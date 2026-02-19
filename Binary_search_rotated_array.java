public class Binary_search_rotated_array {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8, 9, 1, 2, 3,4};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 1};
        int[] arr3 = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int[] arr4 = {3, 4, 5, 6, 7, 8, 9, 1, 2};
        System.out.println(binarySearchRotated(arr1,0,8,2));
        System.out.println(binarySearchRotated(arr2,0,8,2));
        System.out.println(binarySearchRotated(arr3,0,8,2));
        System.out.println(binarySearchRotated(arr4,0,8,2));
    }

    static int binarySearchRotated(int[] arr, int start, int end, int target) {
        if (start >= end) {
            System.out.println(" no element in this array");
            return -1;
        }
        //1
        int mid =start+ (end-start )/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]&& target >= arr[start]){
            end = mid-1;
        }else{
            start=mid+1;
        }
        if(target>arr[mid]&& target>arr[start]){
            start=mid+1;
        }else{
            end = mid-1;
        }
        if(target>arr[mid]&& target<arr[start]){
            start=mid+1;
        }else{
            end=mid-1;
        }
   return binarySearchRotated(arr,start,end,target);
    }
}