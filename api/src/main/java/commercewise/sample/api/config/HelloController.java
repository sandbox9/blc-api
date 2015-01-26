package commercewise.sample.api.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chanwook on 2015. 1. 26..
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello/{message}", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@PathVariable String message) {
        return "hello~ " + message;
    }
}
