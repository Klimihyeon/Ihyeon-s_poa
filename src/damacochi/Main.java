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
	
	System.out.println("\t\t\t\t조르디 버전 by ihyeon");
	System.out.println("\t\t\t\t계속하려면 Enter를 눌러주세요 ");
	
	
	}
	
	
	
	
	void Select() {
		

		System.out.println("\t\t\t\t조르디의 성향을 골라주세요");
		
		System.out.println("\t\t\t1.소심이\t\t\t2.개구쟁이");
		int input = sc.nextInt();
		switch (input) {
		case 1: {
			System.out.println("조르디가 소심합니다.");
			System.out.println("잠을 잘잡니다. 많이 귀찮아 합니다.");
			
			jd.anoying = 50;
			jd.sleep = 50;
			
		}
		case 2:{
			System.out.println("조르디가 개구집니다");
			System.out.println("주인을 자주 부릅니다. 똥을 많이 쌉니다.");
			
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
			
			
			System.out.println("ㅇ ㅅ  ㅇ 대충 조르디 같이 생긴 아스키아트");
			
			
			System.out.println("1.놀아주기2.재우기3.정보보기");
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				
				System.out.println("조르디와 놀아줍니다.");
				
				play();

				
				
			}			break;

			case 2: {
				System.out.println("조르디를 재웁니다.");
				
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
			
			System.out.println("1.댄스2.수영");
			
			
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				
				System.out.println("조르디와 춤을추며 놀아줍니다.");
				
				jd.anoying -= 10;
				jd.exp += 100;
				jd.level += 1;
				
				
			}			break;

			case 2: {
				
				System.out.println("조르디와 수영하며 놀아줍니다.");
				
				jd.anoying -= 10;
				jd.exp += 100;
				jd.level += 1;
				
				
			}			break;

			
			}

		
	}
		void sleep(){
			
			
			System.out.println("1.자장자장2.패서재우기");
			
			int input = sc.nextInt();
			
			switch (input) {
			case 1: {
				
				System.out.println("조르디를 자장가로 재웁니다.");
				
				jd.sleep -= 10;
				jd.exp += 100;
				jd.level += 1;
				
				
			}			break;

			case 2: {
				
				System.out.println("조르디를 팹니다.");
				
				jd.anoying -= 10;
				jd.exp -= 100;
				jd.level -= 1;
			}			break;

			
			}

		
	}	

		
		
		
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
