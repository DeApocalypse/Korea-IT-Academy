package main;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Room_1 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	String mbti = "";
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Title tit = new Title();
		int test = tit.getTest();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room_1 window = new Room_1();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Room_1() {
		initialize();
	}
	
	private void initialize() {
		new JFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("당신을 위한 호텔 추천");
		setBounds(100, 100, 796, 535);
		
		JPanel panel = new JPanel();
		Title tit = new Title();
		if (tit.getTheme() == 1)
			panel.setBackground(Color.WHITE);
		else if (tit.getTheme() == 0)
			panel.setBackground(Color.GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_MBTI_test = new JLabel("Pseudo MBTI Test");
		lblNewLabel_MBTI_test.setFont(new Font("여기어때 잘난체", Font.BOLD, 25));
		lblNewLabel_MBTI_test.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_MBTI_test.setBounds(0, 29, 782, 42);
		panel.add(lblNewLabel_MBTI_test);
		
		JLabel I_or_E = new JLabel("나 자신을 다른 사람들에게 소개하는 것을 어려워 합니다.");
		I_or_E.setHorizontalAlignment(SwingConstants.CENTER);
		I_or_E.setFont(new Font("함초롬돋움", Font.PLAIN, 17));
		I_or_E.setBounds(0, 94, 782, 42);
		panel.add(I_or_E);
		CheckboxGroup I_E = new CheckboxGroup();
		Checkbox I_E_yes = new Checkbox("예", I_E, false);
		I_E_yes.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		I_E_yes.setSize(42, 25);
		I_E_yes.setLocation(270, 129);
		Checkbox I_E_no = new Checkbox("아니오", I_E, false);
		I_E_no.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		I_E_no.setSize(64, 25);
		I_E_no.setLocation(430, 129);
		panel.add(I_E_yes);
		panel.add(I_E_no);
		
		JLabel N_or_S = new JLabel("종종 주변 상황을 무시하거나 잊어버리는 생각에 빠지곤 합니다.");
		N_or_S.setHorizontalAlignment(SwingConstants.CENTER);
		N_or_S.setFont(new Font("함초롬돋움", Font.PLAIN, 17));
		N_or_S.setBounds(0, 174, 782, 42);
		panel.add(N_or_S);
		CheckboxGroup N_S = new CheckboxGroup();
		Checkbox N_S_yes = new Checkbox("예", N_S, false);
		N_S_yes.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		N_S_yes.setBounds(270, 209, 42, 25);
		panel.add(N_S_yes);
		Checkbox N_S_no = new Checkbox("아니오", N_S, false);
		N_S_no.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		N_S_no.setBounds(430, 209, 64, 25);
		panel.add(N_S_no);
		
		JLabel T_or_F = new JLabel("감성적 판단보다 논리적 판단을 하는 편입니다.");
		T_or_F.setHorizontalAlignment(SwingConstants.CENTER);
		T_or_F.setFont(new Font("함초롬돋움", Font.PLAIN, 17));
		T_or_F.setBounds(0, 254, 782, 42);
		panel.add(T_or_F);
		CheckboxGroup T_F = new CheckboxGroup();
		Checkbox T_F_yes = new Checkbox("예", T_F, false);
		T_F_yes.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		T_F_yes.setBounds(270, 289, 42, 25);
		panel.add(T_F_yes);
		Checkbox T_F_no = new Checkbox("아니오", T_F, false);
		T_F_no.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		T_F_no.setBounds(430, 289, 64, 25);
		panel.add(T_F_no);
		
		JLabel J_or_P = new JLabel("매 순간 무엇을 할 것인지 구체적으로 계획합니다.");
		J_or_P.setHorizontalAlignment(SwingConstants.CENTER);
		J_or_P.setFont(new Font("함초롬돋움", Font.PLAIN, 17));
		J_or_P.setBounds(0, 334, 782, 42);
		panel.add(J_or_P);
		CheckboxGroup J_P = new CheckboxGroup();
		Checkbox J_P_yes = new Checkbox("예", J_P, false);
		J_P_yes.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		J_P_yes.setBounds(270, 374, 42, 25);
		panel.add(J_P_yes);
		Checkbox J_P_no = new Checkbox("아니오", J_P, false);
		J_P_no.setFont(new Font("맑은 고딕", Font.PLAIN, 10));
		J_P_no.setBounds(430, 374, 64, 25);
		panel.add(J_P_no);
		
		JButton cancelButton = new JButton("취소");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setBounds(246, 428, 95, 23);
		panel.add(cancelButton);
		
		JButton resultButton = new JButton("결과 확인");
		resultButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (I_E_yes.getSelectedObjects() != null)
					mbti+="I";
				else if (I_E_no.getSelectedObjects() != null)
					mbti+="E";
				
				if (N_S_yes.getSelectedObjects() != null)
					mbti+="N";
				else if (N_S_no.getSelectedObjects() != null)
					mbti+="S";
				
				if (T_F_yes.getSelectedObjects() != null)
					mbti+="T";
				else if (T_F_no.getSelectedObjects() != null)
					mbti+="F";
				
				if (J_P_yes.getSelectedObjects() != null)
					mbti+="J";
				else if (J_P_no.getSelectedObjects() != null)
					mbti+="P";
//				System.out.println(mbti);	// MBTI 정상 작동 확인용 코드
				@SuppressWarnings("unused")
				Recommand recommand = new Recommand(mbti);
				dispose();
			}
		});
		resultButton.setBounds(427, 428, 95, 23);
		panel.add(resultButton);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
