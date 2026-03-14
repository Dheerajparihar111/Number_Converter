import java.util.*;
class Homepage{
    void Homepage(){
        System.out.println(" 1) Decimal To Binary");
        System.out.println(" 2) Decimal To Hexadecimal");
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
                System.out.print("Enter Decimal Number: ");
                int decimal2 = input.nextInt();
                String hexadecimal = Integer.toHexString(decimal2);
                System.out.println("Hexadecimal = " + hexadecimal);
                break;
        }
    }
}