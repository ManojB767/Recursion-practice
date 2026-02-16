import java.util.*;
public class Leetcode_1342 {
        static int steps(int num,int st){
            if(num/2==0){
                return st+1;
            }
            if(num%2!=0){
                num=num-1;
                st++;
            }
            return steps(num/2,st+1);

        }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            if(num==0){
                System.out.println(0);
            }
        System.out.println(steps(num,0));
        }
    }
