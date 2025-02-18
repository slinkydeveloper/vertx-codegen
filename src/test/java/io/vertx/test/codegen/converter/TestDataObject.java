/*
 * Copyright (c) 2011-2017 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */

package io.vertx.test.codegen.converter;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@DataObject(generateConverter = true)
public class TestDataObject {

  private String stringValue;
  private boolean booleanValue;
  private byte byteValue;
  private short shortValue;
  private int intValue;
  private long longValue;
  private float floatValue;
  private double doubleValue;
  private char charValue;
  private Boolean boxedBooleanValue;
  private Byte boxedByteValue;
  private Short boxedShortValue;
  private Integer boxedIntValue;
  private Long boxedLongValue;
  private Float boxedFloatValue;
  private Double boxedDoubleValue;
  private Character boxedCharValue;
  private AggregatedDataObject aggregatedDataObject;
  private Buffer buffer;
  private JsonObject jsonObject;
  private JsonArray jsonArray;
  private TimeUnit httpMethod;
  private ZonedDateTime dateTime;

  private List<String> stringValues;
  private List<Boolean> boxedBooleanValues;
  private List<Byte> boxedByteValues;
  private List<Short> boxedShortValues;
  private List<Integer> boxedIntValues;
  private List<Long> boxedLongValues;
  private List<Float> boxedFloatValues;
  private List<Double> boxedDoubleValues;
  private List<Character> boxedCharValues;
  private List<AggregatedDataObject> aggregatedDataObjects;
  private List<Buffer> buffers;
  private List<JsonObject> jsonObjects;
  private List<JsonArray> jsonArrays;
  private List<TimeUnit> httpMethods;
  private List<ZonedDateTime> dateTimes;
  private List<Object> objects;

  private Set<String> stringSet;
  private Set<Boolean> boxedBooleanSet;
  private Set<Byte> boxedByteSet;
  private Set<Short> boxedShortSet;
  private Set<Integer> boxedIntSet;
  private Set<Long> boxedLongSet;
  private Set<Float> boxedFloatSet;
  private Set<Double> boxedDoubleSet;
  private Set<Character> boxedCharSet;
  private Set<AggregatedDataObject> aggregatedDataObjectSet;
  private Set<Buffer> bufferSet;
  private Set<JsonObject> jsonObjectSet;
  private Set<JsonArray> jsonArraySet;
  private Set<TimeUnit> httpMethodSet;
  private Set<ZonedDateTime> dateTimeSet;
  private Set<Object> objectSet;

  private List<String> addedStringValues = new ArrayList<>();
  private List<Boolean> addedBoxedBooleanValues = new ArrayList<>();
  private List<Byte> addedBoxedByteValues = new ArrayList<>();
  private List<Short> addedBoxedShortValues = new ArrayList<>();
  private List<Integer> addedBoxedIntValues = new ArrayList<>();
  private List<Long> addedBoxedLongValues = new ArrayList<>();
  private List<Float> addedBoxedFloatValues = new ArrayList<>();
  private List<Double> addedBoxedDoubleValues = new ArrayList<>();
  private List<Character> addedBoxedCharValues = new ArrayList<>();
  private List<AggregatedDataObject> addedAggregatedDataObjects = new ArrayList<>();
  private List<Buffer> addedBuffers = new ArrayList<>();
  private List<JsonObject> addedJsonObjects = new ArrayList<>();
  private List<JsonArray> addedJsonArrays = new ArrayList<>();
  private List<TimeUnit> addedHttpMethods = new ArrayList<>();
  private List<ZonedDateTime> addedDateTimes = new ArrayList<>();
  private List<Object> addedObjects = new ArrayList<>();

