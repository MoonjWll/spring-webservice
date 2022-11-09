package com.mwe.webservice.web;

import com.mwe.webservice.domain.posts.PostsRepository;
import com.mwe.webservice.dto.posts.PostsSaveRequestDto;
import com.mwe.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;
//    private Environment env;

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto)
    {
        return postsService.save(dto);

    }

//    @GetMapping("/profile")
//    public String getProfile () {
//        return Arrays.stream(env.getActiveProfiles())
//                .findFirst()
//                .orElse("");
//    }



}
