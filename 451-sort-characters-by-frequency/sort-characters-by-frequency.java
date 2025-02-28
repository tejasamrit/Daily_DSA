class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Use a max heap (PriorityQueue) to sort by frequency
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (a, b) -> frequencyMap.get(b) - frequencyMap.get(a)
        );
        maxHeap.addAll(frequencyMap.keySet());
        
        // Step 3: Build the result string
        StringBuilder ans = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            int freq = frequencyMap.get(current);
            for (int i = 0; i < freq; i++) {
                ans.append(current);
            }
        }
        
        return ans.toString();
    }
}