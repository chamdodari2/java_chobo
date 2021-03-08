package java_chobo.ch08; //res 전달 안해주면 에러뜬다!! 전달했는지 확인 해야함

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ExceptionEx14 {

	public static void main(String[] args) {
		String res = JOptionPane.showInputDialog("파일명을 입력하세요."); // 1 아무것도 입력안하면 " " 전달
		System.out.println("res : " + res); // 2
		File f = createFile(res);// 3
		System.out.println(f.getName() + "파일이 생성되었습니다.");

	}

	private static File createFile(String fileName) {// 4
		System.out.println("fileName : " + fileName); // 제대로 값이 전달되었는지 이렇게 확인해야함.
		File f;
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("파일 이름이 유효하지 않습니다");
			}
		} catch (Exception e) {
			fileName = "제목없음.txt";
		} finally {

			f = new File(fileName); // 해당하는 파일 이름의 객체가 생성되는것이고 아직 파일이 만들어지진 않은것임
			createNewFile(f);

		}
		return f;
		// System.out.println("fileName : "+ fileName);

	}

	private static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (IOException e) {

		}
	}

}
