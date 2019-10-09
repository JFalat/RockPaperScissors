package RockPaperScissors;

public class Paper implements Choosable {
  String name = "Paper";

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void beats(Choosable choosable) {
    if(choosable.getName().equals(this.name)){
      System.out.println("Draw");
    }
    else if(choosable.getName().equals("Rock")){
      System.out.println("Paper wins");
    }
    else if(choosable.getName().equals("Scissors")){
      System.out.println("Scissors win");
    }
  }


  @Override
  public String toString() {
    return "Paper{" +
            "name='" + name + '\'' +
            '}';
  }
}
