package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.ProductVO;

public class ProductDAOImpl implements ProductDAO {
	private static Logger log = LoggerFactory.getLogger(ProductDAOImpl.class);
	private Connection cn;
	private PreparedStatement pst;
	private ResultSet rs;
	private String query;
	
	public ProductDAOImpl() {
		cn = DBConnector.getConnection();
	}

	@Override
	public int insert(ProductVO pvo) {
		query = "insert into product (pname, price, regdate, madeby)"
				+ " values(?,?,now(),?)";
		try {
			pst = cn.prepareStatement(query);
			pst.setString(1, pvo.getPname());
			pst.setDouble(2, pvo.getPrice());
			pst.setString(3, pvo.getMadeby());
			return pst.executeUpdate();
		} catch (SQLException e) {
			log.info(">>> ProductDAO > insert > Error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<ProductVO> selectList() {
		List<ProductVO> list = new ArrayList<>();
		query = "select pno, pname, regdate from product order by regdate desc";
		try {
			pst = cn.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				int pno = rs.getInt("pno");
				String pname = rs.getString("pname");
				String regdate = rs.getString("regdate");
				ProductVO pvo = new ProductVO(pno, pname, regdate);
				list.add(pvo);
			}
			return list;
		} catch (SQLException e) {
			log.info(">>> ProductDAO > selectList > Error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductVO selectOne(int pno) {
		query = "select * from product where pno=?";
		try {
			pst = cn.prepareStatement(query);
			pst.setInt(1, pno);
			rs = pst.executeQuery();
			if(rs.next()) {
				int pn = rs.getInt("pno");
				String pname = rs.getString("pname");
				double price = rs.getDouble("price");
				String regdate = rs.getString("regdate");
				String madeby = rs.getString("madeby");
				ProductVO pvo = new ProductVO(pno, pname, price, regdate, madeby);
				return pvo;
			}
		} catch (SQLException e) {
			log.info(">>> ProductDAO > selectOne > Error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(ProductVO pvo) {
		query = "update product set pname = ?, price = ?, madeby = ? where pno = ?";
		try {
			pst = cn.prepareStatement(query);
			pst.setString(1, pvo.getPname());
			pst.setDouble(2, pvo.getPrice());
			pst.setString(3, pvo.getMadeby());
			pst.setInt(4, pvo.getPno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			log.info(">>> ProductDAO > update > Error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int pno) {
		query = "delete from product where pno = ?";
		try {
			pst = cn.prepareStatement(query);
			pst.setInt(1, pno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			log.info(">>> ProductDAO > delete > Error");
			e.printStackTrace();
		}
		return 0;
	}
}
