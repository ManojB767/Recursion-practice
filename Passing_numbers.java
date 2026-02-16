public class Passing_numbers {
    public static void main(String[] args) {
        int n=12344;
        int pos=5;
        reverse1(n);// method 1 calling
        System.out.println(sum);
        System.out.println(reverse2(n,pos));

    }
    static int sum=0;
    static void reverse1(int n){
        if(n==0){
            return;
        }
        int rem= n%10;
        sum=sum*10+rem;
        reverse1(n/10);
    }
    static int  reverse2(int n,int pos){
        if(n ==0){
            return 0;
        }
        int rem= n%10;
        return rem * (int)(Math.pow(10, pos-1)) + reverse2(n/10,pos-1);

    }
}



















