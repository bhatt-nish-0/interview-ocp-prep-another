package coreapis.string;

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
    }
}
