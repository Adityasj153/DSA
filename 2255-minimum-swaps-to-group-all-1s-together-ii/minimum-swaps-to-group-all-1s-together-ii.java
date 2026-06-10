class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int onescnt = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                onescnt++;
            }
        }
        if(onescnt <= 1){
            return 0;
        }

        int zerocnt = 0;
        for(int i = 0; i < onescnt; i++){
            if(nums[i] == 0){
                zerocnt++;
            }
        }  

        int ans = zerocnt;
        for(int k = 1; k < n; k++){
            if(nums[k - 1] == 0){
                zerocnt--;
            }
            if(nums[(k + onescnt -1) % n] == 0){
                zerocnt++;
            }

            ans = Math.min(ans,zerocnt);
        }
        return ans;
    }
}