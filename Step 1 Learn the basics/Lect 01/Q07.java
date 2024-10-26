import java.util.*;

public class Q07 {

    public static int[] passedBy(int a, int b) {
        // pass by value
        a = a + 1;

        // pass by reference
        b = b + 2;

        // return the modified values
        return new int[]{a, b};
    }
    public static void main(String[] args) {
        int result[] = passedBy(2, 4);
        System.out.println(Arrays.toString(result));
    }
}