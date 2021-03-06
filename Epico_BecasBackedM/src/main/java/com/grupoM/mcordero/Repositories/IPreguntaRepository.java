package com.grupoM.mcordero.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;

//import java.util.List;

//import org.springframework.data.repository.query.Param;



import com.grupoM.mcordero.Entity.Pregunta;

@Transactional
@Repository
public interface IPreguntaRepository extends JpaRepository<Pregunta, Long> {
	//List<Pregunta>findPreguntas(Long pregLong);
	 	/*
		@Query(value="SELECT id, enunciado, tipo, seccion  FROM public.preguntas",nativeQuery=true)
	    public List<Pregunta> todasPreguntas();
	    @Query(value="SELECT id, enunciado, tipo, seccion FROM public.preguntas WHERE public.preguntas.estado =:name",nativeQuery=true) 
	    public List<Pregunta> preguntasActivas();
	    //"LIKE '%MXL%'
	     * 
	     * */

}
