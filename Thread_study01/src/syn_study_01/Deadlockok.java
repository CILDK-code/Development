package syn_study_01;

public class Deadlockok {
	public static void main(String[] args) {
		okMakeup girl1=new okMakeup(1, "girl01");
		okMakeup girl2=new okMakeup(0, "girl02");
		girl1.start();
		girl2.start();
	}
}
//�ں�
class okLipstick{
	
}
//����
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
		//��ױ
		makeup();
	}
	//������жԷ��Ķ�����--���������
	private void makeup() {
		if (choice==0) {
			synchronized (lipstick) {//��ÿں����
				System.out.println(this.girl+"��ÿں�");
				//һ�����ӵ�о��ӵ���
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			synchronized(mirror) {
				System.out.println(this.girl+"�վ���");
			}
		}else {
			synchronized (mirror) {
				System.out.println(this.girl+"�վ���");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			synchronized (lipstick) {
				System.out.println(this.girl+"��ÿں�");
			}
		}
	}
}