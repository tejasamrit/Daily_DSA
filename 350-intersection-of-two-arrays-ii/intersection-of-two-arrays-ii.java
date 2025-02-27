class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:arr1){
            list.add(i);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i : arr2) {
            if (list.contains(i)) {
                resultList.add(i);
                list.remove((Integer) i); // Remove to handle duplicates correctly
            }
        }
        // Convert list to array
        int[] res = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            res[i] = resultList.get(i);
        }

        return res;
    }
}