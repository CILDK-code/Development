package thread_study_01;
/*
 * �����̷߳�ʽ��
 * ����Runnable ��дrun
 * ����ʱ ����ʵ�������+thread�����+start
 */
public class Start_run implements Runnable{
@Override
public void run() {
	for(int i=0;i<20;i++) {
		System.out.println("talk is cheap");
}
}
public static void main(String[] args) {
	//����ʵ�������
	Start_run sr=new Start_run();
	//�������������
	Thread td =new Thread(sr);
	td.start();
	//new Thread(new Start_run()).start();
	for(int i=0;i<20;i++) {
		System.out.println("show me the code");
	}
}
}
