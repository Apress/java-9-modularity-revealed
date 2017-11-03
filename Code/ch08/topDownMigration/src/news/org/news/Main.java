package org.news;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.common.base.CaseFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Logger logger = LoggerFactory.getLogger(Main.class);

        BufferedReader bufferedReader = new BufferedReader(new FileReader("news.json"));

        Type listType = new TypeToken<ArrayList<News>>(){}.getType();
        List<News> yourClassList = new Gson().fromJson(bufferedReader, listType);

        for(News news : yourClassList) {
            logger.info("Id: " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, news.getId()));
            logger.info("Title: " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, news.getTitle()));
            logger.info("Category: " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, news.getCategory()));
            logger.info("Link: " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, news.getLink()));
        }
    }
}
