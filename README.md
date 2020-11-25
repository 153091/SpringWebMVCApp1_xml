#NeilAlishev Spring lessons 17

SpringWebMVCApp1_xml

Прорабатываем @Controller и @GetMapping
Методы контроллера возвращают "представление"


Java Конфигурация:

MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
( взамен web.xml) -считывается сервером Apache Tomcat, конфигурирует DispatcherServet

SpringConfig implements WebMvcConfigurer
(взамен applicationContextMVC.xml) - конфигурация Spring приложения(бины, component scan, настройка ThymeLeaf

Contr+View 
NO Model 
Tomcat


