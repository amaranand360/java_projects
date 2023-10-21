// sum and product ava min max of numbers
import java.util.Scanner;
public class md {
    public static void main(String[] args) {
        System.out.println("Enter 3 num");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int sum = i+j+k;
        int pro = i*j*k;
        float ava = (float)sum/3;
        int max = (i>j) && (i>k) ? i: (j>k) && (j>i) ? j : k;
        int min = (i<j) && (i<k) ? i: (j<k) && (j<i) ? j : k;
        System.out.println("sum = "+sum);
        System.out.println("product = "+pro);
        System.out.println("ava = "+ ava);
        System.out.println("The maximum number amoung these is = "+max);
        System.out.println("The mnimum number amoung these is = "+min);
    }
}
