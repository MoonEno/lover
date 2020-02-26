<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<%@ include file="/WEB-INF/views/common/header.jsp"%>

<script src='/resources/js/main.js' ></script>

<body>

	<div class="onBody">
	    <!-- Background Video -->
	    <video class="mainVideo" autoplay loop> 
				    <source src="/video/mainVideo.mp4" type="video/mp4;"/>
		</video>
	    <div class="blackModal">
		</div>
		
        <div class="loginForm">
            <img id="profile-img" class="profile-img-card" src="/images/euna/euna01.JPG" />
            <form class="form-signin">
                <input type="text" id="id" class="form-control" placeholder="PEA" required>
                <input type="password" id="password" class="form-control" placeholder="비밀번호를 맞춰주세요" required>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">도전</button>
            </form><!-- /form -->
        </div><!-- /card-container -->
	
	</div>
	
</body>
 

</html>
