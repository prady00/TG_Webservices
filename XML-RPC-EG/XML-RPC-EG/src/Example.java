import org.apache.xmlrpc.WebServer;



public class Example {


	public String getStateName(int stateCode){
		// Fetch stateName from some source
		// Let's return Madhya Pradesh irrespective of stateCode
		return "Madhya Pradesh";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {

		     System.out.println("Attempting to start XML-RPC Server...");
		     WebServer server = new WebServer(8080);
		     server.addHandler("example", new Example());
		     server.start();
		     System.out.println("Started successfully.");
		     System.out.println("Accepting requests. (Halt program to stop.)");
		   } catch (Exception exception) {
		     System.err.println("JavaServer: " + exception);
		   }

	}

}
