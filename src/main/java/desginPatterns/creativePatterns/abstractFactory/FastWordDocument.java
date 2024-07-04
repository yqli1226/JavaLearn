package desginPatterns.creativePatterns.abstractFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FastWordDocument implements WordDocument{

    private String text = "";

    public FastWordDocument(){};

    public FastWordDocument(String text) {
        this.text = text;
    }


    @Override
    public void save(Path path) throws IOException {
        try (OutputStream out = Files.newOutputStream(Paths.get(path.toAbsolutePath().toString()))) {
//            doc.write(out);
            System.out.println("使用Fast供应商的word产品，保存到"+path.toAbsolutePath());
        }
    }
}
