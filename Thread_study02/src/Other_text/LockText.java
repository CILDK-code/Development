package Other_text;
/*
 * 可重入锁:锁可以重复使用
 */
public class LockText {
	public void text() {
		//第一次获得锁
		synchronized (this) {
			while (true) {
				//第二次获得相同的锁
				synchronized (this) {
					System.out.println("ReentrantLock");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
public static void main(String[] args) {
	
}
}
