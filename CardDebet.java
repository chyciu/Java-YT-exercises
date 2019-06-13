package JavaFmYouTube;

public class CardDebet {

    String cardNumbers[] = {"ABC", "CDE"};
    int accBallance[] = {2000, 750};
    String card;
    int accountBallance;
    int pay;

    public boolean checkCard(String card) {

        boolean result = false;
        for (int i = 0; i < cardNumbers.length; i++) {
            if (card.equalsIgnoreCase(cardNumbers[i])) ;
            {
                result = true;
            }
        }

        return result;
    }

    public int getAccountBallance(String card) {

        int result = 0;
        for (int i = 0; i < cardNumbers.length; i++) {
            if (card.equalsIgnoreCase(cardNumbers[i])) {
                result = accountBallance;
            }
        }

        return result;
    }

    public int updatedAccountBalance(String card, int pay) {

        for (int i = 0; i < cardNumbers.length; i++) {
            if (card.equalsIgnoreCase(cardNumbers[i])) {
                accBallance[i] = accBallance[i] - pay;
            }

        } return accountBallance;
    }
}

