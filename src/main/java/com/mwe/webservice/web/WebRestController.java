package com.mwe.webservice.web;

import com.mwe.webservice.domain.posts.PostsRepository;
import com.mwe.webservice.dto.posts.PostsSaveRequestDto;
import com.mwe.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto)
    {
        return postsService.save(dto);

    }



}
