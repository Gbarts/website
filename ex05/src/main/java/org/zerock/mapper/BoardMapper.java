package org.zerock.mapper;

import java.util.Date;
import java.util.List;


import org.zerock.domain.BoardVO;


public interface BoardMapper {
	//@Select("select * from my_board where bno > 0")
	public List<BoardVO> getList();
	
	public void insert(BoardVO vo);
	
	public int insert2(BoardVO vo);

	public BoardVO read(Long bno);
	
	public int update(BoardVO vo);
	
	public int delete(Long bno);

}
