package thread_study_01;
/*
 * lambda���ʽ�����߳�(��һ�λ���ٵĴ���)��ʹ��
 * 
 */
public class Lambda_thread {
	//��̬�ڲ���
	static class text1 implements Runnable{
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("talk is cheap");
		}
	}
	}
	public static void main(String[] args) {
		
		//�ֲ��ڲ���
		class text2 implements Runnable{
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("talk is cheap");
			}
		}
	}
		
		//�����ڲ����������ӿڻ��߸���
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("talk is cheap");
			}
				
			}
		}).start();
		//jdk8 �� lambda
new Thread(()-> {
				for(int i=0;i<20;i++) {
					System.out.println("talk is cheap");
			}
		}).start();
}
	
}
