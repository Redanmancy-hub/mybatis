package com.mybatis.pojo;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Dept {
    private Integer did;
    private String deptName;
    private List<Emp> emps;
}
