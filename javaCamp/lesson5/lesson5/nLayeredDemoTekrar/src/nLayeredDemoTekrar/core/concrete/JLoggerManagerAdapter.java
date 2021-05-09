package nLayeredDemoTekrar.core.concrete;

import nLayeredDemoTekrar.JLogger.JLoggerManager;
import nLayeredDemoTekrar.core.abstracts.JLoggerService;
import nLayeredDemoTekrar.entities.concrete.Product;

public class JLoggerManagerAdapter implements JLoggerService{

	@Override
	public void logToSystem(Product product, String message) {

		JLoggerManager jLoggerManager = new JLoggerManager();
		jLoggerManager.log(product, message);
	}

}
