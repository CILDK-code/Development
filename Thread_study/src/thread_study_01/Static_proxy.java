package thread_study_01;

import org.apache.commons.io.filefilter.AbstractFileFilter;

/*
 * 静态代理
 * 公共接口
 * 真实角色
 * 代理角色
 */
public class Static_proxy {
public static void main(String[] args) {
	new Wedding_company(new You()).happy_marry();
}
}
interface Marry{
	void happy_marry();
}
//真实角色
class You implements Marry {

	@Override
	public void happy_marry() {
		System.out.println("marry");
		
	}
	
}
//代理角色
class Wedding_company implements Marry{
	//真实角色
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