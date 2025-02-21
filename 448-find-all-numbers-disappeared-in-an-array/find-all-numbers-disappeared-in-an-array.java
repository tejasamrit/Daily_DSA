class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        boolean[] visit = new boolean[n + 1];
        for (int i : arr) {
            visit[i] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}