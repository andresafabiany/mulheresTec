package br.com.af.mulheresTec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.af.mulheresTec.entity.Mulher;

@Repository
public interface MulherRepository extends JpaRepository<Mulher, Long>{

}
