package Other_text;
/*
 * ��������:�������ظ�ʹ��
 */
public class LockText {
	public void text() {
		//��һ�λ����
		synchronized (this) {
			while (true) {
				//�ڶ��λ����ͬ����
				synchronized (this) {
					System.out.println("ReentrantLock");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
public static void main(String[] args) {
	
}
}
