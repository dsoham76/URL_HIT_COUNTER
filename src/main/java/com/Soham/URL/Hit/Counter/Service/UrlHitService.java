package com.Soham.URL.Hit.Counter.Service;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    private int hitCount;

    public int incrementHitCount() {
        return ++hitCount;
    }
}
