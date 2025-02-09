package coreapis.string;

public class AdjustingCaseMain {
    public static void main(String[] args) {
        String x = "abc123";
        x.toUpperCase();
        System.out.println(x);

        //String x = "abc123";
        x=x.toUpperCase();
        System.out.println(x);

        String animal = "giraffe";

        boolean a = animal.equals("giraffe");
        //this overrides the object class' equals method
        System.out.println(a);

        boolean b = animal.equals(new Exception());
        System.out.println(b);
        //equals is ready to receive an object - no need to be
        //string specifically

        String ui = "helloworldfromjimsayshellohi";

        boolean hello = ui.startsWith("hello");

        boolean hello1 = ui.startsWith("hello", 22);

        boolean hello2 = ui.startsWith("hello", 21);

        boolean hello3 = ui.endsWith("hellohi");

        System.out.println(hello);
        System.out.println(hello1);System.out.println(hello2);

        System.out.println(hello3);

        boolean hello4 = ui.contains("jim");

        boolean hello5 = ui.contains("JIM");

        System.out.println(hello4);
        System.out.println(hello5);
    }

}
