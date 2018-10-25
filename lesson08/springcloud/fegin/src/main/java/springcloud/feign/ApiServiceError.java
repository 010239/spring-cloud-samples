package springcloud.feign;

import org.springframework.stereotype.Component;

/**
 * Created by george on 2018/10/25.
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务发生故障！";
    }
}
