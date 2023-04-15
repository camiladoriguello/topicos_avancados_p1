package primeira.pro.camila.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import primeira.pro.camila.entity.SalesmanEntity;

@Data
@NoArgsConstructor
public class SalesmanDTO {

	private long registry;
	private String name;
	private String whatsApp;
	private String lastSaleDate;
	private int performanceRate;

	public SalesmanDTO(SalesmanEntity salesman) {

		this.registry = salesman.getRegistry();
		this.name = salesman.getName();
		this.whatsApp = salesman.getWhatsApp();
		this.lastSaleDate = salesman.getLastSaleDate();
		this.performanceRate = salesman.getPerformanceRate();
		
	}
}
