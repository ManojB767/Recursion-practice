public class Fact{
    public static void main(String [] args){
        int n=5;
        int x=fact(n);
        System.out.println(x);
    }
    static int fact(int n){
        if(n==2){
            return n;
        }

     return   n=n*fact(n-1);
    }
}