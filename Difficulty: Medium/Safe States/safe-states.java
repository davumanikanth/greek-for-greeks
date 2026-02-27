class Solution {
    public ArrayList<Integer> safeNodes(int numCourses, int[][] edges) {
        // Code here
        int n=edges.length;
        int[] indegree=new int[numCourses];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            int v=edges[i][0];
            int u=edges[i][1];
            adj.get(u).add(v);
        }
        


        for(int i=0;i<numCourses;i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int nei=adj.get(i).get(j);
                indegree[nei]++;
            }
        }


        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }

       ArrayList<Integer> result=new ArrayList<>();
        while(!q.isEmpty())
        {
            int node=q.remove();
            result.add(node);
            for(int i=0;i<adj.get(node).size();i++)
            {
                int ni=adj.get(node).get(i);
                indegree[ni]--;
                if(indegree[ni]==0)
                {
                    q.add(ni);
                }
            }
        
        }
        Collections.sort(result);
        return result;
    }
}