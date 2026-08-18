class Solution {
    public int search(int arr[], int x) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;   // Found → return index
            }
        }
        return -1; // Not found
    }
}
