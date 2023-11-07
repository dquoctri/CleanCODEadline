package com.dqtri.clean.handbook.classes.OrganizingForChange;

import org.hibernate.mapping.Column;

public abstract class Sql {
    public Sql(String table, Column[] columns){}

    public abstract String create();

    public abstract String insert(Object[] fields);

    public abstract String selectAll();

    public abstract String findByKey(String keyColumn, String keyValue);

    public abstract String select(Column column, String pattern);

    public abstract String select(ClosedClasses.Criteria criteria);

    public abstract String preparedInsert();

    abstract String columnList(Column[] columns);

    abstract String valuesList(Object[] fields, final Column[] columns);

    abstract String selectWithCriteria(String criteria);

    abstract String placeholderList(Column[] columns);

}
