package org.zerock.service;

import javax.servlet.http.HttpSession;

import org.zerock.dto.MemberDTO;

public interface MemberService {

	public String logincheck(MemberDTO dto, HttpSession session);
	public void logout(HttpSession session);
}
