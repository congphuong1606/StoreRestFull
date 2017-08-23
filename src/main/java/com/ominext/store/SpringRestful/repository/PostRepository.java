package com.ominext.store.SpringRestful.repository;

import com.ominext.store.SpringRestful.entity.Cmt;
import com.ominext.store.SpringRestful.entity.Post;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post,Long>{


    List<Post> findAllByPostStoreId(long postStoreId);
}
