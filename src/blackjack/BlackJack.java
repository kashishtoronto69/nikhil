/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * nikhil
 */
package blackjack;

/**
 *
 * @author kashi
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CardHand ch = new CardHand();
        ch.generateHand();
//                for(int i=0;i<2;i++)
//                {
//                    System.out.println("the cards are..."+ch.cards[0]);
//                }
//                for(Card c: ch.cards)
//                {
//                    System.out.println(c.getValue() + " of " + c.getSuit());
//                }
               System.out.println(ch.cards);
               //show what happens when there is no toString()

    }
    
}
