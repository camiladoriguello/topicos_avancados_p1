package primeira.pro.camila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import primeira.pro.camila.entity.SalesmanEntity;
import primeira.pro.camila.repository.SalesmanRepository;

@SpringBootApplication
public class CamilaApplication implements CommandLineRunner{
	
	@Autowired
	private SalesmanRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CamilaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		SalesmanEntity salesman1 = new SalesmanEntity(1, "Camila", "35984475175", "14/04/2023", 5, true);
		repository.save(salesman1);
		
	}
	
}
