package com.feilong.mvcstu.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor
public class UserDao {
    private String name;
    private int age;
    private String companyName;
    private String schoolName;
}
