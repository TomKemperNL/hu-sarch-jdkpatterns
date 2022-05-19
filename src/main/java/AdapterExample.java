import java.io.*;

public class AdapterExample {
    public static void main(String[] args) throws IOException {

        FileOutputStream out = new FileOutputStream("Hallo.txt");

        //out.write();//gedver, alleen bytearrays

        Writer writer = new OutputStreamWriter(out);
        writer.write("Hallo Adapter!");

        writer.close();

    }
}
