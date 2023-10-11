public record Contact(String name, String email) {

  public Contact(String name) {
    this(name, "average@gmail.com");
  }

  public Contact {
    if (name == null || email == null) {
      throw new IllegalArgumentException("У вас пустые имя пользователя и адрес электронной почты");
    }
    if (name.isEmpty()) {
      throw new IllegalArgumentException("У вас пустое имя пользователя");
    }
    String substr = email.substring(email.length() - 10);
    if (!substr.equals("@gmail.com")) {
      email = "Неправильный формат почты";
      System.out.println("Твоя почта обязана заканчиваться на @gmail.com");
    }
  }

  public void sayHello() {
    System.out.println("Привет, " + name);
  }
}


