class Solution {
    public List<String> wordBreak(String s, List<String> dict) {
        Map<Integer, List<String>> validMap = new HashMap<Integer, List<String>>();

        // initialize the valid values
        List<String> l = new ArrayList<String>();
        l.add("");
        validMap.put(s.length(), l);

        // generate solutions from the end
        for(int i = s.length() - 1; i >= 0; i--) {
            List<String> values = new ArrayList<String>();
            for(int j = i + 1; j <= s.length(); j++) {
                if (dict.contains(s.substring(i, j))) {
                    for(String word : validMap.get(j)) {
                        values.add(s.substring(i, j) + (word.isEmpty() ? "" : " ") + word);
                    }
                }
            }
            validMap.put(i, values);
        }
        return validMap.get(0);
    }
}