package com.hwx.design.pattern.factory.abstractFactory;

import com.hwx.design.pattern.factory.abstractFactory.base.Book;
import com.hwx.design.pattern.factory.abstractFactory.base.Video;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description:
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory javaFactory = new JavaFactoy();
        Book book = javaFactory.createBook();
        Video video = javaFactory.createVideo();
        book.read();
        video.view();
    }
}
