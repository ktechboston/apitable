/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * SingleSelectProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-08T12:26:03.751525+08:00[Asia/Shanghai]")
public class SingleSelectProperty {
  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private Object color = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public SingleSelectProperty() {
  }

  public SingleSelectProperty color(Object color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  public Object getColor() {
    return color;
  }


  public void setColor(Object color) {
    this.color = color;
  }


  public SingleSelectProperty id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SingleSelectProperty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleSelectProperty singleSelectProperty = (SingleSelectProperty) o;
    return Objects.equals(this.color, singleSelectProperty.color) &&
        Objects.equals(this.id, singleSelectProperty.id) &&
        Objects.equals(this.name, singleSelectProperty.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleSelectProperty {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("color");
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("color");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SingleSelectProperty
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SingleSelectProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SingleSelectProperty is not found in the empty JSON string", SingleSelectProperty.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SingleSelectProperty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SingleSelectProperty` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SingleSelectProperty.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SingleSelectProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SingleSelectProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SingleSelectProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SingleSelectProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<SingleSelectProperty>() {
           @Override
           public void write(JsonWriter out, SingleSelectProperty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SingleSelectProperty read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SingleSelectProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SingleSelectProperty
  * @throws IOException if the JSON string is invalid with respect to SingleSelectProperty
  */
  public static SingleSelectProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SingleSelectProperty.class);
  }

 /**
  * Convert an instance of SingleSelectProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
