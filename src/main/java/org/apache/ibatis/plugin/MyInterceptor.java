package org.apache.ibatis.plugin;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;

/**
 * @description: This is a class!
 * @author: chenjian
 * @date: 2019/02/04 14:21
 */
@Intercepts({
	@Signature(type=StatementHandler.class, method = "parameterize", args = java.sql.Statement.class)
})
public class MyInterceptor implements Interceptor {
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		System.out.println(target.getClass() + "----------------------------");
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		System.out.println(properties);
	}
}
