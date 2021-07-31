package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //member 패키지 이하만 컴포넌트 스캔의 대상이 된다.
        basePackages = "hello.core.member",
        // 스캔을 안할 대상을 지정 (수동 설정 정보랑 출동 방지)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
