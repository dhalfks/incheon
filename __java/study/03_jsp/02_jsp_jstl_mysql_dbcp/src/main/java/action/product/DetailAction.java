package action.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import domain.ProductVO;
import service.ProductService;
import service.ProductServiceImpl;

public class DetailAction implements Action {
	private static Logger log = LoggerFactory.getLogger(DetailAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		ProductService psv = new ProductServiceImpl();
		int pno = Integer.parseInt(req.getParameter("pno"));
		ProductVO pvo = psv.getDetail(pno);
		req.setAttribute("pvo", pvo);
	}

}
