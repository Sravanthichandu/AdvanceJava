package Many_to_One_Uni.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainController {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	}
}

