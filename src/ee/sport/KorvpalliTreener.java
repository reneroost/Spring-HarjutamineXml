package ee.sport;

import ee.sport.teenused.EttekuulutusTeenus;

public class KorvpalliTreener implements Treener {

	private EttekuulutusTeenus ettekuulutusTeenus;
	
	private String emailiAadress;
	private String meeskond;
	
	public KorvpalliTreener() {
		// System.out.println("KorvpalliTreener: ilma argumentideta konstruktori sees");
	}
	
	public String getEmailiAadress() {
		return emailiAadress;
	}

	public void setEmailiAadress(String emailiAadress) {
		this.emailiAadress = emailiAadress;
	}

	public String getMeeskond() {
		return meeskond;
	}

	public void setMeeskond(String meeskond) {
		this.meeskond = meeskond;
	}

	public void setEttekuulutusTeenus(EttekuulutusTeenus ettekuulutusTeenus) {
		// System.out.println("KorvpalliTreener: setteri meetodi sees - setEttekuulutusTeenus");
		this.ettekuulutusTeenus = ettekuulutusTeenus;
	}
	
	@Override
	public String saaIgapaevaneTrenn() {
		return "Soorita 100 kolmepunktiviset";
	}

	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}

}
