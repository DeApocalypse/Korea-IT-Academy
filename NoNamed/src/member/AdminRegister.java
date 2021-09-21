package member;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Title;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class AdminRegister extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtDate;
	private JTextField txtHotel;
	private JTextField txtPeople;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRegister frame = new AdminRegister();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminRegister() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("예약 정보 추가");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 300, 296, 291);
		contentPane = new JPanel();
		Title tit = new Title();
		if (tit.getTheme() == 1)
			contentPane.setBackground(Color.WHITE);
		else if (tit.getTheme() == 0)
			contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(130, 30, 116, 21);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(130, 70, 116, 21);
		contentPane.add(txtDate);
		
		txtHotel = new JTextField();
		txtHotel.setColumns(10);
		txtHotel.setBounds(130, 110, 116, 21);
		contentPane.add(txtHotel);
		
		txtPeople = new JTextField();
		txtPeople.setColumns(10);
		txtPeople.setBounds(130, 150, 116, 21);
		contentPane.add(txtPeople);
		
		JLabel name_label = new JLabel("이름");
		name_label.setFont(new Font("여기어때 잘난체", Font.PLAIN, 12));
		name_label.setHorizontalAlignment(SwingConstants.CENTER);
		name_label.setBounds(36, 33, 57, 15);
		contentPane.add(name_label);
		
		JLabel date_label = new JLabel("날짜");
		date_label.setFont(new Font("여기어때 잘난체", Font.PLAIN, 12));
		date_label.setHorizontalAlignment(SwingConstants.CENTER);
		date_label.setBounds(36, 73, 57, 15);
		contentPane.add(date_label);
		
		JLabel hotel_label = new JLabel("호텔");
		hotel_label.setFont(new Font("여기어때 잘난체", Font.PLAIN, 12));
		hotel_label.setHorizontalAlignment(SwingConstants.CENTER);
		hotel_label.setBounds(36, 113, 57, 15);
		contentPane.add(hotel_label);
		
		JLabel people_label = new JLabel("인원 수");
		people_label.setFont(new Font("여기어때 잘난체", Font.PLAIN, 12));
		people_label.setHorizontalAlignment(SwingConstants.CENTER);
		people_label.setBounds(36, 153, 57, 15);
		contentPane.add(people_label);
		
		JButton btnRegister = new JButton("등록");
		btnRegister.setFont(new Font("여기어때 잘난체", Font.PLAIN, 12));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtName.getText().length() < 1)return;
				if(txtDate.getText().length() < 1)return;
				if(txtHotel.getText().length() < 1)return;
				if(txtPeople.getText().length() < 1)return;
				
				String name = txtName.getText();
				String date = txtDate.getText();
				String hotel = txtHotel.getText();
				String people = txtPeople.getText();
				try {
					AdminService.getInstance().registerMemberVO(
							new AdminInfo(name, date, hotel, people));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				dispose();
				AdminMain am = new AdminMain();
				am.setVisible(true);
				if(AdminMain.getInstance() == null)
					return;
				AdminMain.getInstance().setDefaultTableModel();//갱신
			}
		});
		btnRegister.setBounds(22, 199, 97, 45);
		contentPane.add(btnRegister);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setFont(new Font("여기어때 잘난체", Font.PLAIN, 12));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(173, 199, 97, 45);
		contentPane.add(btnCancel);
	}
}
