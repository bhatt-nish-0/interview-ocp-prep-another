package initvar;

public class InitializingVariables {
    public static void main(String[] args) {

        InitializingVariables variables
                = new InitializingVariables();
        variables.shit();

    }

    public void shit() {
        final int y; //does not have a default val
        //y = 9;
        //y= 10;
        y = 20;
        System.out.println(y);

        int y1;
        final int[] arr = new int[3];
        arr[0] = 24;

        //arr = null;
       int x = 20;
        if (  x == 200) {
            y1 = 10;
        }else {
            y1 = 20;
        }

        System.out.println(y1);

    }
}
