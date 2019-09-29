package io.github.ringsheep.lostelectroblog.model.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class BlogPost {

    String id;

    String title;

    String description;

    LocalDateTime dateTime;

    List<String> mediaLinks;

    List<Tag> tags;

    List<Artist> artists;

}
