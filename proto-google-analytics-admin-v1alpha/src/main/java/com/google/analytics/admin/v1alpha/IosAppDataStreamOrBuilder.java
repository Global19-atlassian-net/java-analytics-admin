/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface IosAppDataStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.IosAppDataStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format: properties/{property_id}/iosAppDataStreams/{stream_id}
   * Example: "properties/1000/iosAppDataStreams/2000"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format: properties/{property_id}/iosAppDataStreams/{stream_id}
   * Example: "properties/1000/iosAppDataStreams/2000"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. ID of the corresponding iOS app in Firebase, if any.
   * This ID can change if the iOS app is deleted and recreated.
   * </pre>
   *
   * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The firebaseAppId.
   */
  java.lang.String getFirebaseAppId();
  /**
   *
   *
   * <pre>
   * Output only. ID of the corresponding iOS app in Firebase, if any.
   * This ID can change if the iOS app is deleted and recreated.
   * </pre>
   *
   * <code>string firebase_app_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for firebaseAppId.
   */
  com.google.protobuf.ByteString getFirebaseAppIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The Apple App Store Bundle ID for the app
   * Example: "com.example.myiosapp"
   * </pre>
   *
   * <code>
   * string bundle_id = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bundleId.
   */
  java.lang.String getBundleId();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The Apple App Store Bundle ID for the app
   * Example: "com.example.myiosapp"
   * </pre>
   *
   * <code>
   * string bundle_id = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for bundleId.
   */
  com.google.protobuf.ByteString getBundleIdBytes();

  /**
   *
   *
   * <pre>
   * Human-readable display name for the Data Stream.
   * The max allowed display name length is 255 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 6;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human-readable display name for the Data Stream.
   * The max allowed display name length is 255 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 6;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}