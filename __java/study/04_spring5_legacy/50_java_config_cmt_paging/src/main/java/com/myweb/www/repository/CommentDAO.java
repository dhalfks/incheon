package com.myweb.www.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myweb.www.domain.CommentVO;
import com.myweb.www.domain.PagingVO;

public interface CommentDAO {
	int insertComment(CommentVO cvo);
	List<CommentVO> selectListComment(@Param("pno") long pno, @Param("pgvo") PagingVO pgvo);
	int updateComment(CommentVO cvo);
	int deleteOneComment(long cno);
	int deleteAllComment(long pno);
	long selectOneComment(long cno); // getPno by cno
	int selectOneCommentTotalCount(long pno);
}
