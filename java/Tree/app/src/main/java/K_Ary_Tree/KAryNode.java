package K_Ary_Tree;

import java.util.ArrayList;
import java.util.List;

public class KAryNode<T> {
    private T data;
    private int k;
    private final List<KAryNode<T>> children;

    public KAryNode(T data, int k){
      children = new ArrayList<>();
      this.k = k;
      this.data = data;
    }

    public KAryNode<T> addChild(T data){
      KAryNode<T> node = new KAryNode<>(data, k);
      if(children.size() < k){
        children.add(node);
        return node;
      }
      return null;
    }

  public List<KAryNode<T>> getChildren() {
    return children;
  }

    public KAryNode<T> getChild(int idx){
      if(idx >= 0 && idx <= children.size())
        return children.get(idx);
      return null;
    }

    public T getData(){
      return data;
    }

    public void setData(T data){
      this.data = data;
    }

  @Override
  public String toString() {
    return "KAryNode{" +
      "data=" + data +
      '}';
  }
}
