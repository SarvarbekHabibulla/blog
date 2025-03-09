package com.imho.blog.mappers;

import com.imho.blog.domain.CreatePostRequest;
import com.imho.blog.domain.UpdatePostRequest;
import com.imho.blog.domain.dtos.CreatePostRequestDto;
import com.imho.blog.domain.dtos.PostDto;
import com.imho.blog.domain.dtos.UpdatePostRequestDto;
import com.imho.blog.domain.entities.Post;
import org.mapstruct.*;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author",source = "author")
    @Mapping(target = "category",source = "category")
    @Mapping(target = "tags",source = "tags")
    @Mapping(target = "status",source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);
}