package sec2;

public class Bus1 extends Car {

	@Override
	public int run() {
		System.out.println("버스가 달립니다.");
		return super.run();
	}

	@Override
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
}