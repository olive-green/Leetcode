class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        // HashMap<List<Integer>,Integer> mp=new HashMap<>(); we cannot do this because we knows
        //Integer[] or list<Integer> cannot contains int[]
        // if we somehow make it then it will increase time complexity instead of that we can do
        //we can convert int[] to strings
        
        HashMap<String, Integer> map = new HashMap<>();
        int row = grid.length;
        int col = grid.length;
        for(int i = 0; i < row; i++){
            String res = "";
            for(int j = 0; j < col; j++){
                res += "-" + grid[i][j];
            }
            map.put(res, map.getOrDefault(res, 0) + 1);
        }
        int cnt = 0;
        for(int j = 0; j < col; j++){
            String res = "";
            for(int i = 0; i < row; i++){
                res += "-" + grid[i][j];
            }
            cnt += map.getOrDefault(res, 0);
        }
        return cnt;
    }
}