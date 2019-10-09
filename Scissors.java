package RockPaperScissors;

public class Scissors implements Choosable {
  String name = "Scissors";

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void beats(Choosable choosable) {
    if(choosable.getName().equals(this.name)){
      System.out.println("Draw");
    }
    else if(choosable.getName().equals("Papier")){
      System.out.println("Scissors win");
    }
    else if(choosable.getName().equals("Rock")){
      System.out.println("Rock wins");
    }

  }


  @Override
  public String toString() {
    return "Scissors{" +
            "name='" + name + '\'' +
            '}';
  }
}
