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
		
		Frame f = new Frame("ȣ�� ��õ");
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
		
		// mbti �� string ������ ������ switch ���� �̿��� ȣ�� �̸��� ������ ����
		
		String mbti = input_mbti; // ����
		String mbtitrait = "";
		String hotelimg = "";
		String hotelname = ""; // ȣ�� �̸�
		String hoteldescription = ""; // ȣ�� ����
		String hotelstar = ""; // ȣ�� ����
		@SuppressWarnings("unused")
		int number = 0;
		
		// ������ ���� ȣ�� ��õ
		
		switch ( mbti ) {
		case "ISTJ":
			mbtitrait = "������ ���� �����ϴ�";
			hotelimg = "��Ŀ��.jpeg";
			hotelname = "��Ŀ��";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�� �ȿ� �־� ����ϰ� ������";
			number = 1;
			break;
		case "ISFJ":
			mbtitrait = "������ ���� �����ϴ�";
			hotelimg = "��Ŀ��.jpeg";
			hotelname = "��Ŀ��";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�� �ȿ� �־� ����ϰ� ������";
			number = 2;
			break;
		case "INFJ":
			mbtitrait = "ȥ�ڸ��� �ð��� �ʿ���";
			hotelimg = "��Ŀ��.jpeg";
			hotelname = "����ũ";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�����ϱ� ����";
			number = 3;
			break;
		case "INTJ":
			mbtitrait = "���� ȣ����� ����";
			hotelimg = "��ũ����.jpeg";
			hotelname = "��ũ����";
			hotelstar = "�ڡڡڡ�";
			hoteldescription = "���Ÿ��� ����";
			number = 4;
			break;
		case "ISTP":
			mbtitrait = "ȿ���� �߽��ϴ�";
			hotelimg = "��������.jpeg";
			hotelname = "��������";
			hotelstar = "�ڡڡڡ�";
			hoteldescription = "������ ����";
			number = 5;
			break;
		case "ISFP":
			mbtitrait = "������ ǳ����";
			hotelimg = "�غ�ġ.jpeg";
			hotelname = "�غ�ġ";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�����Ⱑ ����";
			number = 6;
			break;
		case "INFP":
			mbtitrait = "������ ǳ����";
			hotelimg = "�غ�ġ.jpeg";
			hotelname = "�غ�ġ";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�����Ⱑ ����";
			number = 7;
			break;
		case "INTP":
			mbtitrait = "����ϴ� ���� �����ϴ�";
			hotelimg = "�׽�Ʈ.jpeg";
			hotelname = "�׽�Ʈ";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�ڿ� ǳ���� ���� �� ����";
			number = 8;
			break;
		case "ESTP":
			mbtitrait = "Ȱ������ ���� �����ϴ�";
			hotelimg = "�Ŷ�ȣ��.jpeg";
			hotelname = "�Ŷ�ȣ��";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "���ѹα� 1�� ȣ��";
			number = 9;
			break;
		case "ESFP":
			mbtitrait = "�߾� ����� ���� �����ϴ�";
			hotelimg = "�ݾ�Ʈ��.jpeg";
			hotelname = "�ݾ�Ʈ��";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "���ΰ� ���� ����";
			number = 10;
			break;
		case "ENFP":
			mbtitrait = "������ ���ο� ���� �����ϴ�";
			hotelimg = "�غ�ġ.jpeg";
			hotelname = "�غ�ġ";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�ǹ��� ���� ȣ����";
			number = 11;
			break;
		case "ENTP":
			mbtitrait = "������ ��� ���� �����ϴ�";
			hotelimg = "��ũ�Ͼ�Ʈ.jpeg";
			hotelname = "��ũ�Ͼ�Ʈ";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�䰡 ����";
			number = 12;
			break;
		case "ESTJ":
			mbtitrait = "ȿ���� �߽��ϴ�";
			hotelimg = "������.jpeg";
			hotelname = "��������ũ����";
			hotelstar = "�ڡڡڡ�";
			hoteldescription = "������� ����";
			number = 13;
			break;
		case "ESFJ":
			mbtitrait = "�߾� ����� ���� �����ϴ�";
			hotelimg = "JW�޸���Ʈ.jpeg";
			hotelname = "JW�޸���Ʈ";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "ģ�����̶� ȣĲ�� ������";
			number = 14;
			break;
		case "ENFJ":
			mbtitrait = "����� �����ϴ�";
			hotelimg = "����ũ.jpeg";
			hotelname = "����ũȣ��";
			hotelstar = "�ڡڡڡڡ�";
			hoteldescription = "�����並 ��������";
			number = 15;
			break;
		case "ENTJ":
			mbtitrait = "������ �η������� �ʴ�";
			hotelimg = "��Ŀ��.jpeg";
			hotelname = "��Ŀ��";
			hotelstar = "�ڡڡڡ�";
			hoteldescription = "�������";
			number = 16;
			break;
		}

		// mbti �� string ������ ������
		
		Label L1 = new Label("����� " + mbti + " �Դϴ�!!");
		Font font1 = new Font("", Font.BOLD, 25);
		Font font2 = new Font("", Font.BOLD, 20);
		Font font3 = new Font("", Font.PLAIN, 20);
		
		L1.setBounds(125, 50, 250, 50);
		L1.setFont(font1);
		
		// Mbti ���� �߰�

		Label L2 = new Label(mbtitrait + " ��ſ��� ��õ �帳�ϴ�.");

		L2.setBounds(20, 100, 500, 50);
		L2.setFont(font2);
		
		// ȣ�� �̹��� �߰�
		
		ImageIcon img = new ImageIcon("./img/"+hotelimg);
		JLabel j1 = new JLabel(img);
		j1.setBounds(20, 170, 450, 250);
		
		// ȣ�� �̸�, ����, ���� �߰�

		Label L3 = new Label("ȣ�� : " + hotelname);

		L3.setBounds(100, 450, 200, 50);
		L3.setFont(font3);

		Label L4 = new Label(hoteldescription);
		
		L4.setBounds(100, 500, 300, 50);
		L4.setFont(font3);
		
		Label L5 = new Label("���� : " + hotelstar);
		
		L5.setBounds(100, 550, 200, 50);
		L5.setFont(font3);
		
		f.add(j1);
		f.add(L1);
		f.add(L2);
		f.add(L3);
		f.add(L4);
		f.add(L5);
		
		// '�ٽ� �׽�Ʈ�ϱ�', '�����ϱ�', '�ݱ�' ��ư �����

		Button b1 = new Button("�ٽ��ϱ�");
		Button b2 = new Button("�����ϱ�");
		Button b3 = new Button("�ݱ�");
		
		b1.setBounds(50, 600, 120, 50);
		b2.setBounds(190, 600, 120, 50);
		b3.setBounds(330, 600, 120, 50);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);

		// ��ư�� �̺�Ʈ �߰��ϱ�
		
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