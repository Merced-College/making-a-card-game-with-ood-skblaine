//Skylee Blaine
//Tiffany Allen
//Isaac Halpin
//Cristan Galindo

//seperate file for card class
class Card {
  // private variables here:
  private int value;
  private String suit;
  private String rank;
  // constructor: pulls a new card to play
  public Card(int value, String suit, String rank) {
    this.value = value;
    this.suit = suit;
    this.rank = rank;
  }
  // retreieves the numerical value of card
  public int getValue() {
    return value;
  }
  // retreieves the suit of the card
  public String getSuit() {
    return suit;
  }
  // retreieves the rank of the card
  public String getRank() {
    return rank;
  }
  // prints out the card for the player
  public String toString() {
    return rank + " of " + suit;
  }
}