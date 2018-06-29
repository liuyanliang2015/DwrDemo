<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>大屏数据</title>
<!-- 路径从web.xml中配置,具体文件不需要特意引入真实的js，项目自动生成 -->
<!-- DwrDemo自动生成,名称对应dwr中配置的create:javascript,路径对应web.xml中配置的url-pattern -->
<!-- 导入DWR引擎的核心JavaScript代码库 -->
<script type="text/javascript" src='<%=request.getContextPath()  %>/dwr/engine.js'></script>
<!-- 导入开发者为本应用编写的JavaScript代码库 -->
<script type="text/javascript" src='<%=request.getContextPath()  %>/dwr/util.js'></script>
<!-- 导入DWR为MessagePusher对象动态生成的JavaScript代码库 -->
<script type="text/javascript" src='<%=request.getContextPath()  %>/dwr/interface/MessagePusher.js'></script>
<script type="text/javascript" src='<%=request.getContextPath() %>/js/jquery.js'></script>
<script type="text/javascript">
	function init(){
		dwr.engine.setActiveReverseAjax(true);
		dwr.engine.setNotifyServerOnPageUnload(true);
	}
	
	window.onload = init;
	
	function learning(){
		var name = $("#name").val();
		MessagePusher.learning(name);
	}
	
	function showMessage(msg) {
		$("#show").val(msg);
	}
</script>
</head>
<body>
输入你的姓名：<input type="text" id="name"></input> 
<input type="button" value="开始" onclick="learning()"></input><br>
<textarea rows="20" cols="100" id="show"></textarea><br>
</body>
</html>