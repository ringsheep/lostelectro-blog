package io.github.ringsheep.lostelectroblog.controller;

import io.github.ringsheep.lostelectroblog.model.domain.BlogPost;
import io.github.ringsheep.lostelectroblog.model.dto.BlogPostCreateRequest;
import io.github.ringsheep.lostelectroblog.model.dto.BlogPostFilter;
import io.github.ringsheep.lostelectroblog.model.dto.BlogPostModifactionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/blog")
@RequiredArgsConstructor
public class BlogController {

    @GetMapping(path = "/posts", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public List<BlogPost> getPosts(@RequestParam BlogPostFilter filter) {
        // TODO:

        return Collections.emptyList();
    }

    @PostMapping(path = "/posts/create", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public List<BlogPostModifactionResponse> createPosts(@RequestBody List<BlogPostCreateRequest> blogPostCreateRequests) {
        // TODO:

        return Collections.emptyList();
    }

    @PostMapping(path = "/posts/update", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public List<BlogPostModifactionResponse> updatePosts(@RequestBody List<BlogPost> blogPosts) {
        // TODO:

        return Collections.emptyList();
    }
}
