<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
    <script src="main.js"></script>
    <style>
        body{
            /* background-color: #fff;     引用一张图片吧，后期的 */
        }
        .paper{
            width: 1000px;
            height: 100%;
            /* align: center; */
            /* background-color: rgba(00,00,00,0.3); */
            margin-left: 220px;

        }
        header{
            margin: 0 15px;
        }
        h1{
            text-align: center;
            /* size: 5px;   不可调。。。。？？？？？/ */
        }
        .nav{
            font: italic arial,sans-serif;
        }
        article{
        }
        .formhead{
            align-content: center;
        }
        p{
            margin-left: 10px;
        }
        .number{
            font-size: 10pz;
            font-family:'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif
        }
        .select{
            margin-left: 25px;
            margin-bottom: 8px;
        }
        .fillname{
            border-radius: 5px;
        }
        .subnav{
            text-align: center;
            font-size: 20px;


        }
        .sub{
            /* width: 250px;
            height: 50px;
            background-color:rgb(141, 141, 235); */
            /* text-salign: center； */
            /* margin-left: 50px；    */
             /* 提交按钮如何居中？？？？？？ */
            width: 112px;
            height: 32px;
            border-radius: 2px;
            background-color: #2672ff;
            line-height: 32px;
            text-align: center;
            color: #fff;
            font-size: 14px;
            cursor: pointer;
            border: none;
            margin-left: 425px;
        }
    </style>
    
    <style type="text/css">    
     body{    
        background-image: url(images/timg.jpg);    
        background-size:860px 720px;
        background-repeat:no-repeat;
        background-position:center;
     }    
 </style> 
</head>
<body>


