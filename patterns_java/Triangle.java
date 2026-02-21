package patterns_java;


public class Triangle {
    public static void main(String[] args) {
        pattern(5,0,0);
    }
    static void pattern(int row,int col,int i ){

        if(i==row){
            return;
        }
        if(col<=i){
            System.out.print(" * ");
            pattern(row,col+1,i);
        }else{
            System.out.println();
            pattern(row,0,i+1);
        }
    }
}
