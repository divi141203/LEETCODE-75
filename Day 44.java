class Solution {
    private void dfs(int[][] graph, int city, boolean[] visited){
        if(visited[city])
        {
            return;
        }
        visited[city] = true;
        for(int i = 0; i < graph.length; i++)
        {
            if(graph[city][i] == 1)
                dfs(graph, i, visited);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int city = 0; city < isConnected.length; city++)
        {
            if(!visited[city]){
                dfs(isConnected, city, visited);
                count++;
            }
        }        
        return count;
    }
}
