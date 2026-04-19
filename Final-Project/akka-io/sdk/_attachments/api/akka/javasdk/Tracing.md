---
description: 'declaration: package: akka.javasdk, interface: Tracing'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:46Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
title: Tracing
---

# Tracing

> **Summary:** declaration: package: akka.javasdk, interface: Tracing

## Content

Package [akka.javasdk](package-summary.html)
# Interface Tracing

---

@DoNotInherit
public interface Tracing
Factory for manually creating open telemetry spans in addition to those automatically provided by
 the runtime and SDK.

 Not for user extension. Injectable into endpoint constructors or available through component
 command contexts.

- ## Method Summary

Modifier and Type
Method
Description
`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<io.opentelemetry.api.trace.Span>`
`[parentSpan](#parentSpan())()`

If tracing is enabled, this returns the current parent span, to use for propagating trace
 parent through third party integrations.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<io.opentelemetry.api.trace.Span>`
`[startSpan](#startSpan(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)`

If tracing is enabled, create and start a new custom span with the given name, setting a parent
 for the span is done automatically so that the span is a child of the incoming request or
 component call.

- ## Method Details

	- ### startSpan
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<io.opentelemetry.api.trace.Span\> startSpan([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name)
	If tracing is enabled, create and start a new custom span with the given name, setting a parent
	 for the span is done automatically so that the span is a child of the incoming request or
	 component call.
	
	Returns:
	Optional of the span if tracing is enabled, empty option if tracing is not enabled.
	- ### parentSpan
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<io.opentelemetry.api.trace.Span\> parentSpan()
	If tracing is enabled, this returns the current parent span, to use for propagating trace
	 parent through third party integrations. This span should only be used for observing, ending it
	 or marking it as failed etc. is managed by the SDK and the runtime.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html)*