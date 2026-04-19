---
description: 'declaration: package: akka.javasdk, interface: Sanitizer'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:53Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Sanitizer.html
title: Sanitizer
---

# Sanitizer

> **Summary:** declaration: package: akka.javasdk, interface: Sanitizer

## Content

Package [akka.javasdk](package-summary.html)
# Interface Sanitizer

---

@DoNotInherit
public interface Sanitizer
Sanitizer that applies all configured sanitization rules for the service.

 Can be injected in all components, allows for applying manual sanitization according to
 service configuration in arbitrary logic.

 

Not for user extension, implementation provided by the runtime.

- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[sanitize](#sanitize(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") string)`

- ## Method Details

	- ### sanitize
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") sanitize([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") string)

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Sanitizer.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Sanitizer.html)*