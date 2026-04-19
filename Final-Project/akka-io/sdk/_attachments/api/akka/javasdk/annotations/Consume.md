---
description: 'declaration: package: akka.javasdk.annotations, annotation type: Consume,
  annotation type: FromServiceStream'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:05Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromServiceStream.html
title: Consume.FromServiceStream
---

# Consume.FromServiceStream

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: Consume, annotation type: FromServiceStream

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface Consume.FromServiceStream

Enclosing class:
`[Consume](Consume.html "annotation interface in akka.javasdk.annotations")`

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public static @interface Consume.FromServiceStream
Annotation for consuming messages from another service.

 The underlying method must be declared to receive one parameter for the received messages.
 Use one method with the common event type as parameter, or several methods with different
 parameter types corresponding to different message types.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[id](#id())`

The unique identifier of the stream in the producing service

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[service](#service())`

The deployed name of the service to consume from, can be the deployed name of another service
 in the same project or a fully qualified public hostname of a service in a different project.
- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[consumerGroup](#consumerGroup())`

In case you need to consume the same stream multiple times, each subscription should have a
 unique consumer group.

`boolean`
`[ignoreUnknown](#ignoreUnknown())`

When there is no method in the class whose input type matches the event type:

 
 if ignoreUnknown is true the event is discarded
 if false, an Exception is raised

- ## Element Details

	- ### id
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") id
	The unique identifier of the stream in the producing service
	- ### service
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") service
	The deployed name of the service to consume from, can be the deployed name of another service
	 in the same project or a fully qualified public hostname of a service in a different project.
	
	 Note: The service name is used as unique identifier for tracking progress when consuming
	 it. Changing this name will lead to starting over from the beginning of the event stream.
	
	 
	
	Can be a template referencing an environment variable "${MY\_ENV\_NAME}" set for the service
	 at deployment.
	- ### consumerGroup
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") consumerGroup
	In case you need to consume the same stream multiple times, each subscription should have a
	 unique consumer group.
	
	 Changing the consumer group will lead to starting over from the beginning of the stream.
	
	
	
	Default:
	`""`
	- ### ignoreUnknown
	
	
	boolean ignoreUnknown
	When there is no method in the class whose input type matches the event type:
	
	 
		- if ignoreUnknown is true the event is discarded
		- if false, an Exception is raised
	
	Default:
	`false`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromServiceStream.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromServiceStream.html)*