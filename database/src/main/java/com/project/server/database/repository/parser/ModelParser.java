package com.project.server.database.repository.parser;

import java.sql.ResultSet;

public interface ModelParser<T> {
    T parse(ResultSet resultSet) throws Throwable;
}
