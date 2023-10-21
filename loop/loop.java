package loop;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter tne number(upper-limit)");
    int n =  sc.nextInt();
    int sum =0;
    final double pi= 3.14;
    System.out.println(pi);
    for(int i = 1;i<=n;i+= 2){
     System.out.print("\t"+i);
     sum = sum +i;
    }

    System.out.println("\nthe sum of neatural number = "+sum);
}
}
