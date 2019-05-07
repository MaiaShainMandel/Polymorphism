// composition example
// object code
import java.util.Random; 

public class DeckofCards
{
  private Card myDeck[];       
  private int myCardNum = 0;        
  
  public DeckofCards( )   
  { 
    String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    
    String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
   
    myDeck = new Card[52];
     
    for( int n = 0; n < 52; n++ )
    {
      myDeck[n] = new Card( faces[n % 13], suits[n / 13] );
    }
  } 
// end constructor
  
  // method to deal cards
  public Card deal()
  {    
    if( myCardNum < 52 )
      
      return myDeck[ myCardNum++ ];
    
// post increment:  identifier++
    else
      return null; 
// = 52 means all 52 cards are dealt
  } 
// end deal() method
  
   public void shuffle()
   {  
     String faceTemp, suitTemp;
     int randomNum;
     for (int i = 0; i<52;i++)
     {
       randomNum = (int) (Math.random() * ((51 - 0) + 1)) + 0;
       faceTemp = myDeck [i].myFace;
       suitTemp = myDeck [i].mySuit;
       myDeck [i] = new Card (myDeck [randomNum].myFace, myDeck [randomNum].mySuit);
       myDeck [randomNum] = new Card (faceTemp, suitTemp);
     }
   
   } 
   // end shuffle() method 
  
} 

// close class 










