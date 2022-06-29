
public class ThreadEx2 {
	static long startTime = 0L;
	public static void main(String[] args) {
		ThreaderA tha = new ThreaderA();
		ThreaderB thb = new ThreaderB();
		
		tha.start();
		thb.start();
		startTime = System.currentTimeMillis();
		try {
			tha.join();
			thb.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis() - ThreadEx2.startTime);
	}

}
