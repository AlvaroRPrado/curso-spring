package com.algaworks.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Cerveja;
import com.algaworks.brewer.repository.filter.CervejaFilter;

@Repository
public interface Cervejas extends JpaRepository<Cerveja,  Long> {
	
	public Optional<Cerveja> findBySkuIgnoreCase(String sku);

	public Object filtrar(CervejaFilter cervejaFilter);
	
}
