package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    for (int counter = 1; counter <= 100; counter++) {
      String result = fizzBuzz.valueOf(counter);
      System.out.println(result);
    }
  }

}
