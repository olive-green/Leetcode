class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        int S=intervals[0][0], E=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            //we check for those start which lies bw start and end of other inteval
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(s<=E)
                E=Math.max(E,e);
            else
            {
                ans.add(new int[]{S,E});
                E=e;
                S=s;
            }
        }
        //last set remaining because we are adding candidate only when a big start encounters
        // thats why last pair always left out
        ans.add(new int[]{S,E});
        return ans.toArray(new int[ans.size()][]);
    }
}