import java.util.*;
public class Recursion1 {
    public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   int n = sc.nextInt();
        message(n);
        // calling a  same function multiple times
        // inside a loop
        for(int i=1;i<=n;i++){
            printNumbers(i);
        }
    }
//making a function call itself for n times
    static void message(int  n) {
        if(n==0){
            return;
        }else{
        n-=1;}
        System.out.println("msg"+n);
        message(n);
    }
    static void printNumbers(int i){
        System.out.println(i);

    }
}