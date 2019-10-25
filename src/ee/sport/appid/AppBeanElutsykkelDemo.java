package ee.sport.appid;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ee.sport.Treener;

public class AppBeanElutsykkelDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext kontekst = new ClassPathXmlApplicationContext("beanElutsykkel-rakenduseKontekst.xml");
		
		Treener treener = kontekst.getBean("kergejoustikuTreener", Treener.class);
		System.out.println(treener.saaIgapaevaneTrenn());
		
		kontekst.close();
	}

}
