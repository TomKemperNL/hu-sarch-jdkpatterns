import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class DecoratorExample {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Hallo.zip");

        //Dit is de decorator
        ZipOutputStream zip = new ZipOutputStream(fos);
        zip.putNextEntry(new ZipEntry("Hallo.txt"));

        OutputStream zippy = zip; //Zie, het is gewoon een outputStream

        PrintStream ps = new PrintStream(zippy); //dus we kunnen op zippy aansluiten net als op fos;
        ps.println("Hai");

        ps.close();
    }
}
