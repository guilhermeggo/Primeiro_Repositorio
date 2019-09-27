package br.usjt.previsao.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsao.model.Previsao;
import br.usjt.previsao.repository.PrevisaoRepository;

@Service
public class PrevisaoService {
	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	//@Autowired
	//private Local local;
	
	public void salvar(Previsao previsao) {
		previsaoRepo.save(previsao);		
	}
	
	public List<Previsao> listarTodos(){
		List <Previsao> previsoes = previsaoRepo.findAll();
		//for(Previsao previsao : previsoes)	
			//previsao.setCidade(local.localizacao(previsao.getLongitude(), previsao.getLatitude()));
			
			return previsoes;
	}
}
