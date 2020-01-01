package syn_study_01;


public class Unsafe {

}
 class Unsafe_Web12306 implements Runnable{
	//票数
	private int ticketNums=99;
	@Override
		public void run() {
		while (true) {
			if (ticketNums<0) {
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
		}
			
		}
public static void main(String[] args) {
	//一份资源
	Unsafe_Web12306 web=new Unsafe_Web12306();
	//多个代理
	new Thread(web,"01").start();
	new Thread(web,"02").start();
	new Thread(web,"03").start();
}
}