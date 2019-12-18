package com.helloWorld;

import org.springframework.stereotype.Service;


@Service()
public class DummyServiceImpl implements DummyService {

    @Override
    public String test() {
        return "OK";
    }
}
