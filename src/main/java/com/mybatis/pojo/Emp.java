package com.mybatis.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@ToString
public class Emp {
    private Integer eid;
    private String empName;
    private Integer age;
    private String sex;
    private String email;
    private Dept dept;

    public Emp(Integer eid, String empName, Integer age, String sex, String email) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
