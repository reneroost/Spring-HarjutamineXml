package ee.sport.teenused;

public class PositiivneEttekuulutusTeenus implements EttekuulutusTeenus {

	@Override
	public String saaEttekuulutus() {
		return "Täna on sinu õnnepäev!";
	}

}
