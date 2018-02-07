package io.annot8.standards.roles;

import io.annot8.standards.utils.PathUtils;

public class EventRoles {

  public static final String PREFIX = "event";

  public static final String WHEN = PathUtils.prefix(PREFIX, "when");

  public static final String WHERE = PathUtils.prefix(PREFIX, "where");

  public static final String INVOLVED = PathUtils.prefix(PREFIX, "involved");

  protected EventRoles() {
    // Singleton, but allow other to add additional
  }

}
