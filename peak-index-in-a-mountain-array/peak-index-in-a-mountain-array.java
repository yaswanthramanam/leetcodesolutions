class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //int z=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return i;
            }
        }
        return 0;
    }
}