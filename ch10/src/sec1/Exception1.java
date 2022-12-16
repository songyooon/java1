package sec1;
//예외 처리
public class Exception1 {
	public static void main (String[] args) {
		String data = null;
		try {
			//실행해야 할 문장
			System.out.println(data.toString());
		} catch(NullPointerException e){
			//실행하다가 특정 예외가 발생시 처리 문장
			System.out.println("널 값은 문자열로 변경하여 출력하지 못함");
		} catch(Exception e){
			//실행하다가 장애 발생시 예외 클래스에 의해 처리해야 할 문장
			System.out.println("알 수 없는 장애로 인하여 실행이 계속되지 못함");
		}finally {
			//장애(예외)의 발생유무와 관계없이 반드시 실행할 문장
			System.out.println("종료");
		}
	}
}
