package br.usjt.previsao.EnityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.previsao.EntityManager.JPAUtil;
import br.usjt.previsao.model.DiaSemana;
import br.usjt.previsao.model.Previsao;

public class TesteInserePrevisaoComDiaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaSemana p = new DiaSemana ();
		p.setDiaSemana("Domingo");
		manager.persist(p);
		Previsao u = new Previsao();
		u.setCidade("São Paulo");
		u.setDescricao("Frio");
		u.setHora("12:00");
		u.setHumidade(80);
		u.setTempmax(18);
		u.setTempmin(8);
		u.setSemana(p);
		manager.persist(u);
		transaction.commit();

		manager.close();
		JPAUtil.close();
	}
}
