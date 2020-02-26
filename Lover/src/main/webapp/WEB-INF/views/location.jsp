<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<%@ include file="/WEB-INF/views/common/navigation.jsp"%>
<script src='/resources/js/admin/jquery-1.8.1.min.js'></script>
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
<script type="text/javascript">
	$(document).ready(function () {
	var mapLatLng = new google.maps.LatLng(37.540700, 127.055985)
		var mapOptions = {
		zoom: 16,
		center: mapLatLng,
		mapTypeId: google.maps.MapTypeId.ROADMAP
		}
		var mapGoogle = new google.maps.Map(document.getElementById('map'), mapOptions);
		var mapMarker = new google.maps.Marker({
		map: mapGoogle,
		position: mapLatLng,
		animation: google.maps.Animation.DROP,
		title: "명우공인중개사사무소"
		});
		google.maps.event.addListener(mapMarker, 'click', function () {
		mapGoogle.setCenter(mapMarker.getPosition());
		});
	});
</script>
    <div class="section">
        <div class="wrap">
        <div class="contents">
        <ul>
            <li class="float_l" style="height:700px; width: 25%;">
            <!--왼쪽메뉴-->
            <img src="/resources/images/main/sub_location_img.jpg"/>
            <div class="t10">
                <img src="/resources/images/main/sub_left_location_01.jpg"/>
            </div>
            <div class="t10 b40">
                 <img src="/resources/images/main/tel_bn2_new.jpg" /><br/>
            </div>
            <!--/왼쪽메뉴-->
            </li>
            <li class="float_l" style="width: 65%;">
            <br/>
            <div id="location">
                <img src="/resources/images/detail/img_sub_home.jpg" style="padding-bottom: 3px; vertical-align: middle;"/>&nbsp;>&nbsp;오시는 길&nbsp;>&nbsp;<span class="loca_bold">오시는 길</span>
            </div>
           
            <div class="map" id="map" style="width: 110%; ">
            </div>
            <div >
	            <table class="addtable">
	                <tr>
	                    <th>주소</th>
	                    <td>서울특별시 성동구 성수이로 66, 101-1호(성수동2가, 서울숲 드림타워)</td>
	                </tr>
	                <tr>
	                    <th>TEL</th>
	                    <td>02-499-2004</td>
<!-- 	                </tr> -->
	                <tr>
	                    <th>위치안내</th>
	                    <td>지하철 이용시 : 성수역3분출구에서 이마트방면으로 도보 5분입니다.<br/>승용차 이용시 : 네비게이션에 성수동2가 309-51번지를 검색하세요. </td>
	                </tr>
	            </table>
	        </div>
	        </li>
	        </ul>
         </div>
         </div>
     </div>
    
    <script type="text/javascript">initMoving(document.getElementById("aside02"), 410, 173, 300);</script>
<%@ include file="/WEB-INF/views/common/footer.jsp"%>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAYIeV5l7lfd4IuQN7quPD3Tv4HAAW-EiA&callback=initMap"></script>
</html>
