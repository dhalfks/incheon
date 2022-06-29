package action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import domain.ProductVO;
import service.ProductService;
import service.ProductServiceImpl;

public class ModifyAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ModifyAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		int pno = Integer.parseInt(req.getParameter("pno"));
		String pname = req.getParameter("pname");
		double price = Double.parseDouble(req.getParameter("price"));
		String madeby = req.getParameter("madeby");
		
		ProductVO pvo = new ProductVO(pno, pname, price, madeby);
		
		ProductService psv = new ProductServiceImpl();
		
		int isUp = psv.modify(pvo);
		
		log.info(">>> Product Modify {}", isUp > 0 ? "Success":"Fail");
	}
}
