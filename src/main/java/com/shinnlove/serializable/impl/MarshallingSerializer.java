/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.serializable.impl;

import com.shinnlove.serializable.MySerializer;
import org.jboss.marshalling.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * JBoss的Marshalling。
 *
 * @author shinnlove.jinsheng
 * @version $Id: MarshallingSerializer.java, v 0.1 2018-06-04 下午10:49 shinnlove.jinsheng Exp $$
 */
public class MarshallingSerializer implements MySerializer {

    /** Marshalling配置 */
    final static MarshallingConfiguration configuration     = new MarshallingConfiguration();

    /** Marshalling工厂 */
    final static MarshallerFactory        marshallerFactory = Marshalling
                                                                .getProvidedMarshallerFactory("serial");

    static {
        // 配置版本5
        configuration.setVersion(5);
    }

    @Override
    public <T> byte[] serialize(T obj) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            final Marshaller marshaller = marshallerFactory.createMarshaller(configuration);
            marshaller.start(Marshalling.createByteOutput(byteArrayOutputStream));
            marshaller.writeObject(obj);
            marshaller.finish();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        Object object = null;
        try {
            final Unmarshaller unmarshaller = marshallerFactory.createUnmarshaller(configuration);
            unmarshaller.start(Marshalling.createByteInput(byteArrayInputStream));
            object = unmarshaller.readObject();
            unmarshaller.finish();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return (T) object;
    }

}