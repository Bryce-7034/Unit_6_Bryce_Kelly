public class War {
    public static void main(String [] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Player p1 = new Player(1, deck);
        Player p2 = new Player(2, deck);
        int round = 0;

        p1.startHand(26);
        p2.startHand(26);

        while(p1.getHand().size()>0&&p2.getHand().size()>0) {
            if (p1.getCard() > p2.getCard()) {
                p1.win(p2.lose());
            } else if (p1.getCard() < p2.getCard()) {
                p2.win(p1.lose());
            } else if (p1.getWar() > p2.getWar()) {
                p1.winWar(p2.loseWar());
            } else {
                p2.winWar(p1.loseWar());
            }
            round++;
            System.out.println("Round "+ round+ ":");
            System.out.println(p1);
            System.out.println(p2);
        }
        System.out.println(p1.getHand().size()>0?("Player 1, You Win: You get EGG"):p2.getHand().size()>0?("Player 2, You Win: You get WEG"):("ERROR"));
        System.out.println(round>=100 ? "This is why War is a bad game": "You are the 1/100 person to get a game under 100 rounds");
    }
}
