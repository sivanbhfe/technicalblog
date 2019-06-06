package technicalbloghosting.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalbloghosting.model.Post;
import technicalbloghosting.service.PostService;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("posts")
    public String getUserPosts(Model model){
        ArrayList<Post> posts = postService.getOnePost();
        model.addAttribute("posts",posts);
        return "posts";
    }

}
