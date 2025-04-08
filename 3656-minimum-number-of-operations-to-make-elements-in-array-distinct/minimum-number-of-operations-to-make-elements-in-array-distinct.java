class Solution {
    public int minimumOperations(int[] nums) {
         List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        int operations = 0;

        while (hasDuplicates(list)) {
            // Remove first 3 or less elements
            int removeCount = Math.min(3, list.size());
            for (int i = 0; i < removeCount; i++) {
                list.remove(0);
            }
            operations++;
        }

        return operations;
    }

    private boolean hasDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size() < list.size();
    }
}