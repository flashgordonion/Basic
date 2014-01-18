import ch.aplu.xboxcontroller.XboxControllerListener;


public class ControllerListener implements XboxControllerListener {
	
	public enum Direction { UP, UPRIGHT, RIGHT, DOWNRIGHT, DOWN,
	DOWNLEFT, LEFT, UPLEFT
	}
	
	private Direction currDirect;
	
	
	@Override
	public void back(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buttonA(boolean isPressed) {
		if (isPressed) {
			switch(currDirect) {
			case UP:
				System.out.print('c');
				break;
			case UPRIGHT:
				System.out.print('g');
				break;
			case RIGHT:
				System.out.print('k');
				break;
			case DOWNRIGHT:
				System.out.print('o');
				break;
			case DOWN:
				System.out.print('s');
				break;
			case DOWNLEFT:
				System.out.print('w');
				break;
			case LEFT:
				System.out.print('.');
				break;
			case UPLEFT:
				System.out.print(';');
				break;	
			default:
				break;
			}
		
		}

	}

	@Override
	public void buttonB(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buttonX(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buttonY(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dpad(int arg0, boolean arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void isConnected(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void leftShoulder(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void leftThumb(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	/**
	 * Determines which section the pad is in
	 */
	public void leftThumbDirection(double direction) {
		if (337.5 < direction || direction <= 22.5) {
			currDirect = Direction.UP;
			//TODO send a message for a direction
		}
		else if (22.5 < direction && direction <= 67.5) {
			currDirect = Direction.UPRIGHT;
		}
		else if (67.5 < direction && direction <= 112.5) {
			currDirect = Direction.RIGHT;
		}
		else if (112.5 < direction && direction <= 157.5) {
			currDirect = Direction.DOWNRIGHT;
		}
		else if (157.5 < direction && direction <= 202.5) {
			currDirect = Direction.DOWN;
		}
		else if (202.5 < direction && direction <= 247.5) {
			currDirect = Direction.DOWNLEFT;
		}
		else if (247.5 < direction && direction <= 292.5) {
			currDirect = Direction.LEFT;
		}
		else if (292.5 < direction && direction <= 337.5) {
			currDirect = Direction.UPLEFT;
		}
	}

	@Override
	public void leftThumbMagnitude(double arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void leftTrigger(double arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rightShoulder(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rightThumb(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rightThumbDirection(double arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rightThumbMagnitude(double arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rightTrigger(double arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(boolean arg0) {
		// TODO Auto-generated method stub

	}

}
