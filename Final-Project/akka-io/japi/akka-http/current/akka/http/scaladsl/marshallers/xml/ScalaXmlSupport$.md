---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html
title: ScalaXmlSupport$
---

# ScalaXmlSupport$

## Content

Package [akka.http.scaladsl.marshallers.xml](package-summary.html)
## Class ScalaXmlSupport$

- java.lang.Object
- - akka.http.scaladsl.marshallers.xml.ScalaXmlSupport$

- All Implemented Interfaces:
`[ScalaXmlSupport](ScalaXmlSupport.html "interface in akka.http.scaladsl.marshallers.xml")`

---

```
public class ScalaXmlSupport$
extends java.lang.Object
implements [ScalaXmlSupport](ScalaXmlSupport.html "interface in akka.http.scaladsl.marshallers.xml")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ScalaXmlSupport$](ScalaXmlSupport$.html "class in akka.http.scaladsl.marshallers.xml")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ScalaXmlSupport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `javax.xml.parsers.SAXParser` | `[createSaferSAXParser](#createSaferSAXParser())()` | Creates a safer SAXParser. |
	| `scala.collection.immutable.Seq<[ContentTypeRange](../../model/ContentTypeRange.html "class in akka.http.scaladsl.model")>` | `[nodeSeqContentTypeRanges](#nodeSeqContentTypeRanges())()` |  |
	| `scala.collection.immutable.Seq<[MediaType.NonBinary](../../model/MediaType.NonBinary.html "class in akka.http.scaladsl.model")>` | `[nodeSeqMediaTypes](#nodeSeqMediaTypes())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.marshallers.xml.[ScalaXmlSupport](ScalaXmlSupport.html "interface in akka.http.scaladsl.marshallers.xml")
		
		
		`[createSAXParser](ScalaXmlSupport.html#createSAXParser()), [defaultNodeSeqMarshaller](ScalaXmlSupport.html#defaultNodeSeqMarshaller()), [defaultNodeSeqUnmarshaller](ScalaXmlSupport.html#defaultNodeSeqUnmarshaller()), [nodeSeqMarshaller](ScalaXmlSupport.html#nodeSeqMarshaller(akka.http.scaladsl.model.MediaType.NonBinary)), [nodeSeqUnmarshaller](ScalaXmlSupport.html#nodeSeqUnmarshaller(scala.collection.immutable.Seq))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ScalaXmlSupport$](ScalaXmlSupport$.html "class in akka.http.scaladsl.marshallers.xml") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ScalaXmlSupport$
		
		
		
		```
		public ScalaXmlSupport$()
		```

	- ### Method Detail
	
	
	
		- #### nodeSeqMediaTypes
		
		
		
		```
		public scala.collection.immutable.Seq<[MediaType.NonBinary](../../model/MediaType.NonBinary.html "class in akka.http.scaladsl.model")> nodeSeqMediaTypes()
		```
		- #### nodeSeqContentTypeRanges
		
		
		
		```
		public scala.collection.immutable.Seq<[ContentTypeRange](../../model/ContentTypeRange.html "class in akka.http.scaladsl.model")> nodeSeqContentTypeRanges()
		```
		- #### createSaferSAXParser
		
		
		
		```
		public javax.xml.parsers.SAXParser createSaferSAXParser()
		```
		
		Creates a safer SAXParser.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentTypeRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.NonBinary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshallers/xml/ScalaXmlSupport$.html)*