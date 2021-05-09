package nLayeredDemoTekrar.core.abstracts;

import nLayeredDemoTekrar.entities.concrete.Product;

public interface JLoggerService {
	
	void logToSystem(Product product, String message);
}
