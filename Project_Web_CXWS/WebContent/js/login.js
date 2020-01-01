var reg=/^[1-9]\d{5}(18|19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9xX]$/;/*身份证的正则表达式*/

function login(){
    var act=document.getElementById("accout").value;
    var psw=document.getElementById("password").value;

    if(act==""){
        alert("账号不能为空！")
        return;
    }
    if(psw==""){
        alert("密码不能为空！")
        return;
    }else if(psw != act.slice(-6)){
        alert("密码错误！（身份证后六位）")
        return;
    }alert("登陆成功！")
    window.location.href="linjian/first.html";     //跳转页面
}
