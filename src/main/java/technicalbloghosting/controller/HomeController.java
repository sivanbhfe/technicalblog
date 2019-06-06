package technicalbloghosting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import technicalbloghosting.service.PostService;
import technicalbloghosting.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    public HomeController(){
        System.out.println("***Home Controller***");
    }


    @Autowired
    private PostService postService;

    @RequestMapping(value={"/listAll","/"})
    public String getAllPosts(Model model){

    ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts",posts);
        return "index";
    }

}

