package com.kh.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.practice.model.vo.Member;

@WebServlet("/search")
public class MemberSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Member> mockList = new ArrayList<>();

	public MemberSearchServlet() {
		super();
	}

	@Override
	public void init() {
		// MOCK 회원 데이터
		mockList.add(new Member("홍은동", 25, "남자"));
        mockList.add(new Member("김영심", 19, "여자"));
        mockList.add(new Member("이은수", 30, "남자"));
        mockList.add(new Member("심하늘", 22, "여자"));
        mockList.add(new Member("정심훈", 45, "남자"));
        mockList.add(new Member("심은성", 4, "남자"));
        mockList.add(new Member("나수지", 33, "여자"));
        mockList.add(new Member("유상성", 21, "남자"));
        mockList.add(new Member("한지은", 28, "여자"));
        mockList.add(new Member("고심현", 40, "남자"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		
		List<Member> list = mockList.stream()
			.filter(m -> m.getName().contains(name))
			.collect(Collectors.toList());
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("/result.jsp").forward(request, response);
		
	}

}
