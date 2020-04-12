package br.com.af.mulheresTec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.af.mulheresTec.entity.Tecnologia;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long>{

}
