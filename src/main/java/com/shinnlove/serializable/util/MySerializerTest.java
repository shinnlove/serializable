/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.serializable.util;

import com.shinnlove.serializable.MySerializer;
import com.shinnlove.serializable.impl.DefaultJavaSerializer;
import com.shinnlove.serializable.impl.XStreamSerializer;
import com.shinnlove.serializable.model.Student;

/**
 * 序列化测试类。
 *
 * @author shinnlove.jinsheng
 * @version $Id: MySerializerTest.java, v 0.1 2018-06-04 下午9:47 shinnlove.jinsheng Exp $$
 */
public class MySerializerTest {

    public static void main(String[] args) {

        // 序列化模型
        Student s1 = new Student("qianqian", "957047288@qq.com");
        Student s2 = new Student("bianbian", "306086640@qq.com");

        // Java默认序列化
        MySerializer defaultJavaSerializer = new DefaultJavaSerializer();
        byte[] ds1Array = defaultJavaSerializer.serialize(s1);
        byte[] ds2Array = defaultJavaSerializer.serialize(s2);
        System.out.println(ds1Array);
        System.out.println(ds2Array);

        // Java默认反序列化
        Student das1 = defaultJavaSerializer.deserialize(ds1Array, Student.class);
        Student das2 = defaultJavaSerializer.deserialize(ds2Array, Student.class);
        System.out.println(das1);
        System.out.println(das2);

        // XML序列化
        MySerializer xstreamSerializer = new XStreamSerializer();
        byte[] xs1Array = xstreamSerializer.serialize(s1);
        byte[] xs2Array = xstreamSerializer.serialize(s2);
        System.out.println(xs1Array);
        System.out.println(xs2Array);

        // XML反序列化
        Student xas1 = defaultJavaSerializer.deserialize(ds1Array, Student.class);
        Student xas2 = defaultJavaSerializer.deserialize(ds2Array, Student.class);
        System.out.println(xas1);
        System.out.println(xas2);

    }

}