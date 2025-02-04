package com.example.auth.domain.post.comment.controller;

import com.example.auth.domain.post.post.service.PostService;
import com.example.auth.global.Rq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/posts/{postId}/comments")
@RequiredArgsConstructor
public class ApiV1CommentController {

    private final PostService postService;
    private final Rq rq;



}


