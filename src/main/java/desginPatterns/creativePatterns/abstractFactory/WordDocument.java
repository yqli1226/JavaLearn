package desginPatterns.creativePatterns.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

public interface WordDocument {
    void save(Path path) throws IOException;

}
