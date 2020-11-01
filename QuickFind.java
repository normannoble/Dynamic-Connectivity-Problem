/*  This class starts by creating an array of nodes where each node belongs to a unique collection defined by its value.
    When a node is joined to another node, they are added to the same collection which is identified by the value of the second node. This continues for each subsequent union meaning that the array is affectivley reindexing the collections each time a union is performed. This would make the algo quick to check if array positions are in the same collection but slow to join them together.
*/

public class QuickFind implements IUnionFind
{
  private int[] id;
  
  public QuickFind(int N)
  {
    id = new int[N];
    for (int i = 0; i < N; i++)
      id[i] = i;
  }
 
  public boolean connected(int p, int q)
  { return id[p] == id[q]; }
 
  public void union(int nodeAKey, int nodeBKey)
  {
    int nodeAValue = id[nodeAKey];
    int nodeBValue = id[nodeBKey];

    for (int i = 0; i < id.length; i++)
    if (id[i] == nodeAValue) id[i] = nodeBValue;
 }

 public int[] nodes(){
   return id;
 }
}