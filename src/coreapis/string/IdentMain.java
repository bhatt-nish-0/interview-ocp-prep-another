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
    }
}
