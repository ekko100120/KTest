package com.KTest.test;

import org.apache.commons.io.FileUtils;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.io.File;
import java.util.*;

public class testSet {

    public static void main(String[] args) {

       // Collections<File> fileCollections = FileUtils.listFiles()
        ArrayList<String> arrayList1 =  new ArrayList<>();
        arrayList1.add("vxWorks");
        arrayList1.add("MCU1.out");
        arrayList1.add("MCU1_CBIT.out");
        arrayList1.add("bootstrom.bin");
        System.out.println(arrayList1.toString());
        Collections.sort(arrayList1);
        System.out.println(arrayList1);

    }
}
