// Using Built in Function   TC : O(nlogn)
class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
// Using Two pass Solution  Tc: O(n)
class Solution {
    public void sortColors(int[] nums) {
        int zeroes=0 ,ones=0 ,twoes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroes++;
            else if(nums[i]==1) ones++;
            else twoes++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<zeroes) nums[i]=0;
            else if(i<zeroes+ones) nums[i]=1;
            else nums[i]=2;
        }
    }
}

//Using Dutch Flag algorithms or One Pass Solution           TC: O(n)
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
