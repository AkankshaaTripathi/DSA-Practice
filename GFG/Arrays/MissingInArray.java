class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;
        long Sum = (long)n*(n+1)/2;
        long Array_Sum =0;
        for(int i = 0 ; i< arr.length ; i++){
            Array_Sum += arr[i];
        }
        return (int)(Sum - Array_Sum);
      
    }
}
