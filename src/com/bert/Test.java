package com.bert;

import com.bert.common.util.HttpClientUtil;

public class Test {
public static void main(String[] args) {
	String reqURL1 = "http://v.juhe.cn/weather/index?format=2&cityname=北京&key=34b866ec6167e6966ce5058fd97672d0";
	String response1 = HttpClientUtil.sendGetRequest(reqURL1, "UTF-8");
	System.out.println(response1);
	
	
	String reqURL2 = "http://web.juhe.cn:8080/finance/stock/hs?gid=sh601009&key=fb5b8c54d4c07f3e69510096d6a32104";
	String response2 = HttpClientUtil.sendGetRequest(reqURL2, "UTF-8");
	System.out.println(response2);
	
	
}
}
