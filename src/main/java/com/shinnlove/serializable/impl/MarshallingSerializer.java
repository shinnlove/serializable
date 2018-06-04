/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.shinnlove.serializable.impl;

import com.shinnlove.serializable.MySerializer;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.Marshalling;
import org.jboss.marshalling.MarshallingConfiguration;

import javax.security.auth.login.Configuration;

/**
 * JBoss的Marshalling。
 *
 * @author shinnlove.jinsheng
 * @version $Id: MarshallingSerializer.java, v 0.1 2018-06-04 下午10:49 shinnlove.jinsheng Exp $$
 */
public class MarshallingSerializer implements MySerializer {

    final static MarshallingConfiguration configuration = new MarshallingConfiguration();

    final static MarshallerFactory marshallerFactory = Marshalling.getProvidedMarshallerFactory("serial");

    static {
        configuration.setVersion(5);
    }

    @Override
    public <T> byte[] serialize(T obj) {
        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return null;
    }

}