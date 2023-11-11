public class Parrot extends Pet {

  private final String country;
  public boolean documents;

  public Parrot(String name, int weight, int age, String owner, String country, Boolean documents) {
    super(name, weight, age, owner);
    this.country = country;
    this.documents = documents;
  }

  @Override
  public String say() {
    return "Palyndra pirati!";
  }

  public String fly() {
    return getName() + " said " + "he will back man in " + (int) (Math.random() * 60 + 1)
        + " minutes ";
  }
}
