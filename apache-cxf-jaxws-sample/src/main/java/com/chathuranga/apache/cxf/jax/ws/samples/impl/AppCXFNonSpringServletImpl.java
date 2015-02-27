package com.chathuranga.apache.cxf.jax.ws.samples.impl;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;
import javax.servlet.ServletConfig;

/**
 * <p>
 *    Application Specific Custom Implementation for the {@link org.apache.cxf.transport.servlet.CXFNonSpringServlet}
 * </p>
 * @author Chathuranga Tennakoon / www.chathurangaonline.com
 */
public class AppCXFNonSpringServletImpl extends CXFNonSpringServlet{

    @Override
    public void loadBus(ServletConfig servletConfig){
        super.loadBus(servletConfig);
        ServerFactoryBean factory = new ServerFactoryBean();
        factory.setBus(bus);
        factory.setServiceClass(CalculatorServiceImpl.class);
        factory.setAddress("/calcService");
        factory.create();
    }
}
