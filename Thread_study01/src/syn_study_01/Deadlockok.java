package syn_study_01;

public class Deadlockok {
	public static void main(String[] args) {
		okMakeup girl1=new okMakeup(1, "girl01");
		okMakeup girl2=new okMakeup(0, "girl02");
		girl1.start();
		girl2.start();
	}
}
//口红
class okLipstick{
	
}
//镜子
class okMirror{
	
}
class okMakeup extends Thread{
	static okLipstick lipstick=new okLipstick();
	static okMirror mirror =new okMirror();
	int choice;
	String girl;
	
	public okMakeup(int choice, String girl) {
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
					e.printStackTrace();
				}
				}
			synchronized(mirror) {
				System.out.println(this.girl+"照镜子");
			}
		}else {
			synchronized (mirror) {
				System.out.println(this.girl+"照镜子");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			synchronized (lipstick) {
				System.out.println(this.girl+"获得口红");
			}
		}
	}
}