package loosecouplinginjavaexample;

public class LooseCouplingExample {

	public static void main(String[] args) {
		Traveler tr = new Traveler();
		tr.setV(new Flight()); //inject flight dependency
		tr.startJourney();
		tr.setV(new Car());//inject car dependency
		tr.startJourney();

	}

}
