package malabr;

public class Ab {

    //below is an instance variable
    private int a;
    private static int shit = 20;
    //this is a class variable

    //var x = 88;

    public static void main(String[] args) {
        Ab ab = new Ab();
        ab.a();
        ab.shit = 23;
        System.out.println(shit);
        //System.out.println(a);
        ab.varUsage();
    }

    public void a() {
        System.out.println(a);
    }

    public void varUsage() {
        var name = 2;
        var name1 = "hello";

        //name1 = 83;

        //var p;
        //p = 98;

        //var  g3 = null;
        var g3 = "jey";
        g3 = null;

        var var = "abc";

        var t = "thambi";

        System.out.println(t.getClass());

        var d1 = new Orp();
        //d1 = 5;


    }
}

class Orp {

}
