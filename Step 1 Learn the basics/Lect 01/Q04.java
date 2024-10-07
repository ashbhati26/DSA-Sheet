import java.util.List;

public class Q04 {
    static double switchCase(int choice, List<Double> arr){
        switch(choice){
            case 1:
                double R = arr.get(0);
                return Math.PI * R * R;

            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                return L * B;
            
            default: 
                return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(switchCase(1, List.of(5.0)));
        System.out.println(switchCase(2, List.of(5.0, 10.0)));
    }
}
