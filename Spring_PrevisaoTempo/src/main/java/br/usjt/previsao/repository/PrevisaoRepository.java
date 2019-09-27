package br.usjt.previsao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsao.model.Previsao;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {

}
