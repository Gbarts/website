package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.dao.BoardDAO;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.Data;
import lombok.extern.log4j.Log4j;
@Data
@Log4j
@Service
public class BoardServicempl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> getList() {
		
		return mapper.getList();
	}
	
	@Override
	public BoardVO get(Long bno) {
		log.info("get.........."+bno);
		return mapper.read(bno);
	}

	

	@Override
	public void register(BoardVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int remove(Long bno) {
		// TODO Auto-generated method stub
		return mapper.delete(bno);
	}

	@Override
	public boolean modify(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.update(vo) == 1;
	}

	@Override
	public boolean insert2(BoardVO vo) {
		// TODO Auto-generated method stub
		return mapper.insert2(vo) == 1 ;
	}

	

}
