package coreapis.string;

public class ReplacingMain {
    public static void main(String[] args) {
        String r = "hellothisisarnoldsch";

        String r1 = r.replace("isa","xxx");
        System.out.println(r1);

        r1 = r.replace('l',' ');
        System.out.println(r1);

        String x = "      xxxx           ";

        String x1  = x.trim();

        System.out.println(x1);

        x1 = x.strip();
        System.out.println(x1);

        x1=x.stripLeading();
        System.out.println(x1);

        x1=x.stripTrailing();
        System.out.println(x1);

        String q1 = "\tx";
        System.out.println(q1);

        System.out.println(q1.length());

        System.out.println(q1.strip().length());
    }
}
