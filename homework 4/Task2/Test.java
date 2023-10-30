package Task2;

public class Test {

  public static void main(String[] args) {
    TextAnalyzer[] analyzers = {
        new SpamAnalyzer(new String[]{"SI"}),
        new NegativeTextAnalyzer(),
        new TooLongTextAnalyzer(30)
    };
    String[] comments = {
        "Чекменёв легенда",
        "Дедлайн по джаве:(",
        "Для любого эпсилон больше 0 существует номер",
        "Cristiano Ronaldo SI"
    };
    for (String comment : comments) {
      Label label = checkLabels(analyzers, comment);
      System.out.println(comment + " - " + label);
    }
  }

  public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
    for (TextAnalyzer analyzer : analyzers) {
      if (analyzer.processText(text) != Label.OK) {
        return analyzer.processText(text);
      }
    }
    return Label.OK;
  }


}
