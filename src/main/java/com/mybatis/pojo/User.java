package com.mybatis.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
/*运用反射A字段对应B属性*/
public class User {
    /**
     * id
     */
    private Integer id;
    /**
     * username
     */
    private String username;
    /**
     * password
     */
    private String password;
    /**
     * age
     */
    private Integer age;
    /**
     * sex
     */
    private String sex;
}
