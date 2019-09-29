package io.github.ringsheep.lostelectroblog.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class BlogPostCreateRequest {

    String title;

    String description;

    List<String> mediaLinks;

    List<String> tagNames;

    List<String> artistNames;

}
