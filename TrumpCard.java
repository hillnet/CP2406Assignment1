/**
 * Created by Matt on 30/08/2016.
 */
public class TrumpCard extends Card{

    public TrumpCard(String title, String economicValue){
        super(title, economicValue);
    }

    public String toString(){

        return "Card Name: " + cardTitle + " Category: " + cardEconomicValue + "\n";

    }
}
