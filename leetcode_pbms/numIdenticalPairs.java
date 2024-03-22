class Solution {
    public int numIdenticalPairs(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        int ans = 0;

        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                ans = ans+map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        return ans;
    }
}