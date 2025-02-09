package coreapis.string;

public class IndexOfMain {
    public static void main(String[] args) {
        String a = "jhaatkebarabarhaitu";

        int a1 = a.indexOf("a");
        System.out.println(a1);
        a1 = a.indexOf('a',3);
        System.out.println(a1);
        a1 = a.indexOf('a',2);
        System.out.println(a1);

        a1 = a.indexOf('a',8,13);
        System.out.println(a1);

        a1 = a.indexOf('a',8,9);
        System.out.println(a1);

        a1= a.indexOf("barabar");
        System.out.println(a1);

        a1= a.indexOf("barabar",8);
        System.out.println(a1);

        a1= a.indexOf("barabar",7,9);
        System.out.println(a1);


        a1= a.indexOf("barabar",7,13);
        System.out.println(a1);

        a1= a.indexOf("barabar",7,14);
        System.out.println(a1);


    }
}
