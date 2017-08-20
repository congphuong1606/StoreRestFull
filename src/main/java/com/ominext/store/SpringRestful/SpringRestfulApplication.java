package com.ominext.store.SpringRestful;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.Account;
import model.Comment;
import model.Post;

@SpringBootApplication
public class SpringRestfulApplication {
    private static final Map<Long, Post> postMap = new HashMap<Long, Post>();
    private static final Map<Long, Comment> cmtMap = new HashMap<Long, Comment>();
    private static final Map<Long, Account> accMap = new HashMap<Long, Account>();

    public static void main(String[] args) {
        onPutPost();
        onPutCmt();
        onPutAccount();
        SpringApplication.run(SpringRestfulApplication.class, args);
    }

    //ACCOUNT
    private static void onPutAccount() {
        Account accOne = new Account(100, "store", 965100635, "cokhicongphuong", "Cơ kHí công Phượng",
                "coldboy69", "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-4.jpg");
        accMap.put(accOne.getAccId(), accOne);
    }

    public Account addAcc(Account acc) {
        accMap.put(acc.getAccId(), acc);
        return acc;

    }

    public Account updateAcc(Account acc) {
        Account accOne = acc;
        accMap.put(accOne.getAccId(), accOne);
        return accOne;
    }

    @SuppressWarnings("unlikely-arg-type")
	public void deleteAcc(long accId) {
        accMap.remove(accId);
    }

    public List<Account> getAllAcc() {
        Collection<Account> accAll = accMap.values();
        List<Account> accs = new ArrayList<Account>();
        accs.addAll(accAll);
        return accs;
    }


    //POST

    private static void onPutPost() {
        Post one = new Post(1, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
                "10:03", 10, 200, 200, "Cơ khí Minh Ái",
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg");
        Post two = new Post(2, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
                "10:03", 10, 200, 123, "Cơ khí Minh Ái",
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg");
        Post three = new Post(3, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
                "10:03", 10, 200, 200, "Cơ khí Minh Ái",
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg");
        Post four = new Post(4, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
                "10:03", 10, 200, 100, "Cơ Khí Phượng công",
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-4.jpg");
        Post five = new Post(5, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
                "10:03", 10, 200, 123, "Cơ khí Minh Ái",
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg");
        Post six = new Post(6, "chúng toi đang cạnh tranh trên thị trường rất nhiều món hàng qusy",
                "10:03", 10, 200, 100, "Cơ Khí Phuongj Công",
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-4.jpg");
        // TODO Auto-generated method stub
        postMap.put(one.getPostId(), one);
        postMap.put(two.getPostId(), two);
        postMap.put(three.getPostId(), three);
        postMap.put(four.getPostId(), four);
        postMap.put(five.getPostId(), five);
        postMap.put(six.getPostId(), six);
    }


    public Post addPost(Post post) {
        postMap.put(post.getPostId(), post);
        return post;
    }

    public Post updatePost(Post post) {
        postMap.put(post.getPostId(), post);
        return post;
    }

    @SuppressWarnings("unlikely-arg-type")
	public void deletePost(long postId) {
        postMap.remove(postId);
    }

    public List<Post> getAllPost() {
        Collection<Post> c = postMap.values();
        List<Post> listPost = new ArrayList<Post>();
        listPost.addAll(c);
        return listPost;
    }

    public List<Post> getPosts(long postStoreId) {
        Collection<Post> all = postMap.values();
        List<Post> listPost = new ArrayList<Post>();
        for (Post post : all) {
            if (post.getPostId() == postStoreId) {
                listPost.add(post);
            }
        }
        return listPost;

    }


    ///COMMENT

    private static void onPutCmt() {

        Comment cmtone = new Comment(1, 200,
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-1.jpg",
                1, "rất tốt tôi sẽ liên lạc cho cử hàng của bạn", "10:22");
        Comment cmtTwo = new Comment(2, 10,
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-3.jpg",
                2, "thật tồi tệ", "10:23");
        Comment cmtThree = new Comment(3, 10,
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-3.jpg",
                2, "không sao", "10:24");
        Comment cmtfour = new Comment(4, 100,
                "http://taihinhanhdep.xyz/wp-content/uploads/2015/11/anh-dep-cho-dien-thoai-4.jpg",
                1, "hahah", "10:25");

        cmtMap.put(cmtone.getCmtId(), cmtone);
        cmtMap.put(cmtTwo.getCmtId(), cmtTwo);
        cmtMap.put(cmtThree.getCmtId(), cmtThree);
        cmtMap.put(cmtfour.getCmtId(), cmtfour);
    }

    public Comment addCmt(Comment cmt) {
        cmtMap.put(cmt.getCmtId(), cmt);
        return cmt;
    }

    public Comment updateCmt(Comment cmt) {
        cmtMap.put(cmt.getCmtId(), cmt);
        return cmt;
    }


	@SuppressWarnings("unlikely-arg-type")
	public void deleteCmt(long cmtId) {
        cmtMap.remove(cmtId);
    }

    public List<Comment> getAllCmt() {
        Collection<Comment> cmtall = cmtMap.values();
        List<Comment> cmts = new ArrayList<Comment>();
        cmts.addAll(cmtall);
        return cmts;
    }

}
