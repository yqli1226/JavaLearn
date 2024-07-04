package desginPatterns.creativePatterns.factoryMethod;

import java.time.LocalDate;

public interface LocalDateFactory {
    LocalDate fromInt(int yyyyMMdd);

    static FactoryMethod imp1 = new FactoryMethod();

    static FactoryMethod getFactory() {
        return imp1;
    }
}
