package desginPatterns.creativePatterns.abstractFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class FastHtmlDocument implements HtmlDocument{

    private String text = "";

    public FastHtmlDocument(){};

    public FastHtmlDocument(String text) {
        this.text = text;
    }

    @Override
    public String toHtml() {
        System.out.println(text);
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("html title");
        sb.append(System.currentTimeMillis());
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<!-- this is a html created by Fast provider,at ").append(LocalDateTime.now()).append("-->");
        sb.append("<body>");
        sb.append(this.text);
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @Override
    public void save(Path path) throws IOException {
        byte[] buffer = toHtml().getBytes(StandardCharsets.UTF_8);

        try(OutputStream out= Files.newOutputStream(Paths.get(path.toAbsolutePath().toString()))) {
            out.write(buffer);
        }
        System.out.println("使用Fast供应商的html产品，保存到" + path.toAbsolutePath());
    }


}
