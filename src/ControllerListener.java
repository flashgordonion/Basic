import ch.aplu.xboxcontroller.XboxControllerListener;

public class ControllerListener implements XboxControllerListener {

	public enum Direction {
		UP, UPRIGHT, RIGHT, DOWNRIGHT, DOWN, DOWNLEFT, LEFT, UPLEFT, NONE
	}

	private double magnitude;
	private Direction currDirect = Direction.NONE;
	private GameTyperView viewGUI;
	private boolean goodToGo = false;
	private boolean inAltMode = false;
	private boolean lastLBpressed = false;
	private boolean lastRBpressed = false;
	
	public ControllerListener() {
		viewGUI = new GameTyperView();
		viewGUI.setVisible(true);
	}

	@Override
	public void back(boolean isPressed) {
		viewGUI.appendText("BACK");
	}

	@Override
	public void buttonA(boolean isPressed) {
		if (isPressed && goodToGo && !inAltMode) {
			switch (currDirect) {
			case UP:
				viewGUI.appendText('d');
				viewGUI.highlightLetter('d');
				break;
			case UPRIGHT:
				viewGUI.appendText('h');
				viewGUI.highlightLetter('h');
				break;
			case RIGHT:
				viewGUI.appendText('l');
				viewGUI.highlightLetter('l');
				break;
			case DOWNRIGHT:
				viewGUI.appendText('p');
				viewGUI.highlightLetter('p');
				break;
			case DOWN:
				viewGUI.appendText('t');
				viewGUI.highlightLetter('t');
				break;
			case DOWNLEFT:
				viewGUI.appendText('x');
				viewGUI.highlightLetter('x');
				break;
			case LEFT:
				viewGUI.appendText('.');
				viewGUI.highlightLetter('.');
				break;
			case UPLEFT:
				viewGUI.appendText('-');
				viewGUI.highlightLetter('-');
				break;
			default:
				break;
			}
			
		} 
		else if (isPressed && goodToGo && inAltMode) {
			switch (currDirect) {
			case UP:
				viewGUI.appendText('D');
				viewGUI.highlightLetter('d');
				break;
			case UPRIGHT:
				viewGUI.appendText('H');
				viewGUI.highlightLetter('h');
				break;
			case RIGHT:
				viewGUI.appendText('L');
				viewGUI.highlightLetter('l');
				break;
			case DOWNRIGHT:
				viewGUI.appendText('P');
				viewGUI.highlightLetter('p');
				break;
			case DOWN:
				viewGUI.appendText('T');
				viewGUI.highlightLetter('t');
				break;
			case DOWNLEFT:
				viewGUI.appendText('X');
				viewGUI.highlightLetter('x');
				break;
			case LEFT:
				viewGUI.appendText('.');
				viewGUI.highlightLetter('.');
				break;
			case UPLEFT:
				viewGUI.appendText('-');
				viewGUI.highlightLetter('-');
				break;
			default:
				break;
			}
		}
		else {
			viewGUI.unHighlightAllLetters();
		}

	}

	@Override
	public void buttonB(boolean isPressed) {
		if (isPressed && goodToGo && !inAltMode) {
			switch (currDirect) {
			case UP:
				viewGUI.appendText('c');
				viewGUI.highlightLetter('c');
				break;
			case UPRIGHT:
				viewGUI.appendText('g');
				viewGUI.highlightLetter('g');
				break;
			case RIGHT:
				viewGUI.appendText('k');
				viewGUI.highlightLetter('k');
				break;
			case DOWNRIGHT:
				viewGUI.appendText('o');
				viewGUI.highlightLetter('o');
				break;
			case DOWN:
				viewGUI.appendText('s');
				viewGUI.highlightLetter('s');
				break;
			case DOWNLEFT:
				viewGUI.appendText('w');
				viewGUI.highlightLetter('w');
				break;
			case LEFT:
				viewGUI.appendText(',');
				viewGUI.highlightLetter(',');
				break;
			case UPLEFT:
				viewGUI.appendText('@');
				viewGUI.highlightLetter('@');
				break;
			default:
				break;
			}
		} 
		else if (isPressed && goodToGo && inAltMode) {
			switch (currDirect) {
			case UP:
				viewGUI.appendText('C');
				viewGUI.highlightLetter('c');
				break;
			case UPRIGHT:
				viewGUI.appendText('G');
				viewGUI.highlightLetter('g');
				break;
			case RIGHT:
				viewGUI.appendText('K');
				viewGUI.highlightLetter('k');
				break;
			case DOWNRIGHT:
				viewGUI.appendText('O');
				viewGUI.highlightLetter('o');
				break;
			case DOWN:
				viewGUI.appendText('S');
				viewGUI.highlightLetter('s');
				break;
			case DOWNLEFT:
				viewGUI.appendText('W');
				viewGUI.highlightLetter('w');
				break;
			case LEFT:
				viewGUI.appendText(',');
				viewGUI.highlightLetter(',');
				break;
			case UPLEFT:
				viewGUI.appendText('@');
				viewGUI.highlightLetter('@');
				break;
			default:
				break;
			}
		}
		else {
			viewGUI.unHighlightAllLetters();
		}
	}
	
