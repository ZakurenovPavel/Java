public class Dog extends Pet {

  private final String breed;
  private Fodder Fodder;

  public Dog(String name, int weight, int age, String owner, String breed, Fodder fodder) {
    super(name, weight, age, owner);
    this.breed = breed;
    this.Fodder = fodder;
  }

  @Override
  public String say() {
    return "Woof";
  }

  public String walk() {
    return "I am walking with " + getOwner();
  }

  public String walk(String name) {
    return "I am walking with " + name;
  }

  public enum Fodder {
    Cheap,
    Expensive
  }

  public enum breed {
    Hound_Dogs,
    Sporting_Dogs,
    Herding_Dogs,
    Terrier_Dogs,
    Working_Dogs
  }
}
