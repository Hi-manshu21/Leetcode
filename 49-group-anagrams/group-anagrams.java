class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            String freqString = frequenceOfString(s);

            if(map.containsKey(freqString)){
                map.get(freqString).add(s);
            }
            else{
                List<String> listStr = new ArrayList<>();
                listStr.add(s);
                map.put(freqString,listStr);
            }
        }
        return new ArrayList<>(map.values());
    }

    private String frequenceOfString(String s){
        int [] arr = new int[26];

        StringBuilder sb = new StringBuilder("");
        
        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }

        char c = 'a';
        for(int i : arr){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();

    }
}