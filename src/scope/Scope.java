package scope;

public class Scope {

    final static int MAX_LENGTH = 5; //is in scope until program ends
    int length; //in scope until the object ends

    public static void main(String[] args) {
        thisme(34);
    }

    public static void thisme(int y) {
        int x = 10;
        if (x == 10) {
            int q = 23;
            System.out.println(y);

            if ( y == 18) {
                int u = 23;
                System.out.println(q);
            }

            //System.out.println(u);
        }

        //System.out.println(q);
    }
}
