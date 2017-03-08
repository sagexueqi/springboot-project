package org.sagesource.springboot.listener;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * <p>容器启动监听:监听会早于Spring Application加载</p>
 * <pre>
 *     author      XueQi
 *     date        2017/3/8
 *     email       qi.xue@ucarinc.com
 * </pre>
 */
public class ApplicationStartedEventListener implements ApplicationListener<ApplicationStartingEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
		SpringApplication app = applicationStartingEvent.getSpringApplication();
		app.setBannerMode(Banner.Mode.OFF);

		System.out.println("==========ApplicationStartingEvent========");
	}
}
