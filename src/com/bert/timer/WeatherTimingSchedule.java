package com.bert.timer;

import com.bert.common.util.RandomUtil;
import com.bert.dwr.MessagePusher;

/**
 * 天气和人民币汇率定时任务(每天触发一次)
 */
public class WeatherTimingSchedule {
    public void execute(){
    	try {
    		 MessagePusher push = new MessagePusher();
    	        //第一个参数0，表示广播
    	        push.sendMessage("0", "天气预报:"+RandomUtil.getRandomString(16));
    	        push.sendMessage("0", "人民币汇率:"+RandomUtil.getRandomString(16));
		} catch (Exception e) {
			e.printStackTrace();
		}
       
    }
}
