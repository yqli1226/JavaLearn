package desginPatterns.creativePatterns.factoryMethod;

import java.time.LocalDate;

/**
 * 创造型设计方法
 * 工厂方法
 * 定义一个用于创造对象的接口，让子类决定实例化哪一类。 Factory Method 使一个类的实例化延迟到其子类
 * 题目来自廖雪峰官网每日练习
 */
public class FactoryMethod  implements LocalDateFactory {

    @Override
    public LocalDate fromInt(int yyyyMMdd) {
        String date = String.valueOf(yyyyMMdd);
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(4,6));
        int dayOfMonth = Integer.parseInt(date.substring(6,8));
        return LocalDate.of(year, month, dayOfMonth);
    }

}

