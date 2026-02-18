package com.codecounty.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopier {


    public static void main(String... args) {
        String sourcePath = "C:\\Users\\Namani Srivas\\Downloads\\Code\\Srivas\\6176836152393319430_121.jpg";
        String destinationPath = "C:\\Users\\Namani Srivas\\Downloads\\Code\\Srivas\\copied.bmp";
        try (
                InputStream in = new FileInputStream(sourcePath);
                OutputStream out = new FileOutputStream(destinationPath);
        ) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            System.out.println("Copied");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

