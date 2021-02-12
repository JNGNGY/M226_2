package Personen;

public class Fachangestellter extends Person {
    private Chef vorgesetzter;

    public Fachangestellter(String name, String vorname, int alter, int personalNummer, Chef c) {
        super(name, vorname, alter, personalNummer);
        vorgesetzter = c;
    }

    @Override
    public void print () {
        System.out.print("Fachangestellter: ");
        super.print();
        System.out.println(" Vorgesetzter:" + vorgesetzter.name + " Ferien:" + berechneFerien(alter));
    }

    @Override
    public int berechneFerien(int alter) {
        int ferien = 4;
        if (alter > 49) {
            ferien = 5;
        } else if(alter > 60) {
            ferien = 6;
        }
        return ferien;
    }
}
