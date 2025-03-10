package days25;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex09 {
	
	public static void main(String[] args) throws IOException {
		
		//[PipedReader/PipedWriter]
		// ㄴ 쓰레드 간에 데이터를 주고 받을때 사용하는 스트림
		// RandomAccessFile
		// 	ㄴ 파일의 어느 위치에서나 읽기/쓰기가 가능한 장점이 있는 스트림.
		// 	ㄴ 내부적으로 DataOutput, DataInput 인터페이스 구현
		
					
		// [1] 테스트
		/*
		String name = "test.txt";
		String mode = "rw";
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			// 파일포인터 위치
			System.out.println("파일포인터의 위치: " + raf.getFilePointer());
			raf.writeInt(100);
			System.out.println("파일포인터의 위치: " + raf.getFilePointer());
			raf.writeLong(200L);
			System.out.println("파일포인터의 위치: " + raf.getFilePointer());
			raf.seek(4);
			System.out.println("파일포인터의 위치: " + raf.getFilePointer());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		//[2]
		String s= "I Love normal Java";		
		String q= "javabook";
		
		String name = "random.txt";
		String mode = "rw";
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			long cp= raf.getFilePointer();
			raf.writeBytes(s);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 일시정지 + 엔터 계속
		System.out.println("엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek(2);
			raf.writeBytes(q);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 일시정지 + 엔터 계속
		System.out.println("엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode)) {
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 일시정지 + 엔터 계속
		System.out.println("엔터치면 진행한다.");
		System.in.read();
		System.in.skip(System.in.available());
		
	} // main

} // class
