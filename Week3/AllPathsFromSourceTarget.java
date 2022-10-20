package Week3;
import java.util.ArrayList;

import java.util.List;
/*
 * Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.
 * The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).
 */
class AllPathsFromSourceTarget {
   
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
         
         List<List<Integer>> results = new ArrayList<>();

         List<Integer> path = new ArrayList<>();
         path.add(0);
         allPathsSourceTargetHelper(graph, results, path, 0, graph.length - 1);
         return results;
     }


     private void allPathsSourceTargetHelper(int[][] graph, List<List<Integer>> results, List<Integer> path, int start, int target) {
         
         if (start == target) {
             results.add(new ArrayList<>(path));
             return;
         }

         for (int neighbor : graph[start]) {
             path.add(neighbor);
             allPathsSourceTargetHelper(graph, results, path, neighbor, target);
             path.remove(path.size() - 1);
         }
     }
}