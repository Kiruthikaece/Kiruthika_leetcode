class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0,s2=0;
        for(int i=0;i<nums.length;i++) {
            int n=nums[i];
            while(n!=0) {
                int d=n%10;
                s1=s1+d;
                n=n/10;
            }
           s2=s2+nums[i];
        }
        return s2-s1;
    }
}