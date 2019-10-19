package fish;

import java.util.ArrayList;

class Player {
    private int unknown_cards = 0;
    private ArrayList<Card> known_cards = ArrayList();
}

public int get_unknown_cards() {
    return unknown_cards;
}

public ArrayList<Card> get_known_cards() {
    return known_cards;
}

public void set_unknown_cards(int offset) {
    unknown_cards += offset;
}

public void add_known_cards(Card card) {
    known_cards.add(card);
    return;
}

public boolean remove_known_cards(Card card) {
    return known_cards.remove(card);
}
