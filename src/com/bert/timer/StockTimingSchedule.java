package com.bert.timer;

import com.bert.common.util.RandomUtil;
import com.bert.dwr.MessagePusher;

/**
 * 证券定时任务(根据每日调用接口次数限制，定义定时频率)
 */
public class StockTimingSchedule {
    public void execute(){
    	try {
    		 	MessagePusher push = new MessagePusher();
    	        //第一个参数0，表示广播
    		 	if(push != null){
    		 		push.sendMessage("0", "深证成指:"+RandomUtil.getRandomString(16));
	    	        push.sendMessage("0", "上证成指:"+RandomUtil.getRandomString(16));
	    	        push.sendMessage("0", "恒生指数:"+RandomUtil.getRandomString(16));
	    	        push.sendMessage("0", "道琼斯:"+RandomUtil.getRandomString(16));
	    	        push.sendMessage("0", "纳斯达克:"+RandomUtil.getRandomString(16));
    		 	}
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
