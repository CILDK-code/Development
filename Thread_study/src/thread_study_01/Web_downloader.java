package thread_study_01;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

//����ͼƬ
public class Web_downloader {
	public void downloader(String url,String name) {
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("���Ϸ���url");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("ͼƬ����ʧ��");
		}
	}
public static void main(String[] args) {
	
}
}
