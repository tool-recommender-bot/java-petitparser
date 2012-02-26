package ch.renggli.petitparser;

import java.text.ParseException;

public interface ParseResult<T> {

  T get() throws ParseException;

  boolean isError();


}
