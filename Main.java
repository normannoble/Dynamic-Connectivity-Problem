public class Main {
  public static void main(String[] args) {
    QuickFind quickFind = new QuickFind(10);
    // long startTime = System.nanoTime();
    createConnections(quickFind);
    
    System.out.println(quickFind.connected(4,3));
    // long stopTime = System.nanoTime();
    //System.out.println("Execution Time: " + (stopTime - startTime));

    int[] nodes = quickFind.nodes();
    for (int i = 0; i < nodes.length; i++){
      System.out.println(nodes[i]);
    }
  }

  public static void createConnections(QuickFind quickFind){
    quickFind.union(4,3);
    quickFind.union(3,8);
    quickFind.union(6,5);
    quickFind.union(9,4);
    quickFind.union(2,1);
    quickFind.union(5,0);
    quickFind.union(7,2);
    quickFind.union(6,1);
  }
}