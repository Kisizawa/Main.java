
public class Wizard {
	int hp;
	int mp;
	String name;
	public Wizard() {
		this.name="魔法使い";
		this.hp=50;
		this.mp=80;
	}

	public void ac(int x,String name) {
		System.out.println(this.name+"は敵に魔法で攻撃"+x+"のダメージ");
		
	
	}
	public String toString() {
		return "ログ:まほうつかい（名前="+this.name+"/hp"+this.hp+")";
	}
}
