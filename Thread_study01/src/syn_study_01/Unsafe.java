package syn_study_01;


public class Unsafe {

}
 class Unsafe_Web12306 implements Runnable{
	//Ʊ��
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
	//һ����Դ
	Unsafe_Web12306 web=new Unsafe_Web12306();
	//�������
	new Thread(web,"01").start();
	new Thread(web,"02").start();
	new Thread(web,"03").start();
}
}