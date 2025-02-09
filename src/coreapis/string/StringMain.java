package coreapis.string;

public class StringMain {
    public static void main(String[] args) {
        String name = "xyz";

        //string implements CharSequence
        String name1 = new String("xyz");

        String name2 = """
                Fluffy
                """;


        System.out.println(1 + 2 + "3");

        System.out.println("c" + null);

        String s = "xyz";

        s+=2;

        System.out.println(s);

        String abc = "hello world";
        int len = abc.length();
        System.out.println(len);

        System.out.println(abc.charAt(0));
        System.out.println(abc.charAt(10));

        try {
            System.out.println(abc.charAt(11));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("indexed out!");
        }


        var s2 = "Weâ€™re done feeding the animals";
        System.out.println(s2.charAt(0) + " " + s2.codePointAt(0)); // W87
        System.out.println(s2.charAt(2) + " " + s2.codePointAt(2)); //â€™ 8217
        System.out.println(s2.codePointBefore(3)); //8217
        System.out.println(s2.codePointCount(0,4)); // 4
        //code point at returns the numeric value of the character at the location


        String example = "exampleforsubstring";
        String example1 = example.substring(2);
        System.out.println(example1);
        String example2 = example.substring(0,19);
        System.out.println(example2);

        try {
            String example3 = example.substring(0, 20);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("indexed out again!");
        }

    }
}
