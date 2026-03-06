package app;

import model.Pet;
import service.PetService;

public class Main {

	public static void main1(String[] args) {
		Pet cachorro = new Pet("Luck", 5, "Fernando", "cachorro");
		System.out.println(cachorro.toString());
	}
	 public static void main(String[] args) {

	        PetService service = new PetService();

	        // CREATE
	        Pet pet1 = new Pet("Rex", 3, "Ana", "Cachorro");
	        service.cadastrar(pet1);

	        // READ
	        service.listarTodos();

	        // UPDATE
	        service.atualizar("Rex", 4, "Carlos");

	        // READ novamente
	        service.listarTodos();

	        // DELETE
	        service.remover("Rex");

	        // READ final
	        service.listarTodos();
	        // CREATE
	        
	        Pet pet11 = new Pet("Fred", 3, "Matheus", "Cachorro");
	        service.cadastrar(pet11);
	        
	        // CREATE
	        Pet pet2 = new Pet("Jorge", 3, "Matheus", "Cachorro");
	        service.cadastrar(pet2);
	        
	        // READ novamente
	        service.listarTodos();

	    }
	}

