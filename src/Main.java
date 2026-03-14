import java.util.*;
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Decimal Number");
        int Deci = input.nextInt();
        String binary = Integer.toBinaryString(Deci);
        System.out.println("Binary ="+binary);
    }
}