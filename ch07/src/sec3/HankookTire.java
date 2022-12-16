package sec3;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation){
		super(maxRotation, location);
	}
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Michelin Tire 수명: "+(maxRotation);
			return true;
		} else {
			System.out.println();
		}
	}
}
