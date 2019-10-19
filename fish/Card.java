package fish;

public class Card {
	
	private char suit;
	private char rank;
	
	public Card(char suit, char rank) {
		this.suit = suit;
		this.rank = rank;
	}
	public char getSuit() {
		return suit;
	}
	public char getRank() {
		return rank;
	}
	public void setSuit(char suit) {
		this.suit = suit;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
	public String toString() {
		return rank + " of " + suit;
	}
	

}
