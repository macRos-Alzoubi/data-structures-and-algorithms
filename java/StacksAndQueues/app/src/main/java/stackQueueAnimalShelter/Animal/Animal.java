package stackQueueAnimalShelter.Animal;

public abstract class Animal{
  protected String name;
  protected int age;

  protected Animal(){}

  protected Animal(String name, int age){
    this.name = name;
    this.age = age;
  }

  protected String getName() {
    return name;
  }

  protected void setName(String name) {
    this.name = name;
  }

  protected int getAge() {
    return age;
  }

  protected void setAge(int age) {
    this.age = age;
  }

  protected abstract String getBreed();

  protected abstract void setBreed(String breed);

  @Override
  public String toString() {
    return "Animal{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}
