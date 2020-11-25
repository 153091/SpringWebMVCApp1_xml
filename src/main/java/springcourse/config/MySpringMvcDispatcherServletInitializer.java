package springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * Наследуемся от абстрактного класса ,который нам заменит web.xml
 */
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // этот метод использовать не будем
    // поэтому возвращаем null
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // подставить конфигурационный класс
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class}; // теперь Spring знает, где находится конфигурация
    }

    // "/" -  все HTTP-запросы от пользователя посылаем на DispatcherServlet
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