	@Override
	public void buttonX(boolean isPressed) {
		if (isPressed && goodToGo && !inAltMode) {
			switch (currDirect) {
			case UP:
				viewGUI.appendText('a');
				viewGUI.highlightLetter('a');
				break;
			case UPRIGHT:
				viewGUI.appendText('e');
				viewGUI.highlightLetter('e');
				break;
			case RIGHT:
				viewGUI.appendText('i');
				viewGUI.highlightLetter('i');
				break;
			case DOWNRIGHT:
				viewGUI.appendText('m');
				viewGUI.highlightLetter('m');
				break;
			case DOWN:
				viewGUI.appendText('q');
				viewGUI.highlightLetter('q');
				break;
			case DOWNLEFT:
				viewGUI.appendText('u');
				viewGUI.highlightLetter('u');
				break;
			case LEFT:
				viewGUI.appendText('y');
				viewGUI.highlightLetter('y');
				break;
			case UPLEFT:
				viewGUI.appendText(':');
				viewGUI.highlightLetter(':');
				break;
			default:
				break;
			}
		}
		else if (isPressed && goodToGo && inAltMode) {
			switch (currDirect) {
			case UP:
				viewGUI.appendText('A');
				viewGUI.highlightLetter('a');
				break;
			case UPRIGHT:
				viewGUI.appendText('E');
				viewGUI.highlightLetter('e');
				break;
			case RIGHT:
				viewGUI.appendText('I');
				viewGUI.highlightLetter('i');
				break;
			case DOWNRIGHT:
				viewGUI.appendText('M');
				viewGUI.highlightLetter('m');
				break;
			case DOWN:
				viewGUI.appendText('Q');
				viewGUI.highlightLetter('q');
				break;
			case DOWNLEFT:
				viewGUI.appendText('U');
				viewGUI.highlightLetter('u');
				break;
			case LEFT:
				viewGUI.appendText('Y');
				viewGUI.highlightLetter('y');
				break;
			case UPLEFT:
				viewGUI.appendText(':');
				viewGUI.highlightLetter(':');
				break;
			default:
				break;
			}
		}
		else {
			viewGUI.unHighlightAllLetters();
		}
	}

