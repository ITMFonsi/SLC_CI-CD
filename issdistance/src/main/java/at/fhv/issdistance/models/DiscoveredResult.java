package at.fhv.issdistance.models;

// Start of user code (user defined imports)

// End of user code

public class DiscoveredResult {
	/**
	 * Description of the property message.
	 */
	public String message = null;
	
	/**
	 * Description of the property timestamp.
	 */
	public int timestamp = 0;
	
	/**
	 * Description of the property iss_position.
	 */
	public at.fhv.issdistance.models.ISS_position iss_position = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getMessage(){
		   return this.message;
		}
		
		public void setMessage(String message){
		   this.message = message;
		}
		
		public int getTimestamp(){
		   return this.timestamp;
		}
		
		public void setTimestamp(int timestamp){
		   this.timestamp = timestamp;
		}
		
		public at.fhv.issdistance.models.ISS_position getIss_position(){
		   return this.iss_position;
		}
		
		public void setIss_position(at.fhv.issdistance.models.ISS_position iss_position){
		   this.iss_position = iss_position;
		}
		
	
}
