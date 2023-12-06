package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository usuarioRepository;

	public ArrayList<UserModel> obtenerUsuarios() {
		return (ArrayList<UserModel>) usuarioRepository.findAll();
	}
	
	public UserModel guardarUsuario(UserModel u) {
		return usuarioRepository.save(u);
	}
}
