package com.plz.modules.constant;

import lombok.Data;

/**
 * @ClassName: Constant
 * @Description: 常量类
 * @Author: PANLVZ
 * @Date: 2020/10/26
 */
@Data
public class Constant {

    /**
     * 保存文件根路径
     */
    public static final String rootPath = "E:/upload/";

    /**
     * 订单号 redis key
     */
    public static final String oddKey = "ERPOdd";
    public static final String ODD_NUMBER = "ERPNUMBER";
    public static final Integer ODD_NUMBER_MAX = 9999;

}
