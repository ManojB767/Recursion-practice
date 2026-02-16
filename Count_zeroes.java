public class Count_zeroes {
    public static void main(String[] args) {
        int n= 10204060;
        int counter=zeroes(n,0);
        System.out.println(counter);
    }
    static int zeroes(int n,int counter){
        if(n==0&&counter==0){
            return 0;
        }else if(n==0&&counter!=0){
            return counter;
        }
        if(n%10==0){
            counter++;
        }
        return zeroes(n/10,counter);
    }
}
