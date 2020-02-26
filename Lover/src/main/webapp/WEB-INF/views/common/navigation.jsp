<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="sessionYn" value="${sessionScope.sessionYn }" />
<div class="header">
    <div class="wrap">
        <h1>
            <a href="/intro"><img src="/resources/images/header/top_logo.jpg" alt="mwrealestate"/></a>
        </h1>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="gnbHeader">
            
                <div class="col-sm-3">
                    <img src="/resources/images/header/gnb_s_new.jpg" alt="mwrealnew" class="fRight"/>
                </div>
                
                <div class="col-sm-9 m-t-13">
                    <c:choose>
                        <c:when test="${buildingList ne null && !empty buildingList}">
                            <c:forEach var="item" items="${buildingList}" varStatus="vs" >
                                <span class="p-lr-15"><a href="/detail/${item.id}" class="navi-li">${item.nameKor}</a></span>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <span class="p-lr-15"><a href="#" class="navi-li">데이터가 없습니다.</a></span>
                        </c:otherwise>
                    </c:choose>
                    </div>
                </div>
                
            </div>
        </div>
    </div>
</div>