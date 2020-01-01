package syn_study_01;

import java.util.ArrayList;
import java.util.List;

public class Happy_cinema {
public static void main(String[] args) {
	//����λ��
	List<Integer> available=new ArrayList<>();
	available.add(1);
	available.add(5);
	available.add(6);
	available.add(2);
	available.add(3);
	available.add(9);
	available.add(10);
	//�˿���Ҫ��λ��
	List<Integer>seats01 =new ArrayList<>();
	seats01.add(1);
	seats01.add(2);
	List<Integer>seats02 =new ArrayList<>();
	seats02.add(4);
	seats02.add(5);
	seats02.add(6);

	Cinema c =new Cinema(available, "zx");
	new Thread(new Customer(c,seats01),"С��").start();
	new Thread(new Customer(c,seats02),"С��").start();
}

}
//�˿�
class Customer implements Runnable {
	Cinema cinema;
	List<Integer> seats;
	public Customer(Cinema cinema, List<Integer> seats) {
		this.cinema = cinema;
		this.seats = seats;
	}
	@Override
	public void run() {
		synchronized(cinema) {
		boolean flag = cinema.book_ticket(seats);
		if (flag) {
			System.out.println("��Ʊ�ɹ�"+Thread.currentThread().getName()+"-<λ��Ϊ"+seats);
		}else {
			System.out.println("��Ʊʧ��"+Thread.currentThread().getName());
		}
		}
	}
	
}



//ӰԺ
class Cinema{
	List<Integer> available;//���õ�λ��
	String name;//����
	public Cinema(List<Integer> available, String name) {
		this.available = available;
		this.name = name;
	}
	//��Ʊ
	public boolean book_ticket(List<Integer> seats) {
		System.out.println("����������"+available);
		List<Integer> copy=new ArrayList<Integer>();
		copy.addAll(available);
		
		//���
		copy.removeAll(seats);
		//�жϴ�С
		if (available.size()-copy.size()!=seats.size()) {
			return false;
		}
		//�ɹ�
		available=copy;
		return true;
	}
}
