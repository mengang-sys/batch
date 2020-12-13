package com.my.batch.batch;

import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {
    @Override
    public User process(User user) throws Exception {
        if (user.getAge() % 2 == 0) {
            return user;
        }
        return null;
    }
}
