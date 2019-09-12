package com.example.demo;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {



    @GetMapping (value = "/division")
    public Result diviz(@RequestParam (name = "one") Double one,@RequestParam (name = "two") Double two){

        return new Result("division",one.toString(),two.toString(),Double.toString(one/two));
    }

    @GetMapping (value = "/multiply")
    public Result divimul(@RequestParam (name = "one") Double one,@RequestParam (name = "two") Double two){

        return new Result("multiply",one.toString(),two.toString(),Double.toString(one/two));
    }

    @GetMapping (value = "/substract")
    public Result subs(@RequestParam (name = "one") Double one,@RequestParam (name = "two") Double two){

        return new Result("substract",one.toString(),two.toString(),Double.toString(one-two));
    }

    @GetMapping (value = "/add")
    public Result add(@RequestParam (name = "one") Double one,@RequestParam (name = "two") Double two){

        return new Result("Addition",one.toString(),two.toString(),Double.toString(one+two));
    }

    @GetMapping (value = "/*")
    public Error other(){
        return new Error("fail operation");
    }
}
