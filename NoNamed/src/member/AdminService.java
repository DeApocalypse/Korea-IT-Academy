package member;
/*
 * ArrayList ȸ������ ����
 * ���   :  registerMemberVO(MemberVO) - void
 * ����   :  deleteMemberVO(String name) - void
 * �˻�   :  searchMemberVO(String name) - MemberVO
 * ����   :  updateMemberVO(MemberVO) - void
 * ��ü��ȸ : selectAllMemberVO() - ArrayList<MemberVO>
 */

import java.util.ArrayList;

public class AdminService {
	private ArrayList<AdminInfo> list;
	private static AdminService instance = new AdminService();
	
	private AdminService() {
		list = new ArrayList<AdminInfo>();
		list.add(new AdminInfo("�����", "9/3", "JW�޸���Ʈ", "4��"));
		list.add(new AdminInfo("����", "12/25", "�ݾ�Ʈ��", "1��"));
		list.add(new AdminInfo("��ȿ��", "3/1", "������", "2��"));
		list.add(new AdminInfo("�̼�", "9/14", "��������", "3��"));
	}
	
	public static AdminService getInstance() {
		if(instance == null)
			instance = new AdminService();
		return instance;
	}
	//�߰�
	public void registerMemberVO(AdminInfo vo) throws Exception {
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(vo))
				throw new Exception("ȸ�������� �ߺ��˴ϴ�.");
		}
		list.add(vo);
	}
	//����
	public void deleteMemberVO(String name) throws Exception {
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				return ;
			}		
		}
		throw new Exception("�����Ϸ��� ȸ�� ������ �����ϴ�.");
	}
	
	//����
	public void updateMemberVO(AdminInfo vo) throws Exception {
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(vo)) {
				list.get(i).setDate(vo.getDate());
				list.get(i).setHotel(vo.getHotel());
				list.get(i).setPeople(vo.getPeople());
				return;
			}
		}
		throw new Exception("�����ҷ��� ȸ�� ������ �����ϴ�.");
	}
	//�˻�
	public int searchMemberVO(String name) {
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;//�˻��� ����� ���� ���
	}
	//��ü ���� ���
	public ArrayList<AdminInfo> selectAllMemberVO(){
		return list;
	}
}








