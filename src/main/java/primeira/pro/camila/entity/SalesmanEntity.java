package primeira.pro.camila.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesmanEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long registry;
	private String name;
	private String whatsApp;
	private String lastSaleDate;
	private int performanceRate;
	private boolean active;

}
