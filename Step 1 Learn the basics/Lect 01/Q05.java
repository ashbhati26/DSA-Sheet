import java.util.*;

public class Q05 {

    public static int fibonacci(int n){
        // base case
        if(n == 1 || n == 2){
            return 1;
        }
        // initialize the first two fibonacci nubmers
        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        // calculate the nth fibonacci number
        for(int i = 3; i <= n; i++){
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}
