public class QuickUnion {
  private int[] id;

  public QuickUnion(int N) {
    id = new int[N];
    for (int i = 0; i < N; i++)
      id[i] = i;
  }

  private int root(int i) {
    // while nodeValue is not the same as nodeKey (i.e. not at root)
    while (i != id[i])
      // nodeValue changes to next node up the chain
      i = id[i];
    // return when root is reached.
    return i;
  }

  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  public void union(int p, int q) {
    // find the root of both
    int i = root(p);
    int j = root(q);

    // set the root of the first node to the root of the second node.
    id[i] = j;
  }

  public int[] nodes(){
   return id;
 }
}