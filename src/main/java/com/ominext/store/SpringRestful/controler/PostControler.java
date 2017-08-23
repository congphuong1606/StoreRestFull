package com.ominext.store.SpringRestful.controler;

import com.ominext.store.SpringRestful.entity.Acc;
import com.ominext.store.SpringRestful.entity.Cmt;
import com.ominext.store.SpringRestful.entity.Post;
import com.ominext.store.SpringRestful.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("posts")
public class PostControler {
    @Autowired
    PostRepository postRepository;
    @RequestMapping(path = "/add",method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Post addNewPost(@RequestBody Post post){
        postRepository.save(post);
        return post;
    }

    @RequestMapping(path = "/all",method = RequestMethod.GET)
    public @ResponseBody Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @RequestMapping(path = "/{postId}", method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public void deletePost(@PathVariable("postId") long postId) {
        postRepository.delete(postId);
    }

    @RequestMapping(value = "/{postStoreId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public  @ResponseBody
    List<Post> getCmts(@PathVariable("postStoreId") long postStoreId) {
        return postRepository.findAllByPostStoreId(postStoreId);
    }
}
