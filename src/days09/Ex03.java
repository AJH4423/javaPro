package days09;

import java.util.Arrays;
import java.util.Random;

import days08.Ex07;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// 결제할때마다 영수증보면 임의의 숫자 4개가 '*'로 출력
		/*
		 * "7655-****-9234-5677"
            "7655-8988-9234-****"
            "****-8988-9234-5677"
			"7655-8988-****-5677"
		 * */
		/*
		 * 내가짠 코드
		String card ="7655-8988-9234-5677";
		// 구분문자를 '-'으로 기준을 세워서 4개의 구역에 숫자를 저장
		// 1~4의 숫자를 랜덤으로 받아서 나온 숫자에 해당하는 구역문자열을 '*'으로 대체한뒤 결합해 출력
		
		String star = "****";
		String regex = "-";
		String [] memory = card.split(regex);
		int n = (int)(Math.random()*3);
		
		System.out.println(n);
		
		memory[n] = star;
		
//		System.out.printf("%s", Arrays.toString(memory));
		for (int i = 0; i < memory.length; i++) {
			System.out.printf("%s-",memory[i]);
		}
		System.out.print("\b");
		*/
		
		String card ="7655-8988-9234-5677";
		String regex = "-";
		String [] cardArr = card.split(regex);
		
		
		//int index = Ex07.getRandomInteger(0, 3); --> days08-Ex07
		// Random클래스 사용해서 랜덤수 뽑기
		Random rnd = new Random(); 
		int index = rnd.nextInt(4); // 0~3사이의 수 랜덤으로 출력
		
		cardArr[index] = "****";
		
		String result = String.join(regex, cardArr);
		System.out.println(result); // 밑의 출력값과 동일
//		System.out.printf("%s-%s-%s-%s",cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
		
	} // main

}
