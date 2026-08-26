class Solution {
     public boolean isNegativeWeightCycle(int V, int[][] edges) {

         int[] dist = new int[V];

         // Start every node
         for (int i = 0; i < V; i++) {
             dist[i] = 0;
         }

         // Relax V-1 times
         for (int i = 0; i < V - 1; i++) {

             for (int[] edge : edges) {

                 int u = edge[0];
                 int v = edge[1];
                 int w = edge[2];

                 if (dist[u] + w < dist[v]) {
                     dist[v] = dist[u] + w;
                 }
             }
         }

         // Check one more time
         for (int[] edge : edges) {

             int u = edge[0];
             int v = edge[1];
             int w = edge[2];

             if (dist[u] + w < dist[v]) {
                 return true;
             }
         }

         return false;
     }
 }