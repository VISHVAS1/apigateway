package com.example.gatewaytestapi.gatewaytestapi;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/getMessage/{message}")
    public String getMessage(@PathVariable String message){
        return "This is message"+message;
    }

    @PostMapping("/saveMessage/{message}")
    public void saveMessage(@PathVariable String message){

    }

    @PutMapping("/updateMessage/{str}")
    public void updateMessage(@PathVariable String str){

    }

    @DeleteMapping("/deleteMessage/{str}")
    public void deleteMessage(@PathVariable String str ){

    }


}
