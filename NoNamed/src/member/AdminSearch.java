package member;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import main.Title;

@SuppressWarnings("serial")
public class AdminSearch extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSearch frame = new AdminSearch();
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
	public AdminSearch() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("예약 정보 검색");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 300, 297, 164);
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
		txtName.setBounds(125, 27, 116, 21);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("검색할 회원명");
		lblNewLabel.setFont(new Font("여기어때 잘난체", Font.PLAIN, 12));
		lblNewLabel.setBounds(32, 30, 76, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setFont(new Font("여기어때 잘난체", Font.PLAIN, 12));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				if(name == null) return;
				int no = AdminService.getInstance().searchMemberVO(name);
				AdminMain.getInstance().changeSelectRow(no);
				dispose();
			}
		});
		btnSearch.setBounds(32, 72, 209, 43);
		contentPane.add(btnSearch);
	}

}
