package com.plz.modules.schedule;

import com.plz.modules.constant.Constant;
import com.plz.modules.util.RedisUtils;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName: RedisSchedule
 * @Description: redis定时任务
 * @Author: PANLVZ
 * @Date: 2021/1/8
 */
@Component
@EnableScheduling
public class RedisSchedule {

    @Resource
    private RedisUtils redis;

    /**
     * 每天清空订单序号
     */
    @Scheduled(cron = "0 5 0 * * ?")
    public void emptyOdd() {
        redis.delete(Constant.oddKey);
    }
}
