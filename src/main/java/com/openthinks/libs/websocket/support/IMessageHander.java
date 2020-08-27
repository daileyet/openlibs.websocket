package com.openthinks.libs.websocket.support;

import com.openthinks.libs.websocket.message.IMessage;

/**
 * 
 * ClassName: IMessageHander <br>
 * date: Jul 26, 2017 4:22:15 PM <br>
 * 
 * @author dailey.yet@outlook.com
 * @since JDK 1.8
 */
public interface IMessageHander extends IHander<IMessage> {

  public void processSessionUser();
}
