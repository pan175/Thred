package shop.panhong.day02._04_thread_method;

//线程休眠 ,多用于模拟网络延迟
public class SleepDemo {
	public static void main(String[] args) throws Exception {
		for (int i = 10; i > 0; i--) {
			System.out.println("剩余" + i + "秒");
			Thread.sleep(1000);
		}
		System.out.println("Boom");
	}
}
