package days23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\user\\Desktop\\복습문제\\1차_조편성.txt";
		String line = null;

		// HashSet인 Set계열은 사용불가 : 동명이인 처리 불가
		// List계열 이용 : ArrayList 컬렉션 클래스 이용
		ArrayList<String> team1 = new ArrayList<>();
		ArrayList<String> team2 = new ArrayList<>();
		ArrayList<String> team3 = new ArrayList<>();
		ArrayList<String> team4 = new ArrayList<>();
		
		// 위 ArrayList를 집어넣을 컬렉션클래스 선언	
		ArrayList<ArrayList<String>> class5 = new ArrayList<>();

		String [] lineArr = null;
		try(FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);) {
			ArrayList<String> team = null;
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				lineArr = line.split("[/:]");
				switch (lineArr[0]) {
				case "1조":
					team = team1;
					break;
				case "2조":
					team = team2;
					break;
				case "3조":
					team = team3;
					break;
				case "4조":
					team = team4;
					break;
				}// switch // 1,2,3,4조
				for (int i = 0; i < lineArr.length; i++) {
					team.add(lineArr[i]);
				} // for i
				
				class5.add(team); // 각조원들을 집어 넣음
				
			} // while
			
			// 각 팀원 출력형식 출력
			// dispTeam(team1,team2,team3,team4);
			dispClass(class5);

		} catch (Exception e) {
			System.out.println(e.toString());
		}


	} // main

	private static void dispClass(ArrayList<ArrayList<String>> class5) {
			
		Iterator<ArrayList<String>> ir = class5.iterator();
		int no = 1;
		while (ir.hasNext()) {
			System.out.printf("[%d조]\n",no++);
			ArrayList<String> team = ir.next();
			Iterator<String> ir2 = team.iterator();
			char seq = 'A';		
			while (ir2.hasNext()) {
				String name = (String)ir2.next();
				System.out.printf(" %c. %s\n",seq++, name);				
			}
		}
		System.out.println();
	}

} // class
