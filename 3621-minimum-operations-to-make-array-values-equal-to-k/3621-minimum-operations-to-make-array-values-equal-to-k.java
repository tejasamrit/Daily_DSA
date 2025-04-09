class Solution {
    public int minOperations(int[] nums, int k) {
        for (int num : nums) {
            if (num < k) return -1;
        }
        TreeSet<Integer> unique = new TreeSet<>(Collections.reverseOrder());
        for (int num : nums) {
            if (num > k) {
                unique.add(num);
            }
        }
        int operations = 0;
        while (!unique.isEmpty()) {
            int h = unique.pollFirst(); 
            Integer next = unique.isEmpty() ? k : unique.first();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > h) {
                    nums[i] = h;
                }
            }
            operations++;
        }

        return operations;
    }
}