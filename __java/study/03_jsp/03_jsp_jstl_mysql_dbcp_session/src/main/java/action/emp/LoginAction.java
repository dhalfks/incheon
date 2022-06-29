package action.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import domain.EmpVO;
import service.EmpService;
import service.EmpServiceImpl;

public class LoginAction implements Action {
	private static Logger log = LoggerFactory.getLogger(LoginAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		String pwd = req.getParameter("pwd");
		
		EmpService esv = new EmpServiceImpl();
		EmpVO evo = esv.login(empno, pwd);
		
		if(evo != null) {
			HttpSession ses = req.getSession();
			ses.setAttribute("ses", evo);
			ses.setMaxInactiveInterval(60 * 10); // 초단위
		}else {
			req.setAttribute("msg_login", 0);
		}
	}

}
