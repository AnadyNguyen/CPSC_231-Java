/*
Andy Nguyen
2493321
annguyen@chapman.edu
Worked in partnership with no one
CPSC231-04
MP4 : Card Class and TestCard driver java file
*/


public class TestCards {
    public static void main(String[] args) {
        // constructor
        Card initCard = new Card();
        System.out.println(initCard);
        
        System.out.println("--------------------");

        // copy constructor
        System.out.println("Copy constructor:");
        Card copyCard = new Card(initCard);
        System.out.print("Copy: ");
        System.out.println(copyCard);
        System.out.print("Init: ");
        System.out.println(initCard);
        System.out.println("Are they equal? " + initCard.equals(copyCard));

        System.out.println("--------------------");

        //overloaded constructor
        Card overloadedCard = new Card(7, Card.SPADES);
        Card faceCard = new Card(Card.QUEEN, Card.HEARTS);
        System.out.println("Overloaded constructor:");
        System.out.println(overloadedCard);
        System.out.println(faceCard + "\n");
        System.out.println("Are they equal? " + overloadedCard.equals(faceCard));

        System.out.println("--------------------");

        // getters/accesors
        System.out.println("Getters: \n");
        System.out.println(initCard.getRank());
        Card cardToGetRank = new Card(6, Card.CLUBS);
        Card cardToGetSuit = new Card(7, Card.DIAMONDS);
        System.out.println(cardToGetRank);
        System.out.println(cardToGetSuit);
        System.out.println("Rank: " + cardToGetRank.getRank());
        System.out.println("Suit: " + cardToGetSuit.getSuit() + "\n");
        System.out.println("Are they equal? " + cardToGetRank.equals(cardToGetSuit));

        System.out.println("--------------------");

        // setters/mutators
        System.out.println("Setters: \n");
        System.out.print("overloadedCard before: ");
        System.out.println(overloadedCard);
        overloadedCard.setRank(13);
        System.out.print("overloadedCard after: ");
        System.out.println(overloadedCard);
        System.out.print("initCard before: ");
        System.out.println(initCard);
        initCard.setSuit(3);
        System.out.print("initCard after: ");
        System.out.println(initCard);
        System.out.print("faceCard before: ");
        System.out.println(faceCard);
        faceCard.setRank(5);
        faceCard.setSuit(1);
        System.out.print("faceCard after: ");
        System.out.println(faceCard);

        System.out.println("--------------------");

        //equals method
        Card equalCard = new Card(Card.KING, Card.HEARTS);
        Card equalCard2 = new Card(Card.KING, Card.HEARTS);
        System.out.println("Equals method:");
        System.out.println(initCard + " equals " + equalCard + "? " + cardToGetRank.equals(equalCard));
        System.out.println(equalCard + " equals " + equalCard2 + "? " + equalCard.equals(equalCard2));
    }
}