package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import member.AdminMain;
import java.awt.Font;

class ImagePanel extends JPanel{	// 메인 화면의 배경 & 버튼 이미지를 활용하기 위한 클래스
	
	private static final long serialVersionUID = 1L;	// 시리얼 아이디 할당
	private Image img;	// 이미지 클래스의 변수 생성
	
	public ImagePanel(Image img) {		// 이미지 패널 메소드를 통해 이미지의 크기 등 다양한 설정을 제어
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img , 0, 0, null);
	}
	
}

public class Title extends JFrame{		// JFrame을 상속받아 활용하는 Title 클래스
	
	private static final long serialVersionUID = 1L;
	static int theme = 1;		// 라이트, 다크 모드 결정 변수 (1: 라이트, 0: 다크)
	public int getTheme() {return theme;}
	public void setTheme(int theme) {Title.theme = theme;}
	
	static int test = 1;		// mbti 검사 진행 여부 결정 변수 (1: 진행, 0: 스킵)
	public int getTest() {return test;}
	public void setTest(int test) {Title.test = test;}

	public static void main(String[] args) {		// main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Title window = new Title();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Title() {		// Title 메소드
		initialize();
		
		JPanel panel = new JPanel();
		if (theme == 1)
			panel.setBackground(Color.WHITE);
		else if (theme == 0)
			panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 782, 498);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		// 0. 메인 배경 이미지
		ImagePanel backgound_image = new ImagePanel(new ImageIcon("./img/backgound.jpg").getImage());
		backgound_image.setBounds(6, 6, 769, 264);
		panel.add(backgound_image);
		
		JLabel lblNewLabel_reservation = new JLabel("Reservation");
		lblNewLabel_reservation.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_reservation.setBounds(271, 440, 76, 15);
		panel.add(lblNewLabel_reservation);
		
		JLabel lblNewLabel_how_to_use = new JLabel("How To Use");
		lblNewLabel_how_to_use.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_how_to_use.setBounds(445, 440, 95, 15);
		panel.add(lblNewLabel_how_to_use);
		
		JLabel lblNewLabel_settings = new JLabel("Settings");
		lblNewLabel_settings.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_settings.setBounds(651, 440, 52, 15);
		panel.add(lblNewLabel_settings);
		
		JLabel lblNewLabel_your_hotel = new JLabel("Your Hotel");
		lblNewLabel_your_hotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_your_hotel.setBounds(71, 440, 81, 15);
		panel.add(lblNewLabel_your_hotel);
		
		// 1. 룸 추천 버튼 이미지
		ImagePanel room_button_image = new ImagePanel(new ImageIcon("./img/room.png").getImage());
		room_button_image.setBounds(47, 306, 132, 132);
		room_button_image.addMouseListener(new MouseListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				if(test == 1)
				{
					Room_1 room = new Room_1();
					room.show();						
				}
				else if (test == 0)
				{
					Room_skip_1 room_skip = new Room_skip_1();
					room_skip.show();
				}
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		panel.add(room_button_image);

		// 2. 예약 관리 버튼 이미지
		ImagePanel admin_button_image = new ImagePanel(new ImageIcon("./img/admin.png").getImage());
		admin_button_image.setBounds(243, 306, 132, 132);
		admin_button_image.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				AdminMain admin_main = new AdminMain();
				admin_main.setVisible(true);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			
		});
		panel.add(admin_button_image);
		
		// 3. 사용법 버튼 이미지
		ImagePanel readme_button_image = new ImagePanel(new ImageIcon("./img/readme.png").getImage());
		readme_button_image.setBounds(425, 306, 132, 132);
		readme_button_image.addMouseListener(new MouseListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				Readme_3 readme = new Readme_3();
				readme.show();				
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		panel.add(readme_button_image);
		
		// 4. 설정 버튼 이미지
		ImagePanel setting_button_image = new ImagePanel(new ImageIcon("./img/setting.png").getImage());
		setting_button_image.setBounds(609, 306, 132, 132);
		setting_button_image.addMouseListener(new MouseListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				Setting_4 setting = new Setting_4();
				setting.show();				
				dispose();
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		panel.add(setting_button_image);
		
		// 버전 표시 레이블
		JLabel lblNewLabel_version = new JLabel("Ver. 1.1.0");
		lblNewLabel_version.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_version.setBounds(721, 483, 61, 15);
		panel.add(lblNewLabel_version);
		
	}
	
	private void initialize() {
		new JFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\logo.png"));
		setTitle("MyHotel");
		setBounds(100, 100, 796, 535);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	}
}
