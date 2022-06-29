package com.myweb.www.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myweb.www.domain.BFileVO;
import com.myweb.www.domain.BoardDTO;
import com.myweb.www.domain.BoardVO;
import com.myweb.www.domain.PagingVO;
import com.myweb.www.repository.BCommentDAO;
import com.myweb.www.repository.BFileDAO;
import com.myweb.www.repository.BoardDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO bdao;

	@Inject
	private BCommentDAO cdao;

	@Inject
	private BFileDAO bfdao;

	@Override
	public int register(BoardDTO bdto) {
//		for (int i = 0; i < bdto.getBfList().size(); i++) {
//			bfdao.insertBFile(bdto.getBfList().get(0));
//		}
		int isUp = bdao.insertBoard(bdto.getBvo());
		
		if (isUp > 0 && bdto.getBfList().size() > 0) {
			long bno = bdao.selectOneBno();
			for (BFileVO bfvo : bdto.getBfList()) {
				bfvo.setBno(bno);
				isUp *= bfdao.insertBFile(bfvo);
			}
		}
		return isUp;
	}

	@Override
	public List<BoardVO> getList() {
		return bdao.selectListBoard();
	}

	@Override
	public BoardDTO getDetail(long bno) {		
		return new BoardDTO(bdao.selectOneBoard(bno),bfdao.selectListBFile(bno)) ;
	}

	@Override
	public int modify(BoardDTO bdto) {
		int isUp = bdao.updateBoard(bdto.getBvo());
		if (isUp > 0 && bdto.getBfList().size() > 0) {
			long bno = bdto.getBvo().getBno();
			for (BFileVO bfvo : bdto.getBfList()) {
				bfvo.setBno(bno);
				isUp *= bfdao.insertBFile(bfvo);
			}
		}
		return isUp;
	}

	@Override
	public int remove(long bno) {
		cdao.deleteAllBComment(bno);
		return bdao.deleteBoard(bno);
	}

	@Override
	public List<BoardVO> getList(PagingVO pagingVO) {
		return bdao.selectListBoardPaging(pagingVO);
	}

	@Override
	public int getTotalCount(PagingVO pagingVO) {
		return bdao.selectOneTotalCount(pagingVO);
	}

	@Override
	public int removeFile(String uuid) {
		return bfdao.deleteBFile(uuid);
	}

}
