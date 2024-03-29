package technicalbloghosting.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import technicalbloghosting.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public PostService() {
        System.out.println("***PostService Class***");
    }

    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> posts = new ArrayList<Post>();

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Post Body ");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }

    public ArrayList<Post> getOnePost() {
        ArrayList<Post> post5 = new ArrayList<Post>();
        Post post6 = new Post();
        post6.setTitle("Post 6");
        post6.setBody("Post Body ");
        post6.setDate(new Date());
        post5.add(post6);
        return post5;
    }
}