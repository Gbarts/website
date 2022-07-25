package org.zerock.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.zerock.dao.MemberDAO;
import org.zerock.dto.MemberDTO;

public class MemberServicelmpl implements MemberService {

	@Inject
	MemberDAO dao;
	
	@Override
	public String logincheck(MemberDTO dto, HttpSession session) {
		String name = dao.logincheck(dto);
		if(name!= null) {
		session.setAttribute("id", dto.getUserid());
		session.setAttribute("name", name);
		
		}
		return name;
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}

}
