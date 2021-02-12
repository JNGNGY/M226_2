package Personen;

public class Chef extends Person {
    private String abteilung;

    public Chef(String name, String vorname, int alter, int personalNummer, String abt) {
        super(name, vorname, alter, personalNummer);
        abteilung = abt;
    }

    @Override
    public void print () {
        System.out.print("Chef: ");
        super.print();
        System.out.println(" Abteilung:" + abteilung + " Ferien:" + berechneFerien(alter));
    }

    @Override
    public int berechneFerien(int alter) {
        int ferien = 4;
        if (alter > 55) {
            ferien = 6;
        } else if(alter > 44) {
            ferien = 5;
        }
        return ferien;
    }
}
