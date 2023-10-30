package Task2;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

  public String[] keywords = {":(", "=(", ":|"};

  @Override
  public String[] getKeywords() {
    return keywords;
  }

  @Override
  public Label getLabel() {
    return Label.NEGATIVE_TEXT;
  }
}
