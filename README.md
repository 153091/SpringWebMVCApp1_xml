#NeilAlishev Spring lessons 24

24.
@Valid Валидация форм
Пропускать только приемлемые имена и цифры


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
HTML не умеет читать PATCH DELETE запросы, и чтобы мог - мы их обрабатываем в файле "Замена web.xml",
добавив туда еще два специальных метода
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


