package org.jboss.fuse.practice.bundle.jmx.impl;

import org.jboss.fuse.practice.bundle.jmx.service.MyServiceMBean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyServiceMBeanImpl implements MyServiceMBean {
	@Override
	public void hello() {
		log.info("HELLO WORLD");
	}
}
