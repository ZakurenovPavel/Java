package Task5;

public class UserEntry {

  public static boolean confirm(String login, String password, String confirmPassword) {
    int maxLength = 20;
    try {
      if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= maxLength) {
        throw new WrongLoginException("Неверный логин");
      }
      if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= maxLength) {
        throw new WrongPasswordException("Неверный пароль");
      }
      if (!password.equals(confirmPassword)) {
        throw new WrongPasswordException("Неверный пароль");
      }
      return true;
    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println(e.getMessage());
      return false;
    }

  }

  public static void main(String[] args) {
    System.out.println(confirm("MyLogin", "UnSecurePassword", "SecurePassword"));
    System.out.println(confirm("MyLogin", "SecurePassword", "SecurePassword"));
    System.out.println(confirm("MyLogin", "LongLongSecurePassword", "SecurePassword"));
    System.out.println(confirm("MyLogin", "LongLongSecurePassword", "LongLongSecurePassword"));
    System.out.println(confirm("LongestLoginAtJavaHistory", "SecurePassword", "SecurePassword"));
  }

  static class WrongLoginException extends Exception {

    public WrongLoginException() {
      super();
    }

    public WrongLoginException(String message) {
      super(message);
    }
  }

  static class WrongPasswordException extends Exception {

    public WrongPasswordException() {
      super();
    }

    public WrongPasswordException(String message) {
      super(message);
    }
  }
}
