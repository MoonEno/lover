


$(function() {
	
});


/**
 * 로그인
 */
$(document).on('click', '#loginBtn', function(){

    var $mngId = $('input[name="mngId"]');
    if ($mngId.val() == null || $mngId.val() == '') {
        alert('아이디를 확인해 주세요.');
        $mngId.focus();
        return;
    }

    var $mngPwd = $('input[name="mngPwd"]');
    if ($mngPwd.val() == null || $mngPwd.val() == '') {
        alert('비밀번호를 확인해 주세요.');
        $mngPwd.focus();
        return;
    }

    $.ajax({
        type     : 'POST',
        url      : '/login.json',
        contentType : 'application/json; charset=utf-8',
        data     : JSON.stringify({
            mngId : $mngId.val(),
            mngPwd : $mngPwd.val()
        }),
        dataType : 'json',
        error    : function(json) {
            alert(json.error);
        },
        success  : function(json) {
            if(json.isSuccess){
                // location.href('/intro');
                $(location).attr('href', '/intro');
            } else {
                alert(json.msg);
            }
        }
    });
});

/**
 * 분양글 등록 창 열기
 */
$(document).on('click', '#addBtn', function() {
    $('#modal .modal-title').text('분양글 등록');
    $('#modal #saveBtn').text('저장');
    var el = makeSavePostForm();
    $('#modal .modal-body').html(el);
    $('#modal').modal({
        backdrop : true
    });
});

/**
 * 분양글 삭제 창 열기
 */
$(document).on('click', '#delBtn', function() {
    $('#modal .modal-title').text('분양글 삭제');
    $('#modal #saveBtn').text('삭제');
    makeDelPostForm();
});



function makeDelPostForm() {

    $.ajax({
        type     : 'POST',
        url      : '/list.json',
        contentType : 'application/json; charset=utf-8',
        dataType : 'json',
        error    : function(json) {
            alert(json.error);
        },
        success  : function(json) {
            if(json.isSuccess){
                var list = json.list;

                var el = '<table>';
                for (var i = 0; i < list.length; i++) {
                    el += '<tr seq="' + list[i].id + '">';
                    el += '<td><input type="checkbox" name="delCheck"/></td><td>&nbsp;&nbsp;' + list[i].nameKor +'</td>';
                    el += '</tr>';
                }
                el += '</table>';

                $('#modal .modal-body').html(el);
                $('#modal').modal({
                    backdrop : true
                });
            } else {
                alert(json.msg);
            }
        }
    });
}

/**
 * 빌딩 삭제
 * @param checkList
 */
function deleteBuilding(checkList) {

    // checkList 존재한다면 
    if (checkList.length) {
        
        console.log(JSON.stringify(checkList));
        $.ajax({
            type     : 'POST',
            url      : '/delete.json',
            data     : JSON.stringify({checkList : checkList}),
            contentType : 'application/json; charset=utf-8',
            dataType : 'json',
            error    : function(json) {
                alert(json.error);
            },
            success  : function(json) {
                if(json.isSuccess){
                    alert('삭제되었습니다.');
                    $(location).attr('href', '/intro');
                } else {
                    alert(json.msg);
                }
            }
        });

    }

}

