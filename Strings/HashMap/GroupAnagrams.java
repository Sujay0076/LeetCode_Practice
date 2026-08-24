class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
        if(strs.length < 1){
            return new ArrayList<>();
        }
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String> list = new ArrayList<>();
            if(map.get(key) != null){
                list = map.get(key);
            }
            list.add(s);
            map.put(key,list);
        }
        return new ArrayList<>(map.values());

    }
}
