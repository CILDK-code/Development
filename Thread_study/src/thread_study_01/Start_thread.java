package thread_study_01;
//�����̷߳�ʽһ(�̳�thread ��дrun)
public class Start_thread extends Thread {
	//�̵߳���ڵ�
	@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("talk is cheap");
			}
			
		}
public static void main(String[] args) {
	//�����������
	Start_thread st =new Start_thread();
	//����
	st.start();
	//st.run() ��ͨ�����ĵ��� ��ִ����run������Ĵ���������ִ��
	for(int i=0;i<20;i++) {
		System.out.println("show me the code");
	}
}
}
