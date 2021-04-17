package com.plz.modules;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.stream().forEach(System.out::println);
    }

}
