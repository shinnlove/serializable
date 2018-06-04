/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.serializable.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 可序列化模型。
 *
 * @author shinnlove.jinsheng
 * @version $Id: Student.java, v 0.1 2018-06-04 下午9:48 shinnlove.jinsheng Exp $$
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -2602102929783338486L;

    private String            name;

    private String            email;

    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Getter method for property name.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property name.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property email.
     *
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property email.
     *
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}