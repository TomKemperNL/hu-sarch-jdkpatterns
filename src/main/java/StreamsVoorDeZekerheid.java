import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class StreamsVoorDeZekerheid {
    public static void main(String[] args) throws IOException {
        //Deze try-with-resources syntax kun je gebruiken op alles wat AutoCloseable implementeert
        try(FileOutputStream fos = new FileOutputStream("StreamsTryWith.txt")){
            AutoCloseable alsCloseAble = fos; //zie, dat implementeert ie

            try(PrintStream ps = new PrintStream(fos)){
                ps.println("Hallo Streams met try-with-resources");
            }
        }

        //met zo'n auto-closeable hoef je dus niet expliciet de try/finally code te schrijven, onderstaande is 'more or less identiek'
        FileOutputStream fos2 = null;
        PrintStream ps2 = null;
        try{
            fos2 = new FileOutputStream("StreamsFinally.txt");
            ps2 = new PrintStream(fos2);
            ps2.println("Hallo Streams met Finally!");
        }finally {
            //van buiten naar binnen, anders gaat het in randgevallen mis
            if(ps2 != null){ ps2.close(); }
            if(fos2 != null){ fos2.close(); }
        }
    }
}
