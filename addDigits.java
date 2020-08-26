package LC;

public class addDigits {

    public static void main(String[] args) {
        int num = 156;
        System.out.println(addDigits(156));
    }

    public static int addDigits(int num) { // 38
        if (num < 10) {
            return num;
        } else if (num % 9 == 0) { // special properties of 9
            return 9;
        }
        return num % 9;
    }
}






