package net.story.code;

public class FooBarQix {

  public static void main(String[] args) {
    new FooBarQix().displayAll();
  }

  void displayAll() {
    for (int i = 1; i <= 100; i++) {
      display(i);
    }
  }

  void display(int i) {
    System.out.println(translate(i));
  }

  String translate(int i) {
    String iAsString = String.valueOf(i);
    String result = "";
    result = doMagicReplacement(i, iAsString, 3, "Foo", result);
    result = doMagicReplacement(i, iAsString, 5, "Bar", result);
    result = doMagicReplacement(i, iAsString, 7, "Qix", result);
    if (result.isEmpty()) {
      return iAsString;
    }
    return result;

  }

  String doMagicReplacement(int i, String iAsString, int magic, String replace, String result) {
    boolean divisible = i % magic == 0;
    String magicAsString = String.valueOf(magic);
    int contains = iAsString.split(magicAsString, -1).length - 1;
    int times = contains + (divisible ? 1 : 0);
    for (int j = 0; j < times; j++) {
      result += replace;
    }
    return result;
  }
}
