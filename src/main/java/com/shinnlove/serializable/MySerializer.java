/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.serializable;

/**
 * 序列化接口。
 * 提供两个方法：
 * 1、把任意对象序列化为字节数组；
 * 2、给定类型把字节数组中对象反序列化出来。
 *
 * @author shinnlove.jinsheng
 * @version $Id: com.shinnlove.serializable.MySerializer.java, v 0.1 2018-06-03 下午2:16 shinnlove.jinsheng Exp $$
 */
public interface MySerializer {

    /**
     * 任意对象序列化成字节数组。
     *
     * @param obj
     * @param <T>
     * @return
     */
    <T> byte[] serialize(T obj);

    /**
     * 字节数组反序列化为给定类型对象。
     *
     * @param data
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T deserialize(byte[] data, Class<T> clazz);

}
