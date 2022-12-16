package sec4;

public class Student {
	String name;
	int jum1;
	int jum2;
	int jum3;
	
	public Student() { }
	public Student(String name){ this.name = name; }
	public Student(String name, int jum1, int jum2, int jum3) {
		this.name = name;		this.jum1 = jum2;
		this.jum2 = jum2;		this.jum3 = jum3;
	}
	
	public int calcTot(){
		int tot = jum1+jum2+jum3; 
		return tot;
	}
	public double calcAvg(){
		double avg = (float) (Math.round((jum1+jum2+jum3)/3*100)/100); 
		return avg;
	}
	public String calHak(){
		String hak="";
		double avg = this.calcAvg();
		if(avg>=90) {
			hak="A";
		} else if(avg>=80){
			hak="B";
		} else if(avg>=70){
			hak="C";
		} else {
			hak="D";
		}
		return hak;
	}
	public String calcRes(){
		double avg = this.calcAvg();
		String res = "불합격";
		if(avg>=80) res="합격";
		return res;
	}
}