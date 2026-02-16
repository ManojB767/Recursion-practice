public class Palindrome {
    // THIS METHOD USES DOUBLE SO THE COMPARISON MIGHT FAIL
//    public static void main(String[] args) {
//        int n=545;
//        int pos=3;
//         double x= reverse(n,pos);
//         if(n==x){
//        System.out.println(x+ " this is a palindrome");
//         }else{
//             System.out.println("this aint a palindrome");
//         }
//    }
//    static double reverse(int n ,int pos){
//        if(n==0){
//            return 0;
//        }
//        int rem=n%10;
//        return rem*(Math.pow(10,pos-1)) + reverse(n/10,pos-1);\
    public static void main(String[] args) {
        int n = 123321;
        int x = reverse(n,0);
        System.out.println(x);
    }
      static int reverse(int n , int rev){
        if(n==0){
            return rev;
        }
        int rem= n%10;
        return reverse(n/10,rev*10+rem);
      }
}
