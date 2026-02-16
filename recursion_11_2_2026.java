public class recursion_11_2_2026 {
    public static void main(String []args){
        int n= 8;
        printNto1(n);
        print1toN(n);
    }
    static void printNto1(int n){// this prints from 1 to n
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }

    static void print1toN(int n){// this priont from n to 1
        if(n==0){
            return;
        }
        printNto1(n-1);
        System.out.println(n);
    }
    static void printNto2(int n){// this prints n
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
}
