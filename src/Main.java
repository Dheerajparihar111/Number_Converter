import java.util.*;
class Homepage{
    void Homepage(){
        System.out.println(" 1) Decimal To Binary");
        System.out.println(" 2) Decimal To Octal");
        System.out.println(" 3) Decimal To Hexadecimal");
        System.out.println(" 4) Binary To Decimal");
        System.out.println(" 5) Octal To Decimal");
        System.out.print("Enter Your Choice : ");
    }
}
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Homepage homepage = new Homepage();
        homepage.Homepage();
        int choice = input.nextInt();
        switch (choice) {

            case 1:
                   System.out.println("Enter The Decimal Number");
                   int Decimal1 = input.nextInt();
                   String binary = Integer.toBinaryString(Decimal1);
                   System.out.println("Binary =" + binary);
                   break;
            case 2:
                System.out.println("Enter The Decimal Number ");
                int Decimal2 = input.nextInt();
                String Octal = Integer.toOctalString(Decimal2);
                System.out.println("Octal = "+Octal);
                break;
            case 3:
                System.out.print("Enter Decimal Number: ");
                int Decimal3 = input.nextInt();
                String hexadecimal = Integer.toHexString(Decimal3);
                System.out.println("Hexadecimal = " + hexadecimal);
                break;
            case 4:
                System.out.print("Enter binary number: ");
                String Binary = input.next();
                int binaryToDecimal = Integer.parseInt(Binary, 2);
                System.out.println("Decimal = " + binaryToDecimal);
                break;
            case 5:
                System.out.println("Enter Octal Number");
                String octal = input.next();
                int octalToDecimal = Integer.parseInt(octal,8);
                System.out.println("Decimal = "+octalToDecimal);
                break;

        }
    }
}