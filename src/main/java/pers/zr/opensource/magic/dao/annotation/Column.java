package pers.zr.opensource.magic.dao.annotation;

import java.lang.annotation.*;

/**
 * Created by zhurong on 2016-4-28.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {

    String value();

    boolean readOnly() default false; //not need to insert and update

}
