package com.ypc.spring.etcdclient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "t_user")
@Entity
public class UserEntity {

    @Id
    private Long id;

    private String userName;

    private String mobile;

    private int age;

    private Integer addressId;

}
