class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() == t.length()){
            char[] scharArray = s.toCharArray();
            char[] tcharArray = t.toCharArray();

            Arrays.sort(scharArray);
            Arrays.sort(tcharArray);

            boolean result = Arrays.equals(scharArray,tcharArray);
            return result;
        }
        else{
            return false;
        }
    }
}