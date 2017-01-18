public class Position extends Player{

//defualt constructor
  private String place;

public Position(){

  place = " ";

}

public String toString(){
  return super.toString() + " " + place;
     }

}