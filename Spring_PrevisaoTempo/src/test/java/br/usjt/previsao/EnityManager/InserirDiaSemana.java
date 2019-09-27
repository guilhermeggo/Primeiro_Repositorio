package br.usjt.previsao.EnityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.previsao.EntityManager.JPAUtil;
import br.usjt.previsao.model.DiaSemana;

public class InserirDiaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaSemana u = new DiaSemana ();
		u.setDiaSemana("Domingo");		
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
