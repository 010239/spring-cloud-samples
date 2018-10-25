package springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by george on 2018/10/23.
 */
@RestController
//@EnableHystrix
public class ApiController {
    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    //@HystrixCommand(fallbackMethod = "hiError")
    public String index(){
        return apiService.index();
    }

    //@RequestMapping("/hi")
    //@HystrixCommand(fallbackMethod = "hiError")
    //public String home(@RequestParam String name) {
    //    return "hi "+name+",i am from port:" +port;
    //}

    public String hiError() {
        return "hi,"+",sorry,error!";
    }
}
