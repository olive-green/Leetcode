class valpair{
    String value;
    int timestamp;
    public valpair(String value, int timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }
}
class TimeMap {

    HashMap<String, ArrayList<valpair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        valpair p = new valpair(value, timestamp);
        if(!map.containsKey(key))
        {
            ArrayList<valpair> ll = new ArrayList<>();
            ll.add(p);
            map.put(key, ll);
        }
        else{
            map.get(key).add(p);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";
        else{
           ArrayList<valpair> ll = map.get(key);
            
           for(int i = ll.size()-1;i>=0;i--){
               if(timestamp>=ll.get(i).timestamp)
                   return ll.get(i).value;
           }
            
        }
        return "";
    }
}