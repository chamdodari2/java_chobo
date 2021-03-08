package java_chobo.ch05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayEx11 {

	public static void main(String[] args) {

		// 152쪽 +응용실습

		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" }

		};

		String question;
		String response;
		String msg;
		for (int i = 0; i < words.length; i++) {
			question = String.format("Q%d.%s의 뜻은?", i + 1, words[i][0]);
			response = JOptionPane.showInputDialog(question).trim();

			if (response.equals(words[i][1])) {
				msg = "정답입니다";

			} else {
				msg = String.format("틀렸습니다. 정답은 %s입니다.", words[i][1]);
			}
			JOptionPane.showMessageDialog(null, msg);
		}

	}

}
