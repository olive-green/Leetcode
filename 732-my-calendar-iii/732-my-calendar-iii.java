class MyCalendarThree {
    Map<Integer,Integer> intvls;
    public MyCalendarThree() {
        this.intvls = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        this.intvls.put(start,this.intvls.getOrDefault(start,0)+1);
        this.intvls.put(end,this.intvls.getOrDefault(end,0)-1);
        int prefixSum = 0;
        int res = 0;
        for(int val:this.intvls.values()) {
            prefixSum += val;
            res = Math.max(res,prefixSum);
        }
        return res;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */