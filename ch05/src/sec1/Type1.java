package sec1;

public class Type1 {

	public static void main(String[] args) {
		//Primitive Type(기본형) : 하나의 저장소(변수)에 하나의 데이터만 저장되는 타입
		//반드시 사용시에 초기화를 해야 함
		//기본형 자료는 단일 기억만 하므로 스택과 같은 기억장소에 저장된다
		//스택(stack)은 LIFO(last in first out)구조의 기억장소로 가장 마지막에 입력된 데이터가 가장 먼저 출력될 수 있다. (입구와 출구가 같은 하나의 입출구top가 있음/바닥은 bottom)
		//큐(queue는 FIFO 구조의 기억장소는 순서대로 입력되고 출력되므로 가장 처음에 입력된 것이 가장 먼저 출력된다. (입구rear와 출구front가 서로 다름)
		//데크(dequeue) 
		//리스트(list)
		//데드락(deadlock)=교착상태 -> 인터럽트로 살림  / 인터럽트는 무조건 스택에 저장됨  / cpu가 할 일을 정해주는 것 = 프로세스 스케줄링 (cpu는 순차처리로 FIFO임)
		//
		boolean a=true;
		byte b=120;
		char c='a';
		short d=150;
		int e=150;
		long f;
		float g;
		double h;
		//System.out.println(a);
		//System.out.println(e); - 변수e는 초기화 되어있지않으므로 사용하지 못함
		System.out.println(d==e);
		System.out.println(d!=e);
		//primitive type 변수는 타입이 달라도 값을 직접 비교함
	}

}
