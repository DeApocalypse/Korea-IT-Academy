package main;



import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import member.AdminMain;
import member.AdminRegister;

public class Recommand extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Title t = new Title();
	int test = t.getTest();

	public Recommand(String input_mbti) {
		
		Frame f = new Frame("호텔 추천");
		f.setBounds(50, 50, 500, 700);
		f.setLayout(null);
		f.setResizable(false);
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				f.dispose();

			};

		} );
		
		// mbti 를 string 값으로 받으면 switch 문을 이용해 호텔 이름과 설명을 대입
		
		String mbti = input_mbti; // 예시
		String mbtitrait = "";
		String hotelimg = "";
		String hotelname = ""; // 호텔 이름
		String hoteldescription = ""; // 호텔 설명
		String hotelstar = ""; // 호텔 성급
		@SuppressWarnings("unused")
		int number = 0;
		
		// 유형에 따른 호텔 추천
		
		switch ( mbti ) {
		case "ISTJ":
			mbtitrait = "조용한 곳을 좋아하는";
			hotelimg = "워커힐.jpeg";
			hotelname = "워커힐";
			hotelstar = "★★★★★";
			hoteldescription = "숲 안에 있어 고요하고 조용함";
			number = 1;
			break;
		case "ISFJ":
			mbtitrait = "조용한 곳을 좋아하는";
			hotelimg = "워커힐.jpeg";
			hotelname = "워커힐";
			hotelstar = "★★★★★";
			hoteldescription = "숲 안에 있어 고요하고 조용함";
			number = 2;
			break;
		case "INFJ":
			mbtitrait = "혼자만의 시간이 필요한";
			hotelimg = "워커힐.jpeg";
			hotelname = "씨마크";
			hotelstar = "★★★★★";
			hoteldescription = "힐링하기 좋음";
			number = 3;
			break;
		case "INTJ":
			mbtitrait = "지적 호기심이 많은";
			hotelimg = "썬크루즈.jpeg";
			hotelname = "썬크루즈";
			hotelstar = "★★★★";
			hoteldescription = "볼거리가 많음";
			number = 4;
			break;
		case "ISTP":
			mbtitrait = "효율을 중시하는";
			hotelimg = "포포인츠.jpeg";
			hotelname = "포포인츠";
			hotelstar = "★★★★";
			hoteldescription = "가성비가 좋음";
			number = 5;
			break;
		case "ISFP":
			mbtitrait = "감성이 풍부한";
			hotelimg = "해비치.jpeg";
			hotelname = "해비치";
			hotelstar = "★★★★★";
			hoteldescription = "분위기가 좋음";
			number = 6;
			break;
		case "INFP":
			mbtitrait = "감성이 풍부한";
			hotelimg = "해비치.jpeg";
			hotelname = "해비치";
			hotelstar = "★★★★★";
			hoteldescription = "분위기가 좋음";
			number = 7;
			break;
		case "INTP":
			mbtitrait = "사색하는 것을 좋아하는";
			hotelimg = "네스트.jpeg";
			hotelname = "네스트";
			hotelstar = "★★★★★";
			hoteldescription = "자연 풍경을 느낄 수 있음";
			number = 8;
			break;
		case "ESTP":
			mbtitrait = "활동적인 것을 좋아하는";
			hotelimg = "신라호텔.jpeg";
			hotelname = "신라호텔";
			hotelstar = "★★★★★";
			hoteldescription = "대한민국 1등 호텔";
			number = 9;
			break;
		case "ESFP":
			mbtitrait = "추억 남기는 것을 좋아하는";
			hotelimg = "반얀트리.jpeg";
			hotelname = "반얀트리";
			hotelstar = "★★★★★";
			hoteldescription = "연인과 가기 좋음";
			number = 10;
			break;
		case "ENFP":
			mbtitrait = "언제나 새로운 것을 좋아하는";
			hotelimg = "해비치.jpeg";
			hotelname = "해비치";
			hotelstar = "★★★★★";
			hoteldescription = "건물만 봐도 호강됨";
			number = 11;
			break;
		case "ENTP":
			mbtitrait = "인증샷 찍는 것을 좋아하는";
			hotelimg = "파크하얏트.jpeg";
			hotelname = "파크하얏트";
			hotelstar = "★★★★★";
			hoteldescription = "뷰가 좋음";
			number = 12;
			break;
		case "ESTJ":
			mbtitrait = "효율을 중시하는";
			hotelimg = "정동진.jpeg";
			hotelname = "정동진썬크루즈";
			hotelstar = "★★★★";
			hoteldescription = "사진찍기 좋음";
			number = 13;
			break;
		case "ESFJ":
			mbtitrait = "추억 남기는 것을 좋아하는";
			hotelimg = "JW메리어트.jpeg";
			hotelname = "JW메리어트";
			hotelstar = "★★★★★";
			hoteldescription = "친구들이랑 호캉스 가능함";
			number = 14;
			break;
		case "ENFJ":
			mbtitrait = "사람을 좋아하는";
			hotelimg = "씨마크.jpeg";
			hotelname = "씨마크호텔";
			hotelstar = "★★★★★";
			hoteldescription = "강릉뷰를 즐길수있음";
			number = 15;
			break;
		case "ENTJ":
			mbtitrait = "도전을 두려워하지 않는";
			hotelimg = "워커힐.jpeg";
			hotelname = "워커힐";
			hotelstar = "★★★★";
			hoteldescription = "사진명소";
			number = 16;
			break;
		}

		// mbti 를 string 값으로 받으면
		
		Label L1 = new Label("당신은 " + mbti + " 입니다!!");
		Font font1 = new Font("", Font.BOLD, 25);
		Font font2 = new Font("", Font.BOLD, 20);
		Font font3 = new Font("", Font.PLAIN, 20);
		
		L1.setBounds(125, 50, 250, 50);
		L1.setFont(font1);
		
		// Mbti 설명 추가

		Label L2 = new Label(mbtitrait + " 당신에게 추천 드립니다.");

		L2.setBounds(20, 100, 500, 50);
		L2.setFont(font2);
		
		// 호텔 이미지 추가
		
		ImageIcon img = new ImageIcon("./img/"+hotelimg);
		JLabel j1 = new JLabel(img);
		j1.setBounds(20, 170, 450, 250);
		
		// 호텔 이름, 설명, 성급 추가

		Label L3 = new Label("호텔 : " + hotelname);

		L3.setBounds(100, 450, 200, 50);
		L3.setFont(font3);

		Label L4 = new Label(hoteldescription);
		
		L4.setBounds(100, 500, 300, 50);
		L4.setFont(font3);
		
		Label L5 = new Label("성급 : " + hotelstar);
		
		L5.setBounds(100, 550, 200, 50);
		L5.setFont(font3);
		
		f.add(j1);
		f.add(L1);
		f.add(L2);
		f.add(L3);
		f.add(L4);
		f.add(L5);
		
		// '다시 테스트하기', '예약하기', '닫기' 버튼 만들기

		Button b1 = new Button("다시하기");
		Button b2 = new Button("예약하기");
		Button b3 = new Button("닫기");
		
		b1.setBounds(50, 600, 120, 50);
		b2.setBounds(190, 600, 120, 50);
		b3.setBounds(330, 600, 120, 50);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);

		// 버튼에 이벤트 추가하기
		
		b1.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				@SuppressWarnings("unused")
				Title t = new Title();
				if(test == 1)
				{
					Room_1 room = new Room_1();
					room.show();						
				}
				else
				{
					Room_skip_1 room_skip = new Room_skip_1();
					room_skip.show();
				}

			}
		});

		b2.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
//				AdminMain admin_main = new AdminMain();
				AdminRegister admin_register = new AdminRegister();
//				admin_main.show();
				admin_register.show();
				

			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();

			}
		});
	}

	public static void main(String[] args) {
		String mbti = "";
		@SuppressWarnings("unused")
		Recommand recommand = new Recommand(mbti);
	}

}