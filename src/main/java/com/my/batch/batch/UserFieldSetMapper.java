package com.my.batch.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class UserFieldSetMapper implements FieldSetMapper<User> {
    @Override
    public User mapFieldSet(FieldSet fieldSet) {
        return new User(
                fieldSet.readInt("id"),
                fieldSet.readString("username"),
                fieldSet.readString("password"),
                fieldSet.readInt("age"));
    }
}
