package member;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import main.Title;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("unused")
public class AdminMain extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//-------------------------------------------
	private static AdminMain instance = null;
	private static DefaultTableModel model;
	
	public static AdminMain getInstance() {
		return instance;
	}
	
	public void setDefaultTableModel() {
		String[] header = {"�����ڸ�","��¥","ȣ��", "���� �ο�"};
		ArrayList<AdminInfo> list = AdminService.getInstance().selectAllMemberVO();
		//ȸ�� ������ ����
		String[][] content = new String[list.size()][header.length];
		for(int i=0;i<list.size();i++) {
			content[i][0] = list.get(i).getName();
			content[i][1] = list.get(i).getDate();
			content[i][2] = list.get(i).getHotel();
			content[i][3] = list.get(i).getPeople();
		}
		model = new DefaultTableModel(content, header);
		table.setModel(model);//�ٽ� ����� ����
	}	
	//--------------------------------------------
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain frame = new AdminMain();
					instance = frame;
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
	public AdminMain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./img/logo.png"));
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 796, 535);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_3 = new JMenu("�߰�");
		mnNewMenu_3.setFont(new Font("���ʷҵ���", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem menuRegister = new JMenuItem("ȸ���������");
		menuRegister.setFont(new Font("���ʷҵ���", Font.PLAIN, 12));
		menuRegister.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				AdminRegister admin_register = new AdminRegister();
				admin_register.show();
			}
		});
		
		mnNewMenu_3.add(menuRegister);
		
		JMenu mnNewMenu = new JMenu("��ȸ");
		mnNewMenu.setFont(new Font("���ʷҵ���", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuSearch = new JMenuItem("ȸ�������˻�");
		menuSearch.setFont(new Font("���ʷҵ���", Font.PLAIN, 12));
		menuSearch.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				AdminSearch admin_search = new AdminSearch();
				admin_search.show();
			}
		});
		
		mnNewMenu.add(menuSearch);
		
		contentPane = new JPanel();
		Title tit = new Title();
		if (tit.getTheme() == 1)
			contentPane.setBackground(Color.WHITE);
		else if (tit.getTheme() == 0)
			contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 758, 377);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() != e.VK_ENTER) return;//���͸� ������ ����
				int row = table.getSelectedRow();
				String name = (String) table.getValueAt(table.getSelectedRow(), 0);
				String date = (String)table.getValueAt(table.getSelectedRow(), 1);
				String hotel = (String) table.getValueAt(table.getSelectedRow(), 2);
				String people = (String) table.getValueAt(table.getSelectedRow(), 3);
				try {
					AdminService.getInstance().updateMemberVO(new AdminInfo(name, date, hotel, people));
					setDefaultTableModel();
					table.changeSelection(row, 0, false, false);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		scrollPane.setViewportView(table);
		
		
		
		
		JButton btnExit = new JButton("���");
		btnExit.setFont(new Font("���ʷҵ���", Font.PLAIN, 16));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(629, 416, 141, 40);
		contentPane.add(btnExit);
		
		JButton btnDelete = new JButton("ȸ����������");
		btnDelete.setFont(new Font("���ʷҵ���", Font.PLAIN, 16));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = (String) table.getValueAt(table.getSelectedRow(), 0);
				try {
					AdminService.getInstance().deleteMemberVO(name);
					setDefaultTableModel();//����
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(476, 416, 141, 40);
		contentPane.add(btnDelete);
		
		JButton btnRegister = new JButton("ȸ�������߰�");
		btnRegister.setFont(new Font("���ʷҵ���", Font.PLAIN, 16));
		btnRegister.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				AdminRegister admin_register = new AdminRegister();
				admin_register.show();
			}
		});
		btnRegister.setBounds(323, 416, 141, 40);
		contentPane.add(btnRegister);
		setDefaultTableModel();
	}

	public void changeSelectRow(int no) {
		table.changeSelection(no, 0, false, false);		
	}
}
