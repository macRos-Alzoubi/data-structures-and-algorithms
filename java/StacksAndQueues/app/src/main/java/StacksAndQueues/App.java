/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StacksAndQueues;

import PseudoQueue.PseudoQueue;
import Queue.Queue;
import Stack.Stack;
import stackQueueAnimalShelter.Animal.Animal;
import stackQueueAnimalShelter.Animal.Cat;
import stackQueueAnimalShelter.Animal.Dog;
import stackQueueAnimalShelter.AnimalShelter;

public class App {
  public static void main(String[] args) {
    stackQueueShelter();
//    stacksAndQueues();
//    queueDemo();
//    stackDemo();
  }

  private static void stackQueueShelter() {
    Animal dog = new Dog("patio", "tacoma", 3);
    Animal dog2 = new Dog("jackson", "petcy", 2);

    Animal cat = new Cat("klara", "wafillo", 4);
    Animal cat2 = new Cat("Sacramento", "wafillo", 4);
    Animal cat3 = new Cat("denver", "wafillo", 4);

    AnimalShelter animalShelter = new AnimalShelter();

    animalShelter.enqueue(dog);
    animalShelter.enqueue(dog2);
    animalShelter.enqueue(cat);
    animalShelter.enqueue(cat2);
    animalShelter.enqueue(cat3);

    System.out.println(animalShelter);

    System.out.println(animalShelter.dequeue("Dog"));

  }

  private static void stacksAndQueues() {
    PseudoQueue<String> queue = new PseudoQueue<String>();
    queue.enqueue("added");
    queue.enqueue("Max");
    queue.enqueue("Mac");
    queue.enqueue("Mohammad");
    queue.enqueue("Tariq");
    System.out.println(queue);
    try {
      System.out.println(queue.dequeue());
      System.out.println(queue);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void queueDemo() {
    Queue<String> queue = new Queue<String>();

    queue.enqueue("Max");
    queue.enqueue("Ros");
    System.out.println(queue);
    try {
      System.out.println(queue.peek());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void stackDemo() {
    Stack<Integer> stack = new Stack<Integer>();

    stack.push(14);
    stack.push(2);
    stack.push(9);
    System.out.println(stack);

    try {
      System.out.println(stack.peek());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
