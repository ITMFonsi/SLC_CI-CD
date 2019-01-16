package at.fhv.issdistance.handlers;

// Start of user code (user defined imports)

// End of user code

public class AnalysisHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static AnalysisHandler INSTANCE;
	
	private AnalysisHandler(){
	    // singleton
	}
	
	public static AnalysisHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new AnalysisHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.issdistance.models.DiscoveredResult analyze(String text, String token) throws Exception {
		// Start of user code analyze
		return null;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
