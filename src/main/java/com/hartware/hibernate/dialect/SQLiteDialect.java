package com.hartware.hibernate.dialect;

import org.hibernate.dialect.Dialect;

import java.sql.Types;

public class SQLiteDialect extends Dialect{

    public SQLiteDialect() {
        //texts

        //blobs
    }

    @Override
    public String getAddColumnString() {
        return "add";
    }
}
