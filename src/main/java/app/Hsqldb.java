package app;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebServlet;

/**
 * Created by jennifermcginty on 6/13/17.
 */
@Configuration
public class Hsqldb {
    @Bean
    ServletRegistrationBean h2ServletRegistration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.addUrlMappings("/DB/*");
        return registrationBean;
    }



}
