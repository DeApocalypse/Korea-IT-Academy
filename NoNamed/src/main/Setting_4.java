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
		Checkbox light_mode = new Checkbox("라이트 모드", light_dark, false);
		light_mode.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		light_mode.setSize(111, 25);
		light_mode.setLocation(46, 71);
		panel.add(light_mode);
		Checkbox dark_mode = new Checkbox("다크 모드", light_dark, false);
		dark_mode.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		dark_mode.setSize(111, 25);
		dark_mode.setLocation(181, 71);
		panel.add(dark_mode);
		light_mode.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				tit.setTheme(1);
				System.out.println("라이트 모드");
			}
		});
		dark_mode.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				tit.setTheme(0);
				System.out.println("다크 모드");
			}
		});
		
		CheckboxGroup mbti_yes_no = new CheckboxGroup();
		Checkbox mbti_yes = new Checkbox("진행", mbti_yes_no, false);
		mbti_yes.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
		mbti_yes.setBounds(46, 151, 111, 25);
		panel.add(mbti_yes);
		Checkbox mbti_no = new Checkbox("스킵", mbti_yes_no, false);
		mbti_no.setFont(new Font("함초롬돋움", Font.PLAIN, 12));
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
		
		JLabel notice_label = new JLabel("공지 사항");
		notice_label.setFont(new Font("함초롬돋움", Font.BOLD, 17));
		notice_label.setHorizontalAlignment(SwingConstants.CENTER);
		notice_label.setBounds(12, 205, 86, 35);
		panel.add(notice_label);
		
		JLabel versionLabel = new JLabel("My Hotel -  Ver. 1.1.0");
		versionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		versionLabel.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		versionLabel.setBounds(266, 375, 156, 35);
		panel.add(versionLabel);
		
		String header[] = {"구분", "제목", "작성일"};
		String contents[][] = {
				{"공지", "9/21(화) 오후 4시, 사용자 추가 시 등록 안 되는 문제 수정", "9.21(화)"},
				{"공지", "9/21(화) 오후 3시, 다크/라이트 모드 문제 수정", "9.21(화)"},
				{"공지", "9/14(화) 오전 9시, 정식 서비스 출시!", "9.14(화)"},
				{"공지", "9/13(월) 다크 모드 서비스 추가", "9.13(월)"},
				{"공지", "9/12(일) 비정상적인 이용자 제재 설정", "9.14(일)"},
				{"점검", "(완료) 9/11(토) 정기점검 (오전 9시 ~ 오후 1시)", "9.11(토)"},
				{"공지", "9/10(금) 베타 서비스 시작", "9.9(목)"}
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
		
		JLabel user_setting = new JLabel("사용자 설정");
		user_setting.setHorizontalAlignment(SwingConstants.CENTER);
		user_setting.setFont(new Font("함초롬돋움", Font.BOLD, 17));
		user_setting.setBounds(12, 10, 119, 41);
		panel.add(user_setting);
		
		JLabel theme_setting = new JLabel("- 테마 설정");
		theme_setting.setHorizontalAlignment(SwingConstants.CENTER);
		theme_setting.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		theme_setting.setBounds(22, 47, 104, 29);
		panel.add(theme_setting);
		
		JLabel mbti_yes_or_no = new JLabel("- MBTI 검사 설정");
		mbti_yes_or_no.setHorizontalAlignment(SwingConstants.CENTER);
		mbti_yes_or_no.setFont(new Font("함초롬돋움", Font.PLAIN, 15));
		mbti_yes_or_no.setBounds(35, 127, 132, 29);
		panel.add(mbti_yes_or_no);
		
		
		// 설정 적용 후 다시 시작 버튼
		JButton btnNewButton = new JButton("적용 후 다시 시작");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				dispose();
				Title window = new Title();
				window.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("한컴 고딕", Font.PLAIN, 12));
		btnNewButton.setBounds(290, 116, 132, 23);
		panel.add(btnNewButton);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		new JFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("설정");
		setBounds(180, 180, 448, 457);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
