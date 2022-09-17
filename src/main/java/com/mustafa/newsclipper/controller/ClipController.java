package com.mustafa.newsclipper.controller;

import com.mustafa.newsclipper.service.ClipService;
import com.mustafa.newsclipper.utils.MyErrorResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")

public class ClipController {
    private ClipService clipService;

    @Autowired
    public ClipController(ClipService clipService) {
        this.clipService = clipService;
    }

    @PostMapping("clip")
    @ApiOperation("ssTime ve toTime parametrelerini hh:mm:ss formatında giriniz")
    public MyErrorResponse<Object> clipVideo(@RequestParam String fileName, @RequestParam String ssTime, @RequestParam String toTime) throws IOException, InterruptedException {

        MyErrorResponse<Object> response = new MyErrorResponse<>();
        response.setStatus(clipService.clipVideo(fileName, ssTime, toTime));
        response.setMessage(clipService.getInfo());
        return response;
    }

}
