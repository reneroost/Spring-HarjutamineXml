package ee.sport.treening;

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

}
