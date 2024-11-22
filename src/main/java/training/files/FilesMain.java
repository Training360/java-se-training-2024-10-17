package training.files;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Slf4j
public class FilesMain {

//    private static final Logger log = LoggerFactory.getLogger(FilesMain.class);

    public static void main(String[] args) {
        log.info("Start");
        try {
            new FilesMain().loadFile(Path.of("src/main/resources/names.txt"));
        } catch (LoadFileException e) {
            log.error("Can not read file", e);
//            System.err.println("Can not read file");
//            e.printStackTrace();
        }
    }

    public List<String> loadFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException e) {
            throw new LoadFileException("Can not load file", path);
        }
    }

    @SneakyThrows
    public List<String> simplyLoadFile(Path path) {
        return Files.readAllLines(path);
    }

}
