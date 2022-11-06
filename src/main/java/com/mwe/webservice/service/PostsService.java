package com.mwe.webservice.service;

import com.mwe.webservice.domain.posts.PostsRepository;
import com.mwe.webservice.dto.PostsMainResponseDto;
import com.mwe.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().map(PostsMainResponseDto::new).collect(Collectors.toList());
    }



}
