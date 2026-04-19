---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html
title: FileInfo
---

# FileInfo

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class FileInfo

- java.lang.Object
- - [akka.http.javadsl.server.directives.FileInfo](../../../javadsl/server/directives/FileInfo.html "class in akka.http.javadsl.server.directives")
	- - akka.http.scaladsl.server.directives.FileInfo

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class FileInfo
extends [FileInfo](../../../javadsl/server/directives/FileInfo.html "class in akka.http.javadsl.server.directives")
implements scala.Product, java.io.Serializable
```

Additional metadata about the file being uploaded/that was uploaded using the [`FileUploadDirectives`](FileUploadDirectives.html "interface in akka.http.scaladsl.server.directives")

 param: fieldName Name of the form field the file was uploaded in
 param: fileName User specified name of the uploaded file
 param: contentType Content type of the file

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.server.directives.FileInfo)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FileInfo](#%3Cinit%3E(java.lang.String,java.lang.String,akka.http.scaladsl.model.ContentType))​(java.lang.String fieldName,  java.lang.String fileName,  [ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2,T3))​(T1 v1,  T2 v2,  T3 v3)` |  |
	| `[ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model")` | `[contentType](#contentType())()` |  |
	| `java.lang.String` | `[fieldName](#fieldName())()` |  |
	| `java.lang.String` | `[fileName](#fileName())()` |  |
	| `[ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model")` | `[getContentType](#getContentType())()` | Content type of the file |
	| `java.lang.String` | `[getFieldName](#getFieldName())()` | Name of the form field the file was uploaded in |
	| `java.lang.String` | `[getFileName](#getFileName())()` | User specified name of the uploaded file |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### FileInfo
		
		
		
		```
		public FileInfo​(java.lang.String fieldName,
		                java.lang.String fileName,
		                [ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model") contentType)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2,
		                               T3 v3)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### fieldName
		
		
		
		```
		public java.lang.String fieldName()
		```
		- #### fileName
		
		
		
		```
		public java.lang.String fileName()
		```
		- #### contentType
		
		
		
		```
		public [ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model") contentType()
		```
		- #### getFieldName
		
		
		
		```
		public java.lang.String getFieldName()
		```
		
		Description copied from class: `[FileInfo](../../../javadsl/server/directives/FileInfo.html#getFieldName())`
		Name of the form field the file was uploaded in
		
		Specified by:
		`[getFieldName](../../../javadsl/server/directives/FileInfo.html#getFieldName())` in class `[FileInfo](../../../javadsl/server/directives/FileInfo.html "class in akka.http.javadsl.server.directives")`
		Returns:
		(undocumented)
		- #### getFileName
		
		
		
		```
		public java.lang.String getFileName()
		```
		
		Description copied from class: `[FileInfo](../../../javadsl/server/directives/FileInfo.html#getFileName())`
		User specified name of the uploaded file
		
		Specified by:
		`[getFileName](../../../javadsl/server/directives/FileInfo.html#getFileName())` in class `[FileInfo](../../../javadsl/server/directives/FileInfo.html "class in akka.http.javadsl.server.directives")`
		Returns:
		(undocumented)
		- #### getContentType
		
		
		
		```
		public [ContentType](../../model/ContentType.html "interface in akka.http.scaladsl.model") getContentType()
		```
		
		Description copied from class: `[FileInfo](../../../javadsl/server/directives/FileInfo.html#getContentType())`
		Content type of the file
		
		Specified by:
		`[getContentType](../../../javadsl/server/directives/FileInfo.html#getContentType())` in class `[FileInfo](../../../javadsl/server/directives/FileInfo.html "class in akka.http.javadsl.server.directives")`
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileInfo.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileInfo.html)*