package sec1;

public class ThreadEx2 {

	public static void main(String[] args) {
		Thread th0 = new Thread(new ThreadWithTunnable());
		Thread th1 = new Thread(new ThreadWithRunnable());
		
		th1.setPriority(10);
		
		th0.start();
		th1.start();
		
		System.out.println("th0의 우선순위 : "+th0.getPriority());
		System.out.println("th1의 우선순위 : "th1.getPriority());

	}

}
