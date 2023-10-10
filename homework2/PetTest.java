public class PetTest {
    public static void main(String[] args) {
        Cat myCat = new Cat("Barsik", 7, 5, "Paul", "Maine_Coon", Cat.Fodder.Expensive);
        System.out.println(myCat.say());
        System.out.println(myCat.walk());
        System.out.println(myCat.walk("Mikhail"));

        Dog myDog = new Dog("Martin", 22, 8, "Sergei", "Terrier_Dogs", Dog.Fodder.Cheap);
        System.out.println(myDog.say());
        System.out.println(myDog.walk());
        System.out.println(myDog.walk("Helen"));

        Parrot myParrot = new Parrot("Agent Pi", 11, 16, "Fufelshmertz", "ARGENTINA", true);
        System.out.println(myParrot.say());
        System.out.println(myParrot.fly());
        System.out.println();

        Pet[] animals = {myCat, myDog, myParrot};

        for (int j = 0; j < 3; j++) {
            if (animals[j].say() != null) {
                System.out.println(animals[j].say());
            }
        }
    }
}

