import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FacadeExample {
    public static void main(String[] args) throws IOException {
        Files.writeString(Path.of("Hallo.txt"), "Hallo Facade!", StandardCharsets.UTF_8, StandardOpenOption.CREATE);
    }
}
