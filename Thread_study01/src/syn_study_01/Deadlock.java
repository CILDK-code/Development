package syn_study_01;
//����
public class Deadlock {
public static void main(String[] args) {
	Makeup girl1=new Makeup(1, "girl01");
	Makeup girl2=new Makeup(0, "girl02");
	girl1.start();
	girl2.start();
}
}
//�ں�
class Lipstick{
	
}
//����
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
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				synchronized(mirror) {
					System.out.println(this.girl+"�վ���");
				}
			}
		}else {
			synchronized (mirror) {
				System.out.println(this.girl+"�վ���");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lipstick) {
					System.out.println(this.girl+"��ÿں�");
				}
			}
		}
	}
}