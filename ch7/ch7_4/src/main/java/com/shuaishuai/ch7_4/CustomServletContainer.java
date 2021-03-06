package com.shuaishuai.ch7_4;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by 帅帅 on 2017/11/14.
 */

@Component
public class CustomServletContainer implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9090);
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
        container.setSessionTimeout(10, TimeUnit.MINUTES);
    }
}
