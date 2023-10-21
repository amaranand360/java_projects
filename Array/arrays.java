import java.util.Scanner;
import java.util.Arrays;;
public class arrays {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int[] array ={5,9,6,10,14};
        int[] arr = new int[5];

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat = new int[3][3];

        System.out.println("Take aray input!");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The element of array are:");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println(arr.length);
        Arrays.sort(array);
        //System.out.println(matrix[2][1]);
    }
}
