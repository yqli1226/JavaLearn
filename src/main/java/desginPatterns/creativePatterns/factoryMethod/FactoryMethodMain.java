package desginPatterns.creativePatterns.factoryMethod;

import java.time.LocalDate;

public class FactoryMethodMain {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = LocalDateFactory.getFactory();
        LocalDate date = factoryMethod.fromInt(20240703);
        System.out.printf("date : " + date);
    }
}
