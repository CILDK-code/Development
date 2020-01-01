package thread_Co;
/*
 *  协作模型：生产者消费者实现方式二：信号灯法
 *  借助标志位
 */
public class Co_text02 {
	public static void main(String[] args) {
		Tv tv=new Tv();
		new Player(tv).start();
		new watcher(tv).start();
	}
}
//生产者 演员
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
//消费者 观众
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
//同一个资源 电视
class Tv{
	String voice;
	//信号灯
	//T表示演员表演 观众等待
	//F表示观众观看 演员等待
	boolean flag=true;
	
	//表演
	public synchronized void play(String voice) {
		//演员等待
		if (!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("表演了"+voice);
		this.voice=voice;
		//唤醒
		this.notifyAll();
		this.flag=!(this.flag);
	}
	//观看
	public synchronized void watch() {
		//观众等待
		if (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("听到了"+voice);
		this.notifyAll();
		this.flag=!(this.flag);
	}
}