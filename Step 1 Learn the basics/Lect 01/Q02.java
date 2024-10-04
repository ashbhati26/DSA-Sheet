public class Q02 {
    public static int dataTypeSize(String str) {
        switch (str) {
            case "Character":
                return 2;
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            default:
                return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(dataTypeSize("Character"));
        System.out.println(dataTypeSize("Integer"));
        System.out.println(dataTypeSize("Long"));
        System.out.println(dataTypeSize("Float"));
        System.out.println(dataTypeSize("Double"));
        System.out.println(dataTypeSize("Invalid"));
        
    }
}
