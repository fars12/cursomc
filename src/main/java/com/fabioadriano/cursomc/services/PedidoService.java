package com.fabioadriano.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabioadriano.cursomc.domain.Pedido;
import com.fabioadriano.cursomc.repositories.PedidoRepository;
import com.fabioadriano.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nÃ£o encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
