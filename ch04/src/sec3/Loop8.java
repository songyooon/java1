package sec3;

public class Loop8 {

	public static void main(String[] args) {
		//이중for문을 활용하여 아래와 같은 형태의 구구단을 출력
		// 2*1=2 3*1=3 ,............ 9*1=9
		//..............................
		//2*9=18 ,...................9*9=81
		
		int i=0, j=0;
		for(int i1=1;i1<=9;i1++)
			if(i1>9) break;
			int i1 = 0;
			for(int j1=1;j1<=9;i1++)
				if(j1>9) break;
				int j1 = 0;
				System.out.println(i1+"*"+j1+"="+i1*j1);

	}

}
