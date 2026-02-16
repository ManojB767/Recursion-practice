public class Check_sorted {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,12,34,55,78,90};
        int []arr2={6,3,8,9,54,23,7,9,5};
        int n= arr.length;
        int m= arr2.length;
        System.out.println(checkSorted(arr2,0,m));

    }
    static boolean checkSorted(int [] arr , int i,int n){
        if(i==n-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checkSorted(arr,i+1,n);
    }
}
