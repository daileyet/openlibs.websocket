package com.openthinks.libs.websocket.support;

/**
 * 
 * ClassName: IEndPointSession <br>
 * date: Jul 26, 2017 4:22:29 PM <br>
 * 
 * @author dailey.yet@outlook.com
 * @since JDK 1.8
 */
public interface IEndPointSession {

	/**
	 * return current session is connected or not
	 * @return true or false
	 */
	public boolean isOpen();

	/**
	 * get session id
	 * @return String session id
	 */
	public String getId();

	/**
	 * get session group name
	 * @return String session group
	 */
	public String getGroup();

}
