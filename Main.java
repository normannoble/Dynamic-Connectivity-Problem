public class Main {
  public static void main(String[] args) {

    IUnionFind unionFind = new QuickUnionWeighted(10);
    createConnections(unionFind);
    System.out.println(unionFind.connected(4, 3));

    int[] nodes = unionFind.nodes();
    for (int i = 0; i < nodes.length; i++) {
      System.out.print(nodes[i]+",");
    }
  }

  public static void createConnections(IUnionFind unionFind) {
    unionFind.union(4, 3);
    unionFind.union(3, 8);
    unionFind.union(3, 7);
    unionFind.union(4, 2);
    unionFind.union(2, 1);
    //quickUnion.union(5, 0);
    //quickUnion.union(7, 2);
    //quickUnion.union(6, 1);
  }
}