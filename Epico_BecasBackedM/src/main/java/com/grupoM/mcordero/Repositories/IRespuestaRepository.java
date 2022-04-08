package com.grupoM.mcordero.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.grupoM.mcordero.Entity.Respuesta;

public interface IRespuestaRepository extends JpaRepository<Respuesta, Long> {
	//List<Respuesta> findRespuestas(Long respuestaId);
	@Query(value="SELECT  id, tipo, puntos, opcion, id_pregunta WHERE public.respuestas",nativeQuery=true)
	//WHERE public.respuestas.todas LIKE '%MXL%'
    public List<Respuesta> todRespuestas();
    //@Query(value="SELECT  id, tipo, puntos, opcion, id_pregunta WHERE public.respuestas",nativeQuery=true)
    //public List<Respuesta> porRespuestas();
}
