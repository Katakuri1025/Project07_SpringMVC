package com.bjpowernode.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author deuses
 * @creat 2022-09-01 20:26
 */
@Data @AllArgsConstructor @NoArgsConstructor
public class User {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 证件类型
     */
    private String cardType;

    /**
     * 证件号
     */
    private String cardNo;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户性别
     */
    private String userSex;

    /**
     * 用户年龄
     */
    private Integer userAge;

    /**
     * 用户角色工作
     */
    private String userRole;
}
