# Ihyeon-s_poa

package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a = (int)(Math.random()*9+1);
		int b = (int)(Math.random()*9+1);
		int c = (int)(Math.random()*9+1);
		
		System.out.println("첫번째 랜덤수 "+ a +"두번째 랜덤수"+ b +"세번째 랜덤수"+ c);
	
		int strike =0;
		int ball = 0;
		int out = 0;
		
	for(int i = 0; i < 100; i++) {
		strike =0;

		System.out.println("첫번째 숫자를 입력해주세요.");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("세번째 숫자를 입력해주세요.");
		int num3 = Integer.parseInt(sc.nextLine());
		if(num1 == a ) {
			strike++;		
			System.out.println("Strike!");
		}
		if(num1 == b ) {
			System.out.println("ball!");
			ball++;
		}
		if(num1 == c ) {
			System.out.println("ball!");
			ball++;
		}
		if(num2 == a ) {
			ball++;		
			System.out.println("ball!");
		}
		if(num2 == b ) {
			System.out.println("Strike!");
			strike++;
		}
		if(num2 == c ) {
			System.out.println("ball!");
			ball++;
		}
		if(num3 == a ) {
			ball++;		
			System.out.println("ball!");
		}
		if(num3 == b ) {
			System.out.println("ball!");
			ball++;
		}
		if(num3 == c ) {
			System.out.println("Strike!");
			strike++;
		}
		else {out++;
			System.out.println("틀렸군요");}
		boolean flag = false;
		int count = strike;
		if(count == 3){
			flag  = true;
			break;
		}
	
		}System.out.println("축하드립니다.");
		
		sc.close();
	
	
	
		
		
		
		
		

	}
}

