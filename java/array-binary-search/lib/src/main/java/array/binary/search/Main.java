package array.binary.search;

public class Main {
  public static void main(String[] args) {
    Library lib = new Library();
    int[] arr = new int[]{1, 2, 5, 0, 9, 5};
    System.out.println(lib.BinarySearch(arr, 9));
  }
}
