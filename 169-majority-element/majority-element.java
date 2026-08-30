class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int n=nums.length;
        int curr=0;
        

        for(int num : nums){
            if(count==0){
                curr=num;
            }
            count+=(num==curr) ? 1:-1;
        }
        return curr;
    }
}