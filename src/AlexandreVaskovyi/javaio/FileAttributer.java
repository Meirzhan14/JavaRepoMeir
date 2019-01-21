package AlexandreVaskovyi.javaio;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttributer {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp");

        System.out.println("Size "+ Files.size(path));
        System.out.println("Date modified " + Files.getLastModifiedTime(path));
        System.out.println("IS writable " + Files.isWritable(path));

        FileStore fileStore = Files.getFileStore(path);

    }
}
