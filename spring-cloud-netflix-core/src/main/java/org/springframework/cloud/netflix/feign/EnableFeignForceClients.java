package org.springframework.cloud.netflix.feign;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author shenwei
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(FeignClientsForceRegistrar.class)
public @interface EnableFeignForceClients {

    String[] value() default {};

    String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};

    Class<?>[] defaultConfiguration() default {};

    Class<?>[] clients() default {};

    /**
     * 是否强制basePackages下相关service Interface开启FeignClient注入
     * @return 是否开启强制注入feignClient
     */
    boolean force() default false;
}
