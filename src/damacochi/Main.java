package damacochi;


import java.util.Scanner;

public class Main {
	
	Jordi jd;
	Action ac;
	Scanner sc = new Scanner(System.in);

	
	
	
	Main(){

		String name = sc.nextLine();
		jd = new Jordi("jordi", 20, 20, 20, 20);
		
	}
	
	
	public static void main(String[] args) {
		new Main().start();
	
}
	void Intro() {
	
	System.out.println("    -@.                @:                            $@.    @,                 ");
	System.out.println(".######; -@        $#####$  @:        *********;          $@,    @,            ");     
	System.out.println("@@@@@@! -@        #@@@@@#  @:        @@@@@@@@@=       @@@@@@@@, @,             ");  
	System.out.println("@#      -@        #@   @#  @:                @=       ---#@~--  @,             ");    
	System.out.println("@#      -@.       #@   @#  @:                @=          $@.    @,             ");    
	System.out.println("@#      -@!!-     #@   @#  @=!:             .@=          $@~    @,             ");   
	System.out.println("@#      -@@@;     #@   @#  @@@=         @@  ,@=          @@=    @,             ");    
	System.out.println("@#      -@.       #@   @#  @:           @@  :@=         #@$@~   @,             ");    
	System.out.println("@#,,,,,.-@        #@,,,@#  @:           @@  ;@!        ~@* #@-  @,             ");    
	System.out.println(".@@@@@@@!-@        #@@@@@#  @:           @@            $@@   @@= @,            ");     
	System.out.println("    -@                 @:           @@            ~@     :  @,                 ");
	System.out.println("    -@                 @:      *@@@@@@@@@@@@~               @,                 ");
	System.out.println("    -@                 @:      .,,,,,,,,,,,,.               @,                 ");
	System.out.println("    -@                 @:                                   @,                 ");
	
	System.out.println("\t\t\t\t������ ���� by ihyeon");
	System.out.println("\t\t\t\t����Ϸ��� Enter�� �����ּ��� ");
	
	
	}
	
	
	
	
	void Select() {
		

		System.out.println("\t\t\t\t�������� ������ ����ּ���");
		
		System.out.println("\t\t\t1.�ҽ���\t\t\t2.��������");
		int input = sc.nextInt();
		switch (input) {
		case 1: {
			System.out.println("������ �ҽ��մϴ�.");
			System.out.println("���� ����ϴ�. ���� ������ �մϴ�.");
			
			jd.anoying = 50;
			jd.sleep = 50;
			
		}
		case 2:{
			System.out.println("������ �������ϴ�");
			System.out.println("������ ���� �θ��ϴ�. ���� ���� �Դϴ�.");
			
			jd.call = 50;
			jd.pupu = 50;
			
			
		}
		}
	}

	
	
	

	void start() {
		
		Intro();
		
		Select();
		
		while(true) {
			
			jd.anoying++;
			jd.pupu++;
			jd.sleep++;
			jd.call++;
			jd.exp++;
			
			
			System.out.println("�� ��  �� ���� ������ ���� ���� �ƽ�Ű��Ʈ");
			
			
			System.out.println("1.����ֱ�2.����3.��������");
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				
				System.out.println("������� ����ݴϴ�.");
				
				play();

				
				
			}			break;

			case 2: {
				System.out.println("������ ���ϴ�.");
				
				sleep();
			}
			break;
			case 3: {
				
					jd.info();
				}			break;

				
				
			}

			
			
			}	
	}
		
		void play(){
			
			System.out.println("1.��2.����");
			
			
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				
				System.out.println("������� �����߸� ����ݴϴ�.");
				
				jd.anoying -= 10;
				jd.exp += 100;
				jd.level += 1;
				
				
			}			break;

			case 2: {
				
				System.out.println("������� �����ϸ� ����ݴϴ�.");
				
				jd.anoying -= 10;
				jd.exp += 100;
				jd.level += 1;
				
				
			}			break;

			
			}

		
	}
		void sleep(){
			
			
			System.out.println("1.��������2.�м�����");
			
			int input = sc.nextInt();
			
			switch (input) {
			case 1: {
				
				System.out.println("������ ���尡�� ���ϴ�.");
				
				jd.sleep -= 10;
				jd.exp += 100;
				jd.level += 1;
				
				
			}			break;

			case 2: {
				
				System.out.println("������ �մϴ�.");
				
				jd.anoying -= 10;
				jd.exp -= 100;
				jd.level -= 1;
			}			break;

			
			}

		
	}	

		
		
		
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
