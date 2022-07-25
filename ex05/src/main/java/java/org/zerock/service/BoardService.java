package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;


public interface BoardService {
	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public List<BoardVO> getList();
	
	public int remove(Long bno);
	
	public boolean modify(BoardVO vo);

	public boolean insert2(BoardVO vo);
}
