package com.KTest.test;

import org.apache.commons.io.FilenameUtils;

public class testBaseFileName {

    public static boolean judge(String compared) {
        String fileName = "E:\\KTest\\source\\a.md";
        String  baseName = FilenameUtils.getBaseName(fileName)+"."+FilenameUtils.getExtension(fileName);
        return (FilenameUtils.equals(baseName,compared))? true:false;
    }

    public static void main(String[] args) {
        System.out.println(testBaseFileName.judge("b.md"));
    }
}
