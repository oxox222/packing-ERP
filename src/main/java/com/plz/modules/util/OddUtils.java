package com.plz.modules.util;

import com.plz.modules.constant.Constant;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @ClassName: OddUtils
 * @Description: 订单号生成工具类
 * @Author: PANLVZ
 * @Date: 2021/1/7
 */
@Component
public class OddUtils {

    @Resource
    private RedisUtils redis;


    /**
     * 获取订单号
     * @return
     */
    public String getOdd() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        StringBuilder sb = new StringBuilder(sdf.format(new Date()));
        String value = (String)redis.get(Constant.oddKey);
        if (Objects.isNull(value)) {
            //新的一天从1开始
            value = sb.append("00001").toString();;
        } else {
            //累加
            value = String.format("%05d", Long.parseLong(value)+1);
        }
        redis.set(Constant.oddKey, value);
        return value;
    }

}
