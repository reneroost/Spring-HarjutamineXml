package ee.sport;

import ee.sport.teenused.EttekuulutusTeenus;

public class PesapalliTreener implements Treener {
	
	public EttekuulutusTeenus ettekuulutusTeenus;
	
	public PesapalliTreener() {}
	
	public PesapalliTreener(EttekuulutusTeenus ettekuulutusTeenus) {
		this.ettekuulutusTeenus = ettekuulutusTeenus;
	}
	
	@Override
	public String saaIgapaevaneTrenn() {
		return "Kuluta 30 min löögitrennis";
	}
	
	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}

}
