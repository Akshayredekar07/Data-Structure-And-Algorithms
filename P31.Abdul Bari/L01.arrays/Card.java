public class Card {
    int face;
    int shape;
    int color;

    public Card(int face, int shape, int color) {
        this.face = face;
        this.shape = shape;
        this.color = color;
    }

    public static void main(String[] args) {
        // Initializing a deck of 52 cards
        Card[] deck = new Card[52];

        // Populating the deck with cards
        int index = 0;
        for (int shape = 0; shape < 4; shape++) {
            for (int face = 1; face <= 13; face++) {
                // Example: shape 0 = clubs, 1 = diamonds, 2 = hearts, 3 = spades
                int color = (shape == 0 || shape == 3) ? 0 : 1; // clubs & spades = black (0), diamonds & hearts = red (1)
                deck[index++] = new Card(face, shape, color);
            }
        }

        // Example: printing the first card's face, shape, and color
        System.out.println("Card: Face " + deck[0].face + ", Shape " + deck[0].shape + ", Color " + deck[0].color);
    }
}
