package assertions;

public class ControlFlow {

	public static void main(String[] args) {
		String suit = "Card";
		switch (suit) {
		case "Clubs":
			System.out.println("Clubs");
			break;
		case "Diamonds":
			System.out.println("Diamonds");
			break;
		case "Hearts" :
			System.out.println("Hearts");
			break;
		case "Spades" :
			System.out.println("Spades");
		default:
			assert false : "Unknow playing card suit";
			break;
		}

	}

}
