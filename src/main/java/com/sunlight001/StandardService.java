package com.sunlight001;


/**
 * 定义一组服务，将内部一个或多个连接器与引擎连接起来
 * @author sunlight001
 * 2018年12月28日
 */
public class StandardService {
	public void start() throws Exception {
		// 示例，创建一个Engine (servlet引擎)
		StandardEngine.start();

		// 示例，单个connector
		new HttpConnector().start();
	}
}
