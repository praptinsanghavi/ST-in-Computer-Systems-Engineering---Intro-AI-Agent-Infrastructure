---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/DirectoryListing.html
title: DirectoryListing
---

# DirectoryListing

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Class DirectoryListing

- java.lang.Object
- - [akka.http.javadsl.server.directives.DirectoryListing](../../../javadsl/server/directives/DirectoryListing.html "class in akka.http.javadsl.server.directives")
	- - akka.http.scaladsl.server.directives.DirectoryListing

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DirectoryListing
extends [DirectoryListing](../../../javadsl/server/directives/DirectoryListing.html "class in akka.http.javadsl.server.directives")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.server.directives.DirectoryListing)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DirectoryListing](#%3Cinit%3E(java.lang.String,boolean,scala.collection.immutable.Seq))​(java.lang.String path,  boolean isRoot,  scala.collection.immutable.Seq<java.io.File> files)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<[DirectoryListing](DirectoryListing.html "class in akka.http.scaladsl.server.directives"),​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")>` | `[directoryMarshaller](#directoryMarshaller(boolean))​(boolean renderVanityFooter)` |  |
	| `scala.collection.immutable.Seq<java.io.File>` | `[files](#files())()` |  |
	| `java.util.List<java.io.File>` | `[getFiles](#getFiles())()` |  |
	| `java.lang.String` | `[getPath](#getPath())()` |  |
	| `boolean` | `[isRoot](#isRoot())()` |  |
	| `java.lang.String` | `[path](#path())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### DirectoryListing
		
		
		
		```
		public DirectoryListing​(java.lang.String path,
		                        boolean isRoot,
		                        scala.collection.immutable.Seq<java.io.File> files)
		```

	- ### Method Detail
	
	
	
		- #### directoryMarshaller
		
		
		
		```
		public static [Marshaller](../../marshalling/Marshaller.html "class in akka.http.scaladsl.marshalling")<[DirectoryListing](DirectoryListing.html "class in akka.http.scaladsl.server.directives"),​[RequestEntity](../../model/RequestEntity.html "interface in akka.http.scaladsl.model")> directoryMarshaller​(boolean renderVanityFooter)
		```
		- #### path
		
		
		
		```
		public java.lang.String path()
		```
		- #### isRoot
		
		
		
		```
		public boolean isRoot()
		```
		
		
		Specified by:
		`[isRoot](../../../javadsl/server/directives/DirectoryListing.html#isRoot())` in class `[DirectoryListing](../../../javadsl/server/directives/DirectoryListing.html "class in akka.http.javadsl.server.directives")`
		- #### files
		
		
		
		```
		public scala.collection.immutable.Seq<java.io.File> files()
		```
		- #### getPath
		
		
		
		```
		public java.lang.String getPath()
		```
		
		
		Specified by:
		`[getPath](../../../javadsl/server/directives/DirectoryListing.html#getPath())` in class `[DirectoryListing](../../../javadsl/server/directives/DirectoryListing.html "class in akka.http.javadsl.server.directives")`
		- #### getFiles
		
		
		
		```
		public java.util.List<java.io.File> getFiles()
		```
		
		
		Specified by:
		`[getFiles](../../../javadsl/server/directives/DirectoryListing.html#getFiles())` in class `[DirectoryListing](../../../javadsl/server/directives/DirectoryListing.html "class in akka.http.javadsl.server.directives")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/DirectoryListing.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/DirectoryListing.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/DirectoryListing.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/DirectoryListing.html)*