/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    int[] array = new int[]{8,4,23,42,16,15};

    insertionSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void insertionSort(int[] array){
    for(int i = 1; i < array.length; i++){
      int j = i -1;
      int temp = array[i];

      while (j >= 0 && temp < array[j]){
          array[j + 1] = array[j];
        j -= 1;
      }

      array[j + 1] = temp;
    }
  }
}