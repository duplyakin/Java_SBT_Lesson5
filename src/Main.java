/**
 * Created by Vlad on 05.11.2016.
 */
public class Main {

    public static void main(String[] args) {
       run();
    }

    public static void run() {
        work();
    }

    private static void work() {
        int x = 5;
        int y = 0;

        int x1 = x / y;
        System.out.println(x1);

        ++x1;
        System.out.println("END");
    }
}
