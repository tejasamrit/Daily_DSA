class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            String newS = "";
            int count = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    newS += count + "" + s.charAt(j - 1);
                    count = 1;
                }
            }
            // Add the last group
            newS += count + "" + s.charAt(s.length() - 1);
            s = newS;
        }
        return s;
    }
}