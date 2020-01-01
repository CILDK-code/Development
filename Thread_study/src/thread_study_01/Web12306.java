package thread_study_01;

public class Web12306 implements Runnable{
	private boolean flag = true;
	//Ʊ��
	private int ticketNums=10;
	@Override
		public void run() {
		while (flag) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			text();
		}
		}
	public void text () {
		if (ticketNums<=0) {
			flag=false;
			return;
		}
		synchronized(this) {
		if (ticketNums<=0) {
			flag=false;
			return;
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
	Web12306 web=new Web12306();
	//�������
	new Thread(web,"01").start();
	new Thread(web,"02").start();
	new Thread(web,"03").start();
}
}
