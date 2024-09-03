package se.iths.LektionsÖvningar;

public class ÖvningArray {

    // skapa en array med 3 platser
    // lägg in 3 värden i arrayen
    // lägg till ett 4:e värde i arrayen?

    public static void main(String[] args) {
        String[] vattenmeloner = {"nom", "nomnom", "nomnomnom"};

        String[] vattenmeloner2 = new String[vattenmeloner.length +1];
        for (int i = 0; i < vattenmeloner.length; i++) {
            vattenmeloner2[i] = vattenmeloner[i];

        }
        vattenmeloner2[3] = "nomx4";
        for (int i = 0; i < vattenmeloner2.length; i++) {
            System.out.println(vattenmeloner2[i]);
        }
}
}
