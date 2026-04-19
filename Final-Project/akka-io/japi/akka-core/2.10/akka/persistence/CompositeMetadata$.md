---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CompositeMetadata$.html
title: CompositeMetadata$
---

# CompositeMetadata$

## Content

Package [akka.persistence](package-summary.html)
## Class CompositeMetadata$

- java.lang.Object
- - akka.persistence.CompositeMetadata$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class CompositeMetadata$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.CompositeMetadata$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CompositeMetadata$](CompositeMetadata$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CompositeMetadata$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.CompositeMetadata` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> entries)` | INTERNAL API: Metadata entries keyed by metadata class. |
	| `scala.Option<java.lang.Object>` | `[construct](#construct(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> metadataEntries)` |  |
	| `<M> scala.Option<M>` | `[extract](#extract(scala.collection.immutable.Seq,scala.reflect.ClassTag))​(scala.collection.immutable.Seq<java.lang.Object> metadataEntries,  scala.reflect.ClassTag<M> evidence$2)` |  |
	| `<M> scala.Option<M>` | `[extract](#extract(scala.Option,scala.reflect.ClassTag))​(scala.Option<java.lang.Object> metadata,  scala.reflect.ClassTag<M> evidence$1)` |  |
	| `scala.Option<scala.collection.immutable.Seq<java.lang.Object>>` | `[unapply](#unapply(akka.persistence.CompositeMetadata))​(akka.persistence.CompositeMetadata x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CompositeMetadata$](CompositeMetadata$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CompositeMetadata$
		
		
		
		```
		public CompositeMetadata$()
		```

	- ### Method Detail
	
	
	
		- #### extract
		
		
		
		```
		public <M> scala.Option<M> extract​(scala.Option<java.lang.Object> metadata,
		                                   scala.reflect.ClassTag<M> evidence$1)
		```
		- #### extract
		
		
		
		```
		public <M> scala.Option<M> extract​(scala.collection.immutable.Seq<java.lang.Object> metadataEntries,
		                                   scala.reflect.ClassTag<M> evidence$2)
		```
		- #### construct
		
		
		
		```
		public scala.Option<java.lang.Object> construct​(scala.collection.immutable.Seq<java.lang.Object> metadataEntries)
		```
		- #### apply
		
		
		
		```
		public akka.persistence.CompositeMetadata apply​(scala.collection.immutable.Seq<java.lang.Object> entries)
		```
		
		INTERNAL API: Metadata entries keyed by metadata class.
		 
		 For backwards compatibility of for example EventEnvelope.eventMetadata the entries is a Seq
		 with the metadata that was added last (ReplicatedEventMetaData) at the head of the Seq.
		 Otherwise it could have been a `Map[Class, Any]`.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<java.lang.Object>> unapply​(akka.persistence.CompositeMetadata x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CompositeMetadata$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CompositeMetadata$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CompositeMetadata$.html)*