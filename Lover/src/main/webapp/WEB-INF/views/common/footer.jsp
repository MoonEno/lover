<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!--퀵영역-->
    <div id="aside" style="margin-top: 10%;">
        <ul>
            <li>
                <div class="calculator">
                    <h3>평형계산기</h3>
                    <input id="area" type="text" onclick="select_cal(1);"> ㎡<br/>
                    <input type="button" value="계산하기" onclick="calc_area();"><br/>
                    <input id="pyoung" onclick="select_cal(2);" type="text"> <span>평</span>
                </div>
            </li>
            <li><a href="http://www.mwreal.com" target="_blank"><img src="/resources/images/main/banner_mw.gif" alt="명우부동산홈페이지가기"/></a></li>
        </ul>
    </div>
    
    <div class="footer" style="clear:both;">
        <div class="wrap">
            <h1>
                <img src="/resources/images/main/top_logo.jpg" alt="mwrealestate"/>
            </h1>
            <address>
                명우공인중개사사무소   |   대표 : 최정관   |   서울특별시 성동구 성수이로 66, 101-1호(성수동2가, 서울숲 드림타워)<br/>
                TEL : 02-499-2004   |   FAX : 02-498-8409
            </address>
        </div>
    </div>
    
        <!-- 관리자 로그인 -->
    <div class="adminLogin" align="center">
        <c:choose>
            <c:when test="${sessionYn ne 'Y'}">
                아이디 : <input type="text" name="mngId" class="input- sm"/>
                비밀번호 : <input type="password" name="mngPwd" class="input-sm"/>
                <button type="button" id="loginBtn" class="btn">로그인</button>
            </c:when>
            <c:otherwise>
                <c:if test="${data.id ne ''}">
	                <button type="button" id="addBtn" class="btn btn-primary">분양글 등록</button>
	                <button type="button" id="delBtn" class="btn btn-danger">분양글 삭제</button>
                </c:if>
                <button type="button" id="logoutBtn" class="btn btn-secondary">로그아웃</button>
            </c:otherwise>
        </c:choose>
    </div>
    
</body>