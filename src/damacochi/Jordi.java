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
		this.nickname = "������";
		this.level = 1;
		this.exp= 0;
		this.sleep = sleep;
		this.anoying = anoying;
		this.call = call;
		this.pupu = pupu;
		
		
	}
	
	void levelup () {
		level++;
		System.out.println("������ 1�� �� ���������ϴ�.");
	}
	
	
	void info() {
		System.out.println("�̸� : " + nickname);
		System.out.println("���� : " + level);
		System.out.println("���� : " + exp);
		System.out.println("���� : " + sleep);
		System.out.println("¥�� : " + anoying);
		System.out.println("������ : " + call);
	}
	
	void status(){
		if(sleep == 51) {
			System.out.println("������ ��ϴ�.");
		}
		if(anoying== 51) {
			System.out.println("������ ¥���� ���ϴ�.");
		}
		if(pupu == 51) {
			System.out.println("������ ���� �Դϴ�.");
		}
		if(call == 51) {
			System.out.println("������ �⻵�մϴ�.");
		}
		if(anoying< 40) {
			System.out.println("������ �⻵�մϴ�.");
		}
	}
	
	
	
	
	
}	
	

