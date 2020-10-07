package com.plz.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: PANLVZ
 * @Date: 2020/9/24
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str = list.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(str);
    }
}
