---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:41:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multiparts.html
title: Multiparts
---

# Multiparts

## Content

Package [akka.http.javadsl.model](package-summary.html)
## Class Multiparts

- java.lang.Object
- - akka.http.javadsl.model.Multiparts

- ---

```
public final class Multiparts
extends java.lang.Object
```

Constructors for Multipart instances

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Multiparts](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model")` | `[createFormDataBodyPart](#createFormDataBodyPart(java.lang.String,akka.http.javadsl.model.BodyPartEntity))​(java.lang.String name,  [BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model") entity)` | Creates a BodyPart. |
	| `static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model")` | `[createFormDataBodyPart](#createFormDataBodyPart(java.lang.String,akka.http.javadsl.model.BodyPartEntity,java.util.Map))​(java.lang.String name,  [BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model") entity,  java.util.Map<java.lang.String,​java.lang.String> additionalDispositionParams)` | Creates a BodyPart. |
	| `static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model")` | `[createFormDataBodyPart](#createFormDataBodyPart(java.lang.String,akka.http.javadsl.model.BodyPartEntity,java.util.Map,java.util.List))​(java.lang.String name,  [BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model") entity,  java.util.Map<java.lang.String,​java.lang.String> additionalDispositionParams,  java.util.List<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> headers)` | Creates a BodyPart. |
	| `static [Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model")` | `[createFormDataBodyPartStrict](#createFormDataBodyPartStrict(java.lang.String,akka.http.javadsl.model.HttpEntity.Strict))​(java.lang.String name,  [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") entity)` | Creates a BodyPart.Strict. |
	| `static [Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model")` | `[createFormDataBodyPartStrict](#createFormDataBodyPartStrict(java.lang.String,akka.http.javadsl.model.HttpEntity.Strict,java.util.Map))​(java.lang.String name,  [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") entity,  java.util.Map<java.lang.String,​java.lang.String> additionalDispositionParams)` | Creates a BodyPart.Strict. |
	| `static [Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model")` | `[createFormDataBodyPartStrict](#createFormDataBodyPartStrict(java.lang.String,akka.http.javadsl.model.HttpEntity.Strict,java.util.Map,java.util.List))​(java.lang.String name,  [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") entity,  java.util.Map<java.lang.String,​java.lang.String> additionalDispositionParams,  java.util.List<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> headers)` | Creates a BodyPart.Strict. |
	| `static [Multipart.FormData.Strict](Multipart.FormData.Strict.html "interface in akka.http.javadsl.model")` | `[createFormDataFromFields](#createFormDataFromFields(java.util.Map))​(java.util.Map<java.lang.String,​[HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")> fields)` | Constructor for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\. |
	| `static [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model")` | `[createFormDataFromParts](#createFormDataFromParts(akka.http.javadsl.model.Multipart.FormData.BodyPart...))​([Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model")... parts)` | Constructor for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\. |
	| `static [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model")` | `[createFormDataFromPath](#createFormDataFromPath(java.lang.String,akka.http.javadsl.model.ContentType,java.nio.file.Path))​(java.lang.String name,  [ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  java.nio.file.Path path)` | Creates a FormData instance that contains a single part backed by the given file. |
	| `static [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model")` | `[createFormDataFromPath](#createFormDataFromPath(java.lang.String,akka.http.javadsl.model.ContentType,java.nio.file.Path,int))​(java.lang.String name,  [ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  java.nio.file.Path path,  int chunkSize)` | Creates a FormData instance that contains a single part backed by the given file. |
	| `static [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model")` | `[createFormDataFromSourceParts](#createFormDataFromSourceParts(akka.stream.javadsl.Source))​(akka.stream.javadsl.Source<[Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model"),​? extends java.lang.Object> parts)` | Constructor for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\. |
	| `static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model")` | `[createFormDataPartFromPath](#createFormDataPartFromPath(java.lang.String,akka.http.javadsl.model.ContentType,java.nio.file.Path))​(java.lang.String name,  [ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  java.nio.file.Path path)` | Creates a BodyPart backed by a file that will be streamed using a FileSource. |
	| `static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model")` | `[createFormDataPartFromPath](#createFormDataPartFromPath(java.lang.String,akka.http.javadsl.model.ContentType,java.nio.file.Path,int))​(java.lang.String name,  [ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,  java.nio.file.Path path,  int chunkSize)` | Creates a BodyPart backed by a file that will be streamed using a FileSource. |
	| `static [Multipart.FormData.Strict](Multipart.FormData.Strict.html "interface in akka.http.javadsl.model")` | `[createStrictFormDataFromParts](#createStrictFormDataFromParts(akka.http.javadsl.model.Multipart.FormData.BodyPart.Strict...))​([Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model")... parts)` | Constructor for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Multiparts
		
		
		
		```
		public Multiparts()
		```

	- ### Method Detail
	
	
	
		- #### createFormDataFromParts
		
		
		
		```
		public static [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model") createFormDataFromParts​([Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model")... parts)
		```
		
		Constructor for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\.
		 All parts must have distinct names. (This is not verified!)
		- #### createFormDataFromSourceParts
		
		
		
		```
		public static [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model") createFormDataFromSourceParts​(akka.stream.javadsl.Source<[Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model"),​? extends java.lang.Object> parts)
		```
		
		Constructor for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\.
		 All parts must have distinct names. (This is not verified!)
		- #### createStrictFormDataFromParts
		
		
		
		```
		public static [Multipart.FormData.Strict](Multipart.FormData.Strict.html "interface in akka.http.javadsl.model") createStrictFormDataFromParts​([Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model")... parts)
		```
		
		Constructor for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\.
		 All parts must have distinct names. (This is not verified!)
		- #### createFormDataFromFields
		
		
		
		```
		public static [Multipart.FormData.Strict](Multipart.FormData.Strict.html "interface in akka.http.javadsl.model") createFormDataFromFields​(java.util.Map<java.lang.String,​[HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model")> fields)
		```
		
		Constructor for \`multipart/form\-data\` content as defined in http://tools.ietf.org/html/rfc2388\.
		 All parts must have distinct names. (This is not verified!)
		- #### createFormDataFromPath
		
		
		
		```
		public static [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model") createFormDataFromPath​(java.lang.String name,
		                                                        [ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                                        java.nio.file.Path path,
		                                                        int chunkSize)
		```
		
		Creates a FormData instance that contains a single part backed by the given file.
		
		 To create an instance with several parts or for multiple files, use
		 \`Multiparts.createFormDataFromParts(Multiparts.createFormDataPartFromPath("field1", ...), Multiparts.createFormDataPartFromPath("field2", ...)\`
		- #### createFormDataFromPath
		
		
		
		```
		public static [Multipart.FormData](Multipart.FormData.html "interface in akka.http.javadsl.model") createFormDataFromPath​(java.lang.String name,
		                                                        [ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                                        java.nio.file.Path path)
		```
		
		Creates a FormData instance that contains a single part backed by the given file.
		
		 To create an instance with several parts or for multiple files, use
		 \`Multiparts.createFormDataFromParts(Multiparts.createFormDataPartFromPath("field1", ...), Multiparts.createFormDataPartFromPath("field2", ...)\`
		- #### createFormDataPartFromPath
		
		
		
		```
		public static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model") createFormDataPartFromPath​(java.lang.String name,
		                                                                     [ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                                                     java.nio.file.Path path,
		                                                                     int chunkSize)
		```
		
		Creates a BodyPart backed by a file that will be streamed using a FileSource.
		- #### createFormDataPartFromPath
		
		
		
		```
		public static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model") createFormDataPartFromPath​(java.lang.String name,
		                                                                     [ContentType](ContentType.html "interface in akka.http.javadsl.model") contentType,
		                                                                     java.nio.file.Path path)
		```
		
		Creates a BodyPart backed by a file that will be streamed using a FileSource.
		- #### createFormDataBodyPart
		
		
		
		```
		public static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model") createFormDataBodyPart​(java.lang.String name,
		                                                                 [BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model") entity)
		```
		
		Creates a BodyPart.
		- #### createFormDataBodyPart
		
		
		
		```
		public static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model") createFormDataBodyPart​(java.lang.String name,
		                                                                 [BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model") entity,
		                                                                 java.util.Map<java.lang.String,​java.lang.String> additionalDispositionParams)
		```
		
		Creates a BodyPart.
		- #### createFormDataBodyPart
		
		
		
		```
		public static [Multipart.FormData.BodyPart](Multipart.FormData.BodyPart.html "interface in akka.http.javadsl.model") createFormDataBodyPart​(java.lang.String name,
		                                                                 [BodyPartEntity](BodyPartEntity.html "interface in akka.http.javadsl.model") entity,
		                                                                 java.util.Map<java.lang.String,​java.lang.String> additionalDispositionParams,
		                                                                 java.util.List<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> headers)
		```
		
		Creates a BodyPart.
		- #### createFormDataBodyPartStrict
		
		
		
		```
		public static [Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model") createFormDataBodyPartStrict​(java.lang.String name,
		                                                                              [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") entity)
		```
		
		Creates a BodyPart.Strict.
		- #### createFormDataBodyPartStrict
		
		
		
		```
		public static [Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model") createFormDataBodyPartStrict​(java.lang.String name,
		                                                                              [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") entity,
		                                                                              java.util.Map<java.lang.String,​java.lang.String> additionalDispositionParams)
		```
		
		Creates a BodyPart.Strict.
		- #### createFormDataBodyPartStrict
		
		
		
		```
		public static [Multipart.FormData.BodyPart.Strict](Multipart.FormData.BodyPart.Strict.html "interface in akka.http.javadsl.model") createFormDataBodyPartStrict​(java.lang.String name,
		                                                                              [HttpEntity.Strict](HttpEntity.Strict.html "interface in akka.http.javadsl.model") entity,
		                                                                              java.util.Map<java.lang.String,​java.lang.String> additionalDispositionParams,
		                                                                              java.util.List<[HttpHeader](HttpHeader.html "class in akka.http.javadsl.model")> headers)
		```
		
		Creates a BodyPart.Strict.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/BodyPartEntity.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpEntity.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.FormData.BodyPart.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.FormData.BodyPart.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.FormData.Strict.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multipart.FormData.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multiparts.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Multiparts.html)*