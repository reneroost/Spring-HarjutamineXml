package ee.sport.appid;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ee.sport.Treener;

public class AppTereSpring {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext kontekst = 
				new ClassPathXmlApplicationContext("rakenduseKontekst.xml");
		Treener treener =  null;
		
		System.out.println("Vali meeldiv trenn:\n1 - pesapall\n2 - kergejoustik");
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
		}
		
		System.out.println(treener.saaIgapaevaneTrenn());
		System.out.println(treener.saaIgapaevaneEttekuulutus());
		kontekst.close();
	}

}
