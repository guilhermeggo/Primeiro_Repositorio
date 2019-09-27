package br.usjt.previsao.EnityManager;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.previsao.EntityManager.JPAUtil;
import br.usjt.previsao.model.DiaSemana;

public class TesteListaTodosJPQL {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from tb_DiasSemana");		
		List<DiaSemana> dias = query.getResultList();
		for (DiaSemana u : dias) {
			System.out.println(u);
		}
		manager.close();
		JPAUtil.close();
	}
}
