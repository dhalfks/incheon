package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("Lee", "1234");
		map.put("Kim", "1236");
		map.put("Cho", "1239");
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 pw를 입력해주세요");
			System.out.println("id 입력 > ");
			String id = sc.next();
			System.out.println("pw 입력 > ");
			String pw = sc.next();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("비밀번호 다름");
				}
			}else {
				System.out.println("아이디 없음");
				break;
			}
		}
	}
}
