class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length && k>0;i++){
            if(mp.get(arr[i])==1){
                k--;
                if(k==0)
                    return arr[i];
            }
        }
        return "";
    }
}