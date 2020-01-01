<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
		*{
			padding: 0;
			margin: 0;
		}
		#uls{
			width: 500px;
			height: 500px;
			margin: 50px auto;
		}
		li{
			width: 150px;
			height: 150px;
			background: skyblue;
			float: left;
			list-style: none;
			margin:5px;
			color: #fff;
			text-align: center;
			line-height: 150px;
			font-size: 20px;
			font-weight: bold;
		}
		#uls li button{
			width: 50px;
			height: 30px;
		}
		.light{
			width: 150px;
			height: 150px;
			background: #666;
			color: #fff;
		}
	</style>
</head>
<body>
<ul id='uls'>
		<li>百分之40</li>
		<li>百分之20</li>
		<li>百分之10</li>
		<li>百分之1</li>
		<li><button id='btn1'>开始</button> </li>
		<li>百分之10</li>
		<li>百分之5</li>
		<li>百分之5</li>
		<li>百分之10</li>
	</ul>
	<script>
		var btn1=document.getElementById("btn1");
		var btn2=document.getElementById("btn2");
		var arr=[0,1,2,5,8,7,6,3];//按这个下标依次旋转
		var randoms=[0.4,0.6,0.7,0.8,0.9,0.95,0.99,1];//概率区间
		var i,num1;
		var lis=document.getElementsByTagName("li");
		var num=0;  //定义初识下标
		var test = "num";
		btn1.onclick=function(){
			num=0;
			num1=0;
			btn1.disabled=true;
			time=setInterval(function(){
				lis[arr[num]].className="";
				num++;
				if(num>7){
					num=0;
				}
				lis[arr[num]].className="light";
			},50)
			setTimeout(function(){sclects()},3000);
	function sclects()
	{
		clearInterval(time);
		i=Math.random();
		if (i<randoms[0])
		{
			num1=0;
		}
		else if (i>randoms[0] && i<randoms[1])
		{
			num1=1;
		}
		else if (i>randoms[1] && i<randoms[2])
		{
			num1=2;
		}
		else if (i>randoms[2] && i<randoms[3])
		{
			num1=3;
		}
		else if (i>randoms[3] && i<randoms[4])
		{
			num1=4;
		}
		else if (i>randoms[4] && i<randoms[5])
		{
			num1=5;
		}
		else if (i>randoms[5] && i<randoms[6])
		{
			num1=6;
		}
		else if (i>randoms[6] && i<randoms[7])
		{
			num1=7;
		}
		time1=setInterval(function(){
				lis[arr[num]].className="";
				num++;
				if(num>7){
					num=0;
				}
				if(num==num1)
				{
					clearInterval(time1);
					btn1.disabled=false;
				}
				lis[arr[num]].className="light";
			},50)
		}
	}
		document.getElementById("test").value = test;
	</script>
	请将您获奖图片截图后发到QQ：57339509，之后会联系您并给您发布奖品

</body>
</html>