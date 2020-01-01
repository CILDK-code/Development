package Other_text;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_text_01 {
public static void main(String[] args) {
	Timer timer=new Timer();
	//执行安排
	timer.schedule(new MyTask(), 1000);//执行一次
	timer.schedule(new MyTask(), 1000,200);
}
}
class MyTask extends TimerTask{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("hello world");
		}
		System.out.println("-----------end-----");
		System.out.println("hello java");
	}
}
