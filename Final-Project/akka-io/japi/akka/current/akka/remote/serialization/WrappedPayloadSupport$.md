---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:37:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/serialization/WrappedPayloadSupport$.html
title: WrappedPayloadSupport$
---

# WrappedPayloadSupport$

## Content

Package [akka.remote.serialization](package-summary.html)
## Class WrappedPayloadSupport$

- java.lang.Object
- - akka.remote.serialization.WrappedPayloadSupport$

- ---

```
public class WrappedPayloadSupport$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WrappedPayloadSupport$](WrappedPayloadSupport$.html "class in akka.remote.serialization")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WrappedPayloadSupport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Object` | `[deserializePayload](#deserializePayload(akka.remote.ContainerFormats.Payload,akka.serialization.Serialization))​([ContainerFormats.Payload](../ContainerFormats.Payload.html "class in akka.remote") payload,  [Serialization](../../serialization/Serialization.html "class in akka.serialization") serialization)` |  |
	| `[ContainerFormats.Payload.Builder](../ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[payloadBuilder](#payloadBuilder(java.lang.Object,akka.serialization.Serialization,akka.event.LoggingAdapter))​(java.lang.Object input,  [Serialization](../../serialization/Serialization.html "class in akka.serialization") serialization,  [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)` | Serialize the `input` along with its `manifest` and `serializerId`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WrappedPayloadSupport$](WrappedPayloadSupport$.html "class in akka.remote.serialization") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WrappedPayloadSupport$
		
		
		
		```
		public WrappedPayloadSupport$()
		```

	- ### Method Detail
	
	
	
		- #### payloadBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](../ContainerFormats.Payload.Builder.html "class in akka.remote") payloadBuilder​(java.lang.Object input,
		                                                       [Serialization](../../serialization/Serialization.html "class in akka.serialization") serialization,
		                                                       [LoggingAdapter](../../event/LoggingAdapter.html "interface in akka.event") log)
		```
		
		Serialize the `input` along with its `manifest` and `serializerId`.
		 
		 If `input` is a `Throwable` and can't be serialized because Java serialization is disabled it
		 will fallback to `ThrowableNotSerializableException`.
		- #### deserializePayload
		
		
		
		```
		public java.lang.Object deserializePayload​([ContainerFormats.Payload](../ContainerFormats.Payload.html "class in akka.remote") payload,
		                                           [Serialization](../../serialization/Serialization.html "class in akka.serialization") serialization)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/WrappedPayloadSupport$.html
- https://doc.akka.io/japi/akka/current/akka/remote/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/serialization/Serialization.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/serialization/WrappedPayloadSupport$.html](https://doc.akka.io/japi/akka/current/akka/remote/serialization/WrappedPayloadSupport$.html)*