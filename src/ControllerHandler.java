
import ch.aplu.xboxcontroller.*;

/**
 * This class controls the information from the Xbox controller
 * @author Flash
 *
 */
public class ControllerHandler {
	
	public static void main(String args[]) {
		
		startController();
		
	}
	
	private static XboxController xc = null;
	
	/**
	 * 
	 * @param selection Controller to be used
	 * @return
	 */
	public static boolean startController() {
		
		xc = new XboxController(1, 1);
		
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
