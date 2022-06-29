package webservice;

public class Oracle implements DataBase {
	
	@Override
	public boolean insert(String id) {		
			System.out.println("ORACLE > 회원 정보를 입력 " 
					+ (id.length() > 2 ? "성공" : "실패"));
			return id.length() > 2 ? true : false;
	}

	@Override
	public void select() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void delete() {
		
	}

}
