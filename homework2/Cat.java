public class Cat extends Pet {

  private final String breed;
  private Fodder Fodder;

  public Cat(String name, int weight, int age, String owner, String breed, Fodder fodder) {
    super(name, weight, age, owner);
    this.breed = breed;
    this.Fodder = fodder;
  }

  @Override
  public String say() {
    return "Meow";
  }

  public String walk() {
    return "I am walking with " + getOwner();
  }

  public String walk(String name) {
    return "I am walking with " + name;
  }

  public enum Fodder {
    CHEAP,
    EXPENSIVE
  }
}
