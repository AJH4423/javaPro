package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex05 {

	public static void main(String[] args) {

		/*	days26 - 1차_조편성.txt
		  	1조: 김현수[팀장], 서재웅, 김도훈 - 현도재
			2조: 양재원[팀장], 안준호, 이진욱 - 새벽공방
			3조: 최인석[팀장], 최승호, 박지웅, 김유미 - NoNicotineException
			4조: 서주원[팀장], 김민선, 김승효, 안우혁 - 창사모 
			5조: 이정인[팀장], 변상호, 권태정, 김예지 - codeName
		 */

		// 하루하루 일정 시간마다 조별 폴더안에 부원들 폴더가 업데이트 되게끔 
		// 파일 자동생성하기
		
		/*
		 * 파일을 읽어서 split으로 기준을 잡아 배열을 잡고 몇조, 부원들, 조이름에 대한 정보를 얻음
		 * 얻은 정보로 폴더 및 파일 이름을 정함
		 * 특정시간에 파일및 폴더가 생성되어야 하기에 시간설정
		 * 정한 기준들로 파일 생성
		 * */
	      String parent = "C:\\temp\\";
	      
	      // 2025-03-11(화)
	      LocalDate now = LocalDate.now();
	      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd(E)");
	      String strNow = now.format(dtf);      
	      parent += strNow;
	      
	      String fileName = ".\\src\\days26\\1차_조편성.txt";
	      
	      String pathname = "";
	      
	      try (FileReader reader  = new FileReader(fileName ); 
	          BufferedReader br = new BufferedReader(reader);){
	         String line = null;
	         String regex = "\\s*[,:-]\\s*";
	         while ( (line = br.readLine()) != null) {
	            //  0                                            마지막요소
	            // 1조: 김현수[팀장], 서재웅, 김도훈          - 현도재
	            // System.out.println( line );
	            String [] arr = line.split(regex);
	            // arr[0]
	            // arr[arr.length-1]
	            
	            File f = null; 
	            for (int i = 1; i < arr.length-1; i++) {
	               pathname = String.format("%s\\%s(%s)\\%s"
	                     , parent, arr[0], arr[arr.length-1], arr[i]);
	               System.out.print(pathname +" - ");
	               f = new File(pathname);
	               System.out.println( f.mkdirs() );
	            } // for i
	            
	         } // while
	         
	      } catch (Exception e) {
	         // TODO: handle exception
	      } // try

		
	} // main

} // class
