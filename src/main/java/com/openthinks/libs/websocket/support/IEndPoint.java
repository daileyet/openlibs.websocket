/*
 * Copyright (c) 2017, Robert Bosch (Suzhou) All Rights Reserved. This software is property of
 * Robert Bosch (Suzhou). Unauthorized duplication and disclosure to third parties is prohibited.
 */
package com.openthinks.libs.websocket.support;

import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;

import com.openthinks.libs.websocket.message.IMessage;

/**
 * ClassName: IEndPoint <br>
 * date: Aug 21, 2017 1:17:36 PM <br>
 * 
 * @author dailey.yet@outlook.com
 * @since JDK 1.8
 */
public interface IEndPoint {
  public <T extends IEndPoint, E extends IEndPointSession> IEndPointSupported<T, E> getSupported();

  public void open(Session session, EndpointConfig configuration);

  public default void receive(Session session, IMessage msg) {
    getSupported().getMessageHander(session).process(msg);
  }

  public default void close(Session session, CloseReason closeReason) {
    getSupported().remove(session, closeReason);
  }

  public default void error(Session session, Throwable throwable) {
    getSupported().getErrorHander(session).process(throwable);
  }

}
