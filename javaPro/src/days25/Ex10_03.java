package days25;

import java.io.File;
import java.util.Arrays;

import com.util.FileUtil;

public class Ex10_03 {
	
	public static void main(String[] args) {
		
		String currentDirectory = System.getProperty("user.dir");
		File parent = new File(currentDirectory);
				
		// [문제] \\javaPro 폴더 안에 있는 .dat파일들만 조회
		/* 내가 짠 코드
		File [] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if(f.isFile()) {
			String name = f.getName();
			String basefileName = FileUtil.getExtension(name);
			// System.out.println(basefileName);
			if (basefileName.equals(".dat")) {
				System.out.println(name);
			} // if
			}
		}
		*/
		
		 // [4]
	      File [] list = parent.listFiles(( dir, name)  ->  name.endsWith(".dat") );
	      Arrays.stream(list).forEach(System.out::println);
	      
	      // [2]
	      /*
	      File [] list = parent.listFiles(new FileFilter() {
	         
	         @Override
	         public boolean accept(File f) {
	            //      score.dat
	            return f.getName().endsWith(".dat");
	         }
	      });
	      for (File f : list) {
	         System.out.println(f.getName());
	      }
	      */
	      
	      // [3]
//	      File [] list = parent.listFiles((f) -> f.getName().endsWith(".dat") );
//	      // Arrays.stream(list).forEach(System.out::println);
//	      Arrays.stream(list).forEach( f -> System.out.println(f.getName()));
	      
	      /* [1]
	      File [] list =  parent.listFiles();
	      for (int i = 0; i < list.length; i++) {
	         File f =  list[i];
	         if ( f.isFile() ) {
	            String fileName = f.getName();
	            String ext = FileUtil.getExtension(fileName);
	            if (ext.equals(".dat")) {
	               System.out.println(fileName);
	            } // if
	         } // if
	      } // for i
	      */

		
	} // main

} // class
