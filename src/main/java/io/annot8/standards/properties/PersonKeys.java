package io.annot8.standards.properties;

import io.annot8.standards.utils.PathUtils;

// TODO: PersonProperties?
public class PersonKeys {

  // TODO: Should keys (and things in general) be prefixed (so there's smaller chance for collision)?

  public static final String PREFIX = "person";

  public static final String TITLE = PathUtils.prefix(PREFIX, "title");

  public static final String FIRSTNAME = PathUtils.prefix(PREFIX, "firstname");

  public static final String INITIAL = PathUtils.prefix(PREFIX, "initial");

  public static final String SURNAME = PathUtils.prefix(PREFIX, "surname");

  protected PersonKeys() {
    // Singleton, but allow other to add additional
  }

}
