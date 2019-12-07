package com.hwx.design.pattern.factory.abstractFactory;

import com.hwx.design.pattern.factory.abstractFactory.base.Book;
import com.hwx.design.pattern.factory.abstractFactory.base.Video;

/**
 * @author: hwx
 * @data: 2019/12/7
 * @description:
 */
public interface CourseFactory {
    Video createVideo();

    Book createBook();
}
