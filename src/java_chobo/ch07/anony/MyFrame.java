package java_chobo.ch07.anony;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true); // 이게빠지면 생성은되어있으나 보이지않음
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setTitle("첫 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 엑스버튼 어디에?
		setBounds(100, 100, 450, 300); // 어디에 위치시킬것인가.
		contentPane = new JPanel(); // 작성위치 어디에집어넣ㅇ르지
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 안쪽여백 5픽셀씩
		contentPane.setLayout(new BorderLayout(0, 0));// 컴포런트간의 갭 0,0
		setContentPane(contentPane);

		JButton btn = new JButton("버튼");
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "버튼을 눌렀습니다.");
			}
		});
		contentPane.add(btn, BorderLayout.CENTER);

		JButton ButtonNorth = new JButton("상건");
		ButtonNorth.addActionListener(new EventHandler());
		contentPane.add(ButtonNorth, BorderLayout.NORTH);
		// 직접 수기로 추가하기 (버튼 누르면
		JButton ButtonSouth = new JButton("반장");
		ButtonSouth.addActionListener(new EventHandler());
		// 위에 반장을 어디에달꺼냐는 
		contentPane.add(ButtonSouth, BorderLayout.SOUTH);
		
		JButton ButtonYejin = new JButton("예진이");
		ButtonYejin.addActionListener(new EventHandler());
		contentPane.add(ButtonYejin, BorderLayout.WEST);
	}
	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "상건아~~");

		}

	}

}// end of class 계속 쓸거면 밑에 따로 빼서 이름정해주기