  private Map<String, String> stringValueMap;
  private Map<String, Boolean> boxedBooleanValueMap;
  private Map<String, Byte> boxedByteValueMap;
  private Map<String, Short> boxedShortValueMap;
  private Map<String, Integer> boxedIntValueMap;
  private Map<String, Long> boxedLongValueMap;
  private Map<String, Float> boxedFloatValueMap;
  private Map<String, Double> boxedDoubleValueMap;
  private Map<String, Character> boxedCharValueMap;
  private Map<String, AggregatedDataObject> aggregatedDataObjectMap;
  private Map<String, Buffer> bufferMap;
  private Map<String, JsonObject> jsonObjectMap;
  private Map<String, JsonArray> jsonArrayMap;
  private Map<String, TimeUnit> httpMethodMap;
  private Map<String, ZonedDateTime> dateTimeMap;
  private Map<String, Object> objectMap;

  private Map<String, String> keyedStringValues = new HashMap<>();
  private Map<String, Boolean> keyedBoxedBooleanValues = new HashMap<>();
  private Map<String, Byte> keyedBoxedByteValues = new HashMap<>();
  private Map<String, Short> keyedBoxedShortValues = new HashMap<>();
  private Map<String, Integer> keyedBoxedIntValues = new HashMap<>();
  private Map<String, Long> keyedBoxedLongValues = new HashMap<>();
  private Map<String, Float> keyedBoxedFloatValues = new HashMap<>();
  private Map<String, Double> keyedBoxedDoubleValues = new HashMap<>();
  private Map<String, Character> keyedBoxedCharValues = new HashMap<>();
  private Map<String, AggregatedDataObject> keyedDataObjectValues = new HashMap<>();
  private Map<String, Buffer> keyedBufferValues = new HashMap<>();
  private Map<String, JsonObject> keyedJsonObjectValues = new HashMap<>();
  private Map<String, JsonArray> keyedJsonArrayValues = new HashMap<>();
  private Map<String, TimeUnit> keyedEnumValues = new HashMap<>();
  private Map<String, ZonedDateTime> keyedDateTimeValues = new HashMap<>();
  private Map<String, Object> keyedObjectValues = new HashMap<>();

  public TestDataObject() {
  }

  public TestDataObject(TestDataObject copy) {
  }

  public TestDataObject(JsonObject json) {
  }

  public String getStringValue() {
    return stringValue;
  }

  public TestDataObject setStringValue(String value) {
    this.stringValue = value;
    return this;
  }

  public boolean isBooleanValue() {
    return booleanValue;
  }

  public TestDataObject setBooleanValue(boolean value) {
    this.booleanValue = value;
    return this;
  }

  public byte getByteValue() {
    return byteValue;
  }

  public TestDataObject setByteValue(byte byteValue) {
    this.byteValue = byteValue;
    return this;
  }

  public short getShortValue() {
    return shortValue;
  }

  public TestDataObject setShortValue(short shortValue) {
    this.shortValue = shortValue;
    return this;
  }

  public int getIntValue() {
    return intValue;
  }

  public TestDataObject setIntValue(int intValue) {
    this.intValue = intValue;
    return this;
  }

  public long getLongValue() {
    return longValue;
  }

  public TestDataObject setLongValue(long longValue) {
    this.longValue = longValue;
    return this;
  }

  public float getFloatValue() {
    return floatValue;
  }

  public TestDataObject setFloatValue(float floatValue) {
    this.floatValue = floatValue;
    return this;
  }

  public double getDoubleValue() {
    return doubleValue;
  }

