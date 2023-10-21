import java.util.Scanner;
public class sweep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st & 2nd number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("The value before sweaping 1st num = " + a + " & 2nd num =  " + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("The value after sweaping 1st num & 2nd num =  " +a+ " "  + b);
    }
}
