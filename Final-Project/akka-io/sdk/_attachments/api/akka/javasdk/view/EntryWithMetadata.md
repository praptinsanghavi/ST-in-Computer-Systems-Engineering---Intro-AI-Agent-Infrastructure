---
description: 'declaration: package: akka.javasdk.view, record: EntryWithMetadata'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:49Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/EntryWithMetadata.html
title: EntryWithMetadata
---

# EntryWithMetadata

> **Summary:** declaration: package: akka.javasdk.view, record: EntryWithMetadata

## Content

Package [akka.javasdk.view](package-summary.html)
# Record Class EntryWithMetadata\<T\>

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")
akka.javasdk.view.EntryWithMetadata\<T\>

Type Parameters:
`T` \- The type of the view entry
Record Components:
`entry` \- The actual entry from the view
`metadata` \- Additional metadata for the entry

---

public record EntryWithMetadata\<T\>([T](EntryWithMetadata.html "type parameter in EntryWithMetadata") entry, [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
extends [Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")

- ## Constructor Summary

Constructors

Constructor
Description
`[EntryWithMetadata](#%3Cinit%3E(T,akka.javasdk.Metadata))([T](EntryWithMetadata.html "type parameter in EntryWithMetadata") entry,
 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Creates an instance of a `EntryWithMetadata` record class.
- ## Method Summary

Modifier and Type
Method
Description
`[T](EntryWithMetadata.html "type parameter in EntryWithMetadata")`
`[entry](#entry())()`

Returns the value of the [`entry`](#param-entry) record component.

`final boolean`
`[equals](#equals(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)`

Indicates whether some other object is "equal to" this one.

`final int`
`[hashCode](#hashCode())()`

Returns a hash code value for this object.

`[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")`
`[lastUpdated](#lastUpdated())()`
 
`[Metadata](../Metadata.html "interface in akka.javasdk")`
`[metadata](#metadata())()`

Returns the value of the [`metadata`](#param-metadata) record component.

`final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[toString](#toString())()`

Returns a string representation of this record class.

`<O> [EntryWithMetadata](EntryWithMetadata.html "class in akka.javasdk.view")<O>`
`[withEntry](#withEntry(O))(O newEntry)`

Create a new view entry with the same metadata.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### EntryWithMetadata
	
	
	public EntryWithMetadata([T](EntryWithMetadata.html "type parameter in EntryWithMetadata") entry,
	 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Creates an instance of a `EntryWithMetadata` record class.
	
	Parameters:
	`entry` \- the value for the [`entry`](#param-entry) record component
	`metadata` \- the value for the [`metadata`](#param-metadata) record component
- ## Method Details

	- ### lastUpdated
	
	
	public [Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time") lastUpdated()
	
	Returns:
	A timestamp when the view entry was last updated
	- ### withEntry
	
	
	public \<O\> [EntryWithMetadata](EntryWithMetadata.html "class in akka.javasdk.view")\<O\> withEntry(O newEntry)
	Create a new view entry with the same metadata. Useful for returning something else than the
	 exact entry returned from the view, through {{Source\#map}}, but still be able to let SSE
	 clients to resume from the last seen event.
	- ### toString
	
	
	public final [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toString()
	Returns a string representation of this record class. The representation contains the name of the class, followed by the name and value of each of the record components.
	
	Specified by:
	`[toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#toString() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a string representation of this object
	- ### hashCode
	
	
	public final int hashCode()
	Returns a hash code value for this object. The value is derived from the hash code of each of the record components.
	
	Specified by:
	`[hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#hashCode() "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Returns:
	a hash code value for this object
	- ### equals
	
	
	public final boolean equals([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") o)
	Indicates whether some other object is "equal to" this one. The objects are equal if the other object is of the same class and if all the record components are equal. All components in this record class are compared with [`Objects::equals(Object,Object)`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html#equals(java.lang.Object,java.lang.Object) "class or interface in java.util").
	
	Specified by:
	`[equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html#equals(java.lang.Object) "class or interface in java.lang")` in class `[Record](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html "class or interface in java.lang")`
	Parameters:
	`o` \- the object with which to compare
	Returns:
	`true` if this object is the same as the `o` argument; `false` otherwise.
	- ### entry
	
	
	public [T](EntryWithMetadata.html "type parameter in EntryWithMetadata") entry()
	Returns the value of the [`entry`](#param-entry) record component.
	
	Returns:
	the value of the [`entry`](#param-entry) record component
	- ### metadata
	
	
	public [Metadata](../Metadata.html "interface in akka.javasdk") metadata()
	Returns the value of the [`metadata`](#param-metadata) record component.
	
	Returns:
	the value of the [`metadata`](#param-metadata) record component

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/EntryWithMetadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/EntryWithMetadata.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/EntryWithMetadata.html)*