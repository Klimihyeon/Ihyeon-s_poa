/**
 * 로그인 페이지 js
 */

function login(url){
	var fm = document.getElementById("fm");
	fm.method = "post"
	fm.action = url;
	fm.submit();
}

function movePageByGet(url){
	  // 페이지이동 1
	  location.href = url;
}

