package stackQueueAnimalShelter;

import Queue.Queue;
import stackQueueAnimalShelter.Animal.Animal;
import stackQueueAnimalShelter.Animal.Cat;
import stackQueueAnimalShelter.Animal.Dog;

public class AnimalShelter {
  private final Queue<Dog> dogQueue;
  private final Queue<Cat> catQueue;

  public AnimalShelter() {
    dogQueue = new Queue<Dog>();
    catQueue = new Queue<Cat>();
  }

  public AnimalShelter(Queue<Dog> dogQueue, Queue<Cat> catQueue) {
    this.dogQueue = dogQueue;
    this.catQueue = catQueue;
  }

  public void enqueue(Animal animal){
    if (animal instanceof Dog)
      dogQueue.enqueue((Dog) animal);
    else
      catQueue.enqueue((Cat) animal);
  }

  public Animal dequeue(String pref){
    pref = pref.toLowerCase();
    if(pref.equals("dog")){
      try {
        return dogQueue.dequeue();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }else if(pref.equals("cat")){
      try {
        return catQueue.dequeue();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "AnimalShelter{" +
      "dogQueue=" + dogQueue +
      ", catQueue=" + catQueue +
      '}';
  }
}
