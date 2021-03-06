package ru.kamikadze_zm.zmedia.config;

import javax.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Init extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
            Spring.class, WebMvc.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;//new Class<?>[]{WebMvc.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{
            new CharacterEncodingFilter("UTF-8", true),
            new DelegatingFilterProxy("springSecurityFilterChain")
        };
    }
}
