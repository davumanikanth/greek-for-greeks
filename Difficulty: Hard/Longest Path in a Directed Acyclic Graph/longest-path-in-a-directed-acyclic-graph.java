class Pair {
    int node;
    int weight;

    Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class Solution {
    
    public int[] maxDistance(int V, int src, ArrayList<ArrayList<Integer>> edges) {
        // code here
       
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        int[] indegree=new int[V];
        Arrays.fill(indegree,0);
        
         for (int i = 0; i < edges.size(); i++) {

            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            int wt = edges.get(i).get(2);
            indegree[v]++;

            adj.get(u).add(new Pair(v, wt));
        }
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<V;i++)
       {
           if(indegree[i]==0) q.add(i);
       }
       ArrayList<Integer> topo=new ArrayList<>();
       
       while(!q.isEmpty())
       {
           int num=q.remove();
           topo.add(num);
         for(Pair p:adj.get(num))
          {
              int n=p.node;
              indegree[n]--;
              if(indegree[n]==0) q.add(n);
              
          }
           
           
       }
        int[] arr=new int[V];
        Arrays.fill(arr,Integer.MIN_VALUE);
        arr[src]=0;
        for(int i=0;i<topo.size();i++)
        {
             int u = topo.get(i);
             if(arr[u] == Integer.MIN_VALUE)
{
    continue;
}
            for(Pair p:adj.get(u))
            {
               int v=p.node;
               int wt=p.weight;
               if(arr[u]+wt>arr[v])
               {
                   arr[v]=arr[u]+wt;
               }
            }
        }
        return arr;
       
       
       
        
        
        
        
       
        
    }
}
