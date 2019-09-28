package io.github.ringsheep.lostelectroblog.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Post {

    String title;

    String description;

    LocalDateTime dateTime;

    List<String> mediaLinks;

    List<Tag> tags;

    List<Artist> artists;

}
