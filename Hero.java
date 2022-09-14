public class Hero {
	//初期化用ゾーン
	int hp=0;
	int mp=0;
	int money=10;
	String name=new java.util.Scanner(System.in).nextLine();
	
	
	//名前の入力がないとき
	public Hero() {
		this.name="リンク";
		this.hp=150;
		this.mp=100;
		
	}
	
	//ヒーローの初期能力
	public Hero(String name) {
		this.hp = 100;
		this.mp = 20;
		
		this.name = name;
		this.money=10;
	}
	//初期能力の違うヒーローを作るとき
	public Hero(String name,int hp,int mp) {
		this.name=name;
		this.hp=hp;
		this.mp=mp;
	}
	//冒険を始める
	public void start() {
		System.out.println("勇者"+this.name+"の冒険を始める");
	}
	//冒険をやめる
	
	
	//行動一覧4個
	//1攻撃  2調べる　3逃げる
	
	public void wana() {
		System.out.println("落とし穴だ！");
		System.out.println(this.name+"に５のダメージ");
		this.hp -= 5;
		System.out.println("残りHP"+this.hp);
		
	}
	
	
	//1攻撃
	public void  ac(int damege,String name) {
		
		System.out.println(this.name+"は敵に勇者の剣で攻撃"+damege+"のダメージ");
	
	
	}
	
	
	public String toString() {
		return "ログ:勇者（名前:"+this.name+"/hp"+this.hp+"お財布の中身"+this.money+"ゴールド)";
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
