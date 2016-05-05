package pers.zr.magic.dao.runtime;

import pers.zr.magic.dao.constants.ConditionType;
import pers.zr.magic.dao.matcher.Matcher;

/**
 * Created by zhurong on 2016-4-29.
 */
public class ActionCondition {

    private ConditionType type;

    private Matcher matcher;

    public ActionCondition(ConditionType type, Matcher matcher) {
        this.type = type;
        this.matcher = matcher;
    }

    public ConditionType getType() {
        return type;
    }

    public Matcher getMatcher() {
        return matcher;
    }


}