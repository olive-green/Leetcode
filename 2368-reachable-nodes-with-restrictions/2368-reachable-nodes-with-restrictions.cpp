class Solution {
public:
   unordered_set<int>s;
    int ntc=0;
    void dfs( vector<vector<int>>&v,vector<bool>&visited,int curr)
    {
        if(s.find(curr)!=s.end())
        {
            return ;
        }
        visited[curr]=true;
        ntc++;
        for(auto x:v[curr])
        {
            if(!visited[x])
                dfs(v,visited,x);
        }
    }
    
    int reachableNodes(int n, vector<vector<int>>& edges, vector<int>& restricted) 
    {
        vector<bool>vis(n,false);
        vector<vector<int>>adj(n);
        for(int i=0;i<edges.size();i++)
        {
            adj[edges[i][0]].push_back(edges[i][1]);
            adj[edges[i][1]].push_back(edges[i][0]);
        }
        for(int i=0;i<restricted.size();i++){
            s.insert(restricted[i]);
        }
        
        dfs(adj,vis,0);
        return ntc;
        
    }
};