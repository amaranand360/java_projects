import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        System.out.println("Enter your marks[0-100]");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<40)
        System.out.println("You eligble grade is 'F'");
        else if(x>= 40 && x< 45)
        System.out.println("You eligble grade is 'E'");
        else if(x>= 45 && x< 50)
        System.out.println("You eligble grade is 'P'");
        else if(x>= 50 && x< 55)
        System.out.println("You eligble grade is 'C'");
        else if(x>= 55 && x< 60)
        System.out.println("You eligble grade is 'B'");
        else if(x>= 60 && x< 70)
        System.out.println("You eligble grade is 'B+'");
        else if(x>= 70 && x< 80)
        System.out.println("You eligble grade is 'A'");
        else if(x>= 80 && x< 90)
        System.out.println("You eligble grade is 'A+'"); 
        else if(x>= 90 && x<= 100)
        System.out.println("You eligble grade is 'O'");
        else{
            System.out.println("Marks is invalide");
        }

    }
}
