package thread_study_01;

import org.apache.commons.io.filefilter.AbstractFileFilter;

/*
 * ��̬����
 * �����ӿ�
 * ��ʵ��ɫ
 * �����ɫ
 */
public class Static_proxy {
public static void main(String[] args) {
	new Wedding_company(new You()).happy_marry();
}
}
interface Marry{
	void happy_marry();
}
//��ʵ��ɫ
class You implements Marry {

	@Override
	public void happy_marry() {
		System.out.println("marry");
		
	}
	
}
//�����ɫ
class Wedding_company implements Marry{
	//��ʵ��ɫ
	private Marry target;
	public Wedding_company(Marry target) {
		this.target=target;
	}
	@Override
	public void happy_marry() {
		ready();
		target.happy_marry();
		after();
	}
	private void ready() {
		
	}
	private void after() {
		
	}
}