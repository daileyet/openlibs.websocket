package com.openthinks.libs.websocket.support;


/**
 * ClassName: IHander <br>
 * date: Jul 26, 2017 4:22:04 PM <br>
 * 
 * @author dailey.yet@outlook.com
 * @since JDK 1.8
 */
public interface IHander<T> {
  void process(T t);
}
