/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.conventions;

/** Standard names for common annotation types */
public class AnnotationTypes {

  // TODO: CF entity is perhaps wrong word here
  private static final String ENTITY_PREFIX = "entity";

  public static final String ANNOTATION_TYPE_ADDRESS = PathUtils.join(ENTITY_PREFIX, "address");
  public static final String ANNOTATION_TYPE_AREA = PathUtils.join(ENTITY_PREFIX, "area");
  public static final String ANNOTATION_TYPE_CONCEPT = PathUtils.join(ENTITY_PREFIX, "concept");
  public static final String ANNOTATION_TYPE_COORDINATE =
      PathUtils.join(ENTITY_PREFIX, "coordinate");
  public static final String ANNOTATION_TYPE_CURRENCY = PathUtils.join(ENTITY_PREFIX, "currency");
  public static final String ANNOTATION_TYPE_DISTANCE = PathUtils.join(ENTITY_PREFIX, "distance");
  public static final String ANNOTATION_TYPE_DOCUMENT = PathUtils.join(ENTITY_PREFIX, "document");
  public static final String ANNOTATION_TYPE_DOMAIN = PathUtils.join(ENTITY_PREFIX, "domain");
  public static final String ANNOTATION_TYPE_EMAIL = PathUtils.join(ENTITY_PREFIX, "email");
  public static final String ANNOTATION_TYPE_FINANCIALACCOUNT =
      PathUtils.join(ENTITY_PREFIX, "financialAccount");
  public static final String ANNOTATION_TYPE_FREQUENCY = PathUtils.join(ENTITY_PREFIX, "frequency");
  public static final String ANNOTATION_TYPE_GEOPOLITICALENTITY =
      PathUtils.join(ENTITY_PREFIX, "gpe");
  public static final String ANNOTATION_TYPE_IPADDRESS = PathUtils.join(ENTITY_PREFIX, "ipaddress");
  public static final String ANNOTATION_TYPE_HASHTAG = PathUtils.join(ENTITY_PREFIX, "hashtag");
  public static final String ANNOTATION_TYPE_LANGUAGE = PathUtils.join(ENTITY_PREFIX, "language");
  public static final String ANNOTATION_TYPE_LOCATION = PathUtils.join(ENTITY_PREFIX, "location");
  public static final String ANNOTATION_TYPE_MACADDRESS =
      PathUtils.join(ENTITY_PREFIX, "macAddress");
  public static final String ANNOTATION_TYPE_MASS = PathUtils.join(ENTITY_PREFIX, "mass");
  public static final String ANNOTATION_TYPE_MONEY = PathUtils.join(ENTITY_PREFIX, "money");
  public static final String ANNOTATION_TYPE_ORGANISATION =
      PathUtils.join(ENTITY_PREFIX, "organisation");
  public static final String ANNOTATION_TYPE_PASSPORT = PathUtils.join(ENTITY_PREFIX, "passport");
  public static final String ANNOTATION_TYPE_PERSON = PathUtils.join(ENTITY_PREFIX, "person");
  public static final String ANNOTATION_TYPE_PHONENUMBER =
      PathUtils.join(ENTITY_PREFIX, "phonenumber");
  public static final String ANNOTATION_TYPE_TIMESTAMP = PathUtils.join(ENTITY_PREFIX, "timestamp");
  public static final String ANNOTATION_TYPE_URL = PathUtils.join(ENTITY_PREFIX, "url");
  public static final String ANNOTATION_TYPE_USERNAME = PathUtils.join(ENTITY_PREFIX, "username");
  public static final String ANNOTATION_TYPE_VEHICLE = PathUtils.join(ENTITY_PREFIX, "vehicle");
  public static final String ANNOTATION_TYPE_VOLUME = PathUtils.join(ENTITY_PREFIX, "volume");
  public static final String ANNOTATION_TYPE_WEAPON = PathUtils.join(ENTITY_PREFIX, "weapon");

  private AnnotationTypes() {
    // No constructor - only access to public methods
  }
}
