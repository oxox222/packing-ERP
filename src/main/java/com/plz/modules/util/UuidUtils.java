package com.plz.modules.util;

import java.util.UUID;

/**
 * @ClassName: UUidUtil
 * @Description: uuid
 * @Author: PANLVZ
 * @Date: 2020-03-04
 */
public class UuidUtils {

    static String uuid = new String();

    public static String getUuid() {
        uuid = UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }
}
