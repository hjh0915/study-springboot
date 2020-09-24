实现基本登录页面
===============
页面访问顺序应该是：
localhost:8080-->视图解析器-->login.html-->form表单-->post请求/user/login--->controller-->main页面

先要写好config，否则会直接访问控制器
没有经过首页的form表单，默认调用了get方法

一定要实现implements WebMvcConfigurer接口
----------------------------------------
排除拦截器
``` java
public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main").setViewName("dashboard");
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/login.html","/index.html","/user/login","/static/**","/**/*.svg","/**/*.png","/**/*.css","/**/*.js","/webjars/**");
    }
```