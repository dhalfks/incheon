package service;

import java.util.List;

import domain.EmpVO;

public interface EmpService {
	public int register(EmpVO evo);
	public List<EmpVO> getList();
	public EmpVO getDetail(int empno);
	public int modify(EmpVO evo);
	public int remove(int empno);
	public EmpVO login(int empno, String pwd);
}
