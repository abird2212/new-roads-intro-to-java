public class BlackCard extends Card{

//defualt constructor
  private String color;

public BlackCard(){

  color = "black";

}

public String toString(){
  return super.toString() + " " + color;
     }

}