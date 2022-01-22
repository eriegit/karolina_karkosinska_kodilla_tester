public class SimpleArray {
    public static void main(String[] args) {
        String[] winterSports = new String[5];
        winterSports[0] = "Snowboarding";
        winterSports[1] = "Skiing";
        winterSports[2] = "Cross-country skiing";
        winterSports[3] = "Ice-skating";
        winterSports[4] = "Sledging";

        String winterSport = winterSports[3];

        System.out.println(winterSport);

        int numberOfElements = winterSports.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");


        for (int i = 0; i < winterSports.length; i++) {
            System.out.println(winterSports[i]);
        }
    }
}

