package com.codechallenge.array;

//import java.util.ArrayList;
//import java.util.List;

public class Array {
  public static void main(String[] args) {
    int[] numbersList = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
      41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
      103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157,
      163, 167, 173, 179, 181, 191, 193, 197, 199};

//    List<Integer> reversedList = reverseArray(numbersList);
    int[] reversedList = reverseArray(numbersList);

    for(int num : reversedList)
      System.out.print(num + " ");

  }

  public static int[] reverseArray(int[] numbersList){
    int length = numbersList.length;
    int lastIndex = length - 1;
    int[] reversedList = new int[length];

    for(int i = lastIndex; i >= 0; i--)
      reversedList[lastIndex - i] = numbersList[i];

    return reversedList;
  }


//  public static List<Integer> reverseArray(int[] numbersList) {
//    List<Integer> reversedList = new ArrayList<>();
//
//    for(int i = numbersList.length - 1; i >= 0; i--)
//      reversedList.add(numbersList[i]);
//
//    return reversedList;
//  }
}



