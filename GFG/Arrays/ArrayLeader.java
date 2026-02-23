// Problem: Leaders in an Array
// Platform: GeeksforGeeks
// Difficulty: Easy
// Approach: Traverse from right
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer>leader = new ArrayList<>();
        int current_ldr = arr[n-1];
         leader.add(current_ldr);
         for(int i = n-2 ; i>=0 ; i--){
             if(arr[i]>= current_ldr){
                 current_ldr = arr[i];
                 leader.add(current_ldr);
                 }
         }
         Collections.reverse(leader);
        return leader;
    }
}
