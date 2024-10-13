import java.util.*;

public class Q06 {
    public static void printTable(int n){
        int multiplier = 10;
        while(multiplier > 0){
            System.out.print(n * multiplier + " ");
            multiplier--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        printTable(n);
    }
}