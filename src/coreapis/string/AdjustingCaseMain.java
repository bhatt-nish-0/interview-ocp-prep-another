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


    }
}
