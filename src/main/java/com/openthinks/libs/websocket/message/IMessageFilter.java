package com.openthinks.libs.websocket.message;

import com.openthinks.libs.websocket.support.IEndPointSession;

/**
 * ClassName: IMessageFilter <br>
 * date: Jul 27, 2017 9:26:21 PM <br>
 * 
 * @author dailey.yet@outlook.com
 * @since JDK 1.8
 */
@FunctionalInterface
public interface IMessageFilter<E extends IMessage, T extends IEndPointSession> {
  /**
   * 
   * match:judge assigned message is matched to given session or not. <br>
   * 
   * <pre>
   * <code>
   * String groupName = session.getGroup();
   * 
   * String msgContent = message.getContent();
   * 
   * return isHasRelationship(groupName,msgContent);
   * </code>
   * </pre>
   * 
   * @author dailey.dai@cn.bosch.com DAD2SZH
   * @param message instance of {@link IMessage}
   * @param session instance of {@link IEndPointSession}
   * @return true or false
   * @since JDK 1.8
   */
  public boolean match(E message, T session);
}
