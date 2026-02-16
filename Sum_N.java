public class Sum_N {
    public static void main(String [] args){
        int n=5;
        System.out.println(printSum(n));
    }
    static int printSum(int n){
        if(n==1){
            return n;
        }
        return n+printSum(n-1);
    }
}
