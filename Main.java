public class Main {
  public static void main(String[] args) {
    //QuickFind quickFind = new QuickFind(10);
    //createQFConnections(quickFind);
    //System.out.println(quickFind.connected(4, 3));

    QuickUnion quickUnion = new QuickUnion(10);
    createQUCOnnections(quickUnion);
    System.out.println(quickUnion.connected(4, 3));

    int[] nodes = quickUnion.nodes();
    for (int i = 0; i < nodes.length; i++) {
      System.out.print(nodes[i]+",");
    }
  }

  public static void createQUCOnnections(QuickUnion quickUnion) {
    quickUnion.union(4, 3);
    quickUnion.union(3, 8);
    quickUnion.union(3, 7);
    quickUnion.union(4, 2);
    quickUnion.union(2, 1);
    //quickUnion.union(5, 0);
    //quickUnion.union(7, 2);
    //quickUnion.union(6, 1);
  }

  public static void createQFConnections(QuickFind quickFind) {
    quickFind.union(4, 3);
    quickFind.union(3, 8);
    quickFind.union(6, 5);
    quickFind.union(9, 4);
    quickFind.union(2, 1);
    quickFind.union(5, 0);
    quickFind.union(7, 2);
    quickFind.union(6, 1);
  }
}