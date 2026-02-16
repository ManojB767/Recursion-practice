public class Leetcode_1752 {
    public static void main(String[] args) {
        int [] nums={5,6,9,8,1,2,3};
        System.out.println(check(nums));
    }
    static boolean check(int[] nums) {
        int n = nums.length;
        int x=0;
        if(n==1){
            return true;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                x++;
            }
        }
        if(nums[n-1]>nums[0]) x++;

        return x<=1;  }
}