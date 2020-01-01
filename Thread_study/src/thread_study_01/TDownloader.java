package thread_study_01;

public class TDownloader extends Thread{
	private String url;//远程路径
	private String name;//储存名字
public TDownloader(String url, String name) {

		this.url = url;
		this.name = name;
	}
@Override
public void run() {
	Web_downloader wd=new Web_downloader();
	wd.downloader(url, name);
}
public static void main(String[] args) {
	TDownloader td1=new TDownloader("https://gss1.bdstatic.com/-vo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike150%2C5%2C5%2C150%2C50/sign=79bd3f0077cb0a46912f836b0a0a9d41/b17eca8065380cd7e46d7f17ad44ad34588281dd.jpg","src/photo01.jpg");
	TDownloader td2=new TDownloader("https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E9%A3%8E%E6%99%AF&step_word=&hs=2&pn=2&spn=0&di=92892078090&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1145214342%2C184623774&os=1022290136%2C3034175927&simid=2045515360%2C1006451733&adpicid=0&lpn=0&ln=1959&fr=&fmq=1543406681901_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=13&oriquery=&objurl=http%3A%2F%2Fimgsrc.baidu.com%2Fimage%2Fc0%3Dshijue1%2C0%2C0%2C294%2C40%2Fsign%3D8a953b1817950a7b6138468762b808ac%2F03087bf40ad162d9344e02321bdfa9ec8a13cd78.jpg&fromurl=ipprf_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bev2_z%26e3Bv54AzdH3Fv6jwptejAzdH3F8aad8nadna&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&selected_tags=0","src/photo02");
	TDownloader td3=new TDownloader("https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E9%A3%8E%E6%99%AF&step_word=&hs=2&pn=3&spn=0&di=84786860530&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=3390961998%2C1154407883&os=1786802556%2C2337283776&simid=4126778891%2C557878256&adpicid=0&lpn=0&ln=1959&fr=&fmq=1543406681901_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=13&oriquery=&objurl=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F7acb0a46f21fbe09334115c061600c338644adc3.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bp7h7vitgw_z%26e3BvgAzdH3F6AzdH3Fri5p5AzdH3FetjoAzdH3Ft1AzdH3Fdnccmna0a9lcAzdH3F&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&selected_tags=0","src/photo03");
	
	//启动三个线程
	td1.start();
	td2.start();
	td3.start();
}
}
