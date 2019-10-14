package rockPaperScissors;

import java.util.Scanner;

import static rockPaperScissors.Choice.paper;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String test = scan.nextLine();
    String test2 = scan.nextLine();
    Choice choice1 = null;
    Choice choice2 = null;
    if (test.toUpperCase().equals("Paper".toUpperCase())) {
      choice1 = paper;
    }
    if (test.toUpperCase().equals("Rock".toUpperCase())) {
      choice1 = Choice.rock;
    }
    if (test.toUpperCase().equals("Scissors".toUpperCase())) {
      choice1 = Choice.scissors;
    }
    if (test2.toUpperCase().equals("Paper".toUpperCase())) {
      choice2 = paper;
    }
    if (test2.toUpperCase().equals("Rock".toUpperCase())) {
      choice2 = Choice.rock;
    }
    if (test2.toUpperCase().equals("Scissors".toUpperCase())) {
      choice2 = Choice.scissors;
    }

    if (choice1 == choice2) {
      System.out.println("Draw");
    } else {
      switch (choice1) {
        case paper:
          System.out.println(choice2 == Choice.rock ? "win" : "loose");
          break;
        case rock:
          System.out.println(choice2 == Choice.scissors ? "win" : "loose");
          break;
        case scissors:
          System.out.println(choice2 == Choice.paper ? "win" : "loose");
          break;
      }
    }
  }


}





