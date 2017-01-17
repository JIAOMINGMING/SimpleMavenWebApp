<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
<title>Hello World!</title>
</head>
<script type="text/javascript" src="resources/javascript/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="resources/javascript/test.js"></script>
<body>
<h1>Hello World!</h1>

<%
out.println(new java.util.Date());
%>
<br />
<br />
<br />
<button id = "test">11111111111</button>

<br />
<br />
<br />
<button id = "test1">222222222</button>
<br />
<br />
<br />
<button onclick = crunchifyAjax()>get current time</button>
<br />
<br />
<div id="result">current time</div>
<br />
<br />
<br />
<button onclick = getUserInformation()>get userName and password</button>
<br />
<br />
<div id="userName">userName</div>
<div id="password">password</div>


<button onclick = getUserInformationList()>get userName and password</button>
<br />
<br />
<div id="userName1">userName</div>
<div id="password1">password</div>
<div id="userName2">userName</div>
<div id="password2">password</div>




<button onclick = getSomeDataFromDatabase()>get some information from database</button>
<br />
<br />
<div id="description0">desctiption0</div>
<div id="address0">address0</div>
<div id="sex0">sex0</div>

<div id="description1">desctiption1</div>
<div id="address1">address1</div>
<div id="sex1">sex1</div>

<div id="description2">desctiption2</div>
<div id="address2">address2</div>
<div id="sex2">sex2</div>

<div id="description3">desctiption3</div>
<div id="address3">address3</div>
<div id="sex3">sex3</div>


</body>
</html>

