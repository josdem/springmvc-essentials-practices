package com.makingdevs.practica11;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class FileUploadController {
  
  private Log log = LogFactory.getLog(FileUploadController.class);

  @RequestMapping(value = "/fileUpload", method = RequestMethod.GET)
  public void showFileUploadForm() {
  }

  @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
  public String handleFormUpload(@RequestParam("file") MultipartFile file) throws IOException {
    log.debug(ToStringBuilder.reflectionToString(file));
    if (!file.isEmpty()) {
      log.debug("Retrieving bytes...");
      byte[] bytes = file.getBytes();
      InputStream inputStream = new ByteArrayInputStream(file.getBytes());
      File tempFile = File.createTempFile("prefix", "sufix");
      FileOutputStream fos = new FileOutputStream(tempFile);
      IOUtils.copy(inputStream, fos);
      log.debug(bytes);
      return "redirect:uploadSuccess";
    }

    return "redirect:uploadFailure";
  }
}
