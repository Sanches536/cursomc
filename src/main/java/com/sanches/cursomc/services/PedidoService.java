package com.sanches.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanches.cursomc.domain.Pedido;
import com.sanches.cursomc.repositories.PedidoRepository;
import com.sanches.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository categoriaRepository;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
