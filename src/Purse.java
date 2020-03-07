import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<Coin>();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        int sum = 0;
        for(int i = 0; i<coins.size(); i++){
            sum += coins.get(i).getValue();
        }
        return sum;
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        int num = 0;
        for(int i = 0; i<coins.size(); i++){
            if(coins.get(i).equals(aCoin)){
                num++;
        }
    }
    return num;
}
    public String findSmallest() {
        double valMax = 9999;
        int maxIdx = 0;
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).getValue() < valMax) {
                valMax = coins.get(i).getValue();
                maxIdx = i;
            }
        }
        return coins.get(maxIdx).getName();
    }
}

