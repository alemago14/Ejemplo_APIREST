package com.ejemplo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.entidades.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, String>{

}
