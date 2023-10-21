import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int count =0;
        if(num%2==0){
            System.out.println("It is  non-prime number");
        }
        for (int i =3;i<num;i+=2) { 
            if(num%i == 0){
             count = count++;
            }
        }
        if ( count == 0) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is  non-prime number");
        }
    }
}