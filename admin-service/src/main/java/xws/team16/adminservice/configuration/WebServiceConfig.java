package xws.team16.adminservice.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/messages/*");
    }

    @Bean(name = "messages")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema messageSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MessagesPort");
        wsdl11Definition.setLocationUri("/message");
        wsdl11Definition.setTargetNamespace("https://ftn.uns.ac.rs/messaging");
        wsdl11Definition.setSchema(messageSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema messageSchema() {
        return new SimpleXsdSchema(new ClassPathResource("Messaging.xsd"));
    }
}
