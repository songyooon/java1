package sec2;

public class ListEx2 {
	//학생리스트 선언
	static List<Student> sList = new ArrayList<>();
	public static void main(String[] args) {
		
		boolean ck = true;
		int i = 0;
		while(ck){
		//작업번호: 1.학생추가 , 2.학생검색, 3.학생수정, 4.학생삭제, 5.작업종료
			System.out.print("작업 번호 : ");
			int num = sc.nextInt();
			Student s = new Student();
			switch(num){
				case 1:
					s.setNum(i);
					System.out.print("\n학생 이름 : ");
					s.setName(sc.next());
					System.out.print("\n학생 점수 : ");
					s.setJumsu(sc.nextInt());
					insert(s);
					break;
				case 2:
					System.out.print("검색할 학생 번호 : ");
					int bun = sc.nextInt();
					s = select(bun);
					System.out.println("학생 번호 : "+s.getNum());
					System.out.println("학생 이름 : "+s.getName());
					System.out.println("학생 점수 : "+s.getJumsu());
					break;
				case 3 :
					System.out.println("수정할 학생 번호 : ");
					int no = sc.nextInt();
					s.setNum(no);
					System.out.println("\n학생 이름 : ");
					s.setName(sc.next());
					System.out.println("\n학생 점수 : ");
					s.setJumsu(sc.nextInt());
					update(s);
					//
					break;
				case 4:
					System.out.println("삭제할 학생 번호 : ");
					int no2 = sc.nextInt();
					s.setNum(no2);
					delete(s);
					break;
				case 5:
					System.out.println("학생명단\n번호\t이름\t점수");
					for(int a=0;a<sList.size();i++){
						Student r = new Student();
						r = sList.get(a);
						int coll = r.getNum();
						String col2 = r.getName();
						int col3 = r.getJumsu();
						System.out.println(coll+"\t"+col2+"\t"+col3);
					}
					break;
				default;
					ck=true;
			}
			i++;
		}
	}
	static void insert (Student s){ // 학생추가
		sList.add(s); //리스트의 요소 추가
	}
	static Student select(int i){//학생 검색
		Student s = new Student();
		s = sList.get(i); //리스트의 요소 검색
		return s;
	}
	static void update(Student s) {//학생수정
		Student t = new Student();
		t.setNum(s.getNum());
		t.setName(s.getName());
		t.setJumsu(s.getJumsu());
		sList.set(s.getNum(),t); //리스트의 요소 값 변경
	}
	static void delete(Student s) {//학생삭제
		sList.remove(s.getNum()); //리스트의 요소 제거
	}
}
