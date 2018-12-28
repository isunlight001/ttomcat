package com.sunlight001;

import java.net.Socket;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunlight001.http.RequestFactory;
import com.sunlight001.http.ResponseFactory;

/**
 * 适配器，将connector收到的socket请求，封装request，response两个对象，然后转给Engine去处理
 * @author sunlight001
 * 2018年12月28日
 */
public class CoyoteAdapter {
	public void service(Socket socket) throws Exception {

		// 接收请求数据
		byte[] requestBody = new byte[1024];
		socket.getInputStream().read(requestBody);
		String requestString = new String(requestBody);
		System.out.println("收到http请求，内容如下：");
		System.out.println(requestString);

		// TODO 自己从socket中提取信息，封装成request，response对象，这就是关键
		HttpServletRequest request = RequestFactory.createRequest(requestBody);
		HttpServletResponse response = ResponseFactory.createResponse(socket);

		StandardEngine.dispatch(request, response);

	}

}
