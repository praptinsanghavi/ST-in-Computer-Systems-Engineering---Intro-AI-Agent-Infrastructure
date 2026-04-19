---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:52:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.Wrapper.html
title: TestConductorProtocol.Wrapper
---

# TestConductorProtocol.Wrapper

## Content

Package [akka.remote.testconductor](package-summary.html)
## Class TestConductorProtocol.Wrapper

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite
	- - akka.protobufv3\.internal.AbstractMessage
		- - akka.protobufv3\.internal.GeneratedMessageV3
			- - akka.remote.testconductor.TestConductorProtocol.Wrapper

- All Implemented Interfaces:
`akka.protobufv3.internal.Message`, `akka.protobufv3.internal.MessageLite`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`, `java.io.Serializable`

Enclosing class:
[TestConductorProtocol](TestConductorProtocol.html "class in akka.remote.testconductor")

---

```
public static final class TestConductorProtocol.Wrapper
extends akka.protobufv3.internal.GeneratedMessageV3
implements [TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")
```

Protobuf type `Wrapper`

See Also:
[Serialized Form](../../../serialized-form.html#akka.remote.testconductor.TestConductorProtocol.Wrapper)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | Protobuf type `Wrapper` |
	
	
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`akka.protobufv3.internal.GeneratedMessageV3.BuilderParent, akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>,​BuilderT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableBuilder<MessageT,​BuilderT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessageOrBuilder<MessageT extends akka.protobufv3.internal.GeneratedMessageV3.ExtendableMessage<MessageT>>, akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable, akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter`
		- ### Nested classes/interfaces inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`akka.protobufv3.internal.AbstractMessageLite.InternalOneOfEnum`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static int` | `[ADDR_FIELD_NUMBER](#ADDR_FIELD_NUMBER)` |  |
	| `static int` | `[BARRIER_FIELD_NUMBER](#BARRIER_FIELD_NUMBER)` |  |
	| `static int` | `[DONE_FIELD_NUMBER](#DONE_FIELD_NUMBER)` |  |
	| `static int` | `[FAILURE_FIELD_NUMBER](#FAILURE_FIELD_NUMBER)` |  |
	| `static int` | `[HELLO_FIELD_NUMBER](#HELLO_FIELD_NUMBER)` |  |
	| `static akka.protobufv3.internal.Parser<[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")>` | `[PARSER](#PARSER)` | Deprecated. |
	
	
		- ### Fields inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`alwaysUseFieldBuilders, unknownFields`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`memoizedSize`
		- ### Fields inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`memoizedHashCode`

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `[TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor")` | `[getAddr](#getAddr())()` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor")` | `[getAddrOrBuilder](#getAddrOrBuilder())()` | `optional .AddressRequest addr = 5;` |
	| `[TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor")` | `[getBarrier](#getBarrier())()` | `optional .EnterBarrier barrier = 2;` |
	| `[TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor")` | `[getBarrierOrBuilder](#getBarrierOrBuilder())()` | `optional .EnterBarrier barrier = 2;` |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[getDefaultInstance](#getDefaultInstance())()` |  |
	| `[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `java.lang.String` | `[getDone](#getDone())()` | `optional string done = 4;` |
	| `akka.protobufv3.internal.ByteString` | `[getDoneBytes](#getDoneBytes())()` | `optional string done = 4;` |
	| `[TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor")` | `[getFailure](#getFailure())()` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor")` | `[getFailureOrBuilder](#getFailureOrBuilder())()` | `optional .InjectFailure failure = 3;` |
	| `[TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor")` | `[getHello](#getHello())()` | `optional .Hello hello = 1;` |
	| `[TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor")` | `[getHelloOrBuilder](#getHelloOrBuilder())()` | `optional .Hello hello = 1;` |
	| `akka.protobufv3.internal.Parser<[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")>` | `[getParserForType](#getParserForType())()` |  |
	| `int` | `[getSerializedSize](#getSerializedSize())()` |  |
	| `boolean` | `[hasAddr](#hasAddr())()` | `optional .AddressRequest addr = 5;` |
	| `boolean` | `[hasBarrier](#hasBarrier())()` | `optional .EnterBarrier barrier = 2;` |
	| `boolean` | `[hasDone](#hasDone())()` | `optional string done = 4;` |
	| `boolean` | `[hasFailure](#hasFailure())()` | `optional .InjectFailure failure = 3;` |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[hasHello](#hasHello())()` | `optional .Hello hello = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `static [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[newBuilder](#newBuilder())()` |  |
	| `static [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[newBuilder](#newBuilder(akka.remote.testconductor.TestConductorProtocol.Wrapper))​([TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") prototype)` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[newBuilderForType](#newBuilderForType())()` |  |
	| `protected [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[newBuilderForType](#newBuilderForType(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent))​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)` |  |
	| `protected java.lang.Object` | `[newInstance](#newInstance(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter))​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseDelimitedFrom](#parseDelimitedFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(byte%5B%5D))​(byte[] data)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(byte%5B%5D,akka.protobufv3.internal.ExtensionRegistryLite))​(byte[] data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString data)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.ByteString,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.ByteString data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream))​(akka.protobufv3.internal.CodedInputStream input)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(java.io.InputStream))​(java.io.InputStream input)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(java.io.InputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(java.io.InputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer))​(java.nio.ByteBuffer data)` |  |
	| `static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")` | `[parseFrom](#parseFrom(java.nio.ByteBuffer,akka.protobufv3.internal.ExtensionRegistryLite))​(java.nio.ByteBuffer data,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `static akka.protobufv3.internal.Parser<[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")>` | `[parser](#parser())()` |  |
	| `[TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor")` | `[toBuilder](#toBuilder())()` |  |
	| `void` | `[writeTo](#writeTo(akka.protobufv3.internal.CodedOutputStream))​(akka.protobufv3.internal.CodedOutputStream output)` |  |
	
	
		- ### Methods inherited from class akka.protobufv3\.internal.GeneratedMessageV3
		
		
		`canUseUnsafe, computeStringSize, computeStringSizeNoTag, emptyBooleanList, emptyDoubleList, emptyFloatList, emptyIntList, emptyList, emptyLongList, getAllFields, getDescriptorForType, getField, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof, internalGetMapField, internalGetMapFieldReflection, isStringEmpty, makeExtensionsImmutable, makeMutableCopy, makeMutableCopy, mergeFromAndMakeImmutableInternal, mutableCopy, mutableCopy, mutableCopy, mutableCopy, mutableCopy, newBooleanList, newBuilderForType, newDoubleList, newFloatList, newIntList, newLongList, parseDelimitedWithIOException, parseDelimitedWithIOException, parseUnknownField, parseUnknownFieldProto3, parseWithIOException, parseWithIOException, parseWithIOException, parseWithIOException, serializeBooleanMapTo, serializeIntegerMapTo, serializeLongMapTo, serializeStringMapTo, writeReplace, writeString, writeStringNoTag`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessage
		
		
		`findInitializationErrors, getInitializationErrorString, hashBoolean, hashEnum, hashEnumList, hashFields, hashLong, toString`
		- ### Methods inherited from class akka.protobufv3\.internal.AbstractMessageLite
		
		
		`addAll, addAll, checkByteStringIsUtf8, toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLite
		
		
		`toByteArray, toByteString, writeDelimitedTo, writeTo`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Field Detail
	
	
	
		- #### HELLO\_FIELD\_NUMBER
		
		
		
		```
		public static final int HELLO_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.Wrapper.HELLO_FIELD_NUMBER)
		- #### BARRIER\_FIELD\_NUMBER
		
		
		
		```
		public static final int BARRIER_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.Wrapper.BARRIER_FIELD_NUMBER)
		- #### FAILURE\_FIELD\_NUMBER
		
		
		
		```
		public static final int FAILURE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.Wrapper.FAILURE_FIELD_NUMBER)
		- #### DONE\_FIELD\_NUMBER
		
		
		
		```
		public static final int DONE_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.Wrapper.DONE_FIELD_NUMBER)
		- #### ADDR\_FIELD\_NUMBER
		
		
		
		```
		public static final int ADDR_FIELD_NUMBER
		```
		
		
		See Also:
		[Constant Field Values](../../../constant-values.html#akka.remote.testconductor.TestConductorProtocol.Wrapper.ADDR_FIELD_NUMBER)
		- #### PARSER
		
		
		
		```
		@Deprecated
		public static final akka.protobufv3.internal.Parser<[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")> PARSER
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### newInstance
		
		
		
		```
		protected java.lang.Object newInstance​(akka.protobufv3.internal.GeneratedMessageV3.UnusedPrivateParameter unused)
		```
		
		
		Overrides:
		`newInstance` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDescriptor
		
		
		
		```
		public static final akka.protobufv3.internal.Descriptors.Descriptor getDescriptor()
		```
		- #### internalGetFieldAccessorTable
		
		
		
		```
		protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable()
		```
		
		
		Specified by:
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### hasHello
		
		
		
		```
		public boolean hasHello()
		```
		
		`optional .Hello hello = 1;`
		
		Specified by:
		`[hasHello](TestConductorProtocol.WrapperOrBuilder.html#hasHello())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the hello field is set.
		- #### getHello
		
		
		
		```
		public [TestConductorProtocol.Hello](TestConductorProtocol.Hello.html "class in akka.remote.testconductor") getHello()
		```
		
		`optional .Hello hello = 1;`
		
		Specified by:
		`[getHello](TestConductorProtocol.WrapperOrBuilder.html#getHello())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The hello.
		- #### getHelloOrBuilder
		
		
		
		```
		public [TestConductorProtocol.HelloOrBuilder](TestConductorProtocol.HelloOrBuilder.html "interface in akka.remote.testconductor") getHelloOrBuilder()
		```
		
		`optional .Hello hello = 1;`
		
		Specified by:
		`[getHelloOrBuilder](TestConductorProtocol.WrapperOrBuilder.html#getHelloOrBuilder())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		- #### hasBarrier
		
		
		
		```
		public boolean hasBarrier()
		```
		
		`optional .EnterBarrier barrier = 2;`
		
		Specified by:
		`[hasBarrier](TestConductorProtocol.WrapperOrBuilder.html#hasBarrier())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the barrier field is set.
		- #### getBarrier
		
		
		
		```
		public [TestConductorProtocol.EnterBarrier](TestConductorProtocol.EnterBarrier.html "class in akka.remote.testconductor") getBarrier()
		```
		
		`optional .EnterBarrier barrier = 2;`
		
		Specified by:
		`[getBarrier](TestConductorProtocol.WrapperOrBuilder.html#getBarrier())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The barrier.
		- #### getBarrierOrBuilder
		
		
		
		```
		public [TestConductorProtocol.EnterBarrierOrBuilder](TestConductorProtocol.EnterBarrierOrBuilder.html "interface in akka.remote.testconductor") getBarrierOrBuilder()
		```
		
		`optional .EnterBarrier barrier = 2;`
		
		Specified by:
		`[getBarrierOrBuilder](TestConductorProtocol.WrapperOrBuilder.html#getBarrierOrBuilder())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		- #### hasFailure
		
		
		
		```
		public boolean hasFailure()
		```
		
		`optional .InjectFailure failure = 3;`
		
		Specified by:
		`[hasFailure](TestConductorProtocol.WrapperOrBuilder.html#hasFailure())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the failure field is set.
		- #### getFailure
		
		
		
		```
		public [TestConductorProtocol.InjectFailure](TestConductorProtocol.InjectFailure.html "class in akka.remote.testconductor") getFailure()
		```
		
		`optional .InjectFailure failure = 3;`
		
		Specified by:
		`[getFailure](TestConductorProtocol.WrapperOrBuilder.html#getFailure())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The failure.
		- #### getFailureOrBuilder
		
		
		
		```
		public [TestConductorProtocol.InjectFailureOrBuilder](TestConductorProtocol.InjectFailureOrBuilder.html "interface in akka.remote.testconductor") getFailureOrBuilder()
		```
		
		`optional .InjectFailure failure = 3;`
		
		Specified by:
		`[getFailureOrBuilder](TestConductorProtocol.WrapperOrBuilder.html#getFailureOrBuilder())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		- #### hasDone
		
		
		
		```
		public boolean hasDone()
		```
		
		`optional string done = 4;`
		
		Specified by:
		`[hasDone](TestConductorProtocol.WrapperOrBuilder.html#hasDone())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the done field is set.
		- #### getDone
		
		
		
		```
		public java.lang.String getDone()
		```
		
		`optional string done = 4;`
		
		Specified by:
		`[getDone](TestConductorProtocol.WrapperOrBuilder.html#getDone())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The done.
		- #### getDoneBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getDoneBytes()
		```
		
		`optional string done = 4;`
		
		Specified by:
		`[getDoneBytes](TestConductorProtocol.WrapperOrBuilder.html#getDoneBytes())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The bytes for done.
		- #### hasAddr
		
		
		
		```
		public boolean hasAddr()
		```
		
		`optional .AddressRequest addr = 5;`
		
		Specified by:
		`[hasAddr](TestConductorProtocol.WrapperOrBuilder.html#hasAddr())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		Whether the addr field is set.
		- #### getAddr
		
		
		
		```
		public [TestConductorProtocol.AddressRequest](TestConductorProtocol.AddressRequest.html "class in akka.remote.testconductor") getAddr()
		```
		
		`optional .AddressRequest addr = 5;`
		
		Specified by:
		`[getAddr](TestConductorProtocol.WrapperOrBuilder.html#getAddr())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		Returns:
		The addr.
		- #### getAddrOrBuilder
		
		
		
		```
		public [TestConductorProtocol.AddressRequestOrBuilder](TestConductorProtocol.AddressRequestOrBuilder.html "interface in akka.remote.testconductor") getAddrOrBuilder()
		```
		
		`optional .AddressRequest addr = 5;`
		
		Specified by:
		`[getAddrOrBuilder](TestConductorProtocol.WrapperOrBuilder.html#getAddrOrBuilder())` in interface `[TestConductorProtocol.WrapperOrBuilder](TestConductorProtocol.WrapperOrBuilder.html "interface in akka.remote.testconductor")`
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### writeTo
		
		
		
		```
		public void writeTo​(akka.protobufv3.internal.CodedOutputStream output)
		             throws java.io.IOException
		```
		
		
		Specified by:
		`writeTo` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`writeTo` in class `akka.protobufv3.internal.GeneratedMessageV3`
		Throws:
		`java.io.IOException`
		- #### getSerializedSize
		
		
		
		```
		public int getSerializedSize()
		```
		
		
		Specified by:
		`getSerializedSize` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getSerializedSize` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`equals` in class `akka.protobufv3.internal.AbstractMessage`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Specified by:
		`hashCode` in interface `akka.protobufv3.internal.Message`
		Overrides:
		`hashCode` in class `akka.protobufv3.internal.AbstractMessage`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(java.nio.ByteBuffer data)
		                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(java.nio.ByteBuffer data,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(akka.protobufv3.internal.ByteString data)
		                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(akka.protobufv3.internal.ByteString data,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(byte[] data)
		                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(byte[] data,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws akka.protobufv3.internal.InvalidProtocolBufferException
		```
		
		
		Throws:
		`akka.protobufv3.internal.InvalidProtocolBufferException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(java.io.InputStream input)
		                                               throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(java.io.InputStream input,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseDelimitedFrom​(java.io.InputStream input)
		                                                        throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseDelimitedFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseDelimitedFrom​(java.io.InputStream input,
		                                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                        throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(akka.protobufv3.internal.CodedInputStream input)
		                                               throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### parseFrom
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") parseFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                      akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                               throws java.io.IOException
		```
		
		
		Throws:
		`java.io.IOException`
		- #### newBuilderForType
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") newBuilderForType()
		```
		
		
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`newBuilderForType` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilder
		
		
		
		```
		public static [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") newBuilder()
		```
		- #### newBuilder
		
		
		
		```
		public static [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") newBuilder​([TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") prototype)
		```
		- #### toBuilder
		
		
		
		```
		public [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") toBuilder()
		```
		
		
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`toBuilder` in interface `akka.protobufv3.internal.MessageLite`
		- #### newBuilderForType
		
		
		
		```
		protected [TestConductorProtocol.Wrapper.Builder](TestConductorProtocol.Wrapper.Builder.html "class in akka.remote.testconductor") newBuilderForType​(akka.protobufv3.internal.GeneratedMessageV3.BuilderParent parent)
		```
		
		
		Specified by:
		`newBuilderForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstance
		
		
		
		```
		public static [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") getDefaultInstance()
		```
		- #### parser
		
		
		
		```
		public static akka.protobufv3.internal.Parser<[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")> parser()
		```
		- #### getParserForType
		
		
		
		```
		public akka.protobufv3.internal.Parser<[TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor")> getParserForType()
		```
		
		
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.Message`
		Specified by:
		`getParserForType` in interface `akka.protobufv3.internal.MessageLite`
		Overrides:
		`getParserForType` in class `akka.protobufv3.internal.GeneratedMessageV3`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [TestConductorProtocol.Wrapper](TestConductorProtocol.Wrapper.html "class in akka.remote.testconductor") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.AddressRequest.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.AddressRequestOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.EnterBarrier.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.EnterBarrierOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.Hello.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.HelloOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.InjectFailure.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.InjectFailureOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.Wrapper.Builder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.Wrapper.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.WrapperOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/constant-values.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.Wrapper.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testconductor/TestConductorProtocol.Wrapper.html)*