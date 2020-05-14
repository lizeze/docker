package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: docker
 * @BelongsPackage: com.example.docker
 * @Author: lizeze
 * @CreateTime: 2020-05-14 22:31
 * @Description: ${Description}
 */
@RestController
@RequestMapping("/api/")
public class TestController {
    @GetMapping("hello")
    public String docker() {
        return "docker";
    }
}
