public class RelationalOp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        boolean Equalto = (num1 == num2);
        boolean NotEqualto = (num1 != num2);
        boolean GreaterThan = (num1 > num2);
        boolean LessThan = (num1 < num2);

        System.out.println("Equal: " + Equalto);
        System.out.println("Not Equal: " + NotEqualto);
        System.out.println("num1 is Greater Than num2: " + GreaterThan);
        System.out.println("num1 is Less Than num2: " + LessThan);
    }
}
