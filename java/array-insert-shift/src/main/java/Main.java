public class Main {
  public static void main(String[] args) {

    int[] array = new int[]{1, 2, 3, 4, 5};
    int[] newArray = removeShiftArray(array);

    for (int element : newArray) {
      System.out.print(element + " ");
    }
  }

  public static int[] insertShiftArray(int[] array, int value) {

    int length = array.length;
    int midIndex = (int) Math.round(length / 2.0);
    int[] newArray = new int[length + 1];

    for (int i = 0; i < length; i++)
      newArray[i] = array[i];

    for (int index = newArray.length - 1; index >= midIndex; index--)
      newArray[index] = newArray[index - 1];

    newArray[midIndex] = value;

    return newArray;
  }

  public static int[] removeShiftArray(int[] array) {
    int length = array.length;
    int midIndex = (int) Math.round(length / 2.0);
    int[] newArray = new int[length - 1];

    for (int i = 0; i < length - 1; i++)
      if (i >= midIndex)
        array[i] = array[i + 1];

    for (int i = 0; i < length - 1; i++)
      newArray[i] = array[i];

    return newArray;
  }
}
