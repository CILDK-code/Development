package thread_Co;

import java.awt.Container;

/*
 * Э��ģ�ͣ�������������ʵ�ַ�ʽһ���̷ܳ�
 * ����������
 */
public class Co_text01 {
public static void main(String[] args) {
	SynContainer container=new SynContainer();
	new Productor(container).start();
	new Consumers(container).start();
}
}
//������
class Productor extends Thread{
	SynContainer container;
	
	public Productor(SynContainer container) {
		this.container = container;
	}

	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("����---"+i+"����ͷ");
			container.push(new Steamedbun(i));
		}

	}
}
//������
class Consumers extends Thread{
	SynContainer container;
	public Consumers(SynContainer container) {
		this.container = container;
	}
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("����---"+container.pop().id+"����ͷ");
		}

	}
}
//������
class SynContainer{
	Steamedbun[] buns=new Steamedbun[100];//�洢����
	int count=0;//������
	//���� ����
	public synchronized void push(Steamedbun bun) {
		//��ʱ������
		if (count==buns.length) {
			try {
				this.wait();//�߳����� ������֪ͨ�������
			} catch (InterruptedException e) {
			}
		}
		buns[count]=bun;
		count++;
		//���������ˣ���������
		this.notifyAll();
	}
	//��ȡ
	public synchronized Steamedbun pop() {
		//��ʱ������
		if (count==0) {
			try {
				this.wait();//�߳�������������֪ͨ���ѽ������
			} catch (InterruptedException e) {
			}
		}
		count--;
		Steamedbun bun=buns[count];
		this.notifyAll();//���ڿռ䣬���ѶԷ�����
		return bun;
	}
}
//��ͷ
class Steamedbun{
	int id;

	public Steamedbun(int id) {

		this.id = id;
	}

	}
