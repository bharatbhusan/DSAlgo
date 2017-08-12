
class EnumClass1 {

	/**
	 * @param args
	 */
	public enum Direction { NORTH, SOUTH, EAST, WEST }
	public int x;
}

public class EnumClass extends EnumClass1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction d=Direction.EAST;
		
		System.out.println(d);
	}

}
