package thread_study_01;
/*
 * lambda表达式，简化线程(用一次或很少的次数)的使用
 * 
 */
public class Lambda_thread {
	//静态内部类
	static class text1 implements Runnable{
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("talk is cheap");
		}
	}
	}
	public static void main(String[] args) {
		
		//局部内部类
		class text2 implements Runnable{
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("talk is cheap");
			}
		}
	}
		
		//匿名内部类必须借助接口或者父类
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("talk is cheap");
			}
				
			}
		}).start();
		//jdk8 简化 lambda
new Thread(()-> {
				for(int i=0;i<20;i++) {
					System.out.println("talk is cheap");
			}
		}).start();
}
	
}
