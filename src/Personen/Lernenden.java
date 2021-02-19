package Personen;

public class Lernenden extends Person {
    private int lehrjahr;

    public Lernenden(String name, String vorname, int alter, int personalNummer, int jahr) {
        super(name, vorname, alter, personalNummer);
        lehrjahr = jahr;
    }

    @Override
    public void print () {
        System.out.print("Lernenden: ");
        super.print();
        System.out.println("  Lehrjahr:" + lehrjahr + " Ferien:" + berechneFerien(alter) + " Woche");
    }

    @Override
    public int berechneFerien(int alter) {
        int ferien = 5;
        return ferien;
    }
}
