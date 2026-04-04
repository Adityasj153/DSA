class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        int[] pfreq=new int[26];
        int[] sfreq=new int[26];
        for(char ch:p.toCharArray()){
            pfreq[ch-'a']++;
        }
        int left=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sfreq[ch-'a']++;
            while(i-left+1>p.length()){
                sfreq[s.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(pfreq,sfreq)) res.add(left);
        }
        return res;
    }
}