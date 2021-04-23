public class Deck {
    public static void main(String[] args) {
        String[] Suits = {
                "C1", "C2", "C3", "C4", "C5", "C6","C7","C8","C9","C10",
                "C11","C12","C13","C14","C15","C16","C17","C18","C19","C20",
                "C21","C22","C23","C24","C25"
        };

        String[] Ranks = {
                "1", "2",
        };

        // initialize deck
        int n = Suits.length * Ranks.length;
        String[] Deck = new String[n];
        for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                Deck[Suits.length*i + j] = " The " + Ranks[i] + " of " + Suits[j];
            }
        }


    }

}
