class pair
    {
        int first ;
        int second;
        pair(int first,int second)
        {
            this.first=first;
            this.second=second;
        }
    }
class Solution {
    
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges)
        {
            int u=e[0];
            int v=e[1];
            int w=e[2];
            adj.get(u).add(new pair(w,v));
            adj.get(v).add(new pair(w,u));

        }
        PriorityQueue<pair> pq=new PriorityQueue<>((x,y)-> x.first -y.first);
        int[] distance=new int[V];
        for(int i=0;i<V;i++)
        {
            distance[i]=Integer.MAX_VALUE;
        }
        distance[src]=0;
        pq.add(new pair(0,src));
        while(!pq.isEmpty())
        {
            pair top=pq.remove();
            int dist=top.first;
            int node=top.second;
            for(int i=0;i<adj.get(node).size();i++)
            {
                pair it=adj.get(node).get(i);
                int adjweight=it.first;
                int adjnode=it.second;
                if(dist+adjweight<distance[adjnode])
                {
                    distance[adjnode]=dist+adjweight;
                    pq.add(new pair(distance[adjnode],adjnode));
                    
                }
            }

            
            
            
        }
        
                    return distance;

        
    }
}