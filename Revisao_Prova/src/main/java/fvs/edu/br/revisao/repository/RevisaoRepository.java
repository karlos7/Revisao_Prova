package fvs.edu.br.revisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.revisao.domain.RevisaoDomain;

@Repository
public interface RevisaoRepository extends JpaRepository<RevisaoDomain, Integer>{

}
