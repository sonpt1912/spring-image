package com.example.spring_image.controller;

import com.example.spring_image.service.CloudinaryImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/cloudiary")
public class ClodiaryImageUploadController {

    @Autowired
    private CloudinaryImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<Map> uploadImage(@RequestParam("image") MultipartFile file) {
        Map data = imageService.upload(file);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
