package thread_study_01;
/*
 * 创建线程方式二
 * 创建Runnable 重写run
 * 启动时 创建实现类对象+thread类对象+start
 */
public class Start_run implements Runnable{
@Override
public void run() {
	for(int i=0;i<20;i++) {
		System.out.println("talk is cheap");
}
}
public static void main(String[] args) {
	//创建实现类对象
	Start_run sr=new Start_run();
	//创建代理类对象
	Thread td =new Thread(sr);
	td.start();
	//new Thread(new Start_run()).start();
	for(int i=0;i<20;i++) {
		System.out.println("show me the code");
	}
}
}
