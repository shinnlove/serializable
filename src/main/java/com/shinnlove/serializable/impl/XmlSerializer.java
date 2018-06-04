/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.serializable.impl;

import com.shinnlove.serializable.MySerializer;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Java自带的XML序列化。
 *
 * @author shinnlove.jinsheng
 * @version $Id: XmlSerializer.java, v 0.1 2018-06-04 下午10:24 shinnlove.jinsheng Exp $$
 */
public class XmlSerializer implements MySerializer {

    @Override
    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XMLEncoder xe = new XMLEncoder(out, "utf-8", true, 0);
        xe.writeObject(obj);
        xe.close();
        return out.toByteArray();
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        XMLDecoder xd = new XMLDecoder(in);
        Object obj = xd.readObject();
        xd.close();
        return (T) obj;
    }

}