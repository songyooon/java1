package sec3;

public class Print2 {

	public static void main(String[] args) {
		int a=100;
		float b=3.14f;
		String c="김기태";
		System.out.printf("반지름이 %d인 원은 원주율 %f를 반영하여 원의 넓이가 %f 임. %s의 규칙", a, b, a*a*b, c);
		System.out.printf("%n10진수 %d는 8진수로 %o임", a, a);
		System.out.printf("%n10진수 %d는 16진수로 %x임", a, a);
		
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
		//byte result = byteValue + byteValue;
		//int result = 5 + byteValue;
		//float result = 5 + floatValue;
		//double result = 5 +doubleValue;
		
	}

}
