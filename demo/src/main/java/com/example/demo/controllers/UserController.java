package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
