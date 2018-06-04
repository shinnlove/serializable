/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.serializable.impl;

import com.shinnlove.serializable.MySerializer;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * XStream实现XML序列化和反序列化。
 *
 * API比较方便。
 *
 * @author shinnlove.jinsheng
 * @version $Id: XStreamSerializer.java, v 0.1 2018-06-04 下午10:16 shinnlove.jinsheng Exp $$
 */
public class XStreamSerializer implements MySerializer {

    private static final XStream xStream = new XStream(new DomDriver());

    @Override
    public <T> byte[] serialize(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        String xml = new String(data);
        return (T) xStream.fromXML(xml);
    }

}