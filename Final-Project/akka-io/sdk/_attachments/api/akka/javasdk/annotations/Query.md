---
description: 'declaration: package: akka.javasdk.annotations, annotation type: Query'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:12Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Query.html
title: Query
---

# Query

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: Query

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface Query

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface Query
Annotation used in the scope of a view for providing the query that will be used to explore data
 from that view.

 **Note:** the actual method implementation is never actually executed, but the return type
 must be either [`View.QueryEffect`](../view/View.QueryEffect.html "interface in akka.javasdk.view") or [`View.QueryStreamEffect`](../view/View.QueryStreamEffect.html "interface in akka.javasdk.view")

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[value](#value())`

Assigns the actual query which makes use of the enclosing entity table name as source of data
 for composition.
- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`boolean`
`[streamUpdates](#streamUpdates())`

For a query that returns a [`View.QueryStreamEffect`](../view/View.QueryStreamEffect.html "interface in akka.javasdk.view"), instead of
 completing the stream once the end of the result is reached, keep tailing the query and emit
 updates to the stream as the view is updated.

- ## Element Details

	- ### value
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value
	Assigns the actual query which makes use of the enclosing entity table name as source of data
	 for composition.
	- ### streamUpdates
	
	
	boolean streamUpdates
	For a query that returns a [`View.QueryStreamEffect`](../view/View.QueryStreamEffect.html "interface in akka.javasdk.view"), instead of
	 completing the stream once the end of the result is reached, keep tailing the query and emit
	 updates to the stream as the view is updated.
	
	Default:
	`false`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.QueryEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.QueryStreamEffect.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Query.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Query.html)*