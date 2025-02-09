package coreapis.string;

public class ReplacingMain {
    public static void main(String[] args) {
        String r = "hellothisisarnoldsch";

        String r1 = r.replace("isa","xxx");
        System.out.println(r1);

        r1 = r.replace('l',' ');
        System.out.println(r1);

    }
}
