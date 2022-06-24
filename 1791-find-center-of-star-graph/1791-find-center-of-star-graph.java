class Solution {
    public int findCenter(int[][] edges) {
        //first we find no. of nodes in a graph
        int n=0;
        for(int i=0;i<edges.length;i++){
            n=Math.max(n,Math.max(edges[i][0],edges[i][1]));
        }
        
        //now we calculate indegree of each node
        int[] indegree=new int[n+1];
        for(int i=0;i<edges.length;i++){
            indegree[edges[i][0]]++;
            indegree[edges[i][1]]++;
            
        }
        int res=0;
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==n-1)
                return res=i;
        }
        return res;
    }
}