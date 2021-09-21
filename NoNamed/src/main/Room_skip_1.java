package main;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Room_skip_1 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField userMbti;
	
	String mbti = "";
	String mbti_trait = "";
	String hotel_img = "";
	String hotel_name = "";
	String hotel_description = "";
	String hotel_star_rate = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room_skip_1 window = new Room_skip_1();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Room_skip_1() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		Title tit = new Title();
		if (tit.getTheme() == 1)
			panel.setBackground(Color.WHITE);
		else if (tit.getTheme() == 0)
			panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 587, 396);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		userMbti = new JTextField();
		userMbti.setFont(new Font("여기어때 잘난체", Font.PLAIN, 21));
		userMbti.setHorizontalAlignment(SwingConstants.CENTER);
		userMbti.setBounds(63, 160, 362, 67);
		panel.add(userMbti);
		userMbti.setColumns(10);
		
		JButton resultButton = new JButton("결과 확인");
		resultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				mbti = userMbti.getText().trim().toUpperCase();
				new Recommand(mbti);
			}
		});
		resultButton.setBounds(352, 290, 95, 23);
		panel.add(resultButton);
		
		JLabel user_mbti = new JLabel("당신의 MBTI를 입력해 주세요");
		user_mbti.setFont(new Font("여기어때 잘난체", Font.PLAIN, 19));
		user_mbti.setHorizontalAlignment(SwingConstants.CENTER);
		user_mbti.setBounds(112, 90, 265, 60);
		panel.add(user_mbti);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		new JFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("당신을 위한 호텔 추천");
		setBounds(100, 100, 496, 383);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
