package sec2;

public class UtilObjectsEx2 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "김기태");
		Student s2 = new Student(2, "강병수");
		Student s3 = new Student(3, "고유진");
		Student s4 = s1; //얕은 복제 - 같은 메모리를 공유
		System.out.println(s1);
		System.out.println(s4);
		System.out.println(s1.hashCode());
		
	}

}
