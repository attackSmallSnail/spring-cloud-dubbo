package cn.springcloud.dubbo.demo.provider.service;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String hello() {
        System.out.println("调用成功!!!!!!!!!!!!!!!!!");
        return "Hello " + System.currentTimeMillis();
    }
}
