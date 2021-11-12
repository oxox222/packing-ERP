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
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        StringBuilder sb = new StringBuilder(sdf.format(new Date()));
        Object param = redis.get(Constant.ODD_NUMBER);
        Integer number = null;
        if (Objects.nonNull(param)) {
            number = Integer.parseInt((String) param);
        }
        if (Objects.isNull(number) || number.equals(Constant.ODD_NUMBER_MAX)) {
            //从1开始
            number = 1;
        } else {
            //累加
            number++;
        }
        redis.set(Constant.ODD_NUMBER, number.toString());
        String value = sb.append(String.format("%04d", number)).toString();
        return value;
    }

}