  public TestDataObject setDoubleValue(double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  public char getCharValue() {
    return charValue;
  }

  public TestDataObject setCharValue(char charValue) {
    this.charValue = charValue;
    return this;
  }

  public Boolean isBoxedBooleanValue() {
    return boxedBooleanValue;
  }

  public TestDataObject setBoxedBooleanValue(Boolean value) {
    this.boxedBooleanValue = value;
    return this;
  }

  public Byte getBoxedByteValue() {
    return boxedByteValue;
  }

  public TestDataObject setBoxedByteValue(Byte boxedByteValue) {
    this.boxedByteValue = boxedByteValue;
    return this;
  }

  public Short getBoxedShortValue() {
    return boxedShortValue;
  }

  public TestDataObject setBoxedShortValue(Short boxedShortValue) {
    this.boxedShortValue = boxedShortValue;
    return this;
  }

  public Integer getBoxedIntValue() {
    return boxedIntValue;
  }

  public TestDataObject setBoxedIntValue(Integer boxedIntValue) {
    this.boxedIntValue = boxedIntValue;
    return this;
  }

  public Long getBoxedLongValue() {
    return boxedLongValue;
  }

  public TestDataObject setBoxedLongValue(Long boxedLongValue) {
    this.boxedLongValue = boxedLongValue;
    return this;
  }

  public Float getBoxedFloatValue() {
    return boxedFloatValue;
  }

  public TestDataObject setBoxedFloatValue(Float boxedFloatValue) {
    this.boxedFloatValue = boxedFloatValue;
    return this;
  }

  public Double getBoxedDoubleValue() {
    return boxedDoubleValue;
  }

  public TestDataObject setBoxedDoubleValue(Double boxedDoubleValue) {
    this.boxedDoubleValue = boxedDoubleValue;
    return this;
  }

  public Character getBoxedCharValue() {
    return boxedCharValue;
  }

  public TestDataObject setBoxedCharValue(Character boxedCharValue) {
    this.boxedCharValue = boxedCharValue;
    return this;
  }

  public AggregatedDataObject getAggregatedDataObject() {
    return aggregatedDataObject;
  }

  public TestDataObject setAggregatedDataObject(AggregatedDataObject aggregatedDataObject) {
    this.aggregatedDataObject = aggregatedDataObject;
    return this;
  }

  public Buffer getBuffer() {
    return buffer;
  }

  public TestDataObject setBuffer(Buffer buffer) {
    this.buffer = buffer;
    return this;
  }

  public JsonObject getJsonObject() {
    return jsonObject;
  }

  public TestDataObject setJsonObject(JsonObject jsonObject) {
    this.jsonObject = jsonObject;
    return this;
  }

  public JsonArray getJsonArray() {
    return jsonArray;
  }

  public TestDataObject setJsonArray(JsonArray jsonArray) {
    this.jsonArray = jsonArray;
    return this;
  }

  public TimeUnit getHttpMethod() {
    return httpMethod;
  }

  public TestDataObject setHttpMethod(TimeUnit httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  public ZonedDateTime getDateTime() {
    return dateTime;
  }

  public TestDataObject setDateTime(ZonedDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  public List<String> getStringValues() {
    return stringValues;
  }

  public TestDataObject setStringValues(List<String> stringValues) {
    this.stringValues = stringValues;
    return this;
  }

  public List<Boolean> getBoxedBooleanValues() {
    return boxedBooleanValues;
  }

  public TestDataObject setBoxedBooleanValues(List<Boolean> boxedBooleanValues) {
    this.boxedBooleanValues = boxedBooleanValues;
    return this;
  }

  public List<Byte> getBoxedByteValues() {
    return boxedByteValues;
  }

  public TestDataObject setBoxedByteValues(List<Byte> boxedByteValues) {
    this.boxedByteValues = boxedByteValues;
    return this;
  }

  public List<Short> getBoxedShortValues() {
    return boxedShortValues;
  }

  public TestDataObject setBoxedShortValues(List<Short> boxedShortValues) {
    this.boxedShortValues = boxedShortValues;
    return this;
  }

  public List<Integer> getBoxedIntValues() {
    return boxedIntValues;
  }

  public TestDataObject setBoxedIntValues(List<Integer> boxedIntValues) {
    this.boxedIntValues = boxedIntValues;
    return this;
  }

  public List<Long> getBoxedLongValues() {
    return boxedLongValues;
  }

  public TestDataObject setBoxedLongValues(List<Long> boxedLongValues) {
    this.boxedLongValues = boxedLongValues;
    return this;
  }

  public List<Float> getBoxedFloatValues() {
    return boxedFloatValues;
  }

  public TestDataObject setBoxedFloatValues(List<Float> boxedFloatValues) {
    this.boxedFloatValues = boxedFloatValues;
    return this;
  }

  public List<Double> getBoxedDoubleValues() {
    return boxedDoubleValues;
  }

  public TestDataObject setBoxedDoubleValues(List<Double> boxedDoubleValues) {
    this.boxedDoubleValues = boxedDoubleValues;
    return this;
  }

  public List<Character> getBoxedCharValues() {
    return boxedCharValues;
  }

  public TestDataObject setBoxedCharValues(List<Character> boxedCharValues) {
    this.boxedCharValues = boxedCharValues;
    return this;
  }

  public List<AggregatedDataObject> getAggregatedDataObjects() {
    return aggregatedDataObjects;
  }

  public TestDataObject setAggregatedDataObjects(List<AggregatedDataObject> aggregatedDataObjects) {
    this.aggregatedDataObjects = aggregatedDataObjects;
    return this;
  }

  public List<Buffer> getBuffers() {
    return buffers;
  }

  public TestDataObject setBuffers(List<Buffer> buffers) {
    this.buffers = buffers;
    return this;
  }

  public List<JsonObject> getJsonObjects() {
    return jsonObjects;
  }

  public TestDataObject setJsonObjects(List<JsonObject> jsonObjects) {
    this.jsonObjects = jsonObjects;
    return this;
  }

  public List<JsonArray> getJsonArrays() {
    return jsonArrays;
  }

  public TestDataObject setJsonArrays(List<JsonArray> jsonArrays) {
    this.jsonArrays = jsonArrays;
    return this;
  }

  public List<TimeUnit> getHttpMethods() {
    return httpMethods;
  }

  public TestDataObject setHttpMethods(List<TimeUnit> httpMethods) {
    this.httpMethods = httpMethods;
    return this;
  }

  public List<ZonedDateTime> getDateTimes() {
    return dateTimes;
  }

  public TestDataObject setDateTimes(List<ZonedDateTime> dateTimes) {
    this.dateTimes = dateTimes;
    return this;
  }

  public List<Object> getObjects() {
    return objects;
  }

  public TestDataObject setObjects(List<Object> objects) {
    this.objects = objects;
    return this;
  }


  public Set<String> getStringSet() {
    return stringSet;
  }

  public TestDataObject setStringSet(Set<String> stringSet) {
    this.stringSet = stringSet;
    return this;
  }

  public Set<Boolean> getBoxedBooleanSet() {
    return boxedBooleanSet;
  }

  public TestDataObject setBoxedBooleanSet(Set<Boolean> boxedBooleanSet) {
    this.boxedBooleanSet = boxedBooleanSet;
    return this;
  }

  public Set<Byte> getBoxedByteSet() {
    return boxedByteSet;
  }

  public TestDataObject setBoxedByteSet(Set<Byte> boxedByteSet) {
    this.boxedByteSet = boxedByteSet;
    return this;
  }

  public Set<Short> getBoxedShortSet() {
    return boxedShortSet;
  }

  public TestDataObject setBoxedShortSet(Set<Short> boxedShortSet) {
    this.boxedShortSet = boxedShortSet;
    return this;
  }

  public Set<Integer> getBoxedIntSet() {
    return boxedIntSet;
  }

  public TestDataObject setBoxedIntSet(Set<Integer> boxedIntSet) {
    this.boxedIntSet = boxedIntSet;
    return this;
  }

  public Set<Long> getBoxedLongSet() {
    return boxedLongSet;
  }

  public TestDataObject setBoxedLongSet(Set<Long> boxedLongSet) {
    this.boxedLongSet = boxedLongSet;
    return this;
  }

  public Set<Float> getBoxedFloatSet() {
    return boxedFloatSet;
  }

  public TestDataObject setBoxedFloatSet(Set<Float> boxedFloatSet) {
    this.boxedFloatSet = boxedFloatSet;
    return this;
  }

  public Set<Double> getBoxedDoubleSet() {
    return boxedDoubleSet;
  }

  public TestDataObject setBoxedDoubleSet(Set<Double> boxedDoubleSet) {
    this.boxedDoubleSet = boxedDoubleSet;
    return this;
  }

  public Set<Character> getBoxedCharSet() {
    return boxedCharSet;
  }

  public TestDataObject setBoxedCharSet(Set<Character> boxedCharSet) {
    this.boxedCharSet = boxedCharSet;
    return this;
  }

  public Set<AggregatedDataObject> getAggregatedDataObjectSet() {
    return aggregatedDataObjectSet;
  }

  public TestDataObject setAggregatedDataObjectSet(Set<AggregatedDataObject> aggregatedDataObjectSet) {
    this.aggregatedDataObjectSet = aggregatedDataObjectSet;
    return this;
  }

  public Set<Buffer> getBufferSet() {
    return bufferSet;
  }

  public TestDataObject setBufferSet(Set<Buffer> bufferSet) {
    this.bufferSet = bufferSet;
    return this;
  }

  public Set<JsonObject> getJsonObjectSet() {
    return jsonObjectSet;
  }

  public TestDataObject setJsonObjectSet(Set<JsonObject> jsonObjectSet) {
    this.jsonObjectSet = jsonObjectSet;
    return this;
  }

  public Set<JsonArray> getJsonArraySet() {
    return jsonArraySet;
  }

  public TestDataObject setJsonArraySet(Set<JsonArray> jsonArraySet) {
    this.jsonArraySet = jsonArraySet;
    return this;
  }

  public Set<TimeUnit> getHttpMethodSet() {
    return httpMethodSet;
  }

  public TestDataObject setHttpMethodSet(Set<TimeUnit> httpMethodSet) {
    this.httpMethodSet = httpMethodSet;
    return this;
  }

  public Set<ZonedDateTime> getDateTimeSet() {
    return dateTimeSet;
  }

  public TestDataObject setDateTimeSet(Set<ZonedDateTime> dateTimeSet) {
    this.dateTimeSet = dateTimeSet;
    return this;
  }

  public Set<Object> getObjectSet() {
    return objectSet;
  }

  public TestDataObject setObjectSet(Set<Object> objectSet) {
    this.objectSet = objectSet;
    return this;
  }

  public List<String> getAddedStringValues() {
    return addedStringValues;
  }

  public TestDataObject addAddedStringValue(String addedStringValue) {
    this.addedStringValues.add(addedStringValue);
    return this;
  }

  public List<Boolean> getAddedBoxedBooleanValues() {
    return addedBoxedBooleanValues;
  }

  public TestDataObject addAddedBoxedBooleanValue(Boolean addedBoxedBooleanValue) {
    this.addedBoxedBooleanValues.add(addedBoxedBooleanValue);
    return this;
  }

  public List<Byte> getAddedBoxedByteValues() {
    return addedBoxedByteValues;
  }

  public TestDataObject addAddedBoxedByteValue(Byte addedBoxedByteValue) {
    this.addedBoxedByteValues.add(addedBoxedByteValue);
    return this;
  }

  public List<Short> getAddedBoxedShortValues() {
    return addedBoxedShortValues;
  }

  public TestDataObject addAddedBoxedShortValue(Short addedBoxedShortValue) {
    this.addedBoxedShortValues.add(addedBoxedShortValue);
    return this;
  }

  public List<Integer> getAddedBoxedIntValues() {
    return addedBoxedIntValues;
  }

  public TestDataObject addAddedBoxedIntValue(Integer addedBoxedIntValue) {
    this.addedBoxedIntValues.add(addedBoxedIntValue);
    return this;
  }

  public List<Long> getAddedBoxedLongValues() {
    return addedBoxedLongValues;
  }

  public TestDataObject addAddedBoxedLongValue(Long addedBoxedLongValue) {
    this.addedBoxedLongValues.add(addedBoxedLongValue);
    return this;
  }

  public List<Float> getAddedBoxedFloatValues() {
    return addedBoxedFloatValues;
  }

  public TestDataObject addAddedBoxedFloatValue(Float addedBoxedFloatValue) {
    this.addedBoxedFloatValues.add(addedBoxedFloatValue);
    return this;
  }

  public List<Double> getAddedBoxedDoubleValues() {
    return addedBoxedDoubleValues;
  }

  public TestDataObject addAddedBoxedDoubleValue(Double addedBoxedDoubleValue) {
    this.addedBoxedDoubleValues.add(addedBoxedDoubleValue);
    return this;
  }

  public List<Character> getAddedBoxedCharValues() {
    return addedBoxedCharValues;
  }

  public TestDataObject addAddedBoxedCharValue(Character addedBoxedCharValue) {
    this.addedBoxedCharValues.add(addedBoxedCharValue);
    return this;
  }

  public List<AggregatedDataObject> getAddedAggregatedDataObjects() {
    return addedAggregatedDataObjects;
  }

  public TestDataObject addAddedAggregatedDataObject(AggregatedDataObject addedAggregatedDataObject) {
    this.addedAggregatedDataObjects.add(addedAggregatedDataObject);
    return this;
  }

  public List<Buffer> getAddedBuffers() {
    return addedBuffers;
  }

  public TestDataObject addAddedBuffer(Buffer addedBuffer) {
    this.addedBuffers.add(addedBuffer);
    return this;
  }

  public List<JsonObject> getAddedJsonObjects() {
    return addedJsonObjects;
  }

  public TestDataObject addAddedJsonObject(JsonObject addedJsonObject) {
    this.addedJsonObjects.add(addedJsonObject);
    return this;
  }

  public List<JsonArray> getAddedJsonArrays() {
    return addedJsonArrays;
  }

  public TestDataObject addAddedJsonArray(JsonArray addedJsonArray) {
    this.addedJsonArrays.add(addedJsonArray);
    return this;
  }

  public List<TimeUnit> getAddedHttpMethods() {
    return addedHttpMethods;
  }

  public TestDataObject addAddedHttpMethod(TimeUnit addedHttpMethod) {
    this.addedHttpMethods.add(addedHttpMethod);
    return this;
  }

  public List<ZonedDateTime> getAddedDateTimes() {
    return addedDateTimes;
  }

  public TestDataObject addAddedDateTime(ZonedDateTime addedDateTime) {
    this.addedDateTimes.add(addedDateTime);
    return this;
  }

  public List<Object> getAddedObjects() {
    return addedObjects;
  }

  public TestDataObject addAddedObject(Object addedObject) {
    this.addedObjects.add(addedObject);
    return this;
  }

  public Map<String, String> getStringValueMap() {
    return stringValueMap;
  }

  public TestDataObject setStringValueMap(Map<String, String> stringValueMap) {
    this.stringValueMap = stringValueMap;
    return this;
  }

  public Map<String, Boolean> getBoxedBooleanValueMap() {
    return boxedBooleanValueMap;
  }

  public TestDataObject setBoxedBooleanValueMap(Map<String, Boolean> boxedBooleanValueMap) {
    this.boxedBooleanValueMap = boxedBooleanValueMap;
    return this;
  }

  public Map<String, Byte> getBoxedByteValueMap() {
    return boxedByteValueMap;
  }

  public TestDataObject setBoxedByteValueMap(Map<String, Byte> boxedByteValueMap) {
    this.boxedByteValueMap = boxedByteValueMap;
    return this;
  }

  public Map<String, Short> getBoxedShortValueMap() {
    return boxedShortValueMap;
  }

  public TestDataObject setBoxedShortValueMap(Map<String, Short> boxedShortValueMap) {
    this.boxedShortValueMap = boxedShortValueMap;
    return this;
  }

  public Map<String, Integer> getBoxedIntValueMap() {
    return boxedIntValueMap;
  }

  public TestDataObject setBoxedIntValueMap(Map<String, Integer> boxedIntValueMap) {
    this.boxedIntValueMap = boxedIntValueMap;
    return this;
  }

  public Map<String, Long> getBoxedLongValueMap() {
    return boxedLongValueMap;
  }

  public TestDataObject setBoxedLongValueMap(Map<String, Long> boxedLongValueMap) {
    this.boxedLongValueMap = boxedLongValueMap;
    return this;
  }

  public Map<String, Float> getBoxedFloatValueMap() {
    return boxedFloatValueMap;
  }

  public TestDataObject setBoxedFloatValueMap(Map<String, Float> boxedFloatValueMap) {
    this.boxedFloatValueMap = boxedFloatValueMap;
    return this;
  }

  public Map<String, Double> getBoxedDoubleValueMap() {
    return boxedDoubleValueMap;
  }

  public TestDataObject setBoxedDoubleValueMap(Map<String, Double> boxedDoubleValueMap) {
    this.boxedDoubleValueMap = boxedDoubleValueMap;
    return this;
  }

  public Map<String, Character> getBoxedCharValueMap() {
    return boxedCharValueMap;
  }

  public TestDataObject setBoxedCharValueMap(Map<String, Character> boxedCharValueMap) {
    this.boxedCharValueMap = boxedCharValueMap;
    return this;
  }

  public Map<String, AggregatedDataObject> getAggregatedDataObjectMap() {
    return aggregatedDataObjectMap;
  }

  public TestDataObject setAggregatedDataObjectMap(Map<String, AggregatedDataObject> aggregatedDataObjectMap) {
    this.aggregatedDataObjectMap = aggregatedDataObjectMap;
    return this;
  }

  public Map<String, Buffer> getBufferMap() {
    return bufferMap;
  }

  public TestDataObject setBufferMap(Map<String, Buffer> bufferMap) {
    this.bufferMap = bufferMap;
    return this;
  }

  public Map<String, JsonObject> getJsonObjectMap() {
    return jsonObjectMap;
  }

  public TestDataObject setJsonObjectMap(Map<String, JsonObject> jsonObjectMap) {
    this.jsonObjectMap = jsonObjectMap;
    return this;
  }

  public Map<String, JsonArray> getJsonArrayMap() {
    return jsonArrayMap;
  }

  public TestDataObject setJsonArrayMap(Map<String, JsonArray> jsonArrayMap) {
    this.jsonArrayMap = jsonArrayMap;
    return this;
  }

  public Map<String, TimeUnit> getHttpMethodMap() {
    return httpMethodMap;
  }

  public TestDataObject setHttpMethodMap(Map<String, TimeUnit> httpMethodMap) {
    this.httpMethodMap = httpMethodMap;
    return this;
  }

  public Map<String, ZonedDateTime> getDateTimeMap() {
    return dateTimeMap;
  }

  public TestDataObject setDateTimeMap(Map<String, ZonedDateTime> dateTimeMap) {
    this.dateTimeMap = dateTimeMap;
    return this;
  }

  public Map<String, Object> getObjectMap() {
    return objectMap;
  }

  public TestDataObject setObjectMap(Map<String, Object> objectMap) {
    this.objectMap = objectMap;
    return this;
  }

  public Map<String, String> getKeyedStringValues() {
    return keyedStringValues;
  }

  public TestDataObject addKeyedStringValue(String name, String value) {
    this.keyedStringValues.put(name, value);
    return this;
  }

  public Map<String, Boolean> getKeyedBoxedBooleanValues() {
    return keyedBoxedBooleanValues;
  }

  public TestDataObject addKeyedBoxedBooleanValue(String key, Boolean value) {
    keyedBoxedBooleanValues.put(key, value);
    return this;
  }

  public Map<String, Byte> getKeyedBoxedByteValues() {
    return keyedBoxedByteValues;
  }

  public TestDataObject addKeyedBoxedByteValue(String key, Byte value) {
    keyedBoxedByteValues.put(key, value);
    return this;
  }

  public Map<String, Short> getKeyedBoxedShortValues() {
    return keyedBoxedShortValues;
  }

  public TestDataObject addKeyedBoxedShortValue(String key, Short value) {
    keyedBoxedShortValues.put(key, value);
    return this;
  }

  public Map<String, Integer> getKeyedBoxedIntValues() {
    return keyedBoxedIntValues;
  }

  public TestDataObject addKeyedBoxedIntValue(String key, Integer value) {
    keyedBoxedIntValues.put(key, value);
    return this;
  }

  public Map<String, Long> getKeyedBoxedLongValues() {
    return keyedBoxedLongValues;
  }

  public TestDataObject addKeyedBoxedLongValue(String key, Long value) {
    keyedBoxedLongValues.put(key, value);
    return this;
  }

  public Map<String, Float> getKeyedBoxedFloatValues() {
    return keyedBoxedFloatValues;
  }

  public TestDataObject addKeyedBoxedFloatValue(String key, Float value) {
    keyedBoxedFloatValues.put(key, value);
    return this;
  }

  public Map<String, Double> getKeyedBoxedDoubleValues() {
    return keyedBoxedDoubleValues;
  }

  public TestDataObject addKeyedBoxedDoubleValue(String key, Double value) {
    keyedBoxedDoubleValues.put(key, value);
    return this;
  }

  public Map<String, Character> getKeyedBoxedCharValues() {
    return keyedBoxedCharValues;
  }

  public TestDataObject addKeyedBoxedCharValue(String key, Character value) {
    keyedBoxedCharValues.put(key, value);
    return this;
  }

  public Map<String, AggregatedDataObject> getKeyedDataObjectValues() {
    return keyedDataObjectValues;
  }

  public TestDataObject addKeyedDataObjectValue(String key, AggregatedDataObject value) {
    keyedDataObjectValues.put(key, value);
    return this;
  }

  public Map<String, Buffer> getKeyedBufferValues() {
    return keyedBufferValues;
  }

  public TestDataObject addKeyedBufferValue(String key, Buffer value) {
    keyedBufferValues.put(key, value);
    return this;
  }

  public Map<String, JsonObject> getKeyedJsonObjectValues() {
    return keyedJsonObjectValues;
  }

  public TestDataObject addKeyedJsonObjectValue(String key, JsonObject value) {
    keyedJsonObjectValues.put(key, value);
    return this;
  }

  public Map<String, JsonArray> getKeyedJsonArrayValues() {
    return keyedJsonArrayValues;
  }

  public TestDataObject addKeyedJsonArrayValue(String key, JsonArray value) {
    keyedJsonArrayValues.put(key, value);
    return this;
  }

  public Map<String, TimeUnit> getKeyedEnumValues() {
    return keyedEnumValues;
  }

  public TestDataObject addKeyedEnumValue(String key, TimeUnit value) {
    keyedEnumValues.put(key, value);
    return this;
  }

  public Map<String, ZonedDateTime> getKeyedDateTimeValues() {
    return keyedDateTimeValues;
  }

  public TestDataObject addKeyedDateTimeValue(String key, ZonedDateTime value) {
    this.keyedDateTimeValues.put(key, value);
    return this;
  }

  public Map<String, Object> getKeyedObjectValues() {
    return keyedObjectValues;
  }

  public TestDataObject addKeyedObjectValue(String key, Object value) {
    keyedObjectValues.put(key, value);
    return this;
  }
}
