package log;

import abstracts.LogGenerator;
import singleton.*;

public class Logger {

	public static void main(String[] args) {
		String data = "Lorem Ipsum";
		String fileName = "log.txt";
		
		LogGenerator loggerA = EagerCreation.getInstance();
		loggerA.catchData(data);
		loggerA.writeData(data, fileName);
		loggerA.getInstanceCount();
		
		LogGenerator loggerB = EagerCreation.getInstance();
		loggerB.catchData(data);
		loggerB.writeData(data, fileName);
		loggerB.getInstanceCount();
	}
}
