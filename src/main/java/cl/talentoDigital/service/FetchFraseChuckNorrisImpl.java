package cl.talentoDigital.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.talentoDigital.model.FraseChuckNorris;

@Service
public class FetchFraseChuckNorrisImpl implements IFetchFraseChuckNorris {

	@Value("${endpoints.frase}")
	private String fraseEndpoint; // obteniendo el atributo desde el application. properties y asignándoselo a fraseEndpoint
	// para guardar la url de consulta al end point de la api
	private RestTemplate restTemplate;
	
	@Override
	public FraseChuckNorris fetchFraseChuckNorris() {
		return restTemplate.getForObject(fraseEndpoint, FraseChuckNorris.class) ;
		//es lo mismo que: return restTemplate.getForObject("https://api.chucknorris.io/jokes/random",  FraseChuckNorris.class) ;
	}
	
	public FetchFraseChuckNorrisImpl(RestTemplate restTemplateEntrante) {
		restTemplate=restTemplateEntrante;
	}

}
