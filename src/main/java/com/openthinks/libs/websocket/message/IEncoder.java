package com.openthinks.libs.websocket.message;

/**
 * 
 * ClassName: IEncoder <br>
 * Function: Encode the value of {@link IMessage#getContent()}<br>
 * date: Jul 26, 2017 1:11:22 PM <br>
 * 
 * @author dailey.yet@outlook.com
 * @since JDK 1.8
 */
@FunctionalInterface
public interface IEncoder {
  public String encode();
}
