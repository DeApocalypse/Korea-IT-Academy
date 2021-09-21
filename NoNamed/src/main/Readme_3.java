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
		
		JLabel readme_label = new JLabel("<����>");
		readme_label.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label.setVerticalAlignment(SwingConstants.TOP);
		readme_label.setBounds(0, 21, 792, 20);
		panel.add(readme_label);
		
		JLabel readme_label_1 = new JLabel("MBTI ������ ȣ�� ��õ �� ���� ������ ������ ���α׷� �Դϴ�");
		readme_label_1.setVerticalAlignment(SwingConstants.TOP);
		readme_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_1.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_1.setBounds(0, 71, 792, 20);
		panel.add(readme_label_1);
		
		JLabel readme_label_2 = new JLabel("<���>");
		readme_label_2.setVerticalAlignment(SwingConstants.TOP);
		readme_label_2.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_2.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_2.setBounds(0, 146, 792, 20);
		panel.add(readme_label_2);
		
		JLabel readme_label_3 = new JLabel("����� ������ ���� ���� ������ ȣ���� ��õ�մϴ�");
		readme_label_3.setVerticalAlignment(SwingConstants.TOP);
		readme_label_3.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_3.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_3.setBounds(0, 196, 792, 20);
		panel.add(readme_label_3);
		
		JLabel readme_label_4 = new JLabel("������� ��ȸ �� ��Ұ� �����մϴ�");
		readme_label_4.setVerticalAlignment(SwingConstants.TOP);
		readme_label_4.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_4.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_4.setBounds(0, 227, 792, 20);
		panel.add(readme_label_4);
		
		JLabel readme_label_5 = new JLabel("�������� �Խ����� ���Ͽ� ����� ģȭ���� ������ �����մϴ�");
		readme_label_5.setVerticalAlignment(SwingConstants.TOP);
		readme_label_5.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_5.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_5.setBounds(0, 257, 792, 20);
		panel.add(readme_label_5);
		
		JLabel readme_label_6 = new JLabel("<Ư¡>");
		readme_label_6.setVerticalAlignment(SwingConstants.TOP);
		readme_label_6.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_6.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_6.setBounds(0, 331, 792, 20);
		panel.add(readme_label_6);
		
		JLabel readme_label_7 = new JLabel("���� MBTI �׽�Ʈ�� BI �ΰ� ���� �����Ͽ� Ʈ������ ���������� ����Ǿ����ϴ�");
		readme_label_7.setVerticalAlignment(SwingConstants.TOP);
		readme_label_7.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_7.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_7.setBounds(0, 381, 792, 20);
		panel.add(readme_label_7);
		
		JLabel readme_label_8 = new JLabel("ȣ�� ���� Ȩ�������� ��ġ��ŷ�Ͽ� ����ڿ��� �ͼ��� �������̽� �����Ͽ����ϴ�");
		readme_label_8.setVerticalAlignment(SwingConstants.TOP);
		readme_label_8.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_8.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_8.setBounds(0, 411, 792, 20);
		panel.add(readme_label_8);
		
		JLabel readme_label_9 = new JLabel("ȸ������ �� ��ȸ�� �����ϰ� �Ͽ� ������ �ſ� �����մϴ�");
		readme_label_9.setVerticalAlignment(SwingConstants.TOP);
		readme_label_9.setHorizontalAlignment(SwingConstants.CENTER);
		readme_label_9.setFont(new Font("���� �߳�ü", Font.PLAIN, 18));
		readme_label_9.setBounds(0, 441, 792, 20);
		panel.add(readme_label_9);
		
	}

	private void initialize() {
		new JFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("��� ���");
		setBounds(100, 100, 796, 535);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
