import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operator :- ");
        char ch = sc.next().trim().charAt(0);

        System.out.print("Enter Number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number1: ");
        int num2 = sc.nextInt();

        if (ch == '+'){
            System.out.println(num1+num2);
        } else if (ch == '-') {
            System.out.println(num1-num2);
        } else if (ch == '*') {
            System.out.println(num1*num2);
        } else if (ch == '/') {
            if (num2 != 0){
                System.out.println(num1/num2);
            }
        } else if (ch == '%') {
            System.out.println(num1%num2);
        }else {
            System.out.println("Invalid input");
        }
    }
}
