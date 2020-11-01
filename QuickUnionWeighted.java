public class QuickUnionWeighted {
  private int[] id;
  private int[] sz;

  public QuickUnionWeighted(int N) {
    id = new int[N];
    sz = new int[N];
    for (int i = 0; i < N; i++){
      id[i] = i;
      sz[i] = 1;
    }
      
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

    if (i == j) return;
    if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
    else { id[j] = i; sz[i] += sz[j]; } 
  }

  public int[] nodes(){
   return id;
 }
}