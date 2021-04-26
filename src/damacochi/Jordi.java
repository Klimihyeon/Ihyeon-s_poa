package damacochi;



public class Jordi {
	
	String nickname;
	int level;
	int exp;
	int sleep;
	int anoying;
	int call;
	int pupu;

	
	Jordi(String nickname, int sleep, int anoying, int call, int pupu){
		this.nickname = "조르디";
		this.level = 1;
		this.exp= 0;
		this.sleep = sleep;
		this.anoying = anoying;
		this.call = call;
		this.pupu = pupu;
		
		
	}
	
	void levelup () {
		level++;
		System.out.println("조르디가 1살 더 많아졌습니다.");
	}
	
	
	void info() {
		System.out.println("이름 : " + nickname);
		System.out.println("나이 : " + level);
		System.out.println("경험 : " + exp);
		System.out.println("졸림 : " + sleep);
		System.out.println("짜증 : " + anoying);
		System.out.println("의존도 : " + call);
	}
	
	void status(){
		if(sleep == 51) {
			System.out.println("조르디가 잡니다.");
		}
		if(anoying== 51) {
			System.out.println("조르디가 짜증을 냅니다.");
		}
		if(pupu == 51) {
			System.out.println("조르디가 똥을 쌉니다.");
		}
		if(call == 51) {
			System.out.println("조르디가 기뻐합니다.");
		}
		if(anoying< 40) {
			System.out.println("조르디가 기뻐합니다.");
		}
	}
	
	
	
	
	
}	
	

