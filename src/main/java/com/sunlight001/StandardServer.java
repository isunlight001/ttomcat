package com.sunlight001;


/**
 * server
 * @author sunlight001
 * 2018年12月28日
 */
public class StandardServer {
	public void start() throws Exception {
		// 示例，启动单个service
		new StandardService().start();
	}
}
