package days25;

import java.io.File;

public class Ex10_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// days25 폴더안에 upload 폴더 유무를 확인하고 없으면 폴더 생성
		
		String pathname = ".\\src\\days25";
		File parent = new File(pathname);
		File upload = new File(parent, "upload");
		
		if (!upload.exists()) {
			// upload 폴더 생성
			// upload.mkdir();
			// upload.mkdirs();
			System.out.println(upload.mkdirs());
		} else {
			System.out.println(upload.delete());
		}
		
	}

}
