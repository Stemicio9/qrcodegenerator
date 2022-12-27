package com.example.qrcodecreator;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QrCodeController {


    @GetMapping(value = "/qrcode/{text}", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getQrCode(@PathVariable String text) {
        try{
            return QRCodeGenerator.getQRCodeImage(text, 350, 350);
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[1];
        }

    }

    @PostMapping(value = "/qrcode", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getQrCode(@RequestBody QrCodeContainer container) {
        try{
            return QRCodeGenerator.getQRCodeImage(container.getText(), container.getWidth(), container.getHeight());
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[1];
        }

    }

}
