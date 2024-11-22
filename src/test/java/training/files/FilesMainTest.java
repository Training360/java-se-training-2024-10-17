package training.files;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilesMainTest {

    @Test
    void loadFile() {
        var lines = new FilesMain().loadFile(Path.of("src/main/resources/names.txt"));
        assertEquals(List.of("John", "Jack", "Jane"), lines);
    }

    @Test
    void loadMissingFiles() {
        var e = assertThrows(LoadFileException.class,
                () -> new FilesMain().loadFile(Path.of("src/main/resources/names.xxx")));
        assertEquals("Can not load file", e.getMessage());
    }
}