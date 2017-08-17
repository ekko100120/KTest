package com.KTest.domain;

public class DemoObj {

    private Long id;
    private String name;

    //jackson 对 对象和json 作 转换时一定需要此空构造函数
    public DemoObj() {
        super();
    }

    public DemoObj(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
