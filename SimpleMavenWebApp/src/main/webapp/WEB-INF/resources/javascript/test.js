$(function(){
	  $('#test').click(function () {
	    $(this).text("クリックされました");
	  });
	});


jQuery(document).ready(
		function($) {
	  $('#test1').click(function () {

		  var data = {}
			data["id"] = "2";


			$.ajax({
	             type: "POST",
	             contentType: "application/json",
	             url: "helloworld",
	             data: JSON.stringify(data),
	             // if you set dataType you will go to the error. I don't know why
//	             dataType: 'json',
	             timeout: 600000,
	             success: function (data) {
	                 alert(1111);
	                 //...
	             },
	             error: function (e) {
	            	 console.log("e : " , e);
	                 alert(2222);
	                 //...
	             }
		});


	  });
	});

function crunchifyAjax() {
    $.ajax({
    	type: "POST",
    	contentType: "application/json",
        url : "getTime",
        success : function(data) {
            $('#result').html(data);
        }
    });
}

function getUserInformation() {
    $.ajax({
    	type: "POST",
    	contentType: "application/json",
        url : "getUserInformation",
        success : function(data) {
            $('#userName').html(data.userName);
            $('#password').html(data.password);
            alert(1111);
        },
        error: function (e) {
       	 console.log("e : " , e);
            alert(2222);
            //...
        }

    });
}

function getUserInformationList() {
	var data = [];
	var list1 = {};
	list1["userName"] = "jiaoming1";
	list1["password"] = "password1";
	var list2 = {};
	list2["userName"] = "jiaoming2";
	list2["password"] = "password2";
	data.push(list1);
	data.push(list2);

    $.ajax({
    	type: "POST",
    	contentType: "application/json",
        url : "getUserInformationList",
        data: JSON.stringify(data),
        success : function(data) {
            $('#userName1').html(data[0].userName);
            $('#password1').html(data[0].password);
            $('#userName2').html(data[1].userName);
            $('#password2').html(data[1].password);
            alert(1111);
        },
        error: function (e) {
       	 console.log("e : " , e);
            alert(2222);
            //...
        }

    });
}


function getSomeDataFromDatabase() {
	var data = {};
	data["userName"] = "jiaomingSearchDatabase";
	data["password"] = "passwordSearchDatabase";

    $.ajax({
    	type: "POST",
    	contentType: "application/json",
        url : "getSomeDataFromDatabase",
        data: JSON.stringify(data),
        success : function(data) {
        	console.log(data);
        	console.log("data[0] : " , data[0]);
            $('#description0').html(data[0].userDescription);
            $('#address0').html(data[0].userAddress);
            $('#sex0').html(data[0].userSex);
            $('#description1').html(data[1].userDescription);
            $('#address1').html(data[1].userAddress);
            $('#sex1').html(data[1].userSex);
            $('#description2').html(data[2].userDescription);
            $('#address2').html(data[2].userAddress);
            $('#sex2').html(data[2].userSex);
            $('#description3').html(data[3].userDescription);
            $('#address3').html(data[3].userAddress);
            $('#sex3').html(data[3].userSex);
            alert(333333333333333);
        },
        error: function (e) {
       	 console.log("e : " , e);
            alert(2222);
            //...
        }

    });
}
