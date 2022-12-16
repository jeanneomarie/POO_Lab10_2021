package facebook;

public class Main {
    public static void main(String[] args) {
        FacebookAccount account1 = new FacebookAccount("Andreea", 19, "Turda");
        FacebookAccount account2 = new FacebookAccount("Maria", 20, "Cluj");
        FacebookAccount account3 = new FacebookAccount("Vlad", 20, "Turda");
        FacebookAccount account4 = new FacebookAccount("Ana", 20, "Turda");
        FacebookAccount account5 = new FacebookAccount("Paula", 20, "Sighisoara");

        account1.adaugarePrieten(account2);
        account1.adaugarePrieten(account3);
        account1.adaugarePrieten(account4);
        account1.adaugarePrieten(account5);

        System.out.println("Prietenii userului: " + account1.getNume() + " sunt: ");
        account1.afisarePrieteni();
        System.out.println();

        System.out.println("Vrem sa stergem prietenul " + account2.getNume() + " din lista de prieteni al userului: " + account1.getNume());
        account1.stergerePrieten(account2);
        account1.afisarePrieteni();
        System.out.println();

        String locatie = "Turda";
        System.out.println("Prietenii din " + locatie + " al userului " + account1.getNume() + " sunt:");
        account1.afisarePrieteniLocatie(locatie);
    }
}
