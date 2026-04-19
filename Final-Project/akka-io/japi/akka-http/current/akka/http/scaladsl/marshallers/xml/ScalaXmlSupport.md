---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html
title: ScalaXmlSupport
---

# ScalaXmlSupport

## Content

Package [akka.http.scaladsl.marshallers.xml](package-summary.html)
## Interface ScalaXmlSupport

- All Known Implementing Classes:
`[ScalaXmlSupport$](ScalaXmlSupport$.html "class in akka.http.scaladsl.marshallers.xml")`

---

```
public interface ScalaXmlSupport
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `javax.xml.parsers.SAXParser` | `[createSAXParser](#createSAXParser())()` | Provides a SAXParser for the NodeSeqUnmarshaller to use. |
	| `[Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.xml.NodeSeq,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[defaultNodeSeqMarshaller](#defaultNodeSeqMarshaller())()` |  |
	| `[Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​scala.xml.NodeSeq>` | `[defaultNodeSeqUnmarshaller](#defaultNodeSeqUnmarshaller())()` |  |
	| `[Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.xml.NodeSeq,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[nodeSeqMarshaller](#nodeSeqMarshaller(akka.http.scaladsl.model.MediaType.NonBinary))​([MediaType.NonBinary](../../model/MediaType.NonBinary.html "class in akka.http.scaladsl.model") mediaType)` |  |
	| `[Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​scala.xml.NodeSeq>` | `[nodeSeqUnmarshaller](#nodeSeqUnmarshaller(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[ContentTypeRange](../../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> ranges)` |  |

- - ### Method Detail
	
	
	
		- #### defaultNodeSeqMarshaller
		
		
		
		```
		[Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.xml.NodeSeq,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> defaultNodeSeqMarshaller()
		```
		- #### nodeSeqMarshaller
		
		
		
		```
		[Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<scala.xml.NodeSeq,​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> nodeSeqMarshaller​([MediaType.NonBinary](../../model/MediaType.NonBinary.html "class in akka.http.scaladsl.model") mediaType)
		```
		- #### defaultNodeSeqUnmarshaller
		
		
		
		```
		[Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​scala.xml.NodeSeq> defaultNodeSeqUnmarshaller()
		```
		- #### nodeSeqUnmarshaller
		
		
		
		```
		[Unmarshaller](../../unmarshalling/Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")<[HttpEntity](../../model/HttpEntity.html "interface in akka.http.scaladsl.model"),​scala.xml.NodeSeq> nodeSeqUnmarshaller​(scala.collection.immutable.Seq<[ContentTypeRange](../../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> ranges)
		```
		- #### createSAXParser
		
		
		
		```
		javax.xml.parsers.SAXParser createSAXParser()
		```
		
		Provides a SAXParser for the NodeSeqUnmarshaller to use. Override to provide a custom SAXParser implementation.
		 Will be called once for for every request to be unmarshalled. The default implementation calls `ScalaXmlSupport.createSaferSAXParser`.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonBinary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html)*