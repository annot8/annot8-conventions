/* Annot8 (annot8.io) - Licensed under Apache-2.0. */
package io.annot8.conventions;

/** Standard names for common annotation types */
public class AnnotationTypes {

  // TODO: CF entity is perhaps wrong word here
  private static final String ENTITY_PREFIX = "entity" + PathUtils.SEPARATOR;

  public static final String ANNOTATION_TYPE_ADDRESS = ENTITY_PREFIX + "address";
  public static final String ANNOTATION_TYPE_AREA = ENTITY_PREFIX + "area";
  public static final String ANNOTATION_TYPE_CONCEPT = ENTITY_PREFIX + "concept";
  public static final String ANNOTATION_TYPE_COORDINATE = ENTITY_PREFIX + "coordinate";
  public static final String ANNOTATION_TYPE_CURRENCY = ENTITY_PREFIX + "currency";
  public static final String ANNOTATION_TYPE_DISTANCE = ENTITY_PREFIX + "distance";
  public static final String ANNOTATION_TYPE_DOCUMENT = ENTITY_PREFIX + "document";
  public static final String ANNOTATION_TYPE_DOMAIN = ENTITY_PREFIX + "domain";
  public static final String ANNOTATION_TYPE_EMAIL = ENTITY_PREFIX + "email";
  public static final String ANNOTATION_TYPE_FINANCIALACCOUNT = ENTITY_PREFIX + "financialAccount";
  public static final String ANNOTATION_TYPE_FREQUENCY = ENTITY_PREFIX + "frequency";
  public static final String ANNOTATION_TYPE_GEOPOLITICALENTITY = ENTITY_PREFIX + "gpe";
  public static final String ANNOTATION_TYPE_IPADDRESS = ENTITY_PREFIX + "ipaddress";
  public static final String ANNOTATION_TYPE_HASHTAG = ENTITY_PREFIX + "hashtag";
  public static final String ANNOTATION_TYPE_LANGUAGE = ENTITY_PREFIX + "language";
  public static final String ANNOTATION_TYPE_LOCATION = ENTITY_PREFIX + "location";
  public static final String ANNOTATION_TYPE_MACADDRESS = ENTITY_PREFIX + "macAddress";
  public static final String ANNOTATION_TYPE_MASS = ENTITY_PREFIX + "mass";
  public static final String ANNOTATION_TYPE_MONEY = ENTITY_PREFIX + "money";
  public static final String ANNOTATION_TYPE_ORGANISATION = ENTITY_PREFIX + "organisation";
  public static final String ANNOTATION_TYPE_PASSPORT = ENTITY_PREFIX + "passport";
  public static final String ANNOTATION_TYPE_PERSON = ENTITY_PREFIX + "person";
  public static final String ANNOTATION_TYPE_PHONENUMBER = ENTITY_PREFIX + "phonenumber";
  public static final String ANNOTATION_TYPE_TIMESTAMP = ENTITY_PREFIX + "timestamp";
  public static final String ANNOTATION_TYPE_URL = ENTITY_PREFIX + "url";
  public static final String ANNOTATION_TYPE_USERNAME = ENTITY_PREFIX + "username";
  public static final String ANNOTATION_TYPE_VEHICLE = ENTITY_PREFIX + "vehicle";
  public static final String ANNOTATION_TYPE_VOLUME = ENTITY_PREFIX + "volume";
  public static final String ANNOTATION_TYPE_WEAPON = ENTITY_PREFIX + "weapon";

  private AnnotationTypes() {
    // No constructor - only access to public methods
  }
}
