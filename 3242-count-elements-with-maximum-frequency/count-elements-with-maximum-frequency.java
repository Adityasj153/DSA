class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];

        int maxfreq = 0;
        for(int num : nums){
            freq[num]++;
            if(freq[num] > maxfreq){
                maxfreq = freq[num];
            }
        }

        int sum = 0;
        for(int f : freq){
            if(f == maxfreq){
                sum += f;
            }
        }
        return sum;
    }
}