package pers.zr.opensource.magic.dao.annotation;

import java.lang.annotation.*;

/**
 * Created by zhurong on 2016-5-6.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Key {

    String column();

    boolean autoIncrement() default false;

}
