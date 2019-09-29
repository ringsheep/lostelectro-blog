package io.github.ringsheep.lostelectroblog.model.dto;

import io.github.ringsheep.lostelectroblog.model.domain.Artist;
import io.github.ringsheep.lostelectroblog.model.domain.Tag;
import lombok.Data;

@Data
public class BlogPostFilter {

    int perPage;

    int offset;

    Artist artist;

    Tag tag;

}
