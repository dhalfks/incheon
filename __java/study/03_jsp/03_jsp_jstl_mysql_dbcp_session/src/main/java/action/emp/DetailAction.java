package action.emp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import domain.EmpVO;
import service.EmpService;
import service.EmpServiceImpl;
public class DetailAction implements Action {
	private static Logger log = LoggerFactory.getLogger(DetailAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
//		EmpService esv = new EmpServiceImpl();
//		int empno = Integer.parseInt(req.getParameter("empno"));
//		EmpVO evo = esv.getDetail(empno);
//		req.setAttribute("evo", evo);
		
		req.setAttribute("evo", new EmpServiceImpl().getDetail(
				Integer.parseInt(req.getParameter("empno"))));
	}
}
