package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {

	public static void main(String[] args) {
		
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		
//		회원가입 // 중복 검증
//		if (memberDAO.checkId("kys3189")) {
//			System.out.println("사용 가능한 아이디");
//			
//			memberVO.setMemberId("kys3189");
//			memberVO.setMemberPassword("1234");
//			memberVO.setMemberName("김영수");
//			memberVO.setMemberAddress("서울시");
//			
//			memberDAO.join(memberVO);
//		}else {
//			System.out.println("중복된 아이디");
//		}
		
		
//		아이디 비밀번호 입력
		memberVO.setMemberId("kys3189");
		memberVO.setMemberPassword("1234");
		
//		로그인 후 세션에 정보담기
		if (memberDAO.login(memberVO)) {
			System.out.println("로그인 성공");
			System.out.println(memberDAO.session);
		}else {
			System.out.println("로그인 실패");
			System.out.println(memberDAO.session);
		}
		
//		로그아웃 세션 null로 바꾸기
//		memberDAO.logout();	
//		System.out.println(memberDAO.session);
		
//      정보수정
//		MemberVO updatedMember = new MemberVO();
//		updatedMember.setMemberId("hgd12345");
//		updatedMember.setMemberPassword("12345");
//		updatedMember.setMemberName("홍길동");		 
//		updatedMember.setMemberAddress("서울시 강남구");
//		memberDAO.update(updatedMember);
//		System.out.println("수정 완료");
		
//		비밀번호 변경
//		updatedMember.setMemberPassword("1234");
//		memberDAO.updatePassword(updatedMember);
//		System.out.println("비밀번호 변경 완료");
		
//		계정삭제
//		memberDAO.delete(memberVO);
//		System.out.println("계정 삭제");
		
	}
	
}
