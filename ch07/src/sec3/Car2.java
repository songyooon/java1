package sec3; //이렇게 배열로도 할수있음

public class Car2 {
	Tire[] tires = { new Tire(7, "앞왼쪽"),
	new Tire(4, "앞오른쪽"),
	new Tire(5, "뒤왼쪽"),
	new Tire(3, "뒤오른쪽")};
	
	public Car2() {}
	public int run() {
		System.out.println("-----자동차가 달립니다.------");
		for(int i=0;i<tires.length;i++){
			
		}
	}
}
