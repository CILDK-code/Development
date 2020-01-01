package thread_study_01;
/*
 * 模拟龟兔赛跑
 */
public class Racer implements Runnable{
	private static String winner;
@Override
public void run() {
	for(int steps=1;steps<=100;steps++) {
		System.out.println(Thread.currentThread().getName()+"-->"+steps);
		boolean flag =game_over(steps);
		if (flag) {
			break;
		}
	}

}
private boolean game_over(int steps) {
	if (winner!=null) {//有胜利者
		return true;
	}else {
		if (steps==100) {
			winner=Thread.currentThread().getName();
			System.out.println("winner"+"-->"+winner);
			return true;
		}
	}
	return false;
}
public static void main(String[] args) {
	Racer racer =new Racer();
	new Thread(racer,"tortoise").start();
	new Thread(racer,"rabbit").start();
}
}
