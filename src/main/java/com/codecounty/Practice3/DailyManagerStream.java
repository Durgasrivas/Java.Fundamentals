package com.codecounty.Practice3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DailyManagerStream {

    public static void main(String[] args){
        String diaryFile = "my_diary.txt";
        String backupFile = "diary_backup.txt";

        String entry1="Entry 1: Today I started learning Java File I/O.\n";
        String entry2="Entry 2: It was a bit confusing, but I'm getting the hang of it.\n";
        String entry3="Entry 3: I successfully created and copied a file!\n";

        writeWithStream(diaryFile, entry1);
        writeWithStream(diaryFile, entry2);
        writeWithStream(diaryFile, entry3);

        copyFileWithStream(diaryFile, backupFile);
    }
    public static void writeWithStream(String fileName, String message){
        try(FileOutputStream fos = new FileOutputStream(fileName,true)){
            byte[] bytes = message.getBytes();
            fos.write(bytes);
            System.out.println("Append message to"+fileName);
        }catch (IOException e){
            System.out.println("Error writing: "+e.getMessage());
        }
    }
    public static void copyFileWithStream(String source, String destination){
        try(FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)){
            int data;
            while((data = fis.read())!=-1){
                fos.write(data);
            }
            System.out.println("Backup successful via byte stream!");
        }catch(IOException e){
            System.out.println("copy error: "+e.getMessage());
        }
    }
}
