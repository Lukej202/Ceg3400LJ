import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import net.lingala.zip4j.core.*;
import net.lingala.zip4j.exception.*;
public class test {
    public static void main(String[] args) throws IOException {
        ZipFile zipFile = (ZipFile) Files.copy(Path.of("protected.zip"), Path.of("protectedCopy.zip"));
        
        Files.delete(Path.of("protected.zip"));
    }
}
