package fvs.edu.br.revisao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.revisao.domain.RevisaoDomain;
import fvs.edu.br.revisao.repository.RevisaoRepository;

@Service
public class RevisaoService {

	@Autowired
	private RevisaoRepository repository;
	
	public RevisaoDomain buscar(Integer id) {
		Optional<RevisaoDomain> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
