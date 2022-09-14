public class Thief {
	int hp;
	int mp;
	String name;
	public Thief() {
		this.hp=90;
		this.mp=20;				
		this.name ="斥候";
	}

	public void ac(int x,String name) {
		System.out.println(this.name+"は敵にナイフで攻撃"+x+"のダメージ");
	
	
	}
	public String toString() {
		return "ログ:せっこう（名前="+this.name+"/hp"+this.hp+")";
	}
}
