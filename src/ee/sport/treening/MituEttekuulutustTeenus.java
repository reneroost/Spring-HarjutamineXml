package ee.sport.treening;

public class MituEttekuulutustTeenus implements EttekuulutusTeenus {

	private String[] ettekuulutused = {
		"Ainult kiireim lind saab ussi k�tte, aga aeglasem hiir saab juustu",
		"Tee tipu poole on konarlik, aga rahulduspakkuv",
		"�ra raha p�rast liigselt muretse! Parimad asjad elus on tasuta"
	};
	
	@Override
	public String saaEttekuulutus() {
		return ettekuulutused[(int) (Math.random() * 3)];
	}

}
