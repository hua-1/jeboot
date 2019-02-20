package com.example.jeboot.controller;

import com.example.jeboot.fastdfs.client.FastDFSClient;
import com.example.jeboot.fastdfs.client.FastDFSException;
import com.example.jeboot.fastdfs.client.FileResponseData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

@RestController
public class FileController {


    @PostMapping("/upload")
    @ResponseBody
    public FileResponseData upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        FileResponseData fileNameInfo=new FileResponseData();
        if (file.isEmpty()) {
             fileNameInfo.setMessage("上传失败，请选择文件");
            return fileNameInfo;
        }
        FastDFSClient client=new FastDFSClient();
        try {
            String upload = client.upload(file.getInputStream(), file.getOriginalFilename(), new HashMap<>());
            fileNameInfo = FastDFSClient.getFileNameInfo(upload);
            return fileNameInfo;
        } catch (FastDFSException e) {
            e.printStackTrace();
        }
        fileNameInfo.setMessage("上传失败");
        return fileNameInfo;
    }

    @GetMapping("getFilePath")
    public void getFilePath(@RequestParam("path") String path,@RequestParam("name") String name, HttpServletResponse response) throws IOException, FastDFSException {
        FastDFSClient client=new FastDFSClient();
        client.download(path,name,response.getOutputStream(),response);
    }

    public static void main(String[] args) {
        StringTokenizer stringTokenizer=new StringTokenizer("group1/M00/00/00/rBAlhlxryleASsRYAA1rIuRd3Es623.jpg","/");
         while (stringTokenizer.hasMoreElements()){
             System.out.println(stringTokenizer.nextToken());
         }
    }
}
