public interface IUnionFind {
  public boolean connected(int p, int q);
  public void union(int nodeAKey, int nodeBKey);
  public int[] nodes();
}