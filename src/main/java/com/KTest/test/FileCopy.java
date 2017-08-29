package com.KTest.test;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        File directory = new File("");// 参数为空
        String courseFile = null;
        try {
            courseFile = directory.getCanonicalPath();

        } catch (IOException e) {
            e.printStackTrace();
        }
        IOFileFilter filterSuffixMD5 = FileFilterUtils.suffixFileFilter("");
        IOFileFilter filterNotMD5 = FileFilterUtils.notFileFilter(filterSuffixMD5);
        String source = courseFile + "\\source\\";
        String aim = courseFile + "\\aim\\e\\eeee.txt";
        System.out.println(courseFile);
        System.out.println(source);
        System.out.println(aim);
        File sourceFiles = new File(source);
        File aimFiles = new File(aim);


        FileWriter fileWriter = new FileWriter(new File(aim));
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "zhangsan");
        map.put("b", "lisi");
        map.put("c", "wangwu");


        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals("b")) {
                fileWriter.write(entry.getKey() + "\t" + entry.getValue() + "\n");
                System.out.println(entry.getKey() + "\t" + entry.getValue() + "\n");
            }else {
                System.out.println(entry.getKey() + "\t" + entry.getValue() + "\n");
                continue;
            }
        }

        fileWriter.close();
    }


////        List<String> comparedList= new ArrayList<>();
////        comparedList.add("temp");
////        comparedList.add("1.txt");
////        comparedList.add("2.txt");
////        comparedList.add("im.py");
////        comparedList.add("java.class");
////        comparedList.add("java.java");
////        comparedList.add("test.md");
////        comparedList.add("ZZZ.py");
////        Collections.sort(comparedList);
//        File sourceFile = new File(source);
//        File files[] = sourceFile.listFiles();
//        List<String> fileNames= new ArrayList<>();
//        for (File file: files) {
//           fileNames.add(file.getName());
//        }
//        Collections.sort(fileNames);
//
//        System.out.println("++++++++++++++++++++++++++++++++++");
//        for (String file: fileNames) {
//            System.out.print(file+" ");
//        }
//        System.out.println("++++++++++++++++++++++++++++++++++");
//        for (String file: comparedList) {
//            System.out.print(file+" ");
//        }
//        System.out.println("************************");
//
//        boolean tag =true;
//        String message = "Output message: ";
//
//
//        for (int i=0;i<fileNames.size();i++) {
//
//            if (fileNames.get(i).equals(comparedList.get(i))){
//
//                message= message+fileNames.get(i)+" equal to "+ comparedList.get(i)+" ";
//            }else {
//                tag =false;
//                message= message+fileNames.get(i)+" not equal to "+ comparedList.get(i)+" ";
//            }
//
//        }
//        List returnList = new ArrayList<>();
//        returnList.add(tag);
//        returnList.add(message);
//        System.out.println(returnList.get(1));
//        System.out.println(returnList.get(0));


//
//        File sourceFile = new File(source);
//        File aimFile = new File(aim);
//
//        try {
//            FileUtils.cleanDirectory(aimFile);
//            FileUtils.copyDirectory(sourceFile , aimFile,filterNotMD5);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //FileUtils.cleanDirectory(sourceFile);

    }
