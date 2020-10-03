package com.telnet.prometheus.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * spring相关工具类
 * @author Ternura
 * @since 2020/10/3 20:23
 */
@Component
public class SpringBeanUtils implements ApplicationContextAware {

    /**
     * Name of the MessageSource bean in the factory.
     * If none is supplied, message resolution is delegated to the parent.
     * @see MessageSource
     */
    public static final String MESSAGE_SOURCE_BEAN_NAME = "messageSource";

    private static volatile ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringBeanUtils.applicationContext == null) {
            SpringBeanUtils.applicationContext = applicationContext;
        }
    }

    public static Object getBeanByName(String beanName) {
        return applicationContext.getBean(beanName);
    }

    public static <T> T getBeanAutowired(Class<T> beanType) {
        return applicationContext.getBean(beanType);
    }

    public static MessageSource getMessageSource() {
        return applicationContext.getBean(MESSAGE_SOURCE_BEAN_NAME, MessageSource.class);
    }

    public static String getMessageByDefaultLocale(String messageKey) {
        if (messageKey == null) {
            throw new IllegalArgumentException("messageKey must not be null");
        }
        return applicationContext.getMessage(messageKey, null, Locale.getDefault());
    }

}
