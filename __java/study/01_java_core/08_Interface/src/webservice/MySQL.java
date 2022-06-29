package webservice;

public class MySQL implements DataBase {

	@Override
	public boolean insert(String id) {
		System.out.println("MySQL > 회원 정보를 입력 " 
				+ (id.length() > 2 ? "성공" : "실패"));
		return id.length() > 2 ? true : false;
	}

	@Override
	public void select() {
		System.out.println("데이터베이스에서 회원 정보를 조회하였습니다");

	}

	@Override
	public void update() {
		System.out.println("데이터베이스에서 회원 정보를 수정하였습니다");
	}

	@Override
	public void delete() {
		System.out.println("데이터베이스에서 회원 정보를 삭제하였습니다");
	}

}