	@Override
	public void buttonY(boolean isPressed) {
		if (isPressed && goodToGo && !inAltMode) {
			switch (currDirect) {
			case UP:
				viewGUI.appendText('b');
				viewGUI.highlightLetter('b');
				break;
			case UPRIGHT:
				viewGUI.appendText('f');
				viewGUI.highlightLetter('f');
				break;
			case RIGHT:
				viewGUI.appendText('j');
				viewGUI.highlightLetter('j');
				break;
			case DOWNRIGHT:
				viewGUI.appendText('n');
				viewGUI.highlightLetter('n');
				break;
			case DOWN:
				viewGUI.appendText('r');
				viewGUI.highlightLetter('r');
				break;
			case DOWNLEFT:
				viewGUI.appendText('v');
				viewGUI.highlightLetter('v');
				break;
			case LEFT:
				viewGUI.appendText('z');
				viewGUI.highlightLetter('z');
				break;
			case UPLEFT:
				viewGUI.appendText('/');
				viewGUI.highlightLetter('/');
				break;
			default:
				break;
			}
		} 
		else if (isPressed && goodToGo && inAltMode) {
			switch (currDirect) {
			case UP:
				viewGUI.appendText('B');
				viewGUI.highlightLetter('b');
				break;
			case UPRIGHT:
				viewGUI.appendText('B');
				viewGUI.highlightLetter('f');
				break;
			case RIGHT:
				viewGUI.appendText('J');
				viewGUI.highlightLetter('j');
				break;
			case DOWNRIGHT:
				viewGUI.appendText('N');
				viewGUI.highlightLetter('n');
				break;
			case DOWN:
				viewGUI.appendText('R');
				viewGUI.highlightLetter('r');
				break;
			case DOWNLEFT:
				viewGUI.appendText('V');
				viewGUI.highlightLetter('v');
				break;
			case LEFT:
				viewGUI.appendText('Z');
				viewGUI.highlightLetter('z');
				break;
			case UPLEFT:
				viewGUI.appendText('/');
				viewGUI.highlightLetter('/');
				break;
			default:
				break;
			}
		}
		else {
			viewGUI.unHighlightAllLetters();
		}
	}

	@Override
	public void dpad(int arg0, boolean arg1) {
	}

	@Override
	public void isConnected(boolean arg0) {
	}

	@Override
	public void leftShoulder(boolean isPressed) {
		if (!lastLBpressed) viewGUI.deleteLastChar();
		lastLBpressed = !lastLBpressed;
		
	}

	@Override
	public void leftThumb(boolean arg0) {
	}

	@Override
	/**
	 * Determines which section the pad is in
	 */
	public void leftThumbDirection(double direction) {
		goodToGo = true;
		if (magnitude < 0.8) {
			viewGUI.unHighlightAllPanels();
			goodToGo=false;
			return;
		} else if (350 < direction || direction <= 10) {
			currDirect = Direction.UP;
			viewGUI.highlightPanel(PanelName.PANEL_NORTH);
		} else if (25 < direction && direction <= 65) {
			currDirect = Direction.UPRIGHT;
			viewGUI.highlightPanel(PanelName.PANEL_NORTH_EAST);
		} else if (80 < direction && direction <= 100) {
			currDirect = Direction.RIGHT;
			viewGUI.highlightPanel(PanelName.PANEL_EAST);
		} else if (115 < direction && direction <= 155) {
			currDirect = Direction.DOWNRIGHT;
			viewGUI.highlightPanel(PanelName.PANEL_SOUTH_EAST);
		} else if (170 < direction && direction <= 190) {
			currDirect = Direction.DOWN;
			viewGUI.highlightPanel(PanelName.PANEL_SOUTH);
		} else if (205 < direction && direction <= 245) {
			currDirect = Direction.DOWNLEFT;
			viewGUI.highlightPanel(PanelName.PANEL_SOUTH_WEST);
		} else if (260 < direction && direction <= 280) {
			currDirect = Direction.LEFT;
			viewGUI.highlightPanel(PanelName.PANEL_WEST);
		} else if (295 < direction && direction <= 335) {
			currDirect = Direction.UPLEFT;
			viewGUI.highlightPanel(PanelName.PANEL_NORTH_WEST);
		} else {
			viewGUI.unHighlightAllPanels();
			goodToGo = false;
		}

	}

	@Override
	public void leftThumbMagnitude(double mag) {
		magnitude = mag;

	}

	@Override
	public void leftTrigger(double mag) {
		if(mag > 0.2) {
			inAltMode = true;
		}
		else inAltMode = false;
	}

	@Override
	public void rightShoulder(boolean arg0) {
		if (!lastRBpressed){
			viewGUI.appendText(" ");
			viewGUI.toggleRightTriggerButton();
		}
		lastRBpressed = !lastRBpressed;
	}

	@Override
	public void rightThumb(boolean arg0) {

	}

	@Override
	public void rightThumbDirection(double arg0) {

	}

	@Override
	public void rightThumbMagnitude(double arg0) {

	}

	@Override
	public void rightTrigger(double mag) {

	}

	@Override
	public void start(boolean arg0) {

	}

}
