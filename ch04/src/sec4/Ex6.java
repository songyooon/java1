package sec4;

public class Ex6 {

	public static void main(String[] args) {
		

		for(int a=0;a<5;a++) {
			for(int b=0;b<=a;b++) {  //b<5-a ->역삼각형 모양으로 출력
			System.out.println("*");

		}

			System.out.println();

	}
		System.out.println("\n");
	
		for(int a=0;a<5;a++) {
			for(int b=0;b<5-a;b++) {
				System.out.println("*");
			}
			System.out.println("\n");
		
		for(int a1=0;a1<5;a1++) {
			for(int b=5;b>a1;b--) {
				System.out.println("*");
		}
		 System.out.println("\n");
		}
		
		}
	}
}
