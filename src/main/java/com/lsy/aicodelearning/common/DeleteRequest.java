package com.lsy.aicodelearning.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;    //定义一个固定的序列化版本号，以确保类的序列化和反序列化的兼容性。
}

