---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html
title: SprayJsonSupport
---

# SprayJsonSupport

## Content

Package [akka.http.scaladsl.marshallers.sprayjson](package-summary.html)
## Interface SprayJsonSupport

- All Known Implementing Classes:
`[SprayJsonSupport$](SprayJsonSupport$.html "class in akka.http.scaladsl.marshallers.sprayjson")`

---

```
public interface SprayJsonSupport
```

A trait providing automatic to and from JSON marshalling/unmarshalling using an in\-scope \*spray\-json\* protocol.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T>` | `[sprayJsonByteStringUnmarshaller](#sprayJsonByteStringUnmarshaller(spray.json.RootJsonReader))​(spray.json.RootJsonReader<T> reader)` |  |
	| `<T> [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[sprayJsonMarshaller](#sprayJsonMarshaller(spray.json.RootJsonWriter,spray.json.JsonPrinter))​(spray.json.RootJsonWriter<T> writer,  spray.json.JsonPrinter printer)` |  |
	| `<T> [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[sprayJsonMarshallerConverter](#sprayJsonMarshallerConverter(spray.json.RootJsonWriter,spray.json.JsonPrinter))​(spray.json.RootJsonWriter<T> writer,  spray.json.JsonPrinter printer)` |  |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<T,​akka.NotUsed>>` | `[sprayJsonSourceReader](#sprayJsonSourceReader(spray.json.RootJsonReader,akka.http.scaladsl.common.EntityStreamingSupport))​(spray.json.RootJsonReader<T> reader,  [EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") support)` |  |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T>` | `[sprayJsonUnmarshaller](#sprayJsonUnmarshaller(spray.json.RootJsonReader))​(spray.json.RootJsonReader<T> reader)` |  |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T>` | `[sprayJsonUnmarshallerConverter](#sprayJsonUnmarshallerConverter(spray.json.RootJsonReader))​(spray.json.RootJsonReader<T> reader)` |  |
	| `<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​spray.json.JsValue>` | `[sprayJsValueByteStringUnmarshaller](#sprayJsValueByteStringUnmarshaller())()` |  |
	| `[Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<spray.json.JsValue,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[sprayJsValueMarshaller](#sprayJsValueMarshaller(spray.json.JsonPrinter))​(spray.json.JsonPrinter printer)` |  |
	| `[Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​spray.json.JsValue>` | `[sprayJsValueUnmarshaller](#sprayJsValueUnmarshaller())()` |  |

- - ### Method Detail
	
	
	
		- #### sprayJsonUnmarshallerConverter
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> sprayJsonUnmarshallerConverter​(spray.json.RootJsonReader<T> reader)
		```
		- #### sprayJsonUnmarshaller
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​T> sprayJsonUnmarshaller​(spray.json.RootJsonReader<T> reader)
		```
		- #### sprayJsValueUnmarshaller
		
		
		
		```
		[Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​spray.json.JsValue> sprayJsValueUnmarshaller()
		```
		- #### sprayJsValueByteStringUnmarshaller
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​spray.json.JsValue> sprayJsValueByteStringUnmarshaller()
		```
		- #### sprayJsonByteStringUnmarshaller
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<akka.util.ByteString,​T> sprayJsonByteStringUnmarshaller​(spray.json.RootJsonReader<T> reader)
		```
		- #### sprayJsonSourceReader
		
		
		
		```
		<T> [Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source<T,​akka.NotUsed>> sprayJsonSourceReader​(spray.json.RootJsonReader<T> reader,
		                                                                                                           [EntityStreamingSupport](../../common/EntityStreamingSupport.html "class in akka.http.scaladsl.common") support)
		```
		- #### sprayJsonMarshallerConverter
		
		
		
		```
		<T> [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> sprayJsonMarshallerConverter​(spray.json.RootJsonWriter<T> writer,
		                                                                   spray.json.JsonPrinter printer)
		```
		- #### sprayJsonMarshaller
		
		
		
		```
		<T> [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<T,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> sprayJsonMarshaller​(spray.json.RootJsonWriter<T> writer,
		                                                          spray.json.JsonPrinter printer)
		```
		- #### sprayJsValueMarshaller
		
		
		
		```
		[Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<spray.json.JsValue,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> sprayJsValueMarshaller​(spray.json.JsonPrinter printer)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/sprayjson/SprayJsonSupport.html)*