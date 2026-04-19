---
description: 'declaration: package: akka.javasdk, interface: Metadata, interface:
  MetadataEntry'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:49Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.MetadataEntry.html
title: Metadata.MetadataEntry
---

# Metadata.MetadataEntry

> **Summary:** declaration: package: akka.javasdk, interface: Metadata, interface: MetadataEntry

## Content

Package [akka.javasdk](package-summary.html)
# Interface Metadata.MetadataEntry

Enclosing interface:
`[Metadata](Metadata.html "interface in akka.javasdk")`

---

public static interface Metadata.MetadataEntry
A metadata entry.

- ## Method Summary

Modifier and Type
Method
Description
`[ByteBuffer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/nio/ByteBuffer.html "class or interface in java.nio")`
`[getBinaryValue](#getBinaryValue())()`

Deprecated.
binary not supported, use [`getValue()`](#getValue())

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getKey](#getKey())()`

The key for the metadata entry.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getValue](#getValue())()`

The string value for the metadata entry.

`boolean`
`[isBinary](#isBinary())()`

Deprecated.
binary not supported, use [`getValue()`](#getValue())

`boolean`
`[isText](#isText())()`

Whether this entry is a text entry.

- ## Method Details

	- ### getKey
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getKey()
	The key for the metadata entry.
	
	 The key will be in the original case it was inserted or sent as.
	
	
	
	Returns:
	The key.
	- ### getValue
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getValue()
	The string value for the metadata entry.
	
	Returns:
	The string value, or null if this entry is not a string Metadata entry.
	- ### getBinaryValue
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	[ByteBuffer](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/nio/ByteBuffer.html "class or interface in java.nio") getBinaryValue()
	Deprecated.
	binary not supported, use [`getValue()`](#getValue())
	
	The binary value for the metadata entry.
	
	Returns:
	The binary value, or null if this entry is not a string Metadata entry.
	- ### isText
	
	
	boolean isText()
	Whether this entry is a text entry.
	
	Returns:
	True if this entry is a text entry.
	- ### isBinary
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	boolean isBinary()
	Deprecated.
	binary not supported, use [`getValue()`](#getValue())
	
	Whether this entry is a binary entry.
	
	Returns:
	True if this entry is a binary entry.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.MetadataEntry.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.MetadataEntry.html)*