package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static final Gson GSON = GSON_BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./student.json");

    public static void main(String[] args) {
        Student[] student = {
                Student.getStudentMethod("Datka",21,EducationType.COURSE),
                Student.getStudentMethod("Nurziinat",19,EducationType.UNIVERSITY),
                Student.getStudentMethod("Almazbek",15,EducationType.SCHOOL)
        };

        String json = GSON.toJson(student);
//        System.out.println(json);
        writeMethod(json);
        System.out.println(readFile());


    }
    private static void writeMethod(String word){
        Path wr = Paths.get(String.valueOf(WRITE_PATH));
        try{
            Files.writeString( wr,word, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch (IOException e){
            e.getMessage();
        }
    }


    public static String readFile(){
        String wordJson = "";
        try{
        FileReader reader = new FileReader(String.valueOf(WRITE_PATH));
            int a;
            while((a=reader.read())!=-1){
                wordJson+=(char)a;
            }
        }catch (IOException e){
            e.getMessage();
        }
        return wordJson;
    }

}
