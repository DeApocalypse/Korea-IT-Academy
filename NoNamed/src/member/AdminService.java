package member;
/*
 * ArrayList 회원정보 관리
 * 등록   :  registerMemberVO(MemberVO) - void
 * 삭제   :  deleteMemberVO(String name) - void
 * 검색   :  searchMemberVO(String name) - MemberVO
 * 수정   :  updateMemberVO(MemberVO) - void
 * 전체조회 : selectAllMemberVO() - ArrayList<MemberVO>
 */

import java.util.ArrayList;

public class AdminService {
	private ArrayList<AdminInfo> list;
	private static AdminService instance = new AdminService();
	
	private AdminService() {
		list = new ArrayList<AdminInfo>();
		list.add(new AdminInfo("김범수", "9/3", "JW메리어트", "4명"));
		list.add(new AdminInfo("나얼", "12/25", "반얀트리", "1명"));
		list.add(new AdminInfo("박효신", "3/1", "정동진", "2명"));
		list.add(new AdminInfo("이수", "9/14", "포포인츠", "3명"));
	}
	
	public static AdminService getInstance() {
		if(instance == null)
			instance = new AdminService();
		return instance;
	}
	//추가
	public void registerMemberVO(AdminInfo vo) throws Exception {
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(vo))
				throw new Exception("회원정보가 중복됩니다.");
		}
		list.add(vo);
	}
	//삭제
	public void deleteMemberVO(String name) throws Exception {
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				return ;
			}		
		}
		throw new Exception("삭제하려는 회원 정보가 없습니다.");
	}
	
	//수정
	public void updateMemberVO(AdminInfo vo) throws Exception {
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(vo)) {
				list.get(i).setDate(vo.getDate());
				list.get(i).setHotel(vo.getHotel());
				list.get(i).setPeople(vo.getPeople());
				return;
			}
		}
		throw new Exception("수정할려는 회원 정보가 없습니다.");
	}
	//검색
	public int searchMemberVO(String name) {
		for(int i=0;i<list.size();i++){
			if(list.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;//검색한 결과가 없을 경우
	}
	//전체 정보 출력
	public ArrayList<AdminInfo> selectAllMemberVO(){
		return list;
	}
}








