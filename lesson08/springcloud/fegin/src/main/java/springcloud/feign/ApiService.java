package springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by george on 2018/10/22.
 */
//@FeignClient(value = "eurekaclient")
//public interface ApiService {
//
//    @RequestMapping(value = "/index",method = RequestMethod.GET)
//    String index();
//}

@FeignClient(value = "eurekaclient",fallback = ApiServiceError.class)
public interface ApiService {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
