package RockPaperScissors;

public class Rock implements Choosable {
  String name = "Rock";

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void beats(Choosable choosable) {
    if(choosable.getName().equals(this.name)){
      System.out.println("Draw");
    }
    else if(choosable.getName().equals("Scissors")){
      System.out.println("Rock wins");
    }
    else if(choosable.getName().equals("Paper")){
      System.out.println("Paper wins");
    }
  }

  @Override
  public String toString() {
    return "Rock{" +
            "name='" + name + '\'' +
            '}';
  }
}
