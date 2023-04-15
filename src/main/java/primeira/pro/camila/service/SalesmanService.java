package primeira.pro.camila.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import primeira.pro.camila.dto.SalesmanDTO;
import primeira.pro.camila.entity.SalesmanEntity;
import primeira.pro.camila.repository.SalesmanRepository;

@Service
public class SalesmanService {
	
	private SalesmanRepository repository;
	
	@Autowired
	public SalesmanService(SalesmanRepository repository) {
		this.repository = repository;
	}
	
	public void createSalesman(SalesmanDTO salesman) {
		repository.save(toEntity(salesman));
	}

	public SalesmanEntity toEntity(SalesmanDTO salesman) {
		return new SalesmanEntity(salesman.getRegistry(), salesman.getName(), salesman.getWhatsApp(), salesman.getLastSaleDate(), salesman.getPerformanceRate(), true);
	}
	
	public SalesmanEntity findById(Long registry) {
		Optional<SalesmanEntity> obj = repository.findById(registry);
		SalesmanEntity entity = obj.orElseThrow(() -> new RuntimeException("Objeto não encontrado."));
		return entity;
	}
	
	public void changeActive (Long registry) {
        Optional<SalesmanEntity> obj = repository.findById(registry);
        SalesmanEntity entity = obj.orElseThrow(() -> new RuntimeException("Não foi possível ativar/desativar o objeto."));
        entity.setActive(!entity.isActive());
        repository.save(entity);
    }

}
