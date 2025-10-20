// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        
        
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<V;i++)
        {
            list.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<edges.length;i++)
        {
            int v=edges[i][0];
            int u=edges[i][1];
            
            list.get(v).add(u);
            list.get(u).add(v);
        }
        return list;
        
                
           
        
        
    }
}