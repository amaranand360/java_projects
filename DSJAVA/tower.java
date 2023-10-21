public class tower {
    static void towerOfH(int n,char S,char A,char D){
        if(n==1){
            System.out.println(n+" Move from peg "+S+" to peg "+D);
            return;
        }
        else{
            towerOfH(n-1,S,D,A);
            System.out.println(n+" Move from peg "+S+" to peg "+D);
            towerOfH(n-1,A, S,D);
        }
    }
    public static void main(String[] args) {
        towerOfH(3,'S', 'A', 'D');
    }

}
