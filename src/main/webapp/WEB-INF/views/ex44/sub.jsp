<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<h1>json format data 전송</h1>
	<button id="btn1">/ex44/sub01 post 요청 w/ data</button>
	<br>
	<button id="btn2">/ex44/sub02 post 요청 w/ data text/plain</button>
	<br>
	<button id="btn3">/ex44/sub03 post 요청 w/ data application/json</button>
	
	<br>
	<button id="btn4">/ex44/sub04 post 요청 json</button>
	
	<br>
	<button id="btn5">/ex44/sub05 post 요청 json</button>
	<br>
	<button id="btn6">/ex44/sub06 post 요청 json</button>
	
	<br>
	<button id="btn7">/ex44/sub07 post 요청 json</button>
	
	<br>
	<button id="btn8">/ex44/sub03 post 요청 obj -> json</button>
	<br>
	<button id="btn9">/ex44/sub05 post 요청 obj -> json</button>
	<br>
	<button id="btn10">/ex44/sub04 post 요청 obj -> json</button>
	
	<br>
	<button id="btn11">/ex44/sub03 post 요청 form -> obj -> json</button>
	<form action="" id="form1">
		<input type="text" name="name" id="nameInput1" value="차범근">
		<input type="text" name="address" id="addressInput1" value="독일">
	</form>
	
	<button id="btn12">/ex44/sub06 post form->obj->json</button>
	<input type="text" id="nameInput2" value="박지성">
	<input type="text" id="locationInput2" value="런던">
	<input type="text" id="sinceInput2" value="2000년">
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script>
const ctx = "${pageContext.request.contextPath}";

document.querySelector("#btn11").addEventListener("click", function() {
	const name = document.querySelector("#nameInput1").value;
	const address = document.querySelector("#addressInput1").value;
	const obj = {
		name : name,
		address : address,
	};
	const data = JSON.stringify(obj);
	fetch(ctx + "/ex44/sub03", {
		method : "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : data
	});
});

document.querySelector("#btn10").addEventListener("click", function() {
	const obj = {
			age:55, 
			name:"차범근", 
			hasCar:true, 
			food:["햄버거", "국수"]
	};
	
	fetch(ctx + "/ex44/sub04", {
		method : "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : JSON.stringify(obj)
	});
})

document.querySelector("#btn9").addEventListener("click", function() {
	const o = {
			address:"서울", 
			score: 88.8, 
			phone:["1111", "2222"], 
			married:true
	};
	const data = JSON.stringify(o);
	fetch(ctx + "/ex44/sub05", {
		method : "post",
		headers : {
			"Content-Type" : "application/json"
		}, 
		body : data
	});
})

document.querySelector("#btn8").addEventListener("click", function() {
	const o = {name : "박", address : "부산"};
	const data = JSON.stringify(o);
	
	fetch(ctx + "/ex44/sub03", {
		method : "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : data
	})
})

document.querySelector("#btn7").addEventListener("click", function() {
	fetch(ctx + "/ex44/sub07", {
		method : "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : `{"age": 44, "info" : {"address": ["서울", "부산"], "married":false}}`
	})
});


document.querySelector("#btn6").addEventListener("click", function() {
	fetch(ctx + "/ex44/sub06", {
		method : "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : `{"name" : "손", "job" : {"location" : "london", "since" : "2000년"}}`
	})
});


document.querySelector("#btn5").addEventListener("click", function() {
	fetch(ctx + "/ex44/sub05", {
		method : "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : `{"address":"서울", "phone":["010", "020"], "married":"true", "score":"99.9"}`
	})
});

document.querySelector("#btn4").addEventListener("click", function() {
	fetch(ctx + "/ex44/sub04", {
		method : "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : `{"name":"son", "hasCar": true, "food":["피자", "커피"], "age":33}`
	});
})

document.querySelector("#btn3").addEventListener("click", function() {
	fetch(ctx + "/ex44/sub03", {
		method: "post",
		headers : {
			"Content-Type" : "application/json"
		},
		body : '{"name":"son", "address":"seoul"}'
	});
});

document.querySelector("#btn2").addEventListener("click", function() {
	fetch(ctx + "/ex44/sub02", {
		method: "post",
		body : '{"name":"son", "address":"seoul"}'
	});
});

document.querySelector("#btn1").addEventListener("click", function() {
	fetch(ctx + "/ex44/sub01", {
		method: "post",
		body : '{"name":"son", "address":"seoul"}'
	});
});
</script>
</body>
</html>






