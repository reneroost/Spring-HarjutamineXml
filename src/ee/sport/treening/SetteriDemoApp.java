package ee.sport.treening;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetteriDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext kontekst = 
				new ClassPathXmlApplicationContext("rakenduseKontekst.xml");
		JalgpalliTreener jalgpalliTreener = kontekst.getBean("jalgpalliTreener", JalgpalliTreener.class);
		KorvpalliTreener korvpalliTreener = kontekst.getBean("korvpalliTreener", KorvpalliTreener.class);
		
		System.out.println("Vali meeldiv trenn:\n1 - jalgpall\n2 - korvpall");
		Scanner klaviatuur = new Scanner(System.in);
		int valik = klaviatuur.nextInt();
		klaviatuur.close();
		
		switch(valik) {

		case 1:
			System.out.println(jalgpalliTreener.saaIgapaevaneTrenn());
			System.out.println(jalgpalliTreener.saaIgapaevaneEttekuulutus());
			System.out.println(jalgpalliTreener.getEmailiAadress());
			System.out.println(jalgpalliTreener.getMeeskond());
			break;
		case 2:
			System.out.println(korvpalliTreener.saaIgapaevaneTrenn());
			System.out.println(korvpalliTreener.saaIgapaevaneEttekuulutus());
			System.out.println(korvpalliTreener.getEmailiAadress());
			System.out.println(korvpalliTreener.getMeeskond());
			break;
		}
		
		kontekst.close();
	}
}
