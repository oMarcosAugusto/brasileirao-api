package brasileiraoapi.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import brasileiraoapi.dto.PartidaGoogleDTO;

public class ScrapingUtil {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ScrapingUtil.class);
	private static final String BASE_URL_GOOGLE = "https://www.google.com/search?q=";
	private static final String COMPLEMENTO_URL_GOOGLE = "&hl=pt-BR";
	
	public static void main(String[] args) {
		String url = BASE_URL_GOOGLE + "athletico+x+palmeiras+25/10/2022" + COMPLEMENTO_URL_GOOGLE;
		
		ScrapingUtil scraping = new ScrapingUtil();
		scraping.obtemInformacoesPartida(url);
	}
	
	public PartidaGoogleDTO obtemInformacoesPartida(String url) {
		PartidaGoogleDTO partida = new PartidaGoogleDTO();
		
		Document document = null;
		
		try {
			document = Jsoup.connect(url).get();
			
			String title = document.title();
			LOGGER.info("Titulo da pagina: {}", title);
		} catch (IOException e) {
			LOGGER.error("Erro ao tentar conectar no Google com JSOUP -> {}", e.getMessage());
		}
		
		return partida;
	}
}
