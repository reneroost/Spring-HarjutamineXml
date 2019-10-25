package ee.sport.appid;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ee.sport.Treener;

public class AppBeanSkoopDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext kontekst = new ClassPathXmlApplicationContext("beanSkoop-rakenduseKontekst.xml");
		
		Treener treener = kontekst.getBean("kergejoustikuTreener", Treener.class);
		Treener alfaTreener = kontekst.getBean("kergejoustikuTreener", Treener.class);
		
		boolean vastus = (treener == alfaTreener);
		System.out.println("Viitavad samale objektile: " + vastus);
		
		System.out.println("\nAsukoht mälus.\ntreener: " + treener + "\nalfaTreener: " + alfaTreener);
		
		kontekst.close();
	}

}
