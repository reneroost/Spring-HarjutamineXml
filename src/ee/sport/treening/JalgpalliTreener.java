package ee.sport.treening;

public class JalgpalliTreener implements Treener {
	
	public EttekuulutusTeenus ettekuulutusTeenus;
	
	public JalgpalliTreener() {}
	
	public JalgpalliTreener(EttekuulutusTeenus ettekuulutusTeenus) {
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
