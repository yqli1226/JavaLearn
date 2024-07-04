package desginPatterns.creativePatterns.abstractFactory;

public interface AbstractFactory {
    HtmlDocument createHtml(String md);

    WordDocument createWord(String md);

    public static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodFactory();
        } else {
            throw new IllegalArgumentException("Invalid Factory Name");
        }
    }
}
