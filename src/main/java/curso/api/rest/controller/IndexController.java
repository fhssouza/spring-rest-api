package curso.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.api.rest.model.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<String> init(@RequestParam (value = "nome", required = true, defaultValue = "Nome não informado") String nome, @RequestParam("salario") long salario) {
		System.out.println("Parametro sendo recebido " + nome + " Salario é: " + salario);
		return new ResponseEntity<String>("Olá Usuário REST Spring Boot seu nome é " + nome + " Salario é: " + salario, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<Usuario> usuario(){
		
		Usuario usuario = new Usuario();
		usuario.setId(50L);
		usuario.setLogin("fhssouza@gmail.com");
		usuario.setNome("Fábio Souza");
		usuario.setSenha("123456");
		
		return ResponseEntity.ok(usuario);
		
	}

}
