package K_Ary_Tree;

import java.util.ArrayList;
import java.util.List;

public class KAryTree<T> {
  private KAryNode<T> root;
  private int height;
  private int idx;
  private List<KAryNode<T>> KAryTreeNodes;


  public KAryTree() {
    KAryTreeNodes = new ArrayList<>();
    height = 0;
    idx = 0;
    root = null;
  }

  public KAryTree(List<T> values, int K){
    KAryTreeNodes = new ArrayList<>();
    height = (int)Math.ceil((Math.log((double)values.size() * (K - 1)) / Math.log(K)) - 1) + 1;
    System.out.println(height);
    int arrayLength = values.size();

    if (arrayLength <= 0) {
      return;
    }
    root = new KAryNode<>(values.get(0),K);
    KAryTreeNodes.add(root);
    createKAryTree(values, K, root);
  }

  private void createKAryTree(List<T> values, int K, KAryNode<T> node){
    for (int j = 0; j < K; j++) {
      if ((K * idx + (j + 1)) > (values.size() - 1)){
        return;
      }else {
        KAryTreeNodes.add(node.addChild(values.get(K * idx + (j + 1))));
      }
    }
    if (idx < values.size()) {
      idx++;
      createKAryTree(values, K, KAryTreeNodes.get(idx));
    }
  }

  public void postorder(KAryNode<T> root) {
    if (root == null) {
      return;
    }
    for (int i = 0; i < root.getChildren().size(); i++) {
      postorder(root.getChildren().get(i));
    }
    System.out.print(root.getData() + " ");
  }

  public void treeFizzBuzz(){
    for (KAryNode<T> kAryNode: KAryTreeNodes){
      if ((((int) kAryNode.getData()) % 3 == 0) && (((Integer) kAryNode.getData()) % 5 == 0)){
        kAryNode.setData((T) "FizzBuzz");
      }else if(((int) kAryNode.getData()) % 3 == 0){
        kAryNode.setData((T) "Fizz");
      }else if(((int) kAryNode.getData()) % 5 == 0){
        kAryNode.setData((T) "Buzz");
      }
    }
  }

  public KAryNode<T> getRoot() {
    return root;
  }

  @Override
  public String toString() {
    return "KAryTree{" +
      "KAryTreeNodes=" + KAryTreeNodes +
      '}';
  }
}
