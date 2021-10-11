package stackQueueAnimalShelter.Animal;

public class Cat extends Animal{
  private String breed;

  public Cat(String breed) {
    this.breed = breed;
  }

  public Cat(String name, String breed, int age) {
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
    return "Cat{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", breed='" + breed + '\'' +
      '}';
  }
}
