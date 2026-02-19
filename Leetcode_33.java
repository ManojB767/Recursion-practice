public class Leetcode_33 {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,8,9};
        System.out.println(search(nums,8));
    }
    static int search(int[] nums, int target) {
        int n= nums.length;
        return searchIndex(nums,0,n-1,target);

    }
    static int searchIndex(int [] arr,int s,int e, int t){// s-start, e-end,t-target
        if(s>e){
            return -1; // element not found, base case
        }

        int mid=(s+e)/2;

        if( t == arr[mid] ){
            return mid;
        }

        if(arr[s]<=arr[mid]){

            if(t<=arr[mid]&&t>=arr[s]){
                return searchIndex(arr,s,mid-1,t);
            }else{
                return searchIndex(arr,mid+1,e,t);
            }

        }
        if(t >= arr[mid]&& t<= arr[e]){
            return searchIndex(arr,mid+1,e,t);

        }else{
            return searchIndex(arr,s,mid-1,t);
        }

    }
}