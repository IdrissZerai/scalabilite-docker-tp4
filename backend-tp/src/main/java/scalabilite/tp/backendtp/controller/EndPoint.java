package scalabilite.tp.backendtp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPoint {
    Logger logger = LoggerFactory.getLogger(EndPoint.class);


    @PostMapping
    public String writer(@RequestBody String log){
        logger.info(log);
        return log;
    }
}
