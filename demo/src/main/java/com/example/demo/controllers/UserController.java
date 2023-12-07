package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/usuario")
public class UserController {

	@Autowired 
	UserService usuarioServicio;
	
	@GetMapping
	public ArrayList<UserModel> obtenerUsuarios() {
		return usuarioServicio.obtenerUsuarios();
	}
	
	@PostMapping
	public UserModel guardarUsuario(@RequestBody UserModel u) {
		return usuarioServicio.guardarUsuario(u);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<UserModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
		return usuarioServicio.obtenerPorId(id);
	}
	
	@GetMapping("query")
	public ArrayList<UserModel> obtenerPorPrioridad(@RequestParam("prioridad") Integer prio){
		return usuarioServicio.obtenerPorPrioridad(prio);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable Long id) {
		boolean ok = usuarioServicio.eliminarUsuario(id);
		if(ok) {
			return "Se eliminó correctamente el User con id " + id;
		}else {
			return "No se pudo eliminar el user con id " + id; 
		}
	}
	
}
