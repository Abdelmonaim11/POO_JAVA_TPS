public class OccurrenceCounter {
    public int[] nb_Occurence = new int[26];
    public String ch;

    public OccurrenceCounter(String ch){
        this.ch = ch;
    }

    public void findOccurence() {
        ch = ch.toUpperCase();

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                nb_Occurence[c - 'A']++;
            }
        }
        System.out.println("La chaîne " + ch + " contient :");
        for (int i = 0; i < 26; i++) {
            if (nb_Occurence[i] > 0) {
                char lettre = (char) (i + 'A');
                System.out.println(nb_Occurence[i] + " fois la lettre '" + lettre + "'");
            }
        }
    }
}
