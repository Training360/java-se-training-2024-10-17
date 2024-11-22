package training.files;

import lombok.Getter;

import java.nio.file.Path;

public class LoadFileException extends RuntimeException {

    @Getter
    private Path path;

    public LoadFileException(String message, Path path) {
        super(message);
        this.path = path;
    }


}
