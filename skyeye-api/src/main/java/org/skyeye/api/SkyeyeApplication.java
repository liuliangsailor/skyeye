package org.skyeye.api;

import org.skyeye.api.constant.InterceptorConstant;
import org.skyeye.api.interceptor.HeaderInterceptor;
import org.skyeye.api.interceptor.RequestInterceptor;
import org.skyeye.api.interceptor.TraceLogInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liuliang
 * @date 2020/7/21 下午1:10
 */
@SpringBootApplication(scanBasePackages ={"org.skyeye.*"},exclude={DataSourceAutoConfiguration.class})
public class SkyeyeApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(SkyeyeApplication.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TraceLogInterceptor()).addPathPatterns("/**").excludePathPatterns(InterceptorConstant.EXCLUDE_HEADER);
        registry.addInterceptor(new HeaderInterceptor()).addPathPatterns("/**").excludePathPatterns(InterceptorConstant.EXCLUDE_HEADER);
        registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/**").excludePathPatterns(InterceptorConstant.EXCLUDE_HEADER);
    }
}
