package com.ominext.store.SpringRestful.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_post")
public class Post {
    @Id
    long postId;
    String postContent;
    String postTime;
    int postComment;
    int postLove;
    long postStoreId;
    String postStoreName;
    String postStoreAvatar;
    String postImage;

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public int getPostComment() {
        return postComment;
    }

    public void setPostComment(int postComment) {
        this.postComment = postComment;
    }

    public int getPostLove() {
        return postLove;
    }

    public void setPostLove(int postLove) {
        this.postLove = postLove;
    }

    public long getPostStoreId() {
        return postStoreId;
    }

    public void setPostStoreId(long postStoreId) {
        this.postStoreId = postStoreId;
    }

    public String getPostStoreName() {
        return postStoreName;
    }

    public void setPostStoreName(String postStoreName) {
        this.postStoreName = postStoreName;
    }

    public String getPostStoreAvatar() {
        return postStoreAvatar;
    }

    public void setPostStoreAvatar(String postStoreAvatar) {
        this.postStoreAvatar = postStoreAvatar;
    }

}
