/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author kashi
 */


public class CardHand {

        private int handSize = 52;
	public Card[] cards = new Card[3];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                   int countDealerCards = 0;     
                   int countCards = 0;
            do{


		do{
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }
		}while(countCards==1);



		do{
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        
                        cards[countDealerCards] = (new Card(s,v));
                        countCards++;
                    }
                }
		}while(countDealerCards==1);

		}while(cards[countCards].getValue() == cards[countDealerCards].getValue());
		


	
                }//end outter for
        }//end method

