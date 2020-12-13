package com.my.batch.batch;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class UserWriter implements ItemWriter<User> {
    @Override
    public void write(List<? extends User> list) throws Exception {
        for (User user : list) {
            System.out.println(user);
        }
    }
}
