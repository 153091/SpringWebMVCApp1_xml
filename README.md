#NeilAlishev Spring lessons 21,22,23

21.
only READ  (from CRUD)
Вместо БД временно ArrayList.
GET /people
GET /people/id
22.
@ModelAttribute
CREATE
GET /people/new
POST /people
23.
PATCH  DELETE
GET /people/:id/edit
PATCH people/:id
DELETE people/:id


Java Конфигурация:

MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
( взамен web.xml) -считывается сервером Apache Tomcat, конфигурирует DispatcherServet

SpringConfig implements WebMvcConfigurer
(взамен applicationContextMVC.xml) - конфигурация Spring приложения(бины, component scan, настройка ThymeLeaf

Contr+View 
NO Model 
Tomcat


