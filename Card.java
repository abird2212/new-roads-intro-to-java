public class Card{
  
  // bellow are the properties
  
  //private String color;
  private String suit;
  private char rank;
  
  //constructor/method to make the object
 
  public Card(){

  }
  
  // this is a construtor
  
  public Card(String newSuit, char newRank){
  
   // color = newColor;
    suit = newSuit;
    rank = newRank;
  }
  
  //colors
  
  //mutators
 /* public String getColor(){
    return color;
  }
  
  public void setColor(String newColor){
    color = newColor;
  }*/
  
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
  
  public void setRank(char newRank){
    rank = newRank;
  }
 
  // mutator end
  
  
  //prints out object 
  public String toString(){
  return suit + " " + rank;

}
  
  
}//end of the class
  