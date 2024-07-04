package desginPatterns.creativePatterns.abstractFactory;

public class GoodFactory implements AbstractFactory{
    @Override
    public HtmlDocument createHtml(String md) {
        return new GoodHtmlDocument();
    }

    @Override
    public WordDocument createWord(String md) {
        return new GoodWordDocument();
    }
}
