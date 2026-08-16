class BinarySearch {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low=mid+1;
            else{
                high=mid-1;
            }
        }
        return -1;
    }
  public static void main(String args[]){
    int [] arr={1,2,3,4,5,6,8,9};
    int target=8;
    // System.out.println(search(arr,target));   search file not static so you can not directly print so create object
    BinarySearch bs=new BinarySearch();
    System.out.println(bs.search(arr,target));
  }
}
