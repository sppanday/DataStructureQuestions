
package javaapplication114_robot_agile_problem;

/**
 *
 * @author surendrapanday
 */
public class JavaApplication114_Robot_Agile_Problem {

/**
 * A squad of robotic explorers are to be landed in Uluru.
 *
 * The landing area is rectangular and must be navigated by the robots so that
 * their on-board cameras can get a complete view of the surrounding terrain to
 * send back to Canberra.
 *
 * A robot’s position and location is represented by a combination of x and y
 * co-ordinates and a letter representing one of the four cardinal compass
 * points. The landing area in Uluru is divided up into a grid to simplify
 * navigation. An example position might be 0, 0, N, which means the robot is in
 * the bottom left corner and facing North.
 *
 * In order to control a robot, we send a simple string of letters. The possible
 * letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the robot spin 90 degrees
 * left or right respectively, without moving from its current spot. ‘M’ means
 * move forward one grid point, and maintain the same heading.
 *
 * Assume that the square directly North from (x, y) is (x, y+1).
 *
 * INPUT:
 *
 * The first line of input is the upper-right coordinates of the landing area,
 * the lower-left coordinates are assumed to be 0,0.
 *
 * The rest of the input is information pertaining to the robots that have been
 * deployed. Each explorer has two lines of input. The first line gives the
 * explorer’s position, and the second line is a series of instructions telling
 * the explorer how to explore the Uluru landing zone.
 *
 * The position is made up of two integers and a letter separated by spaces,
 * corresponding to the x and y co-ordinates and the explorer’s orientation.
 *
 * Each explorer will be finished sequentially, which means that the second
 * explorer won’t start to move until the first one has finished moving.
 *
 * OUTPUT:
 *
 * The output for each explorer should be its final co-ordinates and heading.
 *
 *
 * COMMAND LINE INPUT AND OUTPUT:
 *
 * Test Input: 
 * 5 5 
 * 1 2 N 
 * LMLMLMLMM 
 * 3 3 E 
 * MMRMMRMRRM
 * 
 * Expected Output: 
 * 1 3 N 
 * 5 1 E
 * 
 * @author Tamzidur Rahman
 * 
 */

	enum Facing {
		N, // North
		S, // South
		E, // East
		W; // West
	}

	enum Move {
		L, // Left rotation
		R, // Right rotation
		M; // Move
	}

	static class Coordinate {
		int x;
		int y;

		Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static class Rover {
		// cardinal direction rover is looking at
		Facing facing = null;
		// position of the rover
		Coordinate coordinate = null;

		public Rover(Coordinate c, Facing f) {
			this.facing = f;
			this.coordinate = c;
		}
	}

	/**
	 * assumptions: 
	 * input provided is valid (ie top right cannot have coordinate position less than bot left) 
	 * input provided is valid format (program will crash otherwise)
	 * input validation is low priority
	 */
	public static void main(String[] args) throws Exception {
		String input = "";
		boolean running = true;
		Coordinate botLeft = new Coordinate(0, 0);
		Coordinate topRight = null;

		System.out.println("Enter an empty line to exit");
		System.out.println("Enter top right coordinates: (x y)");
		if ((input = isValidInput()) == null) {
			running = false;
		}

		topRight = new Coordinate(Integer.parseInt(input.split(" ")[0]), Integer.parseInt(input.split(" ")[1]));

		while (running) {
			System.out.println("Enter rover state: (x y F)");
			if ((input = isValidInput()) == null) {
				break;
			}

			String[] tokens = input.split(" ");
			Rover r = new Rover(new Coordinate(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])),
					Facing.valueOf(tokens[2]));

			// skip iteration if invalid input
			if (!isWithinBounds(r.coordinate, botLeft, topRight)) {
				continue;
			}

			System.out.println("Enter rover actions: (LRM)*");
			if ((input = isValidInput()) == null) {
				break;
			}

			for (char c : input.toCharArray()) {
				Move m = Move.valueOf("" + c);
				switch (m) {
				case M:
					Coordinate newCoordinate = move(r.coordinate, r.facing);
					if (isWithinBounds(newCoordinate, botLeft, topRight)) {
						r.coordinate = newCoordinate;
					}
					break;
				case L:
					Facing rl = rotateLeft(r.facing);
					r.facing = rl;
					break;
				case R:
					Facing rr = rotateRight(r.facing);
					r.facing = rr;
					break;
				}
			}

			System.out.println(r.coordinate.x + " " + r.coordinate.y + " " + r.facing);
		}
	}

	/**
	 * Returns input from console, null if input is invalid (null or empty)
	 * @return String
	 */
	public static String isValidInput() {
		String input = System.console().readLine();
		return input != null && !input.isEmpty() ? input : null;
	}

	/**
	 * Returns a new facing based on provided facing. (N -> W)
	 * @throws Exception
	 */
	public static Facing rotateLeft(Facing f) throws Exception {
		switch (f) {
		case N:
			return Facing.W;
		case W:
			return Facing.S;
		case S:
			return Facing.E;
		case E:
			return Facing.N;
		default:
			throw new Exception("not supported state: " + f);
		}
	}

	/**
	 * Returns a new facing based on provided facing. (N -> E)
	 * @throws Exception
	 */
	public static Facing rotateRight(Facing f) throws Exception {
		switch (f) {
		case N:
			return Facing.E;
		case E:
			return Facing.S;
		case S:
			return Facing.W;
		case W:
			return Facing.N;
		default:
			throw new Exception("not supported state: " + f);
		}
	}

	/**
	 * Returns a new coordinate that has been moved in direction of facing. IE (x,
	 * y, N) -> (x, y + 1)
	 * 
	 * @param c - current coordinate
	 * @param f - movement in direction
	 * @return Coordinate
	 * @throws Exception
	 */
	public static Coordinate move(Coordinate c, Facing f) throws Exception {
		switch (f) {
		case N:
			return new Coordinate(c.x, c.y + 1);
		case S:
			return new Coordinate(c.x, c.y - 1);
		case E:
			return new Coordinate(c.x + 1, c.y);
		case W:
			return new Coordinate(c.x - 1, c.y);
		default:
			throw new Exception("not supported state: " + f);
		}
	}

	/**
	 * Returns if either provided coordinate is within the provided bounds or not.
	 * 
	 * @param c        - coordinate to be tested
	 * @param botLeft  - coordinate of bottom left corner of grid
	 * @param topRight - coordinate of top right corner of grid
	 * @return Boolean
	 */
	public static boolean isWithinBounds(Coordinate c, Coordinate botLeft, Coordinate topRight) {
		if (c.x < botLeft.x || c.x > topRight.y) {
			return false;
		}

		if (c.y < botLeft.y || c.y > topRight.y) {
			return false;
		}

		return true;
	}
}

