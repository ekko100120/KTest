###springmvc模块化

* 1.Initializer implement WebApplicationInitializer
> step 1 spring提供用来配置Servlet3.0+配置的接口,从而替代web.xml,实现接口将会自动被SpringServletContainerInitializer(用来启动Servlet3.0容器)获取到.

> step 2 新建WebApplicationContext,注册配置类,并将其和当前的servletContext关联。
> step 3 注册Spring MVC 的 DispatcherServlet 


