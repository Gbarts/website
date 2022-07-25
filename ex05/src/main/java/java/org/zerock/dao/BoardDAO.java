package org.zerock.dao;

import org.zerock.domain.BoardVO;

public interface BoardDAO {
	//게시글 작성
	public void insert(BoardVO vo) throws Exception;
	
	// 게시물 수정
		public void update(BoardVO boardVO) throws Exception;
		
		// 게시물 삭제
		public void delete(Long bno) throws Exception;
}
