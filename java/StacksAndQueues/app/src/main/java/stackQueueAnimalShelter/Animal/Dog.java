package stackQueueAnimalShelter.Animal;

public class Dog extends Animal{
  private String breed;

  public Dog(String breed) {
    this.breed = breed;
  }

  public Dog(String name, String breed, int age) {
    super(name, age);
    this.breed = breed;
  }

  @Override
  public String getBreed() {
    return breed;
  }

  @Override
  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String toString() {
    return "Dog{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", breed='" + breed + '\'' +
      '}';
  }
}
