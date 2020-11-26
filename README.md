#NeilAlishev Spring lessons 17,19,20

Прорабатываем @Controller и @GetMapping
@RequestParam - получаем параметры GET-запроса FirstController.
Model model - передаем параметры из этого GET-запроса на наше представление hello.html 
Методы контроллера возвращают "представление"


Java Конфигурация:

MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
( взамен web.xml) -считывается сервером Apache Tomcat, конфигурирует DispatcherServet

SpringConfig implements WebMvcConfigurer
(взамен applicationContextMVC.xml) - конфигурация Spring приложения(бины, component scan, настройка ThymeLeaf

Contr+View 
NO Model 
Tomcat


