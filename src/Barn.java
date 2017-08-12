
class Building 
{ 
	public void show()
	{
		System.out.println("Bharat");
	}
}
public class Barn extends Building {
 public static void main(String[] args) {
 Building build1 = new Building();
 //Building build2 = new Building();
Barn barn1 = new Barn();
Building barn2 = build1;
Object obj1 = (Object) build1;
String str1 = build1.toString();
Building build3 = (Building) barn1;
}
}