
public class Matango {
//	Hero h10 =new Hero();
	int hp;
	final int LEVEL=10;
	char suffix;
	String name;
	public void Matang(String name,char suffix) {
		this.hp=15;
		this.name=(name+suffix);
	}
	public void samon() {
		System.out.println(this.name+"が現れた");
		
		
	}
	public String toString() {
		return "システムログ:きのこ（名前="+this.name+"/hp"+this.hp+")";
	}
}
