public class DIgit_sum {
    public static void main(String[]args){
        int n=12312345;
        int m=0;
        System.out.println(digitSum(n));
    }
    static int digitSum(int n){
        if(n==0){
            return n;
        }
        return n%10 + digitSum(n/10);
    }
}