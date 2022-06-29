package action.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import action.Action;
import domain.ProductVO;
import service.EmpService;
import service.ProductService;
import service.ProductServiceImpl;

public class ListAction implements Action {
	private static Logger log = LoggerFactory.getLogger(ListAction.class);

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) {
		ProductService psv = new ProductServiceImpl();
		List<ProductVO> list = psv.getList();
		req.setAttribute("list", list);
	}
}
