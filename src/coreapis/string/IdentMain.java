package coreapis.string;

import java.util.IllegalFormatConversionException;

public class IdentMain {
    public static void main(String[] args) {
        String x = """
                abc
                def
                ghi
                """;

        System.out.println(x);

        String x2 = x.indent(7);
        System.out.println(x2);

        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true
        System.out.println("".isBlank());

        String q = String.format("Hello %s","kate");
        System.out.println(q);

        q = String.format("hello %d",23);
        System.out.println(q);

        q = "hi %d %d %d".formatted(2,9,7);
        System.out.println(q);

        try {
            q = "%d hello".formatted("test");
        } catch (IllegalFormatConversionException e) {
            System.out.println("test");
        }
        System.out.println(q);

        var pi = 3.14159265359;

        System.out.format("[%f]",pi);
        System.out.println();
        System.out.format("[%.3f]",pi);
        System.out.println();
        System.out.format("[%.4f]",pi);

    }
}
