//Author Name: Colton Haynes
//Date: 8/21/2019
//Program Name: Haynes_Drone
//Purpose: Simulation using button, drone movement in x,y,z location


package Drone;

import java.util.Scanner;

public class Haynes_Drone {
	
	public int x_pos;
	public int y_pos;
	public int z_pos;
	public int orientation;
	public String cardinal;
	
	
	public Haynes_Drone() {
		x_pos = 0;
		y_pos = 0;
		z_pos = 0;
		orientation = 1; // Starts North
	}
	
	public void drone_up() {
		z_pos = z_pos + 1;
	}
	
	public void drone_down() {
		z_pos = z_pos - 1;
	}
	
	public void drone_forward() {
		if (orientation == 1) {
			y_pos = y_pos + 1;
		}
		if (orientation == 3) {
			y_pos = y_pos - 1;
		}
		if (orientation == 2) {
			x_pos = x_pos + 1;
		}
		if (orientation == 4) {
			x_pos = x_pos - 1;
		}
		
	}
	
	public void drone_backward() {
		if (orientation == 1) {
			y_pos = y_pos - 1;
		}
		if (orientation == 3) {
			y_pos = y_pos + 1;
		}
		if (orientation == 2) {
			x_pos = x_pos - 1;
		}
		if (orientation == 4) {
			x_pos = x_pos + 1;
		}
	}
	
	public void drone_turnLeft() {
		orientation = orientation - 1;
		if (orientation < 1) {
			orientation = 4;
		}
	}
	
	public void drone_turnRight() {
		orientation = orientation + 1;
		if (orientation > 4) {
			orientation = 1;
		}
	}
	

	
	public String getPosition() {

		if (orientation == 1) {
			cardinal = "North";
		} else if 
			 (orientation == 2) {
				cardinal = "East";
		} else if 
			 (orientation == 3) {
				cardinal = "South";
		} else if 
			 (orientation == 4) {
				cardinal = "West";
		}
		
		return "Haynes_Drone [x_pos=" + x_pos + ", y_pos=" + y_pos + ", z_pos=" + z_pos + ", orientation=" + cardinal
				+ "]";
	}

	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int UserChoice = 0;
		Haynes_Drone drone = new Haynes_Drone();
		
		do {
			displayMenu();
			UserChoice = input.nextInt();
			
			if (UserChoice == 1) {
				System.out.println("You have moved up");
				drone.drone_up();			
			}
			if (UserChoice == 2) {
				System.out.println("You have moved down");
				drone.drone_down();			
			}
			if (UserChoice == 3) {
				System.out.println("You have moved forward");
				drone.drone_forward();			
			}
			if (UserChoice == 4) {
				System.out.println("You have moved backward");
				drone.drone_backward();			
			}
			if (UserChoice == 5) {
				System.out.println("You have turned left");
				drone.drone_turnLeft();			
			}
			if (UserChoice == 6) {
				System.out.println("You have turned right");
				drone.drone_turnRight();			
			}
			if (UserChoice == 7) {
				System.out.println(drone.getPosition());			
			}
			
		} while (UserChoice != 8);
		
		System.out.println("Drone Navigation has ended.");
		input.close();
	}

	public static void displayMenu() {
		System.out.println("Which direction would you like to move the drone?");
		System.out.println("1 - Move Up");
		System.out.println("2 - Move Down");
		System.out.println("3 - Move Forward");
		System.out.println("4 - Move Backward");
		System.out.println("5 - Turn Left");
		System.out.println("6 - Turn Right");
		System.out.println("7 - Display Position");
		System.out.println("8 - Exit Navigation");

	}
	
	
}
