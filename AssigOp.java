public class AssigOp {
    public static void main(String[] args) {
        int num1 = 10;
        // we'll just keep on updating the value of num1 with every action that is performed

        // Addition(10+2)
        num1 += 2; 
        System.out.println("After addition: num = " + num1);
        // here the value of num1 becomes = 12


        // Subtraction (12-4)
        num1 -= 4; 
        System.out.println("After subtraction: num = " + num1);
         // here the value of num1 becomes = 8


        // Multiplication (8*7)
         num1 *= 7; 
        System.out.println("After multiplication: num = " + num1);
        // here the value of num1 becomes = 56

        // Division (56/4)
        num1 /= 4; 
        System.out.println("After division: num = " + num1);
        // here the value of num1 becomes = 14

        // Modulus(14%3)
        num1 %= 3; 
        System.out.println("After modulus: num = " + num1);
        // here the value of num1 becomes = 2
    }
    
}
