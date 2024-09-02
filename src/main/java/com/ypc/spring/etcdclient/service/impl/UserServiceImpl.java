package com.ypc.spring.etcdclient.service.impl;

import com.ypc.spring.etcdclient.entity.UserEntity;
import com.ypc.spring.etcdclient.repository.UserRepository;
import com.ypc.spring.etcdclient.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {


    @Value("${dynamic.value}")
    private String configValue;

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity queryById(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public String queryConfig() {
        log.info("动态配置的值:{}", configValue);
        return configValue;
    }
}
