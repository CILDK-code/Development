package syn_study_01;
//死锁
public class Deadlock {
public static void main(String[] args) {
	Makeup girl1=new Makeup(1, "girl01");
	Makeup girl2=new Makeup(0, "girl02");
	girl1.start();
	girl2.start();
}
}
//口红
class Lipstick{
	
}
//镜子
class Mirror{
	
}
class Makeup extends Thread{
	static Lipstick lipstick=new Lipstick();
	static Mirror mirror =new Mirror();
	int choice;
	String girl;
	
	public Makeup(int choice, String girl) {
		this.choice = choice;
		this.girl = girl;
	}

	@Override
	public void run() {
		//化妆
		makeup();
	}
	//互相持有对方的对象锁--》造成死锁
	private void makeup() {
		if (choice==0) {
			synchronized (lipstick) {//获得口红的锁
				System.out.println(this.girl+"获得口红");
				//一秒后想拥有镜子的锁
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				synchronized(mirror) {
					System.out.println(this.girl+"照镜子");
				}
			}
		}else {
			synchronized (mirror) {
				System.out.println(this.girl+"照镜子");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lipstick) {
					System.out.println(this.girl+"获得口红");
				}
			}
		}
	}
}