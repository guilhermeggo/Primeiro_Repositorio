package br.usjt.previsao.EnityManager;

import javax.persistence.EntityManager;

import br.usjt.previsao.EntityManager.JPAUtil;
import br.usjt.previsao.model.DiaSemana;

public class TesteBuscaPrevisaoComDiaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		DiaSemana u = manager.find(DiaSemana.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();
	}
}
