package AlexandreVaskovyi.javaio;

import sun.management.FileSystem;

import java.io.IOException;
import java.nio.file.*;

public class FileUnits {

    public void processDir() throws IOException {
        Path dir = Paths.get("temp");
        if (Files.notExists(dir)){
            Files.createDirectory(dir);
        }

        Files.createDirectories(Paths.get("temp/a/b/c"));

        Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();
        for (Path rootDir : rootDirectories){
            System.out.println(rootDir);
        }


        try(DirectoryStream<Path> paths = Files.newDirectoryStream(dir)){
            for (Path p : paths){
                System.out.println(p);
            }
        }
    }

}
