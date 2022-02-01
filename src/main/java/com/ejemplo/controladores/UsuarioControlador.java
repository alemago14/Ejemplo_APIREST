package com.ejemplo.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.entidades.Usuario;
import com.ejemplo.servicios.UsuarioServicio;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio usuarioServ;
	
	@GetMapping
	public ArrayList<Usuario> obtenerUsuarios(){
		return usuarioServ.obtenerUsuarios();
	}
	
	@PostMapping
	public Usuario registrar(@RequestBody Usuario user) {
		return this.usuarioServ.registrar(user);
	}
}
