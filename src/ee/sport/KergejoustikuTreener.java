package ee.sport;

import ee.sport.teenused.EttekuulutusTeenus;

public class KergejoustikuTreener implements Treener {
	
	public EttekuulutusTeenus ettekuulutusTeenus;
	
	public KergejoustikuTreener() {	}
	
	public KergejoustikuTreener(EttekuulutusTeenus ettekuulutusTeenus) {
		this.ettekuulutusTeenus = ettekuulutusTeenus;
	}
	
	@Override
	public String saaIgapaevaneTrenn() {
		return "Jookse tempokalt 5km";
	}
	
	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}
	
	public void teeMinuKaivitusTegevusi() {
		System.out.println("KergejoustikuTreener: teeMinuKaivitusTegevusi()");
	}
	
	public void teeMinuSulgemisTegevusiJouJou() {
		System.out.println("KergejoustikuTreener: teeMinuSulgemisTegevusiJouJou()");
	}

}
