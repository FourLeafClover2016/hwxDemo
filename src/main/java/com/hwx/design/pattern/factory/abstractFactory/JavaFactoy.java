package com.hwx.design.pattern.factory.abstractFactory;

import com.hwx.design.pattern.factory.abstractFactory.base.Book;
import com.hwx.design.pattern.factory.abstractFactory.base.JavaBook;
import com.hwx.design.pattern.factory.abstractFactory.base.JavaVideo;
import com.hwx.design.pattern.factory.abstractFactory.base.Video;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description:
 */
public class JavaFactoy implements CourseFactory {
    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    @Override
    public Book createBook() {
        return new JavaBook();
    }
}
