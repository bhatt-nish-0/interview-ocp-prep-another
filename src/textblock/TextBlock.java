package textblock;

public class TextBlock {
    public static void main(String[] args) {
        String x = """
                sss
                bheem
                """;

        String x1 = "sss" +
                "vheem";

        String mok = """
                "jeanne kwoski"
                        yabadabadoo
                """;

        String dick = """
                
                                        papa shango
                                                   hello
                
                                        """;

        String k = """
                doe \
                deer
                """;

        k = """
                doe \n
                deer
                """;

        System.out.print(x);
        System.out.println(x1);
        System.out.println(mok);
        System.out.println(dick);
        System.out.println(k);
    }
}
