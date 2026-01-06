class Solution {
    class pair
    {
        int dist;
        int nodes;
        pair(int dist,int nodes)
        {
            this.dist=dist;
            this.nodes=nodes;
            
        }
    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int[] e:edges)
        {
            int v=e[0];
            int u=e[1];
            int w=e[2];
            adj.get(v).add(new pair(w,u));
            adj.get(u).add(new pair(w,v));
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((x,y)-> x.dist -y.dist);
        int[] distance=new int[V];
        
        for(int i=0;i<V;i++) distance[i]=(int)(1e9);
         pq.add(new pair(0,src));
         distance[src]=0;
         while(pq.size()!=0)
         {
             
             int dis=pq.peek().dist;
             int node=pq.peek().nodes;
             
             pq.remove();
             for(int i=0;i<adj.get(node).size();i++)
             {
                 pair it=adj.get(node).get(i);
                 int adjnode=it.nodes;
                 int adjweight=it.dist;
                 if(dis+ adjweight< distance[adjnode])
                 {
                     distance[adjnode]=dis+adjweight;
                     pq.add(new pair(distance[adjnode],adjnode));
                 }
             }
         }
         return distance;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}