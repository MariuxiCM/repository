package com.grupoM.mcordero.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupoM.mcordero.Entity.Encuesta;

public interface IEncuestaRepository extends JpaRepository<Encuesta, Long> {

	Optional<Encuesta> findById(Integer id);

	void deleteById(Integer id);

}
