package com.dev.l1exercise;

import com.dev.l1exercise.model.Message;
import com.dev.l1exercise.model.User;
import com.dev.l1exercise.reopsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class L1Controller {

    @Autowired(required = false)
    private UserRepository userRepository;

    @GetMapping("/")
    public String index(){
        return "hello";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    /**
     * This endpoint returns the entered text value
     * @param text Text Value
     * @return Enterd Text Value will be returned
     */

    @GetMapping("getText/{text}")
    public ResponseEntity<String> getText(@PathVariable String text){
        return ResponseEntity.ok(text);
    }

    /**
     * This end point is used to get the message
     * @param model
     * @return message
     */
    @GetMapping("/message")
    public String getMessage(Model model){
        model.addAttribute("message", new Message());
        return "message";
    }

    /**
     * This endpoint is used to post the message
     * @param message
     * @return messageResult
     */
    @PostMapping("/message")
    public String messageSubmit(@ModelAttribute Message message){
        return "messageResult";
    }

    /**
     * This end point is used to get the user
     * @param model
     * @return user
     */
    @GetMapping("/user")
    public String user(Model model){
        model.addAttribute("user", new User());
        return "user";
    }

    /**
     * This endpoint is used to save user in DB
     * @param user
     * @return userResult
     */
    @PostMapping(path = "user")
    public String saveUser(@ModelAttribute User user){
        User usr = userRepository.save(user);
        System.out.println(usr + "is saved to DB successfully");
        return "userResult";
    }

}
