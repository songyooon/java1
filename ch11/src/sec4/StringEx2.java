package sec4;

public class StringEx2 {

	public static void main(String[] args) {
		String names = "김태엽&한태헌,안효준,고유진,유광현-이해나";
		//문자열을 배열요소로 형변환
		String[] name = names.split("&|,|-");
		for(String irum : name) {
			System.out.println(irum);
		}
		
		//Token : 구분자 또는 사용권
		
	}

}
