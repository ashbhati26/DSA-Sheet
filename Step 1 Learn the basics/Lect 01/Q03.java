public class Q03 {
    public static String compareNM(int n, int m) {
        if(n < m){
            return "lesser";
        } else if(n == m){
            return "equal";
        } else {
            return "greater";
        }
    }
    public static void main(String[] args) {
        System.out.println(compareNM(3, 5));
        System.out.println(compareNM(5, 5));
        System.out.println(compareNM(9, 6));
    }   
}