package com.fabioadriano.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabioadriano.cursomc.domain.Cliente;
import com.fabioadriano.cursomc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
		+ id 
		+ ", Tipo: " 
		+ Cliente.class.getName()));
	}

}
