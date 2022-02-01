package com.ejemplo.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.entidades.Usuario;
import com.ejemplo.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {

	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	public ArrayList<Usuario> obtenerUsuarios(){
		return (ArrayList<Usuario>) usuarioRepo.findAll();
	}
	
	public Usuario registrar(Usuario user) {
		return usuarioRepo.save(user);
	}
}
