package fvs.edu.br.revisao.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.revisao.domain.RevisaoDomain;
import fvs.edu.br.revisao.service.RevisaoService;

@RestController
@RequestMapping(value="/revisao_domain")
public class RevisaoResource {
	
	@Autowired
	private RevisaoService service;
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public ResponseEntity<?> listar(@PathVariable Integer id) {
		RevisaoDomain domain = service.buscar(id);
		return ResponseEntity.ok().body(domain);
	}

}
