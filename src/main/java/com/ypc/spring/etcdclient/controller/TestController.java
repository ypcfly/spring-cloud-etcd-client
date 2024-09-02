package com.ypc.spring.etcdclient.controller;


import com.ypc.spring.etcdclient.entity.UserEntity;
import com.ypc.spring.etcdclient.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

    private final IUserService userService;

    public TestController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * 测试查询数据接口
     * @param id
     * @return
     */
    @PostMapping("/queryById/{id}")
    public ResponseEntity<UserEntity> queryById(@PathVariable("id") Integer id) {
        UserEntity userEntity = userService.queryById(id);
        return ResponseEntity.ok(userEntity);
    }

    /**
     * 测试动态配置刷新接口
     * @return
     */
    @PostMapping("/query/dynamic")
    public ResponseEntity<String> queryConfig() {
        String value = userService.queryConfig();
        return ResponseEntity.ok(value);
    }
}
