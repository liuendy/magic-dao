package pers.zr.opensource.magic.dao;

import pers.zr.opensource.magic.dao.matcher.Matcher;
import pers.zr.opensource.magic.dao.order.Order;
import pers.zr.opensource.magic.dao.page.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * MagicDao interface
 *
 * Created by zhurong on 2016-4-29.
 */
public interface MagicDao<KEY extends Serializable, ENTITY extends Serializable> {

    public ENTITY get(KEY key);

    public void insert(ENTITY entity);

    public Long insertForId(ENTITY entity);

    public void update(ENTITY entity);

    public void delete(KEY key);

    public List<ENTITY> query(Matcher...conditions);

    public List<ENTITY> query(List<Order> orders, Matcher...conditions);

    public List<ENTITY> query(Page page, Matcher...conditions);

    public List<ENTITY> query(Page page, List<Order> orders, Matcher...conditions);

    public Long getCount(Matcher...conditions);

    public void delete(Matcher...conditions);

    public void update(Map<String, Object> valueMap, Matcher...conditions);


}
