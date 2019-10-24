package ee.sport.treening;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TereSpringApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext kontekst = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Treener treener =  null;
		
		System.out.println("Vali meeldiv trenn:\n1 - pesapall\n2 - kergejoustik\n3 - jalgpall");
		Scanner klaviatuur = new Scanner(System.in);
		int valik = klaviatuur.nextInt();
		klaviatuur.close();
		
		switch(valik) {
		case 1:
			treener = kontekst.getBean("pesapalliTreener", Treener.class);
			break;
		case 2:
			treener = kontekst.getBean("kergejoustikuTreener", Treener.class);
			break;
		case 3:
			treener = kontekst.getBean("jalgpalliTreener", Treener.class);
			break;
		}
		
		System.out.println(treener.saaIgapaevaneTrenn());
		System.out.println(treener.saaIgapaevaneEttekuulutus());
		kontekst.close();
	}

}
