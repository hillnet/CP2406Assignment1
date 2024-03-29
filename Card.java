
/**
 * Created by matt on 30/08/2016.
 */


public class Card {

    public String cardTitle;
    String cardChemistry;
    String cardClassification;
    String cardCrystalSystem;
    String cardOccurrence;
    double cardHardness;
    double cardSpecificGravity;
    String cardCleavage;
    String cardCrustalAbundance;
    String cardEconomicValue;

    Card(String title, String chemistry, String classification,
         String crystalSystem, String occurrence, double hardness,
         double specificGravity, String cleavage, String crystalAbundance,
         String economicValue){
        cardTitle = title;
        cardChemistry = chemistry;
        cardClassification = classification;
        cardCrystalSystem = crystalSystem;
        cardOccurrence = occurrence;
        cardHardness = hardness;
        cardSpecificGravity = specificGravity;
        cardCleavage = cleavage;
        cardCrustalAbundance = crystalAbundance;
        cardEconomicValue = economicValue;
    }

    Card(String title, String economicValue){
        cardTitle = title;
        cardEconomicValue = economicValue;
    }

    public String toString(){

        return "Card Name: " + cardTitle + " , Chemistry: " + cardChemistry + " , Classification: " + cardClassification + " , Crystal System: " + cardCrystalSystem +
                " , Occurrance: " + cardOccurrence + " , Hardness: " + cardHardness + " , Specific Gravity: " + cardSpecificGravity
                + " , Cleavage: " + cardCleavage + " , Crustal Abundance: " + cardCrustalAbundance + " , Economic Value: " + cardEconomicValue + "\n";

    }


}

