// Array -sorted
class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
        
    }
}
//Forward Recursion Approach
class Solution {
    public static int largest(int[] arr) {
        // code here
        return largeElement(arr,0);
        
    }
    public static int largeElement(int [] arr, int idx){
        if(idx==arr.length-1) return arr[idx];
        int max=largeElement(arr,idx+1);
        return Math.max(max,arr[idx]);
    } 
}
// backward recursion 
class Solution {
    public static int largest(int[] arr) {
        // code here
        return largeElement(arr,arr.length-1);
        
    }
    public static int largeElement(int [] arr, int n){
        if(n==1) return arr[0]; // arr[n] due to return 1st index value not 0th index value
        int max=largeElement(arr,n-1);
        return Math.max(max,arr[n]);
    } 
}



// Efficient Method
class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
        
    }
}
//or
  class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
        
    }
}
