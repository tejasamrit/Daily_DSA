class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:s1.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:s2.split(" ")){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String>list=new ArrayList<>();
        for(Map.Entry<String,Integer> i:map.entrySet()){
            if(i.getValue()==1){
                list.add(i.getKey());
            }
        }
        String res[]=new String[list.size()];
        list.toArray(res);
        return res;
    }
}