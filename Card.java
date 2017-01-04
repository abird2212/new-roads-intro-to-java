public class Card{
  
  // bellow are the properties
  
  private String color;
  private String suit;
  private char rank;
  
  //constructor/method to make the object
  
  public Card(){
  
    color = "red";
    suit = "diamonds";
    rank = 'A';
  }
  
  //colors
  
  //mutators
  public String getColor(){
    return color;
  }
  
  public void setColor(String newColor){
    color = newColor;
  }
  
  //suits
  
    //mutators
  public String getSuit(){
    return suit;
  }
  
  public void setSuit(String newSuit){
    suit = newSuit;
  }
  
  // ranks
  
      //mutators
  public char getRank(){
    return rank;
  }
  
  public void setRank(String newRank){
    rank = newRank;
  }
 
  // mutator end
  
  
  //prints out object 
  public String toString(){
  return color + " " + suit + " " + rank;

}
  
  
}//end of the class
  