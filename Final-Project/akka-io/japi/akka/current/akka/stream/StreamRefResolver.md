---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/StreamRefResolver.html
title: StreamRefResolver
---

# StreamRefResolver

## Content

Package [akka.stream](package-summary.html)
## Interface StreamRefResolver

- All Superinterfaces:
`[Extension](../actor/Extension.html "interface in akka.actor")`

---

```
public interface StreamRefResolver
extends [Extension](../actor/Extension.html "interface in akka.actor")
```

The stream ref resolver provides a way to serialize and deserialize streamrefs in user serializers.
 
 Not for user extension

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [SinkRef](SinkRef.html "interface in akka.stream")<T>` | `[resolveSinkRef](#resolveSinkRef(java.lang.String))​(java.lang.String serializedSinkRef)` | Deserialize an `SinkRef` in the [`toSerializationFormat(akka.stream.SourceRef<T>)`](#toSerializationFormat(akka.stream.SourceRef)). |
	| `<T> [SourceRef](SourceRef.html "interface in akka.stream")<T>` | `[resolveSourceRef](#resolveSourceRef(java.lang.String))​(java.lang.String serializedSourceRef)` | Deserialize an `SourceRef` in the [`toSerializationFormat(akka.stream.SourceRef<T>)`](#toSerializationFormat(akka.stream.SourceRef)). |
	| `<T> java.lang.String` | `[toSerializationFormat](#toSerializationFormat(akka.stream.SinkRef))​([SinkRef](SinkRef.html "interface in akka.stream")<T> ref)` | Generate full String representation of the `SinkRef`. |
	| `<T> java.lang.String` | `[toSerializationFormat](#toSerializationFormat(akka.stream.SourceRef))​([SourceRef](SourceRef.html "interface in akka.stream")<T> ref)` | Generate full String representation of the `SourceRef`. |

- - ### Method Detail
	
	
	
		- #### toSerializationFormat
		
		
		
		```
		<T> java.lang.String toSerializationFormat​([SourceRef](SourceRef.html "interface in akka.stream")<T> ref)
		```
		
		Generate full String representation of the `SourceRef`.
		 This representation should be used as serialized representation.
		- #### toSerializationFormat
		
		
		
		```
		<T> java.lang.String toSerializationFormat​([SinkRef](SinkRef.html "interface in akka.stream")<T> ref)
		```
		
		Generate full String representation of the `SinkRef`.
		 This representation should be used as serialized representation.
		- #### resolveSourceRef
		
		
		
		```
		<T> [SourceRef](SourceRef.html "interface in akka.stream")<T> resolveSourceRef​(java.lang.String serializedSourceRef)
		```
		
		Deserialize an `SourceRef` in the [`toSerializationFormat(akka.stream.SourceRef<T>)`](#toSerializationFormat(akka.stream.SourceRef)).
		- #### resolveSinkRef
		
		
		
		```
		<T> [SinkRef](SinkRef.html "interface in akka.stream")<T> resolveSinkRef​(java.lang.String serializedSinkRef)
		```
		
		Deserialize an `SinkRef` in the [`toSerializationFormat(akka.stream.SourceRef<T>)`](#toSerializationFormat(akka.stream.SourceRef)).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Extension.html
- https://doc.akka.io/japi/akka/current/akka/stream/SinkRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/SourceRef.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/StreamRefResolver.html](https://doc.akka.io/japi/akka/current/akka/stream/StreamRefResolver.html)*