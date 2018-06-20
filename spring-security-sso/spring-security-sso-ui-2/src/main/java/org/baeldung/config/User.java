package org.baeldung.config;

/**
 * author 1016823429@qq.com
 * date 2018/6/20
 **/
public class User {

    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
