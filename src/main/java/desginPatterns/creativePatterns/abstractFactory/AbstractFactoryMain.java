package desginPatterns.creativePatterns.abstractFactory;


import java.io.IOException;
import java.nio.file.Paths;

public class AbstractFactoryMain {
    public static void main(String[] args) throws IOException {
        AbstractFactory factory = new FastFactory();
        HtmlDocument htmlDocument = factory.createHtml("#Hello\\nHello, world!");
        htmlDocument.save(Paths.get(".","fast.html"));

        WordDocument wordDocument = factory.createWord("#Hello\\nHello, world!");
        wordDocument.save(Paths.get(".","fast.doc"));
    }
}
