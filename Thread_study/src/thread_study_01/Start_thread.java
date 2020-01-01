package thread_study_01;
//创建线程方式一(继承thread 重写run)
public class Start_thread extends Thread {
	//线程的入口点
	@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("talk is cheap");
			}
			
		}
public static void main(String[] args) {
	//创建子类对象
	Start_thread st =new Start_thread();
	//启动
	st.start();
	//st.run() 普通方法的调用 会执行完run方法里的代码再向下执行
	for(int i=0;i<20;i++) {
		System.out.println("show me the code");
	}
}
}
