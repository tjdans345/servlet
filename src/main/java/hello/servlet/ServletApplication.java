package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan // 스프링이 자동으로 내 패키지를 포함한 하위 패키지에있는 서블릿을 다 찾아본다음에 자동으로 서블릿을 등록해준다. -> 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

//	prifix, subfix 설정
//	@Bean
//	InternalResourceViewResolver internalResourceViewResolver() {
//		return new InternalResourceViewResolver("", "");
//	}

}
