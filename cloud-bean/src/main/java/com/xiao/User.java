package com.xiao;

import lombok.Data;

import java.util.Date;

/**
 * 测试Demo
 *
 * @author 肖亭
 * @since 2018年05月29 14:58
 **/
@Data
public class User {
    /**
     * ID
     */
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 创建时间
     */
    private Date time;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
