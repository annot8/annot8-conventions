package io.annot8.standards.roles;

import io.annot8.standards.utils.PathUtils;

/**
 * Roles for the groups with type relation.
 */
public class RelationRoles {

  public static final String PREFIX = "coreference";

  public static final String SOURCE = PathUtils.prefix(PREFIX, "source");

  public static final String TARGET = PathUtils.prefix(PREFIX, "target");

  protected RelationRoles() {
    // Singleton, but allow other to add additional
  }

}
