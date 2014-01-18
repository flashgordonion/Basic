
import ch.aplu.xboxcontroller.*;

/**
 * This class controls the information from the Xbox controller
 * @author Flash
 *
 */
public class ControllerHandler {
	
	public static void main(String args[]) {
		
		startController(1);
		
	}
	
	private static XboxController xc = null;
	
	/**
	 * 
	 * @param selection Controller to be used
	 * @return
	 */
	public static boolean startController(int selection) {
		
		xc = new XboxController(selection);
		
		if(!xc.isConnected()) return false;	
		
		xc.addXboxControllerListener(new ControllerListener());

		return true;
	}
	
	/**
	 * Releases control of the controller
	 * @return
	 */
	public boolean endController() {
		if (xc==null) return false;
		xc.release();
		return true;
	}
	
}
