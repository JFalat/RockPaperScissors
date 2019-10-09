package RockPaperScissors;

import RockPaperScissors.Choosable;
import RockPaperScissors.Paper;
import RockPaperScissors.Rock;
import RockPaperScissors.Scissors;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Choosable choosable=null;
    Choosable choosable2=null;


    Scanner scan = new Scanner(System.in);

    String test = scan.nextLine();
    if (test.equals("Paper")) {
      choosable=new Paper();
    }
    if (test.equals("Rock")) {
      choosable=new Rock();
    }
    if (test.equals("Scissors")) {
      choosable=new Scissors();
    }

    System.out.println(choosable);

    Scanner scan2 = new Scanner(System.in);
    String test2 = scan2.nextLine();
    if (test2.equals("Paper")) {
      choosable2=new Paper();
    }
    if (test2.equals("Rock")) {
      choosable2=new Rock();
    }
    if (test2.equals("Scissors")) {
      choosable2=new Scissors();
    }


    System.out.println(choosable2);

    choosable.beats(choosable2);




  }
}


