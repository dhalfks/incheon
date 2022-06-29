package webservice;

public class WebService implements Service {
	
	DataBase dbms;
	
	public WebService() {}

	public WebService(int db) {
		dbms = db > 1 ? new Oracle() : new MySQL();
	}

	@Override
	public void register(String id) {
		System.out.println("회원가입 서비스 요청");
		System.out.println("회원가입" + (dbms.insert(id) ? "완료" : "실패"));
	}

	@Override
	public void login() {
		System.out.println("회원로그인 서비스 요청");
		dbms.select();
		System.out.println("로그인 완료");
	}

	@Override
	public void edit() {
		System.out.println("회원 정보 수정 서비스 요청");
		dbms.update();
		System.out.println("수정 완료");
	}

	@Override
	public void resign() {
		System.out.println("회원 탈퇴 서비스");
		dbms.delete();
		System.out.println("탈퇴 완료");
	}

}
