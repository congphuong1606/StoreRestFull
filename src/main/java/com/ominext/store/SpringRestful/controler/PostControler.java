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

    //thêm một post mới
    @RequestMapping(path = "/add", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Post addNewPost(@RequestBody Post post) {
        postRepository.save(post);
        return post;
    }

    //lấy ra số cmt của một post
    @RequestMapping(path = "/coundCmt/{postId}", method = RequestMethod.GET)
    @ResponseBody
    public Integer getCountPostCmt(@PathVariable("postId") long postId) {
        Post post = postRepository.findAllByPostId(postId);
        return post.getPostComment();
    }
    //cập nhật cmt của một post
    @RequestMapping(path = "/coundCmt/{postId}", method = RequestMethod.PUT)
    @ResponseBody
    public Integer updateCountPostCmt(@PathVariable("postId") long postId) {
        Post p = postRepository.findAllByPostId(postId);
        int postCmt=p.getPostComment()+1;
        p.setPostComment(postCmt);
        postRepository.save(p);
        return postCmt;
    }
    //cap nhat like cua mot post
    @RequestMapping(path = "/coundlove/{postId}", method = RequestMethod.PUT)
    @ResponseBody
    public Integer updateCountPostLove(@PathVariable("postId") long postId) {
        Post p = postRepository.findAllByPostId(postId);
        int postLove=p.getPostLove()+1;
        p.setPostLove(postLove);
        postRepository.save(p);
        return postLove;
    }

    //lấy ra toàn bộ posts
    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    //xóa một post
    @RequestMapping(path = "/{postId}", method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public void deletePost(@PathVariable("postId") long postId) {
        postRepository.delete(postId);
    }

    //lấy ra những post của một cửa hàng
    @RequestMapping(value = "/{postStoreId}", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    List<Post> getCmts(@PathVariable("postStoreId") long postStoreId) {
        return postRepository.findAllByPostStoreId(postStoreId);
    }
}
