import java.util.Scanner;

public class FIb_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" the fibonacci numbers from 1 to " + n + "are as follows");

        System.out.println(fiboNum(n));
    }
    static int fiboNum(int n) {
        if(n<2){
            return n;
        }
    return (fiboNum(n - 1) + fiboNum(n - 2)) ;
    }
}