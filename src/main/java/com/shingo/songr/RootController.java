package com.shingo.songr;

import com.shingo.songr.model.Album;
import com.shingo.songr.model.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class RootController {

    @Autowired
    AlbumRepository repo;


    @GetMapping("/")
    public String getHome(Model m) {
        m.addAttribute("username","Shingo");

        return "home";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "hello world";
    }

    @GetMapping("/capitalize/{input}")
    @ResponseBody
    public String capitalize(@PathVariable String input){
        return input.toUpperCase();
    }

    @GetMapping("/albums")
    public String getAlbum(Model m){
    m.addAttribute("username","Shingo");

        Album[] albums = new Album[]{
                new Album("The Wave","Donald",5000,160,"https://images.unsplash.com/photo-1553378950-0ba726c8ca1b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1502&q=80"),
                new Album("Essential Pop Music","Mariah",51000,240,"https://images.unsplash.com/photo-1575648517354-5b77e77ecb0c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=664&q=80"),
                new Album("Best Hits of the 90s","Jonathan",125000,400,"https://images.unsplash.com/photo-1578894934390-f83bb626aeb8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=786&q=80")
        };

        List<Album> albums1 = repo.findAll();


        m.addAttribute("albums",albums);

        return "albums";
    }

    @PostMapping("/newalbums")
    public RedirectView addAlbum(String title, String artist, Integer songCount, Integer length, String imageUrl){
        Album newAlbum = new Album (title, artist, songCount, length, imageUrl) {
        };

        repo.save(newAlbum);
        return new RedirectView("/");
    }

}
