package sec1;

public class Oper3 {

	public static void main(String[] args) {
		//문자열 결합
		byte a='k',b='i',c='m';
		int d = 1004;
		System.out.println("d="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println(a+b+c+1004); //문자의 연산 결과는 숫자
		System.out.println("kim"+d); //문자열 결합
		//증감 연산자
		int k=1, l=1, m=1, n=1;
		System.out.println();
		System.out.println(k++); //출력 : 1 -> 계산 : 2 => 후위연산
		System.out.println(k);
		System.out.println(++l); //계산 : 2 -> 출력 : 2 => 전위연산
		System.out.println(l);
		System.out.println(m--); //출력 : 1 -> 계산 : 0 => 후위연산
		System.out.println(m);
		System.out.println(--n); //계산 : 0 -> 출력 : 0 => 전위연산
		System.out.println(n);
		
		//대입 연산자
		int p=20, r=30;
		p=p+1; //p++, ++p
		p+=2; //p=p+2 ->22
		r-=2; //r=r-2 -> 28 r을 2씩 감소시켜라
		System.out.println(p);
		System.out.println(r);
		p*=2; //p=p*2 -> 44
		r/=2; //r=r/2 -> 14
		System.out.println(p);
		System.out.println(r);
		
	}

}
