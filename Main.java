public class Main {
	//変数宣言ゾーン
	static int f=0;
	static int l=0;
	
	public static void main(String[] args) {
		
		
		//勇者作成
		System.out.println("勇者の名前を教えてください");
		String name = new java.util.Scanner(System.in).nextLine();
		Hero h1 = new Hero(name);
		
		//仲間の作成（使用するかは不明）
		Wizard w1=new Wizard();
		Wizard w2=new Wizard();
		w1.name="魔法使い1";
		w2.name="魔法使い2";
		
		Thief t1 = new Thief();
		Thief t2 = new Thief();
		t1.name="斥候1";
		t2.name="斥候2";
		
		//仲間を作成もしくは
		System.out.println("あなたに仲間はいますか？\n1.yes 2.no");
		
		//選択肢のint型宣言・取得用
		int family =new java.util.Scanner(System.in).nextInt();
		
		
		for(int i=0;i<2;i++) {
			if (family==1) {
				System.out.println("1.Wizard? 2.Thief?");
				 	f = new java.util.Scanner(System.in).nextInt();
					if(f==1) {
						System.out.println("魔法使いが仲間になった");
						System.out.println("二人目の仲間はいますか？");
						
						System.out.println("1.Wizard? 2.Thief? 3.no");
						l=new java.util.Scanner(System.in).nextInt();
							if(l==1) {
								System.out.println("二人目の仲間も魔法使いなんだ");
							
							}else if(l==2) {
								System.out.println("二人目の仲間は斥候、バランスのいいチームだ");
							}else{
								System.out.println("二人だけか");
							}
					
					break;
					
					
					}else if(f==2) {
						System.out.println("斥候が仲間になった");
						System.out.println("二人目の仲間はいますか？");
						System.out.println("1.Wizard 2.Thief?");
						l = new java.util.Scanner(System.in).nextInt();
							if(l==1) {
								System.out.println("二人目の仲間は魔法使い、バランスのいいチームだ");
							}else if(l==2) {
								System.out.println("二人目の仲間も斥候か");
							}else {
								System.out.println("二人だけか");
							}
					
					break;
					}else {
						System.out.println("仲間はいらないようだな");
					break;
					}
		 
			}else if(family==2){
				System.out.println("一人か…体力をあげてやろう");
				h1.hp=150;
				System.out.println("勇者"+h1.name+"の体力は"+h1.hp+"になった");
			break;
			
			}else{
				System.out.println("システムエラー");
			break;
			}
		}
	
//始まり
		h1.start();
		
		
		
		if (family==1) {
			System.out.println("勇者の仲間は…");
			if(f==1&&l==1) {
				System.out.println("魔法使い二人だね");
		
			}else if(f==1&&l==2||f==2&&l==1) {
				System.out.println("魔法使いと斥候が仲間だね");
			
			}else if(f==2&&l==2) {
				System.out.println("斥候二人が仲間だね");
				
			}else {
				System.out.print("");
			}		
		}else {
			System.out.print("");
		}
		
//行動開始
//死ぬまでダンジョン繰り返させたい
		
		System.out.println("ダンジョンに潜り宝を手に入れるのだ");
			
		
				int danjon = new java.util.Random().nextInt(13)+1;
		
				int a = danjon;

				System.out.println(h1.name+"はダンジョンに潜った、ダンジョンの深さは"+a+"層");
				
				while(a>0) {
					for(int i =0;i<a;) {
						if(h1.hp>0) {
						System.out.println("1.進む　2.帰る");
						int x = new java.util.Scanner(System.in).nextInt();
							if(x==1&&a>=0) {
				
								System.out.println("ダンジョンの"+a+"層を探索し終えた");
								a--;
								System.out.println("残りは"+a+"層");
							
//ここを変更したい
								int wing = new java.util.Random().nextInt(3);
								if(wing==1) {	
									int get = new java.util.Random().nextInt(5)+1;
									System.out.println(get+"ゴールド手に入れた");
									h1.money += get; 
			//なぜか処理を続行する為にエンターを押す必要がある　なぜ
			//解決、Matango.javaないのnew Hero演算子が処理の邪魔をしていたようだ
								}else if(wing==2) {
									Matango m1 = new Matango();
									m1.Matang("お化けキノコ",'A');
									m1.samon();
								
									System.out.println("1.戦う2逃げる");
									int select = new java.util.Scanner(System.in).nextInt();
								
									if(select==1) {
											System.out.println("戦いが始まった！");
											
											while(m1.hp>0) {
												int damege;
												if(f==1&&l==1) {
																
													System.out.println(h1.name+"の攻撃!");
													damege= new java.util.Random().nextInt(10)+1;
													h1.ac(damege,h1.name);
													m1.hp-=damege;
													
													System.out.println(w1.name+"の攻撃!");
													damege= new java.util.Random().nextInt(5)+1;
													w1.ac(damege,w1.name);
													m1.hp-=damege;
													
													System.out.println(w2.name+"の攻撃!");
													damege= new java.util.Random().nextInt(5)+1;
													w2.ac(damege,w2.name);
													m1.hp-=damege;
													
												
												}else if(f==1&&l==2||f==2&&l==1) {
													System.out.println(h1.name+"の攻撃!");
													damege= new java.util.Random().nextInt(10)+1;
													h1.ac(damege,h1.name);
													m1.hp-=damege;
													
													System.out.println(w1.name+"の攻撃!");
													damege= new java.util.Random().nextInt(5)+1;
													w1.ac(damege,w1.name);
													m1.hp-=damege;
													
													System.out.println(t1.name+"の攻撃!");
													damege= new java.util.Random().nextInt(4)+1;
													t1.ac(damege,t1.name);
													m1.hp-=damege;
												}else if(f==2&&l==2) {
													System.out.println(h1.name+"の攻撃!");
													damege= new java.util.Random().nextInt(10)+1;
													h1.ac(damege,h1.name);
													m1.hp-=damege;
													
													System.out.println(t1.name+"の攻撃!");
													damege= new java.util.Random().nextInt(5)+1;
													t1.ac(damege,t1.name);
													m1.hp-=damege;
													
													System.out.println(t2.name+"の攻撃!");
													damege= new java.util.Random().nextInt(5)+1;
													t2.ac(damege,t2.name);
													m1.hp-=damege;
												}else {
													System.out.println(h1.name+"の攻撃!");
													damege= new java.util.Random().nextInt(10)+1;
													int solodamege = damege+5;
													
													h1.ac(solodamege,h1.name);
													m1.hp-=solodamege;
												}
												
												
												
										}
											System.out.println(m1.name+"を倒した");
											
											int getgold = new java.util.Random().nextInt(10)+1;
											System.out.println(m1.name+"は"+getgold+"ゴールドを落とした");
											h1.money+=getgold;
										
										
									}else if(select==2){
										System.out.println(h1.name+"は逃げ出した");
										System.out.println("お金を落としてしまった！");
										int outgold = new java.util.Random().nextInt(3)+1;
										h1.money -= outgold;
										System.out.println(outgold+"ゴールド失った");
									}
								
								
								
								System.out.println("お財布の中身は"+h1.money+"になった");
								
							}else {
								h1.wana();
								
							}
								
								
							
							
//ランダムで敵に遭遇・宝を発見・罠の発動を行いたい↑
							
						}else if(x==2){
							System.out.println("ダンジョンの探索をやめた");
							break;
						}else {
							System.out.println("システムエラー");
							break;
						}
					}else {
						System.out.println("hpが０になってしまった！");
						break;
					}
			
					}
					break;
				}
		
				
		System.out.println(h1.name+"の冒険は終わった");
		System.out.print("リザルト");
		System.out.print(h1);
		
			
		}
		
	}
