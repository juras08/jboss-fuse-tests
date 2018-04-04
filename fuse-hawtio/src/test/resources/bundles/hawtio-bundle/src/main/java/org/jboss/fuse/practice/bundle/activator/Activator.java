package org.jboss.fuse.practice.bundle.activator;

import org.jboss.fuse.practice.bundle.jmx.impl.MyServiceMBeanImpl;
import org.jboss.fuse.practice.bundle.jmx.service.MyServiceMBean;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import java.util.Dictionary;
import java.util.Hashtable;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Activator implements BundleActivator {

	private ServiceRegistration registration;
//	private static BundleContext context;

//	static BundleContext getContext() {
//		return context;
//	}

	@Override
	public void start(BundleContext bundleContext) {
//		Activator.context = bundleContext;

		Dictionary<String, String> map = new Hashtable<>();
		map.put("jmx.objectname", "org.apache.karaf:type=qa,name=testbean");
		registration = bundleContext.registerService(
				MyServiceMBean.class.getName(),
				new MyServiceMBeanImpl(),
				map);
	}

	@Override
	public void stop(BundleContext bundleContext) {
//		Activator.context = null;
		registration.unregister();
		log.info("Hawtio Bundle Stopped");
	}
}
