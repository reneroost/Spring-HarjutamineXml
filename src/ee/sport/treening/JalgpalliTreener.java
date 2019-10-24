package ee.sport.treening;

public class JalgpalliTreener implements Treener {
	
	public EttekuulutusTeenus ettekuulutusTeenus;
	
	private String emailiAadress;
	private String meeskond;
	
	public JalgpalliTreener() {
		// System.out.println("JalgpalliTreener: ilma argumentideta konstruktori sees");
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
		// System.out.println("JalgpalliTreener: setteri meetodi sees - setEttekuulutusTeenus");
		this.ettekuulutusTeenus = ettekuulutusTeenus;
	}
	
	@Override
	public String saaIgapaevaneTrenn() {
		return "Soorita 120 tsenderdust viiekasti";
	}
	
	@Override
	public String saaIgapaevaneEttekuulutus() {
		return "Lihtsalt tee seda: " + ettekuulutusTeenus.saaEttekuulutus();
	}
	
}
