package com.ypc.spring.etcdclient.repository;

import com.ypc.spring.etcdclient.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
