package com.company.tasks.task034;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Task034 {
    public static void run(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        InputStream inputStream = url.openStream();
//        Files.copy(inputStream, new File("test100k.db").toPath(), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(inputStream, Paths.get("test100k.db"), StandardCopyOption.REPLACE_EXISTING);

    }
}
