class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int ans[] = new int[n];
        for (int i=0;i<n;i++){
            int idx = binarysearch(potions, spells[i], success);
            if (idx != -1){
                ans[i] = potions.length - idx;
            }  
        }return ans;
    }

    int binarysearch(int potions[], long spells, long success) {
        int low = 0, high = potions.length-1,idx=-1;
        while (low <= high) {
            int mid = (high+low)/2;
            if ( potions[mid]*spells>=success){
                idx = mid;
                high = mid - 1;  
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }
}