package thread_Co;
/*
 *  Э��ģ�ͣ�������������ʵ�ַ�ʽ�����źŵƷ�
 *  ������־λ
 */
public class Co_text02 {
	public static void main(String[] args) {
		Tv tv=new Tv();
		new Player(tv).start();
		new watcher(tv).start();
	}
}
//������ ��Ա
class Player extends Thread{
	Tv tv;
	public Player(Tv tv) {
		this.tv = tv;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			this.tv.play("STN");
		}

	}
}
//������ ����
class watcher extends Thread{
	Tv tv;
	public watcher(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void run() {
		for(int j=0;j<20;j++) {
			tv.watch();
		}
	}
}
//ͬһ����Դ ����
class Tv{
	String voice;
	//�źŵ�
	//T��ʾ��Ա���� ���ڵȴ�
	//F��ʾ���ڹۿ� ��Ա�ȴ�
	boolean flag=true;
	
	//����
	public synchronized void play(String voice) {
		//��Ա�ȴ�
		if (!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("������"+voice);
		this.voice=voice;
		//����
		this.notifyAll();
		this.flag=!(this.flag);
	}
	//�ۿ�
	public synchronized void watch() {
		//���ڵȴ�
		if (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("������"+voice);
		this.notifyAll();
		this.flag=!(this.flag);
	}
}