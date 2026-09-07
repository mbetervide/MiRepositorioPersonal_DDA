package uy.edu.ort.DDA.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class HolamundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolamundoApplication.class, args);
	}

	@RestController 
	public class HolaMundoController{

		//decorar - mapear a la raíz del proyecto o carpeta x
		//GET - verbo para acceder a url
		//get, put, delete, post, patch - tengo otras acciones
		@GetMapping("/holaMundo")
		public String holaMundo(){
			return "Hola mundillo";
		}

	}

}
