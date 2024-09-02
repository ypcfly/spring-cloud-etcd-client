package com.ypc.spring.etcdclient.service;

import com.ypc.spring.etcdclient.entity.UserEntity;

public interface IUserService {


    UserEntity queryById(Integer id);


    String queryConfig();
}
