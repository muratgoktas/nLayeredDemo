package nLayeredDemo.core.adapter;

import nLayeredDemo.core.service.LoggerService;
import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
	private JLoggerManager jLoggerManager;

	public JLoggerManagerAdapter(JLoggerManager jLoggerManager) {
		super();
		this.jLoggerManager = jLoggerManager;
	}

	@Override
	public void logToSystem(String message) {
		this.jLoggerManager.log(message);

	}

}
