//package elseif;
import java.util.Scanner;
public class odev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a [+]number");
        int n = sc.nextInt();
        if (n%2 == 0){
          System.out.println("It is even number");  
        }
        else{
            System.out.println("it is odd number");
        }
    } 
}
