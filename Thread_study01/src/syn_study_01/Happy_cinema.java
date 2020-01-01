package syn_study_01;

import java.util.ArrayList;
import java.util.List;

public class Happy_cinema {
public static void main(String[] args) {
	//可用位置
	List<Integer> available=new ArrayList<>();
	available.add(1);
	available.add(5);
	available.add(6);
	available.add(2);
	available.add(3);
	available.add(9);
	available.add(10);
	//顾客需要的位置
	List<Integer>seats01 =new ArrayList<>();
	seats01.add(1);
	seats01.add(2);
	List<Integer>seats02 =new ArrayList<>();
	seats02.add(4);
	seats02.add(5);
	seats02.add(6);

	Cinema c =new Cinema(available, "zx");
	new Thread(new Customer(c,seats01),"小明").start();
	new Thread(new Customer(c,seats02),"小李").start();
}

}
//顾客
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
			System.out.println("出票成功"+Thread.currentThread().getName()+"-<位置为"+seats);
		}else {
			System.out.println("出票失败"+Thread.currentThread().getName());
		}
		}
	}
	
}



//影院
class Cinema{
	List<Integer> available;//可用的位置
	String name;//名称
	public Cinema(List<Integer> available, String name) {
		this.available = available;
		this.name = name;
	}
	//购票
	public boolean book_ticket(List<Integer> seats) {
		System.out.println("可座的数量"+available);
		List<Integer> copy=new ArrayList<Integer>();
		copy.addAll(available);
		
		//相减
		copy.removeAll(seats);
		//判断大小
		if (available.size()-copy.size()!=seats.size()) {
			return false;
		}
		//成功
		available=copy;
		return true;
	}
}
