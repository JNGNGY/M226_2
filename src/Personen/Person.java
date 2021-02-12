package Personen;

public abstract class Person {
    protected String name;
    protected String vorname;
    protected int personalNummer;
    protected int alter;

    public Person(String name, String vorname, int alter, int personalNummer) {
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
        this.alter = alter;
    }

    public void print() {
        System.out.println( name + " " + vorname + " Alter:" + alter + " Personalnummer:" + personalNummer);
    }

    // Methode wird vordefiniert die jede class haben muss
    public abstract int berechneFerien(int alter);
}



//Aufgabe 2
class Firma {
    public Person[] mitarbeiter;

    public Firma (Person[] p) {
        mitarbeiter = p;
    }
}
