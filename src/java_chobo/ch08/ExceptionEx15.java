package java_chobo.ch08; //res 전달 안해주면 에러뜬다!! 전달했는지 확인 해야함     <전가 활용>

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ExceptionEx15 {

	public static void main(String[] args) {
		String res = JOptionPane.showInputDialog("파일명을 입력하세요."); // 1 아무것도 입력안하면 " " 전달
		File f;
		String msg = null;

		try {
			f = createFile(res);// 3
			msg = String.format(f.getName() + "파일이 생성되었습니다.");
			
		} catch (Exception e) {
			msg = String.format(e.getMessage() + "다시 입력해주세요.");
		}
		JOptionPane.showMessageDialog(null, msg);

	}

	private static File createFile(String fileName) throws Exception {// 4
		// System.out.println("fileName : " + fileName); // 제대로 값이 전달되었는지 이렇게 확인해야함.
		// File f;
		if (fileName == null || fileName.equals("")) {
			throw new Exception("파일 이름이 유효하지 않습니다");
		}

		File f = new File(fileName);

		f.createNewFile();
		return f;

		// System.out.println("fileName : "+ fileName);

	}

}
