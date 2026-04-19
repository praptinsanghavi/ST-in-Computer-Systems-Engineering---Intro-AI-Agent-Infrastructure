---
description: 'declaration: package: akka.javasdk, interface: CloudEvent'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:45Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CloudEvent.html
title: CloudEvent
---

# CloudEvent

> **Summary:** declaration: package: akka.javasdk, interface: CloudEvent

## Content

Package [akka.javasdk](package-summary.html)
# Interface CloudEvent

---

public interface CloudEvent
CloudEvent representation of Metadata.

- ## Method Summary

Modifier and Type
Method
Description
`[Metadata](Metadata.html "interface in akka.javasdk")`
`[asMetadata](#asMetadata())()`

Return this CloudEvent represented as Metadata.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[clearDatacontenttype](#clearDatacontenttype())()`

Clear the data content type of this CloudEvent, if set.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[clearDataschema](#clearDataschema())()`

Clear the data schema of this CloudEvent, if set.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[clearSequence](#clearSequence())()`

Clear the sequence of this CloudEvent, if set.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[clearSequenceType](#clearSequenceType())()`

Clear the sequence type of this CloudEvent, if set.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[clearSubject](#clearSubject())()`

Clear the subject of this CloudEvent, if set.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[clearTime](#clearTime())()`

Clear the time of this CloudEvent, if set.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[datacontenttype](#datacontenttype())()`

The data content type of this CloudEvent.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net")>`
`[dataschema](#dataschema())()`

The data schema of this CloudEvent.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[id](#id())()`

The id of this CloudEvent.

`static [CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[of](#of(java.lang.String,java.net.URI,java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id,
 [URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net") source,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") type)`

Create a CloudEvent.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Long](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Long.html "class or interface in java.lang")>`
`[sequence](#sequence())()`

The sequence of this CloudEvent parsed to Long value.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[sequenceString](#sequenceString())()`

The sequence of this CloudEvent.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[sequenceType](#sequenceType())()`

The sequence type of this CloudEvent.

`[URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net")`
`[source](#source())()`

The source of this CloudEvent.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[specversion](#specversion())()`

The CloudEvent spec version.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[subject](#subject())()`

The subject of this CloudEvent.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[ZonedDateTime](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/ZonedDateTime.html "class or interface in java.time")>`
`[time](#time())()`

The time of this CloudEvent.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[type](#type())()`

The type of this CloudEvent.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withDatacontenttype](#withDatacontenttype(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") datacontenttype)`

Return a new CloudEvent with the given data content type.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withDataschema](#withDataschema(java.net.URI))([URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net") dataschema)`

Return a new CloudEvent with the given data schema.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withId](#withId(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id)`

Return a new CloudEvent with the given id.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withSequence](#withSequence(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sequence)`

Return a new CloudEvent with the given sequence.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withSequenceType](#withSequenceType(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sequenceType)`

Return a new CloudEvent with the given sequence type.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withSource](#withSource(java.net.URI))([URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net") source)`

Return a new CloudEvent with the given source.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withSubject](#withSubject(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") subject)`

Return a new CloudEvent with the given subject.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withTime](#withTime(java.time.ZonedDateTime))([ZonedDateTime](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/ZonedDateTime.html "class or interface in java.time") time)`

Return a new CloudEvent with the given time.

`[CloudEvent](CloudEvent.html "interface in akka.javasdk")`
`[withType](#withType(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") type)`

Return a new CloudEvent with the given type.

- ## Method Details

	- ### specversion
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") specversion()
	The CloudEvent spec version.
	
	Returns:
	The spec version.
	- ### id
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id()
	The id of this CloudEvent. According to the CloudEvents
	 https://github.com/cloudevents/spec/blob/v1\.0\.2/cloudevents/spec.md\#id\[specification], the ID
	 is not guaranteed to be the same for redelivery of the same event, hence we can't use it for
	 deduplication.
	
	Returns:
	The id.
	- ### withId
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withId([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id)
	Return a new CloudEvent with the given id.
	
	Parameters:
	`id` \- The id to set.
	Returns:
	A copy of this CloudEvent.
	- ### source
	
	
	[URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net") source()
	The source of this CloudEvent.
	
	Returns:
	The source.
	- ### withSource
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withSource([URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net") source)
	Return a new CloudEvent with the given source.
	
	Parameters:
	`source` \- The source to set.
	Returns:
	A copy of this CloudEvent.
	- ### type
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") type()
	The type of this CloudEvent.
	
	Returns:
	The type.
	- ### withType
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withType([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") type)
	Return a new CloudEvent with the given type.
	
	Parameters:
	`type` \- The type to set.
	Returns:
	A copy of this CloudEvent.
	- ### datacontenttype
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> datacontenttype()
	The data content type of this CloudEvent.
	
	Returns:
	The data content type, if set.
	- ### withDatacontenttype
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withDatacontenttype([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") datacontenttype)
	Return a new CloudEvent with the given data content type.
	
	Parameters:
	`datacontenttype` \- The data content type to set.
	Returns:
	A copy of this CloudEvent.
	- ### clearDatacontenttype
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") clearDatacontenttype()
	Clear the data content type of this CloudEvent, if set.
	
	Returns:
	A copy of this CloudEvent.
	- ### dataschema
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net")\> dataschema()
	The data schema of this CloudEvent.
	
	Returns:
	The data schema, if set.
	- ### withDataschema
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withDataschema([URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net") dataschema)
	Return a new CloudEvent with the given data schema.
	
	Parameters:
	`dataschema` \- The data schema to set.
	Returns:
	A copy of this CloudEvent.
	- ### clearDataschema
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") clearDataschema()
	Clear the data schema of this CloudEvent, if set.
	
	Returns:
	A copy of this CloudEvent.
	- ### subject
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> subject()
	The subject of this CloudEvent.
	
	Returns:
	The subject, if set.
	- ### withSubject
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withSubject([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") subject)
	Return a new CloudEvent with the given subject.
	
	Parameters:
	`subject` \- The subject to set.
	Returns:
	A copy of this CloudEvent.
	- ### clearSubject
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") clearSubject()
	Clear the subject of this CloudEvent, if set.
	
	Returns:
	A copy of this CloudEvent.
	- ### sequence
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Long](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Long.html "class or interface in java.lang")\> sequence()
	The sequence of this CloudEvent parsed to Long value.
	- ### sequenceString
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> sequenceString()
	The sequence of this CloudEvent.
	- ### withSequence
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withSequence([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sequence)
	Return a new CloudEvent with the given sequence.
	
	Parameters:
	`sequence` \- The sequence to set.
	Returns:
	A copy of this CloudEvent.
	- ### clearSequence
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") clearSequence()
	Clear the sequence of this CloudEvent, if set.
	
	Returns:
	A copy of this CloudEvent.
	- ### sequenceType
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> sequenceType()
	The sequence type of this CloudEvent.
	- ### withSequenceType
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withSequenceType([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sequenceType)
	Return a new CloudEvent with the given sequence type.
	
	Parameters:
	`sequenceType` \- The sequence type to set.
	Returns:
	A copy of this CloudEvent.
	- ### clearSequenceType
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") clearSequenceType()
	Clear the sequence type of this CloudEvent, if set.
	
	Returns:
	A copy of this CloudEvent.
	- ### time
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[ZonedDateTime](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/ZonedDateTime.html "class or interface in java.time")\> time()
	The time of this CloudEvent.
	
	Returns:
	The time, if set.
	- ### withTime
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") withTime([ZonedDateTime](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/ZonedDateTime.html "class or interface in java.time") time)
	Return a new CloudEvent with the given time.
	
	Parameters:
	`time` \- The time to set.
	Returns:
	A copy of this CloudEvent.
	- ### clearTime
	
	
	[CloudEvent](CloudEvent.html "interface in akka.javasdk") clearTime()
	Clear the time of this CloudEvent, if set.
	
	Returns:
	A copy of this CloudEvent.
	- ### asMetadata
	
	
	[Metadata](Metadata.html "interface in akka.javasdk") asMetadata()
	Return this CloudEvent represented as Metadata.
	
	 If this CloudEvent was created by {[`Metadata.asCloudEvent()`](Metadata.html#asCloudEvent())}, then any non CloudEvent
	 metadata that was present will still be present.
	
	
	
	Returns:
	This CloudEvent expressed as metadata.
	- ### of
	
	
	static [CloudEvent](CloudEvent.html "interface in akka.javasdk") of([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id,
	 [URI](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html "class or interface in java.net") source,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") type)
	Create a CloudEvent.
	
	Parameters:
	`id` \- The id of the CloudEvent.
	`source` \- The source of the CloudEvent.
	`type` \- The type of the CloudEvent.
	Returns:
	The newly created CloudEvent.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CloudEvent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CloudEvent.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CloudEvent.html)*