<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>회원 검색 결과</title>
</head>
<body>
    <h2>검색 결과</h2>
    <c:if test="${not empty list}">
    	<c:forEach items="${list}" var="m">
    		
    	</c:forEach>
    </c:if>
	<!-- 
		Servlet에서 전달받은 데이터를 바탕으로 응답화면 그리기.
		1. servlet에서 전달받은 데이터가 존재하는 경우와 , 존재하지 않는 경우를
		나눠서 작업할것.
		2. 작업시에는 core라이브러의 태그들을 사용할 것
	 -->
	<div>
		<!-- 일치하는 회원이 존재하지 않는 경우 -->
		<p style="color:red;">해당 이름의 회원이 존재하지 않습니다.</p>
		
		<!-- "성"을 검색한 경우 회원정보 출력예시 -->
		<div class="member">
            <p>이름: 심은성</p>
            <p>나이: 4</p>
            <p>성별: 남자</p>
		</div>	
		<div class="member">
            <p>이름: 유상성</p>
            <p>나이: 21</p>
            <p>성별: 남자</p>
		</div>	
	</div> 
</body>
</html>
