package com.sunlight001;


/**
 * Tomcat给servlet容器的命名
 * @author sunlight001
 * 2018年12月28日
 */
public class Catalina {
	public void start() throws Exception {
		new StandardServer().start();
	}
}