<div class="paper" >
    <header>

        <h1>大学生网购调查问卷</h1>
            <span class="nav">
              您好，我们正在进行一项关于大学生网购的调查，想邀请您用几分钟时间帮忙填答这份问卷。本问卷实行匿名制，所有数据只用于统计分析， 请您放心填写。题目选项无对错之分，请您按自己的实际情况填写。谢谢您的帮助。
            </span> 
    </header>
    <article>
        <hr size="5" color="#3366FF" width="96%" align="center">
            <form action="Webservlet" method="post" target="_blank" class="formhead">
            	
            	<br>
            	<p><span class="number">1.</span>
                    <label for="user">您的大名:</label>
                <input  id="user" class="fillname" type="text" name="uname" value="" maxlength="4"></p>
                <p><span class="number">2.</span>
                    <label for="schnum">您的学号:</label>
                <input  id="schnum" class="schnum" type="text" name="schnum" value="" maxlength="10"></p>
                <br>
                <p><span class="number">3.</span>您的性别是?</p>
                <input class="select" type="radio" name="sex" value="男" checked>男<br>
                <input class="select" type="radio" name="sex" value="女">女
                <br>
                <p><span class="number">4.</span>您所在的你年级?</p>
                <input class="select" type="radio" name="grade" value="大一" checked>大一
                <input class="select" type="radio" name="grade" value="大二">大二
                <input class="select" type="radio" name="grade" value="大三">大三
                <input class="select" type="radio" name="grade" value="大四">大四
                <input class="select" type="radio" name="grade" value="研究生">研究生
                <br>
                <p><span class="number">5.</span>你过去3个月是否曾经在网络上购买东西?</p>
                <input class="select" type="radio"name="havebought" value="是" checked>是
                <input class="select" type="radio"name="havebought" value="否">否
                <br>
                <p><span class="number">6.</span>你选择网络购物的主要原因是?</p>
                <input class="select" type="checkbox" name="reason" value="方便快捷，节省时间" checked>方便快捷，节省时间<br>
                <input class="select" type="checkbox" name="reason" value="品种齐全">品种齐全<br>
                <input class="select" type="checkbox" name="reason" value="价格便宜">价格便宜<br>
                <input class="select" type="checkbox" name="reason" value="时尚有趣">时尚有趣<br>
                <input class="select" type="checkbox" name="reason" value="实体店难以买到">实体店难以买到<br>
                <input class="select" type="checkbox" name="reason" value="网购时间不受限制">网购时间不受限制<br>
                <input class="select" type="checkbox" name="reason" value="其他">其他
                <br>
                <p><span class="number">7.</span>你主要在哪些网站上购买东西?</p>
                <!-- 5你主要在哪些网站上购买东西？ -->
                <input class="select" type="checkbox" name="webset" value="淘宝网" checked>淘宝网<br>
                <input class="select" type="checkbox" name="webset" value="京东商城">京东商城<br>
                <input class="select" type="checkbox" name="webset" value="卓越亚马逊">卓越亚马逊<br>
                <input class="select" type="checkbox" name="webset" value="当当网">当当网<br>
                <input class="select" type="checkbox" name="webset" value="拍拍网">拍拍网<br>
                <input class="select" type="checkbox" name="webset" value="其他">其他
                <br>
                <p><span class="number">8.</span>你在网上主要购买哪些东西?</p>
                <input class="select" type="checkbox" name="goods" value="服饰鞋帽" checked>服饰鞋帽
                <input class="select" type="checkbox" name="goods" value="饰品">饰品
                <input class="select" type="checkbox" name="goods" value="电子产品">电子产品
                <input class="select" type="checkbox" name="goods" value="生活日用品">生活日用品
                <input class="select" type="checkbox" name="goods" value="化妆品">化妆品
                <input class="select" type="checkbox" name="goods" value="书籍">书籍
                <input class="select" type="checkbox" name="goods" value="其他">其他
                <br>
                <p><span class="number">9.</span>你选择这些网站购物，主要看重哪些因素?</p>
                <input class="select" type="checkbox" name="choireason" value="产品种类的丰富性" checked>产品种类的丰富性<br>
                <input class="select" type="checkbox" name="choireason" value="其网站页面设计他">网站页面设计<br>
                <input class="select" type="checkbox" name="choireason" value="网站广告宣传和促销">网站广告宣传和促销<br>
                <input class="select" type="checkbox" name="choireason" value="销售商家信用度">其销售商家信用度他<br>
                <input class="select" type="checkbox" name="choireason" value="商家服务态度和互动程度">商家服务态度和互动程度<br>
                <input class="select" type="checkbox" name="choireason" value="品牌知名度">品牌知名度<br>
                <input class="select" type="checkbox" name="choireason" value="退换货便利性">退换货便利性<br>
                <input class="select" type="checkbox" name="choireason" value="产品价格">产品价格<br>
                <input class="select" type="checkbox" name="choireason" value="产品质量描述">产品质量描述<br>
                <input class="select" type="checkbox" name="choireason" value="发货及送货速度">发货及送货速度<br>
                <input class="select" type="checkbox" name="choireason" value="售后服务">售后服务<br>
                <input class="select" type="checkbox" name="choireason" value="购买者评论">购买者评论<br>
                <input class="select" type="checkbox" name="choireason" value="其他">其他
                <br>
                <p><span class="number">10.</span>你平时网购的频率是?</p>
                <input class="select" type="radio" name="buyfreq" value="每天一次或以上" checked>每天一次或以上<br>
                <input class="select" type="radio" name="buyfreq" value="每周４－５次">每周４～５次<br>
                <input class="select" type="radio" name="buyfreq" value="每周２－３次">每周２～３次<br>
                <input class="select" type="radio" name="buyfreq" value="每周１次">每周１次<br>
                <input class="select" type="radio" name="buyfreq" value="每月５－６次">每月５～６次<br>
                <input class="select" type="radio" name="buyfreq" value="每月２－３次">每月２～３次<br>
                <input class="select" type="radio" name="buyfreq" value="每月１次">每月１次<br>
                <input class="select" type="radio" name="buyfreq" value="少于每月一次">少于每月一次
                <br>    
                <p><span class="number">11.</span>你平均每个月花费在网购上的费用是多少钱?</p>
                <input class="select" type="radio" name="lesscost" value="１００元以内" checked>１００元以内<br>
                <input class="select" type="radio" name="lesscost" value="１００－３００元">１００～３００元<br>
                <input class="select" type="radio" name="lesscost" value="３０１－５００元">３０１～５００元<br>
                <input class="select" type="radio" name="lesscost" value="５０１－１０００元">５０１～１０００元<br>
                <input class="select" type="radio" name="lesscost" value="１０００元以上">１０００元以上
                <br>    
                <p><span class="number">12.</span>你喜欢的促销方式有哪些?</p>
                <input class="select" type="checkbox" name="salepromotion" value="免邮费" checked>免邮费
                <input class="select" type="checkbox" name="salepromotion" value="打折">打折
                <input class="select" type="checkbox" name="salepromotion" value="送分送礼物">送分送礼物
                <input class="select" type="checkbox" name="salepromotion" value="赠送优惠券">赠送优惠券
                <input class="select" type="checkbox" name="salepromotion" value="其他">其他
                <br>    
                <p><span class="number">13.</span>网购时，你经常使用哪种付款方式?</p>
                <input class="select" type="checkbox" name="paymeth" value="网上支付" checked>网上支付
                <input class="select" type="checkbox" name="paymeth" value="货到付款">货到付款
                <input class="select" type="checkbox" name="paymeth" value="邮局汇款">邮局汇款
                <input class="select" type="checkbox" name="paymeth" value="银行转账">银行转账
                <input class="select" type="checkbox" name="paymeth" value="其他">其他
                <br>    
                <p><span class="number">14.</span>你对网银、支付宝、财富通等网络支付手段的态度?</p>
                <input class="select" type="radio" name="attitude" value="放心，方便快捷又安全" checked>放心，方便快捷又安全
                <input class="select" type="radio" name="attitude" value="比较放心">比较放心
                <input class="select" type="radio" name="attitude" value="不放心，感觉不安全">不放心，感觉不安全
                <br>
                <p><span class="number">15.</span>网购时，对于货物，你通常采用哪种邮递方式?</p>
                <input class="select" type="radio" name="delivery" value="平邮" checked>平邮
                <input class="select" type="radio" name="delivery" value="快递">快递
                <input class="select" type="radio" name="delivery" value="ＥＭＳ">ＥＭＳ
                <input class="select" type="radio" name="delivery" value="其他">其他
                <br>
                <p><span class="number">16.</span>网购时，你对于货物送达能够接受的最长时间是?</p>
                <input class="select" type="radio" name="mindtime" value="１天" checked>１天
                <input class="select" type="radio" name="mindtime" value="２－３天">２～３天
                <input class="select" type="radio" name="mindtime" value="４－５天">４～５天
                <input class="select" type="radio" name="mindtime" value="６－７天">６～７天
                <input class="select" type="radio" name="mindtime" value="８－１０天">８～１０天
                <input class="select" type="radio" name="mindtime" value="无所谓">无所谓
                <br>
                <p><span class="number">17.</span>网购过程，你最担心的因素是?</p>
                <input class="select" type="checkbox" name="worry" value="支付的安全性" checked>支付的安全性<br>
                <input class="select" type="checkbox" name="worry" value="商家的诚信">商家的诚信<br>
                <input class="select" type="checkbox" name="worry" value="图片和实物有差距">其图片和实物有差距他<br>
                <input class="select" type="checkbox" name="worry" value="产品质量不合格">产品质量不合格<br>
                <input class="select" type="checkbox" name="worry" value="运货过程货物受损">其运货过程货物受损他<br>
                <input class="select" type="checkbox" name="worry" value="其他">其他
                <br>
                <br>
                
                 <p class="subnav">感谢您参与本调查，您的意见对我们很重要。</p>
                <input class="sub" type="submit" name="submit" value="发布并提交">
            </form>
        </article>
        
    </div>
</body>
</html>