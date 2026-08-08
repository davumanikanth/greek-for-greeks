class Solution {
    int[] parent;
    int[] rank;
    int find(int x)
    {
        if(x==parent[x])
        {
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    void union(int a,int b)
    {
        int upa=find(a);
        int upb=find(b);
        if(rank[upa]>rank[upb]) parent[upb]=upa;
        else if(rank[upa]<rank[upb]) parent[upa]=upb;
        else 
        {
            parent[upa]=upb;
            rank[upb]++;
            
        }
    }
    int minEdgesReq(int n, int[][] edges) {
     parent=new int[n];
     rank=new int[n];
     for(int i=0;i<n;i++)
     {
         parent[i]=i;
     }
     int extraedge=0;
     
     for(int[] edge: edges)
     {
         int u=edge[0];
         int v=edge[1];
         if(find(u)==find(v))
         {
             extraedge++;
             
             
             
         }else
         {
             union(u,v);
         }
     }
     int components=0;
     for(int i=0;i<n;i++)
     {
         if(find(i)==i)
         {
             components++;
         }
     }
     int needed=components-1;
     if( extraedge>=needed)
     {
         return needed;
     }
     return -1;
        // code here
        
    }
}