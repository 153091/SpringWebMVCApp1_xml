package springcourse.config;

import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


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

    //HTML 5 не умеет читать PATCH DELETE запросы
    // на старте добавляем фильтр, чтобы читать HTTP запросы PATCH DELETE
    @Override
    public void onStartup(ServletContext aServletContext) throws ServletException {
        super.onStartup(aServletContext);
        registerHiddenFieldFilter(aServletContext);
    }

    private void registerHiddenFieldFilter(ServletContext aContext) {
        aContext.addFilter("hiddenHttpMethodFilter",
                new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null ,true, "/*");
    }
}
