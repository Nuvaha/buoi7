package com.example.buoi7;

import android.os.Environment;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FileManager {
    // getExternalStorageDirectory(): Bộ nhớ ngoài
    public String path = Environment.getExternalStorageDirectory().getPath();

    public List<File> getFile(String path){
        File f = new File(path);
        return Arrays.asList(f.listFiles());
    }
}
