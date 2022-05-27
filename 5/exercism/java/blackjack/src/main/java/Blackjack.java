public class Blackjack {

    public int parseCard(String card) {
        int val;

        switch(card) {
            case "ace":
                val = 11;
                break;

            case "two":
                val = 2;
                break;

            case "three":
                val = 3;
                break;

            case "four":
                val = 4;
                break;

            case "five":
                val = 5;
                break;

            case "six":
                val = 6;
                break;

            case "seven":
                val = 7;
                break;

            case "eight":
                val = 8;
                break;

            case "nine":
                val = 9;
                break;

            case "ten": case "jack": case "queen": case "king":
                val = 10;
                break;

            default: 
                val = 0;
                break;
        }

        return val;
    }

    public boolean isBlackjack(String card1, String card2) {
        int parseCard1 = parseCard(card1);
        int parseCard2 = parseCard(card2);
        boolean isBlackjack;

        if( parseCard1 + parseCard2 == 21) {
            isBlackjack = true;
        } else {
            isBlackjack = false;
        }

        return isBlackjack;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        
        //make use of hand score Val
        String largeHandStr;
        if(!isBlackjack && dealerScore == 11) {
            largeHandStr = "P";
        }else if(isBlackjack && (dealerScore == 11 || dealerScore == 10)) {
            largeHandStr = "S";
        }else if(isBlackjack && (dealerScore != 11 && dealerScore != 10)) {
            largeHandStr = "W";
        } else {
            largeHandStr = "";
        }
        return largeHandStr;
        
    }

    public String smallHand(int handScore, int dealerScore) {

        String smallHandStr;

        if(handScore >= 17) {
            smallHandStr = "S";
            
        } else if(handScore <= 11) {
            smallHandStr = "H";
            
        } else if((handScore >= 12 && handScore <= 16) && dealerScore >= 7) {
            smallHandStr = "H";
            
        } else if( (handScore >= 12 && handScore <= 16) && dealerScore < 7) {
            smallHandStr = "S";
            
        }  else {
            smallHandStr = "";
        }
        return smallHandStr;

    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
