package br.usjt.previsao.model;

import org.junit.Assert;
import org.junit.Test;


public class PrevisaoTest {
	@Test
	public void alunoTest() {
		Previsao a = new Previsao();
		a.setId(1L);
		Assert.assertEquals(1L, a.getId(), 0);
	}
}
