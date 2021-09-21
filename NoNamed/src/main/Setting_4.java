package main;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Setting_4 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting_4 window = new Setting_4();
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
	public Setting_4() {
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
		
		CheckboxGroup light_dark = new CheckboxGroup();
		Checkbox light_mode = new Checkbox("����Ʈ ���", light_dark, false);
		light_mode.setFont(new Font("���ʷҵ���", Font.PLAIN, 12));
		light_mode.setSize(111, 25);
		light_mode.setLocation(46, 71);
		panel.add(light_mode);
		Checkbox dark_mode = new Checkbox("��ũ ���", light_dark, false);
		dark_mode.setFont(new Font("���ʷҵ���", Font.PLAIN, 12));
		dark_mode.setSize(111, 25);
		dark_mode.setLocation(181, 71);
		panel.add(dark_mode);
		light_mode.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				tit.setTheme(1);
				System.out.println("����Ʈ ���");
			}
		});
		dark_mode.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				tit.setTheme(0);
				System.out.println("��ũ ���");
			}
		});
		
		CheckboxGroup mbti_yes_no = new CheckboxGroup();
		Checkbox mbti_yes = new Checkbox("����", mbti_yes_no, false);
		mbti_yes.setFont(new Font("���ʷҵ���", Font.PLAIN, 12));
		mbti_yes.setBounds(46, 151, 111, 25);
		panel.add(mbti_yes);
		Checkbox mbti_no = new Checkbox("��ŵ", mbti_yes_no, false);
		mbti_no.setFont(new Font("���ʷҵ���", Font.PLAIN, 12));
		mbti_no.setBounds(181, 151, 111, 25);
		panel.add(mbti_no);
		mbti_yes.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				tit.setTest(1);
			}
		});
		mbti_no.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				tit.setTest(0);
			}
		});
		
		JLabel notice_label = new JLabel("���� ����");
		notice_label.setFont(new Font("���ʷҵ���", Font.BOLD, 17));
		notice_label.setHorizontalAlignment(SwingConstants.CENTER);
		notice_label.setBounds(12, 205, 86, 35);
		panel.add(notice_label);
		
		JLabel versionLabel = new JLabel("My Hotel -  Ver. 1.1.0");
		versionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		versionLabel.setFont(new Font("���ʷҵ���", Font.PLAIN, 15));
		versionLabel.setBounds(266, 375, 156, 35);
		panel.add(versionLabel);
		
		String header[] = {"����", "����", "�ۼ���"};
		String contents[][] = {
				{"����", "9/21(ȭ) ���� 4��, ����� �߰� �� ��� �� �Ǵ� ���� ����", "9.21(ȭ)"},
				{"����", "9/21(ȭ) ���� 3��, ��ũ/����Ʈ ��� ���� ����", "9.21(ȭ)"},
				{"����", "9/14(ȭ) ���� 9��, ���� ���� ���!", "9.14(ȭ)"},
				{"����", "9/13(��) ��ũ ��� ���� �߰�", "9.13(��)"},
				{"����", "9/12(��) ���������� �̿��� ���� ����", "9.14(��)"},
				{"����", "(�Ϸ�) 9/11(��) �������� (���� 9�� ~ ���� 1��)", "9.11(��)"},
				{"����", "9/10(��) ��Ÿ ���� ����", "9.9(��)"}
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 236, 400, 129);
		panel.add(scrollPane);
		
		table = new JTable(contents, header);
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setPreferredWidth(280);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setColumnHeaderView(textPane);
		
		JLabel user_setting = new JLabel("����� ����");
		user_setting.setHorizontalAlignment(SwingConstants.CENTER);
		user_setting.setFont(new Font("���ʷҵ���", Font.BOLD, 17));
		user_setting.setBounds(12, 10, 119, 41);
		panel.add(user_setting);
		
		JLabel theme_setting = new JLabel("- �׸� ����");
		theme_setting.setHorizontalAlignment(SwingConstants.CENTER);
		theme_setting.setFont(new Font("���ʷҵ���", Font.PLAIN, 15));
		theme_setting.setBounds(22, 47, 104, 29);
		panel.add(theme_setting);
		
		JLabel mbti_yes_or_no = new JLabel("- MBTI �˻� ����");
		mbti_yes_or_no.setHorizontalAlignment(SwingConstants.CENTER);
		mbti_yes_or_no.setFont(new Font("���ʷҵ���", Font.PLAIN, 15));
		mbti_yes_or_no.setBounds(35, 127, 132, 29);
		panel.add(mbti_yes_or_no);
		
		
		// ���� ���� �� �ٽ� ���� ��ư
		JButton btnNewButton = new JButton("���� �� �ٽ� ����");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				dispose();
				Title window = new Title();
				window.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("���� ���", Font.PLAIN, 12));
		btnNewButton.setBounds(290, 116, 132, 23);
		panel.add(btnNewButton);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		new JFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("����");
		setBounds(180, 180, 448, 457);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
