package com.hwx.design.pattern.factory.abstractFactory;

import com.hwx.design.pattern.factory.abstractFactory.base.Book;
import com.hwx.design.pattern.factory.abstractFactory.base.PythonBook;
import com.hwx.design.pattern.factory.abstractFactory.base.PythonVideo;
import com.hwx.design.pattern.factory.abstractFactory.base.Video;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description:
 */
public class PythonFactory implements CourseFactory {
    @Override
    public Video createVideo() {
        return new PythonVideo();
    }

    @Override
    public Book createBook() {
        return new PythonBook();
    }
}
