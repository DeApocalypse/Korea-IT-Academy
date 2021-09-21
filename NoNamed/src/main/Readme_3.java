package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Readme_3 extends JFrame{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Readme_3 window = new Readme_3();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Readme_3() {
		initialize();
		
		JPanel panel = new JPanel();
		Title tit = new Title();
		if (tit.getTheme() == 1)
			panel.setBackground(Color.WHITE);
		else if (tit.getTheme() == 0)
			panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 782, 498);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel readme_label = new JLabel("<컨셉>");
		readme_label.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label.setVerticalAlignment(SwingConstants.TOP);
		readme_label.setBounds(0, 21, 792, 20);
		panel.add(readme_label);
		
		JLabel readme_label_1 = new JLabel("MBTI 유형별 호텔 추천 및 예약 관리가 가능한 프로그램 입니다");
		readme_label_1.setVerticalAlignment(SwingConstants.TOP);
		readme_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_1.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_1.setBounds(0, 71, 792, 20);
		panel.add(readme_label_1);
		
		JLabel readme_label_2 = new JLabel("<기능>");
		readme_label_2.setVerticalAlignment(SwingConstants.TOP);
		readme_label_2.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_2.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_2.setBounds(0, 146, 792, 20);
		panel.add(readme_label_2);
		
		JLabel readme_label_3 = new JLabel("사용자 유형을 통해 개인 맞춤형 호텔을 추천합니다");
		readme_label_3.setVerticalAlignment(SwingConstants.TOP);
		readme_label_3.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_3.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_3.setBounds(0, 196, 792, 20);
		panel.add(readme_label_3);
		
		JLabel readme_label_4 = new JLabel("예약관리 조회 및 취소가 가능합니다");
		readme_label_4.setVerticalAlignment(SwingConstants.TOP);
		readme_label_4.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_4.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_4.setBounds(0, 227, 792, 20);
		panel.add(readme_label_4);
		
		JLabel readme_label_5 = new JLabel("공지사항 게시판을 통하여 사용자 친화적인 접근이 가능합니다");
		readme_label_5.setVerticalAlignment(SwingConstants.TOP);
		readme_label_5.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_5.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_5.setBounds(0, 257, 792, 20);
		panel.add(readme_label_5);
		
		JLabel readme_label_6 = new JLabel("<특징>");
		readme_label_6.setVerticalAlignment(SwingConstants.TOP);
		readme_label_6.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_6.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_6.setBounds(0, 331, 792, 20);
		panel.add(readme_label_6);
		
		JLabel readme_label_7 = new JLabel("간이 MBTI 테스트와 BI 로고를 별도 제작하여 트랜디한 디자인으로 설계되었습니다");
		readme_label_7.setVerticalAlignment(SwingConstants.TOP);
		readme_label_7.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_7.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_7.setBounds(0, 381, 792, 20);
		panel.add(readme_label_7);
		
		JLabel readme_label_8 = new JLabel("호텔 예약 홈페이지를 벤치마킹하여 사용자에게 익숙한 인터페이스 구현하였습니다");
		readme_label_8.setVerticalAlignment(SwingConstants.TOP);
		readme_label_8.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_8.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_8.setBounds(0, 411, 792, 20);
		panel.add(readme_label_8);
		
		JLabel readme_label_9 = new JLabel("회원관리 및 조회를 가능하게 하여 관리가 매우 수월합니다");
		readme_label_9.setVerticalAlignment(SwingConstants.TOP);
		readme_label_9.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_9.setFont(new Font("여기어때 잘난체", Font.PLAIN, 18));
		readme_label_9.setBounds(0, 441, 792, 20);
		panel.add(readme_label_9);
		
	}

	private void initialize() {
		new JFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("사용 방법");
		setBounds(100, 100, 796, 535);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
