package primeira.pro.camila.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import primeira.pro.camila.entity.SalesmanEntity;

@Repository
public interface SalesmanRepository extends JpaRepository<SalesmanEntity, Long>{

	/* public List<SalesmanEntity>findByActive(Boolean active); */
	
}