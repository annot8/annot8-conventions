package io.annot8.standards;

/**
 * Standard names for common group types
 */
public class GroupTypes {
  private GroupTypes(){
    //No constructor - only access to public methods
  }

  public static final String GROUP_TYPE_COREFERENCE = "coreference";
  public static final String GROUP_TYPE_EVENT = "event";
  public static final String GROUP_TYPE_RELATION = "relation";

  public static final String GROUP_TYPE_RELATION_OWNS = "owns";
  public static final String GROUP_TYPE_RELATION_COMMUNICATED = "communicated";
}
