/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.serializable.util;

import com.shinnlove.serializable.MySerializer;
import com.shinnlove.serializable.impl.DefaultJavaSerializer;
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
        byte[] s1Array = defaultJavaSerializer.serialize(s1);
        byte[] s2Array = defaultJavaSerializer.serialize(s2);
        System.out.println(s1Array);
        System.out.println(s2Array);

        // Java默认反序列化
        Student as1 = defaultJavaSerializer.deserialize(s1Array, Student.class);
        Student as2 = defaultJavaSerializer.deserialize(s2Array, Student.class);
        System.out.println(as1);
        System.out.println(as2);

    }

}