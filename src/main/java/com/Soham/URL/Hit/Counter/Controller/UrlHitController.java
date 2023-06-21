package com.Soham.URL.Hit.Counter.Controller;

import com.Soham.URL.Hit.Counter.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlHitController {

    @Autowired
    private final UrlHitService urlHitService;

    public UrlHitController(UrlHitService urlHitService) {
        this.urlHitService = urlHitService;
    }

    @GetMapping("count")
    public String hitCounter(){
        int hitCount= urlHitService.incrementHitCount();
        return "HitCount:"+hitCount;
    }

    @GetMapping("count/username/{Username}")
    public String hitCounter(@PathVariable  String Username) {
        int hitCount = urlHitService.incrementHitCount();
        return "Username:"+Username+"\n"+"Hit count: " + hitCount;
    }
}
