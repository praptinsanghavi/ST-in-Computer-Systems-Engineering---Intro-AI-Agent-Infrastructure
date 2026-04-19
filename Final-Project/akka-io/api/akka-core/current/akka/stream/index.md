---
description: Akka 2.10.17 - akka.stream
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/index.html
title: Akka 2.10.17 - akka.stream
---

# Akka 2.10.17 - akka.stream

> **Summary:** Akka 2.10.17 - akka.stream

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/actor/index.html "Permalink")  package [actor](../actor/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](../annotation/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/coordination/index.html "Permalink")  package [coordination](../coordination/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/discovery/index.html "Permalink")  package [discovery](../discovery/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/dispatch/index.html "Permalink")  package [dispatch](../dispatch/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/event/index.html "Permalink")  package [event](../event/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/io/index.html "Permalink")  package [io](../io/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/japi/index.html "Permalink")  package [japi](../japi/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pattern/index.html "Permalink")  package [pattern](../pattern/index.html "This package is used as a collection point for usage patterns which involve actors, futures, etc.")This package is used as a collection point for usage patterns which involve
actors, futures, etc.

#### Commonly Used Patterns With Akka

This package is used as a collection point for usage patterns which involve
actors, futures, etc. but are loosely enough coupled to (multiple of) them
to present them separately from the core implementation. Currently supported
are:

	- **ask:** create a temporary one\-off actor for receiving a reply to a
	message and complete a [scala.concurrent.Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html) with it; returns said
	Future.
	- **pipeTo:** feed eventually computed value of a future to an [akka.actor.ActorRef](../actor/ActorRef.html) as
	a message.
	- **pipeToSelection:** feed eventually computed value of a future to an [akka.actor.ActorSelection](../actor/ActorSelection.html) as
	a message.In Scala the recommended usage is to import the pattern from the package
object:

```
import akka.pattern.ask

ask(actor, message) // use it directly
actor ask message   // use it by implicit conversion
```
For Java the patterns are available as static methods of the [akka.pattern.Patterns](../pattern/Patterns$.html)
class:

```
import static akka.pattern.Patterns.ask;

ask(actor, message);
```
Definition Classes[akka](../index.html)
- [**](../../akka/persistence/index.html "Permalink")  package [persistence](../persistence/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/pki/index.html "Permalink")  package [pki](../pki/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/remote/index.html "Permalink")  package [remote](../remote/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/routing/index.html "Permalink")  package [routing](../routing/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/index.html "Permalink")  package streamDefinition Classes[akka](../index.html)
- [**](../../akka/stream/impl/index.html "Permalink")  package [impl](impl/index.html "The architecture of Akka Streams internally consists of several distinct layers:")The architecture of Akka Streams internally consists of several distinct layers:

The architecture of Akka Streams internally consists of several distinct layers:

 \* The DSLs like [akka.stream.scaladsl.Flow](scaladsl/Flow.html), [akka.stream.scaladsl.Source](scaladsl/Source.html) etc. are the user facing API
 for composing streams. These DSLs are a thin wrappers around the internal akka.stream.impl.TraversalBuilder
 builder classes. There are Java alternatives of these DSLs in [javadsl](javadsl/index.html) which basically wrap their scala
 counterpart, delegating method calls.
 \* The [akka.stream.stage.GraphStage](stage/GraphStage.html) API is the user facing API for creating new stream operators. These
 classes are used by the akka.stream.impl.fusing.GraphInterpreter which executes islands (subgraphs) of these
 operators
 \* The high level DSLs use the akka.stream.impl.TraversalBuilder classes to build instances of
 akka.stream.impl.Traversal which are the representation of a materializable stream description. These builders
 are immutable and safely shareable. Unlike the top\-level DSLs, these are classic, i.e. elements are treated as
 Any.
 \* The akka.stream.impl.Traversal is the immutable, efficient representation of a stream processing graph that
 can be materialized. The builders exists solely for the purpose of producing a traversal in the end.
 \* The akka.stream.impl.PhasedFusingActorMaterializer is the class that is responsible for traversing and
 interpreting a akka.stream.impl.Traversal. It delegates the actual task of creating executable entities
 and Publishers/Producers to akka.stream.impl.PhaseIslands which are plugins that understand atomic operators
 in the graph and able to turn them into executable entities.
 \* The akka.stream.impl.fusing.GraphInterpreter and its actor backed wrapper akka.stream.impl.fusing.ActorGraphInterpreter
 are used to execute synchronous islands (subgraphs) of [akka.stream.stage.GraphStage](stage/GraphStage.html)s.

For the execution layer, refer to akka.stream.impl.fusing.GraphInterpreter.

#### Design goals

The central piece for both the DSLs and materialization is the akka.stream.impl.Traversal. This is the
representation of an Akka Stream, basically a [akka.stream.scaladsl.RunnableGraph](scaladsl/RunnableGraph.html). The design goals
for akka.stream.impl.Traversal are:

 \* Be able to materialize a graph in one pass over the traversal
 \* Unify materialization and fusing. The materializer should be able to construct all the necessary data structures
 for the interpreters and for connecting them in one go.
 \* Avoid allocations as much as possible.
 \* Biased implementation for the 90% case. Common cases should be as fast as possible:
 \* wiring linear chains should be very fast.
 \* assume that most graphs are mostly linear, with only a few generalized graph constructs thrown in.
 \* materialization should not pay the price of island tracking if there is only a single island
 \* assume that the number of islands is low in general
 \* avoid "copiedModule" i.e. wrappers that exist solely for the purpose of establishing new port identities
 for operators that are used multiple times in the same graph.
 \* Avoid hashmaps and prefer direct array lookup wherever possible

Semantically, a traversal is a list of commands that the materializer must execute to turn the description to a
running stream. In fact, the traversal is nothing more than an immutable list, that is expressed as a tree. A
tree is used to make immutable appends fast (immutable lists only have prepend as O(1\) operation, append is O(N)).
The materializer "recovers" the original sequence by using a local, mutable stack to properly traverse the tree
structure. This is way cheaper than to immutably append to the traversal at each addition.

The "tree\-ness" is expressed by explicit akka.stream.impl.Concat nodes that express that two traversals
need to be traversed in a certain sequence, stashing away the second on a local stack until the first is fully
traversed.

While traversing the traversal (basically following Concat nodes), the materializer will visit the following
command types:

 \* akka.stream.impl.MaterializeAtomic: An atomic module needs to be materialized. This node also contains
 wiring information which we discuss later.
 \* Materialized value computation. This is a stack based "sublanguage" to compute the final materialized value
 on a stack, maintained by the materializer
 \* akka.stream.impl.PushNotUsed push a NotUsed value on the stack
 \* akka.stream.impl.Pop pop the top of the stack and throw away
 \* akka.stream.impl.Transform take the top of the stack, transform it with the provided function and put
 the result back on the top of the stack
 \* akka.stream.impl.Compose take the top two values of the stack, invoke the provided function with these
 values as arguments, then put the calculated value on the top of the stack
 \* Materialized values of atomic operators when visiting a akka.stream.impl.MaterializeAtomic must be
 pushed to the stack automatically. There are no explicit PUSH commands for this
 \* Attributes calculation. These also are a stack language, although much simpler than the materialized value
 commands. For any materialized operator, the top of the attributes stack should be provided as the current
 effective attributes.
 \* akka.stream.impl.PushAttributes combines the attributes on the top of the stack with the given ones and
 puts the result on the attributes stack
 \* akka.stream.impl.PopAttributes removes the top of the attributes stack.
 \* Island tracking. Islands serve two purposes. First, they allow a large graph to be cut into parts that execute
 concurrently with each other, using asynchronous message passing between themselves. Second, they are an
 extension point where "plugins" (akka.stream.impl.PhaseIsland) can be used to specially handle subgraphs.
 Islands can be nested in each other. This makes "holes" in the parent island. Islands also need a stack
 as exiting a "hole" means returning to the parent, enclosing island and continuing where left.
 \* akka.stream.impl.EnterIsland instructs the materializer that the following commands will belong to
 the materialization of a new island (a subgraph). The akka.stream.impl.IslandTag signals to
 the materializer which akka.stream.impl.PhaseIsland should be used to turn operators of this island into
 executable entities.
 \* akka.stream.impl.ExitIsland instructs the materializer that the current island is done and the parent
 island is now the active one again.

 Please note that the stack based materialized value computation eliminates the issues present in the older
 materializer which expressed these computations as an AST. We had to use optimizations for this tree so that
 long Keep.left chains don't explode the stack visiting a large AST. The stack based language sidesteps this issue
 completely as the number of these commands don't increase the stack space required to execute them, unless the
 computation itself requires it (which is not the case in any sane stream combination).

#### Graph model, offsets, slots

 As a mental model, the wiring part of the Traversal (i.e. excluding the stack based sub\-commands tracking
 materialized values, attributes, islands, i.e. things that don't contribute to the wiring structure of the graph)
 translates everything to a single, global, contiguous Array. Every input and output port of each operator is mapped
 to exactly one slot of this "mental array". Input and output ports that are considered wired together simply map
 to the same slot. (In practice, these slots might not be mapped to an actual global array, but multiple local arrays
 using some translation logic, but we will explain this later)

 Input ports are mapped simply to contiguous numbers in the order they are visited. Take for example a simple
 traversal:

 Operator1\[in1, in2, out] \- Operator2\[out] \- Operator3\[in]

 This results in the following slot assignments:

 \* Operator1\.in1 \-\> 0
 \* Operator1\.in2 \-\> 1
 \* Operator3\.in \-\> 2

 The materializer simply visits Stage1, Stage2, Stage3 in order, visiting the input ports of each operator in order.
 It then simply assigns numbers from a counter that is incremented after visiting an input port.
 (Please note that all akka.stream.impl.StreamLayout.AtomicModules maintain a stable order of their ports, so
 this global ordering is well defined)

 Before explaining how output wiring works, it is important to settle some terminology. When we talk about ports
 we refer to their location in the "mental array" as slots. However, there are other entities that needs to
 reference various positions in this "mental array", but in these cases we use the term \_offset\_ to signify that
 these are only used for bookkeeping, they have no "place" in the "array" themselves. In particular:

 \* offset of a module: The offset of an akka.stream.impl.StreamLayout.AtomicModule is defined as the value of
 the input port counter when visiting the akka.stream.impl.MaterializeAtomic node to materialize that module.
 In other words, the offset of a module is the slot of its first input port (if there is any). Since modules
 might not have any input ports it can be that different modules share the same offset, simply because the
 the first one visited does not increase the input port counter.
 \* offset of segments, islands: Defined similarly to module. The offset of an island or a segment is simply the
 value of the input port counter (or the first unallocated slot).

 For example:

 Module1\[in1 \= 0, in2 \= 1] \- Module2\[out] \- Module3\[in \= 2]

 The offset of Module1 is 0, while Module2 and Module3 share the same offset of 2\. Note that only input ports (slots)
 contribute to the offset of a module in a traversal.

 Output ports are wired relative to the offset of the module they are contained in. When the materializer visits
 a akka.stream.impl.MaterializeAtomic node, it contains an Array that maps ports to a relative offset. To
 calculate the slot that is assigned to an output port the following formula is used:

 slot \= offsetOfModule \+ outToSlots(out.id)

 Where outToSlots is the array contained in the akka.stream.impl.MaterializeAtomic node.

#### Relative addressing

 The power of this structure comes from the fact that slots are assigned in a relative manner:

 \* input ports are assigned in sequence so the slots assigned to the input ports of a subgraph depend on the
 subgraph's position in the traversal
 \* output ports are assigned relative to the offset of their owner module, which is in turn relative to its first
 (potential) input port (which is relative, too, because of the previous point)

 This setup allows combining subgraphs without touching their internal wirings as all their internal wirings will
 properly resolve due to everything being relative:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\+
 \| \| \| \|
 \|\-\-\-\-\-\-\-\-\-Graph1\-\-\-\-\-\-\-\-\-\|\-\-\- .... \-\-\-\|\-\-\-\-Graph2\-\-\-\-\|

 It is important to note that due to reusability, an Akka Stream graph may contain the same atomic or composite
 multiple times in the same graph. Since these must be distinguished from each other somehow, they need port mapping
 (i.e. a new set of ports) to ensure that the ports of one graph are distinguishable from another. Because how
 the traversal relative addressing works, these are \_temporary\_ though, once all internal wirings are ready, these
 mappings can be effectively dropped as the global slot assignments uniquely identify what is wired to what. For
 example since Graph1 is visited before Graph2 all of the slots or offsets it uses are different from Graph2 leaving
 no room for misinterpretation.

#### Port mapping

 Port mapping is the way how the DSL can distinguish between multiple instances of the same graph included multiple
 times. For example in the Graph DSL:

 val merge1 \= builder.add(Merge)
 val merge2 \= builder.add(Merge)

 the port merge1\.out must be different from merge2\.out.

 For efficiency reasons, the linear and graph DSLs use different akka.stream.impl.TraversalBuilder types to
 build the akka.stream.impl.Traversal (we will discuss these next). One of the differences between the two
 builders are their approach to port mapping.

 The simpler case is the akka.stream.impl.LinearTraversalBuilder. This builder only allows building linear
 chains of operators, hence, it can only have at most one [OutPort](OutPort.html) and [InPort](InPort.html) unwired. Since there is no
 possible ambiguity between these two port types, there is no need for port mapping for these. Conversely,
 for those internal ports that are already wired, there is no need for port mapping as their relative wiring
 is not ambiguous (see previous section). As a result, the akka.stream.impl.LinearTraversalBuilder does not
 use any port mapping.

 The generic graph builder class akka.stream.impl.CompositeTraversalBuilder needs port mapping as it allows
 adding any kind of builders in any order. When adding a module (encoded as another akka.stream.impl.TraversalBuilder)
 there are two entities in play:

 \* The module (builder) to be added. This builder has a few ports unwired which are usually packaged in a [Shape](Shape.html)
 which is stored alongside with the builder in the [Graph](Graph.html) of the DSL. When invoking methods on this builder
 these set of ports must be used.
 \* The module that we are growing. This module needs a new set of ports to be used as it might add this module
 multiple times and needs to disambiguate these ports.

 Adding to the akka.stream.impl.CompositeTraversalBuilder involves the following steps (pseudocode):

 val newShape \= shape.deepCopy() // Copy the shape of the module we want to add
 val newBuilder \= builder.add(submodule, newShape) // Add the module, and register it with the new shape
 newBuilder.wire(newShape.in, ...) // Use the new ports to wire

 What happens in the background is that [Shape.deepCopy](Shape.html#deepCopy():akka.stream.Shape) creates copies of the ports, and fills their
 mappedTo field to point to their original port counterpart. Whenever we call wire in the outer module, it
 delegates calls to the submodule, but using the original port (as the submodule builder has no knowledge of
 the external mapping):

 submodule.assign(port.mappedTo, ...) // enclosing module delegating to submodule, translating ports back

 Visualizing this relationship:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| in', in" \-\-\-\-\-\-\-\-\-\+ \| in' and in" both resolve to in
 \| \| .mappedTo v .mappedTo \| but they will be used on \_different\_ builders
 \| \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \|
 \| \| in \| \| in \| \| (delegation happens recursively in AddedModule)
 \| \| AddedModule \| \| AddedModule \| \|

 It is worth to note that the submodule might also continue this map\-and\-delegate chain to further submodules until
 a builder is reached that can directly perform the operation. In other words, the depth of nesting is equal to
 the length of mappedTo chaining.

 IMPORTANT: When wiring in the enclosing module the new ports/shape MUST be used, using the original ports/shape
 will lead to incorrect state.

#### TraversalBuilders

 In order to understand why builders are needed, consider wiring two ports together. Actually, we don't need to
 wire input ports anywhere. Their slot is implicitly assigned by their position in the traversal, there is no
 additional state we need to track. On the other hand, we cannot build a akka.stream.impl.MaterializeAtomic
 node until the mapping array outToSlots is fully calculated. In other words, in reality, we don't wire input ports
 anywhere, we only assign output ports to slots. The builders exist mainly to keep track all the necessary
 information to be able to assign output ports, build the outToSlots array and finally the akka.stream.impl.MaterializeAtomic
 node. The consequence of this that a akka.stream.impl.Traversal can be constructed as soon as all output ports
 are wired ("unwired" inputs don't matter).

 There is a specific builder that is used for the cases where all outputs have been wired:
 akka.stream.impl.CompletedTraversalBuilder. This builder type simply contains the completed traversal plus
 some additional data. The reason why this builder type exists is to keep auxiliary data structures required for
 output port mapping only while they are needed, and shed them as soon as they are not needed anymore. Since builders
 may recursively contain other builders, as soon as internals are completed those contained builders transition
 to completed state and drop all additional data structures. This is very GC friendly as many intermediate graphs
 exist only in a method call, and hence most of the additional data structures are dropped before method return and
 can be efficiently collected by the GC.

 The most generic builder is akka.stream.impl.CompositeTraversalBuilder. There are two main considerations
 this builder needs to consider:

 \* Enclosed modules (builders) must have a stable position in the final traversal for relative addressing to work.
 Since module offsets are calculated by traversal position, and outputs are wired relative to module offset, this
 is critical.
 \* Enclosed builders might not be complete yet (i.e. have unwired outputs) and hence they cannot immediately give
 a Traversal.

 The composite builder keeps a temporary list of traversal steps (in reverse order because of immutable lists)
 it needs to create once it is completed (all outputs wired). These steps refer to the traversal of submodules
 as a akka.stream.impl.BuilderKey which is just a placeholder where the traversal of the submodule will be
 stitched in. This akka.stream.impl.BuilderKey is also a key to a map which contains the evolving builder.
 The importance of this "preimage" traversal is that it keeps position of submodules stable, making relative
 addressing possible.

 Once the composite is completed, it takes these steps (now reversing it back to normal), and builds the traversal
 using the submodule traversals referred to by akka.stream.impl.BuilderKey. Note that at this point all the
 submodules are akka.stream.impl.CompletedTraversalBuilders because there are no unwired outputs and hence the
 Traversal can be assembled. As the builder evolves over time, more and more of its akka.stream.impl.BuilderKeys
 will refer to akka.stream.impl.CompletedTraversalBuilders, shedding much of the temporary data structures.

 Refer to akka.stream.impl.CompositeTraversalBuilder for more details.

 The akka.stream.impl.LinearTraversalBuilder is a much simpler beast. For efficiency, it tries to work as much
 as possible directly on the akka.stream.impl.Traversal avoiding auxiliary structures. The two main considerations
 for this builder are:

 \* [akka.stream.scaladsl.Source](scaladsl/Source.html) and [akka.stream.scaladsl.Flow](scaladsl/Flow.html) contain an unwired output port. Yet, we would
 like to build the traversal directly as much as possible, even though the builder is not yet completed
 \* akka.stream.impl.CompositeTraversalBuilders might be included in a linear chain. These cannot provide a
 traversal before they are fully completed.

 The linear builder, although it is one class, comes in basically two flavors:

 \* Purely linear builder: this contains only other linear builders, or all the composites that it includes
 have been fully wired before and hence their traversal is now fully incorporated. Basically this kind
 of builder only contains the akka.stream.impl.Traversal and only a couple of extra fields.
 \* Linear builder with an incomplete composite at the end (output): In this case, we have an incomplete composite.
 It can only be at the end, since this is the only position where an output port can be unwired. We need to
 carry this builder with us until the output port is finally wired, in which case we incorporate its traversal
 into the already complete one, and hopefully transition to a purely linear builder.

 If we consider the purely linear case, we still need to figure out how can we provide a traversal even though
 the last output port is unwired. The trick that is used is to wire this output port optimistically to the
 relative address \-1 which is almost always correct (why \-1? explained a bit later). If it turns out to be incorrect
 later, we fix it by the helper method akka.stream.impl.Traversal.rewireFirstTo which tears down the traversal
 until the wrong module is found, then fixes the port assignment. This is only possible on purely linear layouts though.
 Again, this is an example of the 90% rule. Most appends will not need this rewiring and hence be as fast as possible
 while the rarer cases suffering a minor penalty.

 In the case where the last module is a composite, the above trick would not work as nothing guarantees that the
 module that exposed its output port is at an expected position in the traversal. Instead, we simply keep around
 this composite and delay construction of its part of the traversal. For details see akka.stream.impl.LinearTraversalBuilder
 as these cases are heavily commented and explained in the code.

 There is another peculiarity of the linear builder we need to explain. Namely, it builds the traversal in reverse
 order, i.e. from Sinks towards Sources. THIS CAN BE SUPER CONFUSING AT TIMES SO PAY ATTENTION! There are two
 important reasons why this is needed:

 \* Prepending to immutable lists is more efficient. Even though we encode our traversal list as a tree, we would
 need stack space at materialization time as much as the length of the list if we would append to it instead of
 prepending.
 \* Prepending means that most output ports refer to slots visited before, i.e. output relative offsets are negative.
 This means that during materialization, output ports will be wired to slots that the materializer visited before
 which enables an efficient one\-pass materialization design. The importance of this is discussed later below.

 To visualize this, imagine a simple stream:

 \[Source.out] \-\> \[Map.in, Map.out] \-\> \[Sink.in]

 The traversal:

 offs \= 0 offs \= 1 offs \= 1
 \[Sink.in \= 0] \<\- \[Map.in \= 1, Map.out \= \-1] \<\- \[Source.out \= \-1]

 Since the traversal steps are reversed compared to the DSL order, it is important to reverse materialized value
 computation, too.

#### Islands and local slots

 All what we have discussed so far referred to the "mental array", the global address space in which slots
 are assigned to ports. This model describes the wiring of the graph perfectly, but it does not map to the local
 data structures needed by materialization when there are islands present. One of the important goals of this
 layout data structure is to be able to produce the data structures used by the akka.stream.impl.fusing.GraphInterpreter
 directly, without much translation. Unfortunately if there is an island inside a traversal, it might leave gaps
 in the address space:

 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 Since we visit Island2 before returning to Island1, the naive approach would leave a large gap between the last
 input port visited before entering Island2 and the first input port visited when returning to Island1\. What
 we would like to have instead is a contiguous slot assignment from the viewpoint of Island1\. This is where
 akka.stream.impl.PhasedFusingActorMaterializer and its akka.stream.impl.IslandTracking helper comes into
 the picture. These classes do the heavy\-lifting of traversing the traversal and then mapping global slots to
 slots local to the island, delegating then the local wiring to akka.stream.impl.PhaseIsland implementations.
 For example the akka.stream.impl.GraphStageIsland sees only a contigous slot\-space and hence it can directly
 construct the array for the interpreter. It is not aware of the presence of other islands or how it is represented
 in the global slot\-space.

#### Materialization

 Materialzation is orchestrated by the akka.stream.impl.PhasedFusingActorMaterializer. It basically decodes the
 traversal and handles islands. This top\-level materializer does not really handle the wiring \_inside\_ an island,
 it only handles wiring of Publishers and Subscribers that connect islands. Instead it delegates in\-island wiring
 to akka.stream.impl.PhaseIslands. For example a default fused island will be actually wired by
 akka.stream.impl.GraphStageIsland.

 First, look at a traversal that has two islands:

 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 In this traversal, we have two islands, and three, so called \_segments\_. Segments are simply contiguous range of
 slots between akka.stream.impl.EnterIsland or akka.stream.impl.ExitIsland tags (in any combination). When
 the materializer encounters either an enter or exit command, it saves various information about the segment it
 just completed (what is its offset, how long it is measured in input slots, etc.). This information is later
 used to figure out if a wiring crosses island boundaries or is it local to the island.

 It is important to note that the data structure for this is only allocated when there are islands. This is again
 the 90% rule in action. In addition, these data structures are [java.util.ArrayList](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html) instances, where lookups
 according to some value are implemented as simple linear scans. Since in 90% of the cases these structures are
 very short, this is the most efficient approach. Cases where this can be a performance problem are very\-very special
 and likely not happen in practice (no graph should contain more than a dozen of islands for example).

 When it comes to deciding whether a wiring is cross\-island or local, there are two cases possible:

 \* we encountered an output port that is wired backwards (relative address is negative). In this case we already
 have all the data necessary to resolve the question.
 \* we encountered an output port that is wired forward (relative address is positive). In this case we have not
 yet visited that part of the traversal where the assignment points.

 If we want to keep the one\-pass design of the materializer, we need to delay forward wirings until we have all
 the information needed, i.e. we visit the target in port. The akka.stream.impl.PhasedFusingActorMaterializer
 has a data structure for tracking forward wires which it consults whenever it visits an input port. Again, this
 is only allocated if needed, and it is again an array with linear scan lookup. Once the target input port have
 been found, the rules of the wiring are the same as for backwards wiring.

 backward wire (to the visited part) \<\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\> forward wire (into the unknown)
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\-\-\-\- ... (this is where we are now)

 Remember, the akka.stream.impl.LinearTraversalBuilder builds its akka.stream.impl.Traversal in backwards
 order, so since most of the graphs are constructed by the linear DSLs almost all wirings will be backwards
 (90% rule in action again).

##### Backward wirings

 When it comes to resolving wirings and calculating the local slots for all the islands involved there are three
 distinct cases.

 A wiring can be in\-segment:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 This means that the slot assigned to the output port still belongs to the current segment. This is easy to detect
 as the akka.stream.impl.IslandTracking class tracks the offset of the current segment. If the target input
 slot is larger or equal than this offset, and the wiring is backwards, then the wiring is strictly local to the
 island. The materializer will simply delegate to the akka.stream.impl.PhaseIsland to do the internal wiring.
 Since we know the offset of the segment in the local space of this island, calculating the local slot for the
 akka.stream.impl.PhaseIsland is simple. (This is fully documented with diagrams
 in akka.stream.impl.IslandTracking)

 A wiring can be cross\-segment, in\-island:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 In this case, the target slot is in another, but already visited segment. The akka.stream.impl.IslandTracking
 class needs to first find the segment in which the target slot is. Since each segment keeps a reference to its
 akka.stream.impl.PhaseIsland instance that handles the internal wiring a simple reference equality check
 will tell us if the target segment is in the same island or not. In this case it is, so all we need is to
 compensate for any possible holes (punched by enclosed islands) to calculate the local slot for the island
 and call the appropriate callback on the akka.stream.impl.PhaseIsland. (This is fully documented with diagrams
 in akka.stream.impl.IslandTracking)

 Finally a wiring can be cross\-segment, cross\-island:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 This means, that the steps were similar as in the previous case until that point where we check the reference
 equality of the current akka.stream.impl.PhaseIsland with that of the target segment (we have already found
 the target segment). In this case, we need to calculate the local slot in the target island (similar to the
 previous case) and try to wire the two islands together. Now, instead of delegating the wiring to the phases, we
 ask the output akka.stream.impl.PhaseIsland to provide a Publisher and then we ask the target island to
 take this Publisher.

 Refer to akka.stream.impl.IslandTracking for all the nasty details of local slot resolution. It is also
 recommended to try out a few examples with akka.stream.impl.PhasedFusingActorMaterializer.Debug turned on, it
 will detail every step of the island tracking and slot resolution steps.

#### Utilities

 Useful utilities are:

 \* akka.stream.impl.PhasedFusingActorMaterializer.Debug: if this flag is turned on, the materializer will
 log the steps it takes
 \* akka.stream.impl.TraversalBuilder.printTraversal: Prints the Traversal in a readable format
 \* akka.stream.impl.TraversalBuilder.printWiring: Prints the calculated port assignments. Useful for
 debugging if everything is wired to the right thing.
- [**](../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../akka/stream/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html "Scala API: The flow DSL allows the formulation of stream transformations based on some input.")Scala API: The flow DSL allows the formulation of stream transformations based on some
input.

Scala API: The flow DSL allows the formulation of stream transformations based on some
input. The starting point is called [Source](scaladsl/Source.html) and can be a collection, an iterator,
a block of code which is evaluated repeatedly or a org.reactivestreams.Publisher.
A flow with an attached input and open output is also a [Source](scaladsl/Source.html).

A flow may also be defined without an attached input or output and that is then
a [Flow](scaladsl/Flow.html). The `Flow` can be connected to the `Source` later by using [Source\#via](scaladsl/Source.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T]) with
the flow as argument, and it remains a [Source](scaladsl/Source.html).

Transformations can be appended to `Source` and `Flow` with the operations
defined in [FlowOps](scaladsl/FlowOps.html). Each DSL element produces a new flow that can be further transformed,
building up a description of the complete transformation pipeline.

The termination point of a flow is called [Sink](scaladsl/Sink.html) and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a [Sink](scaladsl/Sink.html).

If a flow has both an attached input and an attached output it becomes a [RunnableGraph](scaladsl/RunnableGraph.html).
In order to execute this pipeline the flow must be materialized by calling [RunnableGraph\#run](scaladsl/RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat) on it.

You can create your `Source`, `Flow` and `Sink` in any order and then wire them together before
they are materialized by connecting them using [Flow\#via](scaladsl/Flow.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Flow.this.Repr[T]) and [Flow\#to](scaladsl/Flow.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.Sink[In,Mat]), or connecting them into a
[GraphDSL](scaladsl/GraphDSL$.html) with fan\-in and fan\-out elements.

See [Reactive Streams](https://github.com/reactive-streams/reactive-streams/) for
details on org.reactivestreams.Publisher and org.reactivestreams.Subscriber.

It should be noted that the streams modeled by this library are “hot”,
meaning that they asynchronously flow through a series of processors without
detailed control by the user. In particular it is not predictable how many
elements a given transformation step might buffer before handing elements
downstream, which means that transformation functions may be invoked more
often than for corresponding transformations on strict collections like
List. \*An important consequence\* is that elements that were produced
into a stream may be discarded by later processors, e.g. when using the
\#take operator.

By default every operation is executed within its own [akka.actor.Actor](../actor/Actor.html)
to enable full pipelining of the chained set of computations. This behavior
is determined by the [akka.stream.Materializer](Materializer.html) which is required
by those methods that materialize the Flow into a series of
org.reactivestreams.Processor instances. The returned reactive stream
is fully started and active.
- [**](../../akka/stream/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)
- [**](../../akka/stream/stage/index.html "Permalink")  package [stage](stage/index.html)
- [**](../../akka/stream/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [**](../../akka/stream/typed/index.html "Permalink")  package [typed](typed/index.html)
- [AbruptIOTerminationException](AbruptIOTerminationException.html "This exception signals that a stream has been completed by an onError signal while there was still IO operations in progress.")
- [AbruptStageTerminationException](AbruptStageTerminationException.html "Signal that the operator was abruptly terminated, usually seen as a call to postStop of the GraphStageLogic without any of the handler callbacks seeing completion or failure from upstream or cancellation from downstream.")
- [AbruptStreamTerminationException](AbruptStreamTerminationException.html "A base exception for abrupt stream termination.")
- [AbruptTerminationException](AbruptTerminationException.html "This exception signals that an actor implementing a Reactive Streams Subscriber, Publisher or Processor has been terminated without being notified by an onError, onComplete or cancel signal.")
- [AbstractShape](AbstractShape.html "Java API for creating custom Shape types.")
- [ActorAttributes](ActorAttributes$.html "Attributes for the Materializer.")
- [ActorMaterializer](ActorMaterializer.html "An ActorMaterializer takes a stream blueprint and turns it into a running stream.")
- [ActorMaterializerSettings](ActorMaterializerSettings.html "This class describes the configurable properties of the ActorMaterializer.")
- [AmorphousShape](AmorphousShape.html "This type of Shape can express any number of inputs and outputs at the expense of forgetting about their specific types.")
- [Attributes](Attributes.html "Holds attributes which can be used to alter akka.stream.scaladsl.Flow / akka.stream.javadsl.Flow or akka.stream.scaladsl.GraphDSL / akka.stream.javadsl.GraphDSL materialization.")
- [BackpressureTimeoutException](BackpressureTimeoutException.html)
- [BidiShape](BidiShape.html "A bidirectional flow of elements that consequently has two inputs and two outputs, arranged like this:")
- [BindFailedException](BindFailedException.html)
- [BoundedSourceQueue](BoundedSourceQueue.html "A queue of the given size that gives immediate feedback whether an element could be enqueued or not.")
- [BufferOverflowException](BufferOverflowException.html)
- [Client](Client.html "The client is usually the side that consumes the service provided by its interlocutor.")
- [ClosedShape](ClosedShape.html "This Shape is used for graphs that have neither open inputs nor open outputs.")
- [CompletionStrategy](CompletionStrategy.html)
- [CompletionTimeoutException](CompletionTimeoutException.html)
- [ConnectionException](ConnectionException.html)
- [DelayOverflowStrategy](DelayOverflowStrategy.html "Represents a strategy that decides how to deal with a buffer of time based operator that is full but is about to receive a new element.")
- [EagerClose](EagerClose.html "see TLSClosing")
- [FanInShape](FanInShape.html)
- [FanInShape10](FanInShape10.html)
- [FanInShape11](FanInShape11.html)
- [FanInShape12](FanInShape12.html)
- [FanInShape13](FanInShape13.html)
- [FanInShape14](FanInShape14.html)
- [FanInShape15](FanInShape15.html)
- [FanInShape16](FanInShape16.html)
- [FanInShape17](FanInShape17.html)
- [FanInShape18](FanInShape18.html)
- [FanInShape19](FanInShape19.html)
- [FanInShape2](FanInShape2.html)
- [FanInShape20](FanInShape20.html)
- [FanInShape21](FanInShape21.html)
- [FanInShape22](FanInShape22.html)
- [FanInShape3](FanInShape3.html)
- [FanInShape4](FanInShape4.html)
- [FanInShape5](FanInShape5.html)
- [FanInShape6](FanInShape6.html)
- [FanInShape7](FanInShape7.html)
- [FanInShape8](FanInShape8.html)
- [FanInShape9](FanInShape9.html)
- [FanOutShape](FanOutShape.html)
- [FanOutShape10](FanOutShape10.html)
- [FanOutShape11](FanOutShape11.html)
- [FanOutShape12](FanOutShape12.html)
- [FanOutShape13](FanOutShape13.html)
- [FanOutShape14](FanOutShape14.html)
- [FanOutShape15](FanOutShape15.html)
- [FanOutShape16](FanOutShape16.html)
- [FanOutShape17](FanOutShape17.html)
- [FanOutShape18](FanOutShape18.html)
- [FanOutShape19](FanOutShape19.html)
- [FanOutShape2](FanOutShape2.html)
- [FanOutShape20](FanOutShape20.html)
- [FanOutShape21](FanOutShape21.html)
- [FanOutShape22](FanOutShape22.html)
- [FanOutShape3](FanOutShape3.html)
- [FanOutShape4](FanOutShape4.html)
- [FanOutShape5](FanOutShape5.html)
- [FanOutShape6](FanOutShape6.html)
- [FanOutShape7](FanOutShape7.html)
- [FanOutShape8](FanOutShape8.html)
- [FanOutShape9](FanOutShape9.html)
- [FlowMonitor](FlowMonitor.html "Used to monitor the state of a stream")
- [FlowMonitorState](FlowMonitorState$.html)
- [FlowShape](FlowShape.html "A Flow Shape has exactly one input and one output, it looks from the outside like a pipe (but it can be a complex topology of streams within of course).")
- [Graph](Graph.html "Not intended to be directly extended by user classes")
- [IOOperationIncompleteException](IOOperationIncompleteException.html "This exception signals that a stream has been completed or has an error while there was still IO operations in progress")
- [IOResult](IOResult.html "Holds a result of an IO operation.")
- [IOSettings](IOSettings.html)
- [IgnoreBoth](IgnoreBoth.html "see TLSClosing")
- [IgnoreCancel](IgnoreCancel.html "see TLSClosing")
- [IgnoreComplete](IgnoreComplete.html "see TLSClosing")
- [InPort](InPort.html "An input port of a StreamLayout.Module.")
- [InitialTimeoutException](InitialTimeoutException.html)
- [Inlet](Inlet.html)
- [InvalidPartnerActorException](InvalidPartnerActorException.html "Stream refs establish a connection between a local and remote actor, representing the origin and remote sides of a stream.")
- [InvalidSequenceNumberException](InvalidSequenceNumberException.html)
- [KillSwitch](KillSwitch.html "A KillSwitch allows completion of Graphs from the outside by completing Graphs of FlowShape linked to the switch.")
- [KillSwitches](KillSwitches$.html "Creates shared or single kill switches which can be used to control completion of graphs from the outside.")
- [MaterializationException](MaterializationException.html "This exception or subtypes thereof should be used to signal materialization failures.")
- [Materializer](Materializer.html "The Materializer is the component responsible for turning a stream blueprint into a running stream.")
- [MaterializerLoggingProvider](MaterializerLoggingProvider.html "Not for user extension")
- [NeverMaterializedException](NeverMaterializedException.html)
- [OutPort](OutPort.html "An output port of a StreamLayout.Module.")
- [Outlet](Outlet.html)
- [OverflowStrategy](OverflowStrategy.html "Represents a strategy that decides how to deal with a buffer that is full but is about to receive a new element.")
- [QueueCompletionResult](QueueCompletionResult.html "Not for user extension")
- [QueueOfferResult](QueueOfferResult.html "Not for user extension")
- [RateExceededException](RateExceededException.html "Exception that is thrown when rated controlled by stream is exceeded")
- [RemoteStreamRefActorTerminatedException](RemoteStreamRefActorTerminatedException.html)
- [RestartSettings](RestartSettings.html)
- [Server](Server.html "The server is usually the side the provides the service to its interlocutor.")
- [Shape](Shape.html "A Shape describes the inlets and outlets of a Graph.")
- [SharedKillSwitch](SharedKillSwitch.html "A SharedKillSwitch is a provider for Graphs of FlowShape that can be completed or failed from the outside.")
- [SinkRef](SinkRef.html "A SinkRef allows sharing a \"reference\" to a Sink with others, with the main purpose of crossing a network boundary.")
- [SinkShape](SinkShape.html "A Sink Shape has exactly one input and no outputs, it models a data sink.")
- [SourceRef](SourceRef.html "A SourceRef allows sharing a \"reference\" with others, with the main purpose of crossing a network boundary.")
- [SourceShape](SourceShape.html "A Source Shape has exactly one output and no inputs, it models a source of data.")
- [StreamDetachedException](StreamDetachedException.html "This exception signals that materialized value is already detached from stream.")
- [StreamIdleTimeoutException](StreamIdleTimeoutException.html)
- [StreamLimitReachedException](StreamLimitReachedException.html)
- [StreamRefAttributes](StreamRefAttributes$.html "Attributes for stream refs (akka.stream.SourceRef and akka.stream.SinkRef).")
- [StreamRefMessages](StreamRefMessages.html)
- [StreamRefResolver](StreamRefResolver.html "The stream ref resolver provides a way to serialize and deserialize streamrefs in user serializers.")
- [StreamRefSettings](StreamRefSettings.html "Settings specific to SourceRef and SinkRef.")
- [StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html)
- [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "Leaked publishers and subscribers are cleaned up when they are not used within a given deadline, configured by StreamSubscriptionTimeoutSettings.")
- [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "This mode describes what shall happen when the subscription timeout expires for substream Publishers created by operations like prefixAndTail.")
- [StreamTcpException](StreamTcpException.html)
- [StreamTimeoutException](StreamTimeoutException.html "Base class for timeout exceptions specific to Akka Streams")
- [SubscriptionWithCancelException](SubscriptionWithCancelException.html "Extension of Subscription that allows to pass a cause when a subscription is cancelled.")
- [SubstreamCancelStrategy](SubstreamCancelStrategy.html "Represents a strategy that decides how to deal with substream events.")
- [Supervision](Supervision$.html)
- [SystemMaterializer](SystemMaterializer.html)
- [TLSClientAuth](TLSClientAuth.html "An SSLEngine can either demand, allow or ignore its peer’s authentication (via certificates), where Need will fail the handshake if the peer does not provide valid credentials, Want allows the peer to send credentials and verifies them if provided, and None disables peer certificate verification.")
- [TLSClosing](TLSClosing.html "All streams in Akka are unidirectional: while in a complex flow graph data may flow in multiple directions these individual flows are independent from each other.")
- [TLSProtocol](TLSProtocol$.html)
- [TLSRole](TLSRole.html)
- [TargetRefNotInitializedYetException](TargetRefNotInitializedYetException.html)
- [ThrottleMode](ThrottleMode.html "Represents a mode that decides how to deal exceed rate for Throttle operator")
- [TooManySubstreamsOpenException](TooManySubstreamsOpenException.html "This exception signals that the maximum number of substreams declared has been exceeded.")
- [UniformFanInShape](UniformFanInShape.html)
- [UniformFanOutShape](UniformFanOutShape.html)
- [UniqueKillSwitch](UniqueKillSwitch.html "A UniqueKillSwitch is always a result of a materialization (unlike SharedKillSwitch which is constructed before any materialization) and it always controls that graph and operator which yielded the materialized value.")
- [WatchedActorTerminatedException](WatchedActorTerminatedException.html "Used as failure exception by an ask operator if the target actor terminates.")
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[akka](../index.html)
- [**](../../akka/util/index.html "Permalink")  package [util](../util/index.html)Definition Classes[akka](../index.html)
p[akka](../index.html)

# stream[**](../../akka/stream/index.html "Permalink")

#### package stream

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/stream/impl/index.html "Permalink")  package [impl](impl/index.html "The architecture of Akka Streams internally consists of several distinct layers:")The architecture of Akka Streams internally consists of several distinct layers:

The architecture of Akka Streams internally consists of several distinct layers:

 \* The DSLs like [akka.stream.scaladsl.Flow](scaladsl/Flow.html), [akka.stream.scaladsl.Source](scaladsl/Source.html) etc. are the user facing API
 for composing streams. These DSLs are a thin wrappers around the internal akka.stream.impl.TraversalBuilder
 builder classes. There are Java alternatives of these DSLs in [javadsl](javadsl/index.html) which basically wrap their scala
 counterpart, delegating method calls.
 \* The [akka.stream.stage.GraphStage](stage/GraphStage.html) API is the user facing API for creating new stream operators. These
 classes are used by the akka.stream.impl.fusing.GraphInterpreter which executes islands (subgraphs) of these
 operators
 \* The high level DSLs use the akka.stream.impl.TraversalBuilder classes to build instances of
 akka.stream.impl.Traversal which are the representation of a materializable stream description. These builders
 are immutable and safely shareable. Unlike the top\-level DSLs, these are classic, i.e. elements are treated as
 Any.
 \* The akka.stream.impl.Traversal is the immutable, efficient representation of a stream processing graph that
 can be materialized. The builders exists solely for the purpose of producing a traversal in the end.
 \* The akka.stream.impl.PhasedFusingActorMaterializer is the class that is responsible for traversing and
 interpreting a akka.stream.impl.Traversal. It delegates the actual task of creating executable entities
 and Publishers/Producers to akka.stream.impl.PhaseIslands which are plugins that understand atomic operators
 in the graph and able to turn them into executable entities.
 \* The akka.stream.impl.fusing.GraphInterpreter and its actor backed wrapper akka.stream.impl.fusing.ActorGraphInterpreter
 are used to execute synchronous islands (subgraphs) of [akka.stream.stage.GraphStage](stage/GraphStage.html)s.

For the execution layer, refer to akka.stream.impl.fusing.GraphInterpreter.

#### Design goals

The central piece for both the DSLs and materialization is the akka.stream.impl.Traversal. This is the
representation of an Akka Stream, basically a [akka.stream.scaladsl.RunnableGraph](scaladsl/RunnableGraph.html). The design goals
for akka.stream.impl.Traversal are:

 \* Be able to materialize a graph in one pass over the traversal
 \* Unify materialization and fusing. The materializer should be able to construct all the necessary data structures
 for the interpreters and for connecting them in one go.
 \* Avoid allocations as much as possible.
 \* Biased implementation for the 90% case. Common cases should be as fast as possible:
 \* wiring linear chains should be very fast.
 \* assume that most graphs are mostly linear, with only a few generalized graph constructs thrown in.
 \* materialization should not pay the price of island tracking if there is only a single island
 \* assume that the number of islands is low in general
 \* avoid "copiedModule" i.e. wrappers that exist solely for the purpose of establishing new port identities
 for operators that are used multiple times in the same graph.
 \* Avoid hashmaps and prefer direct array lookup wherever possible

Semantically, a traversal is a list of commands that the materializer must execute to turn the description to a
running stream. In fact, the traversal is nothing more than an immutable list, that is expressed as a tree. A
tree is used to make immutable appends fast (immutable lists only have prepend as O(1\) operation, append is O(N)).
The materializer "recovers" the original sequence by using a local, mutable stack to properly traverse the tree
structure. This is way cheaper than to immutably append to the traversal at each addition.

The "tree\-ness" is expressed by explicit akka.stream.impl.Concat nodes that express that two traversals
need to be traversed in a certain sequence, stashing away the second on a local stack until the first is fully
traversed.

While traversing the traversal (basically following Concat nodes), the materializer will visit the following
command types:

 \* akka.stream.impl.MaterializeAtomic: An atomic module needs to be materialized. This node also contains
 wiring information which we discuss later.
 \* Materialized value computation. This is a stack based "sublanguage" to compute the final materialized value
 on a stack, maintained by the materializer
 \* akka.stream.impl.PushNotUsed push a NotUsed value on the stack
 \* akka.stream.impl.Pop pop the top of the stack and throw away
 \* akka.stream.impl.Transform take the top of the stack, transform it with the provided function and put
 the result back on the top of the stack
 \* akka.stream.impl.Compose take the top two values of the stack, invoke the provided function with these
 values as arguments, then put the calculated value on the top of the stack
 \* Materialized values of atomic operators when visiting a akka.stream.impl.MaterializeAtomic must be
 pushed to the stack automatically. There are no explicit PUSH commands for this
 \* Attributes calculation. These also are a stack language, although much simpler than the materialized value
 commands. For any materialized operator, the top of the attributes stack should be provided as the current
 effective attributes.
 \* akka.stream.impl.PushAttributes combines the attributes on the top of the stack with the given ones and
 puts the result on the attributes stack
 \* akka.stream.impl.PopAttributes removes the top of the attributes stack.
 \* Island tracking. Islands serve two purposes. First, they allow a large graph to be cut into parts that execute
 concurrently with each other, using asynchronous message passing between themselves. Second, they are an
 extension point where "plugins" (akka.stream.impl.PhaseIsland) can be used to specially handle subgraphs.
 Islands can be nested in each other. This makes "holes" in the parent island. Islands also need a stack
 as exiting a "hole" means returning to the parent, enclosing island and continuing where left.
 \* akka.stream.impl.EnterIsland instructs the materializer that the following commands will belong to
 the materialization of a new island (a subgraph). The akka.stream.impl.IslandTag signals to
 the materializer which akka.stream.impl.PhaseIsland should be used to turn operators of this island into
 executable entities.
 \* akka.stream.impl.ExitIsland instructs the materializer that the current island is done and the parent
 island is now the active one again.

 Please note that the stack based materialized value computation eliminates the issues present in the older
 materializer which expressed these computations as an AST. We had to use optimizations for this tree so that
 long Keep.left chains don't explode the stack visiting a large AST. The stack based language sidesteps this issue
 completely as the number of these commands don't increase the stack space required to execute them, unless the
 computation itself requires it (which is not the case in any sane stream combination).

#### Graph model, offsets, slots

 As a mental model, the wiring part of the Traversal (i.e. excluding the stack based sub\-commands tracking
 materialized values, attributes, islands, i.e. things that don't contribute to the wiring structure of the graph)
 translates everything to a single, global, contiguous Array. Every input and output port of each operator is mapped
 to exactly one slot of this "mental array". Input and output ports that are considered wired together simply map
 to the same slot. (In practice, these slots might not be mapped to an actual global array, but multiple local arrays
 using some translation logic, but we will explain this later)

 Input ports are mapped simply to contiguous numbers in the order they are visited. Take for example a simple
 traversal:

 Operator1\[in1, in2, out] \- Operator2\[out] \- Operator3\[in]

 This results in the following slot assignments:

 \* Operator1\.in1 \-\> 0
 \* Operator1\.in2 \-\> 1
 \* Operator3\.in \-\> 2

 The materializer simply visits Stage1, Stage2, Stage3 in order, visiting the input ports of each operator in order.
 It then simply assigns numbers from a counter that is incremented after visiting an input port.
 (Please note that all akka.stream.impl.StreamLayout.AtomicModules maintain a stable order of their ports, so
 this global ordering is well defined)

 Before explaining how output wiring works, it is important to settle some terminology. When we talk about ports
 we refer to their location in the "mental array" as slots. However, there are other entities that needs to
 reference various positions in this "mental array", but in these cases we use the term \_offset\_ to signify that
 these are only used for bookkeeping, they have no "place" in the "array" themselves. In particular:

 \* offset of a module: The offset of an akka.stream.impl.StreamLayout.AtomicModule is defined as the value of
 the input port counter when visiting the akka.stream.impl.MaterializeAtomic node to materialize that module.
 In other words, the offset of a module is the slot of its first input port (if there is any). Since modules
 might not have any input ports it can be that different modules share the same offset, simply because the
 the first one visited does not increase the input port counter.
 \* offset of segments, islands: Defined similarly to module. The offset of an island or a segment is simply the
 value of the input port counter (or the first unallocated slot).

 For example:

 Module1\[in1 \= 0, in2 \= 1] \- Module2\[out] \- Module3\[in \= 2]

 The offset of Module1 is 0, while Module2 and Module3 share the same offset of 2\. Note that only input ports (slots)
 contribute to the offset of a module in a traversal.

 Output ports are wired relative to the offset of the module they are contained in. When the materializer visits
 a akka.stream.impl.MaterializeAtomic node, it contains an Array that maps ports to a relative offset. To
 calculate the slot that is assigned to an output port the following formula is used:

 slot \= offsetOfModule \+ outToSlots(out.id)

 Where outToSlots is the array contained in the akka.stream.impl.MaterializeAtomic node.

#### Relative addressing

 The power of this structure comes from the fact that slots are assigned in a relative manner:

 \* input ports are assigned in sequence so the slots assigned to the input ports of a subgraph depend on the
 subgraph's position in the traversal
 \* output ports are assigned relative to the offset of their owner module, which is in turn relative to its first
 (potential) input port (which is relative, too, because of the previous point)

 This setup allows combining subgraphs without touching their internal wirings as all their internal wirings will
 properly resolve due to everything being relative:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\+
 \| \| \| \|
 \|\-\-\-\-\-\-\-\-\-Graph1\-\-\-\-\-\-\-\-\-\|\-\-\- .... \-\-\-\|\-\-\-\-Graph2\-\-\-\-\|

 It is important to note that due to reusability, an Akka Stream graph may contain the same atomic or composite
 multiple times in the same graph. Since these must be distinguished from each other somehow, they need port mapping
 (i.e. a new set of ports) to ensure that the ports of one graph are distinguishable from another. Because how
 the traversal relative addressing works, these are \_temporary\_ though, once all internal wirings are ready, these
 mappings can be effectively dropped as the global slot assignments uniquely identify what is wired to what. For
 example since Graph1 is visited before Graph2 all of the slots or offsets it uses are different from Graph2 leaving
 no room for misinterpretation.

#### Port mapping

 Port mapping is the way how the DSL can distinguish between multiple instances of the same graph included multiple
 times. For example in the Graph DSL:

 val merge1 \= builder.add(Merge)
 val merge2 \= builder.add(Merge)

 the port merge1\.out must be different from merge2\.out.

 For efficiency reasons, the linear and graph DSLs use different akka.stream.impl.TraversalBuilder types to
 build the akka.stream.impl.Traversal (we will discuss these next). One of the differences between the two
 builders are their approach to port mapping.

 The simpler case is the akka.stream.impl.LinearTraversalBuilder. This builder only allows building linear
 chains of operators, hence, it can only have at most one [OutPort](OutPort.html) and [InPort](InPort.html) unwired. Since there is no
 possible ambiguity between these two port types, there is no need for port mapping for these. Conversely,
 for those internal ports that are already wired, there is no need for port mapping as their relative wiring
 is not ambiguous (see previous section). As a result, the akka.stream.impl.LinearTraversalBuilder does not
 use any port mapping.

 The generic graph builder class akka.stream.impl.CompositeTraversalBuilder needs port mapping as it allows
 adding any kind of builders in any order. When adding a module (encoded as another akka.stream.impl.TraversalBuilder)
 there are two entities in play:

 \* The module (builder) to be added. This builder has a few ports unwired which are usually packaged in a [Shape](Shape.html)
 which is stored alongside with the builder in the [Graph](Graph.html) of the DSL. When invoking methods on this builder
 these set of ports must be used.
 \* The module that we are growing. This module needs a new set of ports to be used as it might add this module
 multiple times and needs to disambiguate these ports.

 Adding to the akka.stream.impl.CompositeTraversalBuilder involves the following steps (pseudocode):

 val newShape \= shape.deepCopy() // Copy the shape of the module we want to add
 val newBuilder \= builder.add(submodule, newShape) // Add the module, and register it with the new shape
 newBuilder.wire(newShape.in, ...) // Use the new ports to wire

 What happens in the background is that [Shape.deepCopy](Shape.html#deepCopy():akka.stream.Shape) creates copies of the ports, and fills their
 mappedTo field to point to their original port counterpart. Whenever we call wire in the outer module, it
 delegates calls to the submodule, but using the original port (as the submodule builder has no knowledge of
 the external mapping):

 submodule.assign(port.mappedTo, ...) // enclosing module delegating to submodule, translating ports back

 Visualizing this relationship:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| in', in" \-\-\-\-\-\-\-\-\-\+ \| in' and in" both resolve to in
 \| \| .mappedTo v .mappedTo \| but they will be used on \_different\_ builders
 \| \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \|
 \| \| in \| \| in \| \| (delegation happens recursively in AddedModule)
 \| \| AddedModule \| \| AddedModule \| \|

 It is worth to note that the submodule might also continue this map\-and\-delegate chain to further submodules until
 a builder is reached that can directly perform the operation. In other words, the depth of nesting is equal to
 the length of mappedTo chaining.

 IMPORTANT: When wiring in the enclosing module the new ports/shape MUST be used, using the original ports/shape
 will lead to incorrect state.

#### TraversalBuilders

 In order to understand why builders are needed, consider wiring two ports together. Actually, we don't need to
 wire input ports anywhere. Their slot is implicitly assigned by their position in the traversal, there is no
 additional state we need to track. On the other hand, we cannot build a akka.stream.impl.MaterializeAtomic
 node until the mapping array outToSlots is fully calculated. In other words, in reality, we don't wire input ports
 anywhere, we only assign output ports to slots. The builders exist mainly to keep track all the necessary
 information to be able to assign output ports, build the outToSlots array and finally the akka.stream.impl.MaterializeAtomic
 node. The consequence of this that a akka.stream.impl.Traversal can be constructed as soon as all output ports
 are wired ("unwired" inputs don't matter).

 There is a specific builder that is used for the cases where all outputs have been wired:
 akka.stream.impl.CompletedTraversalBuilder. This builder type simply contains the completed traversal plus
 some additional data. The reason why this builder type exists is to keep auxiliary data structures required for
 output port mapping only while they are needed, and shed them as soon as they are not needed anymore. Since builders
 may recursively contain other builders, as soon as internals are completed those contained builders transition
 to completed state and drop all additional data structures. This is very GC friendly as many intermediate graphs
 exist only in a method call, and hence most of the additional data structures are dropped before method return and
 can be efficiently collected by the GC.

 The most generic builder is akka.stream.impl.CompositeTraversalBuilder. There are two main considerations
 this builder needs to consider:

 \* Enclosed modules (builders) must have a stable position in the final traversal for relative addressing to work.
 Since module offsets are calculated by traversal position, and outputs are wired relative to module offset, this
 is critical.
 \* Enclosed builders might not be complete yet (i.e. have unwired outputs) and hence they cannot immediately give
 a Traversal.

 The composite builder keeps a temporary list of traversal steps (in reverse order because of immutable lists)
 it needs to create once it is completed (all outputs wired). These steps refer to the traversal of submodules
 as a akka.stream.impl.BuilderKey which is just a placeholder where the traversal of the submodule will be
 stitched in. This akka.stream.impl.BuilderKey is also a key to a map which contains the evolving builder.
 The importance of this "preimage" traversal is that it keeps position of submodules stable, making relative
 addressing possible.

 Once the composite is completed, it takes these steps (now reversing it back to normal), and builds the traversal
 using the submodule traversals referred to by akka.stream.impl.BuilderKey. Note that at this point all the
 submodules are akka.stream.impl.CompletedTraversalBuilders because there are no unwired outputs and hence the
 Traversal can be assembled. As the builder evolves over time, more and more of its akka.stream.impl.BuilderKeys
 will refer to akka.stream.impl.CompletedTraversalBuilders, shedding much of the temporary data structures.

 Refer to akka.stream.impl.CompositeTraversalBuilder for more details.

 The akka.stream.impl.LinearTraversalBuilder is a much simpler beast. For efficiency, it tries to work as much
 as possible directly on the akka.stream.impl.Traversal avoiding auxiliary structures. The two main considerations
 for this builder are:

 \* [akka.stream.scaladsl.Source](scaladsl/Source.html) and [akka.stream.scaladsl.Flow](scaladsl/Flow.html) contain an unwired output port. Yet, we would
 like to build the traversal directly as much as possible, even though the builder is not yet completed
 \* akka.stream.impl.CompositeTraversalBuilders might be included in a linear chain. These cannot provide a
 traversal before they are fully completed.

 The linear builder, although it is one class, comes in basically two flavors:

 \* Purely linear builder: this contains only other linear builders, or all the composites that it includes
 have been fully wired before and hence their traversal is now fully incorporated. Basically this kind
 of builder only contains the akka.stream.impl.Traversal and only a couple of extra fields.
 \* Linear builder with an incomplete composite at the end (output): In this case, we have an incomplete composite.
 It can only be at the end, since this is the only position where an output port can be unwired. We need to
 carry this builder with us until the output port is finally wired, in which case we incorporate its traversal
 into the already complete one, and hopefully transition to a purely linear builder.

 If we consider the purely linear case, we still need to figure out how can we provide a traversal even though
 the last output port is unwired. The trick that is used is to wire this output port optimistically to the
 relative address \-1 which is almost always correct (why \-1? explained a bit later). If it turns out to be incorrect
 later, we fix it by the helper method akka.stream.impl.Traversal.rewireFirstTo which tears down the traversal
 until the wrong module is found, then fixes the port assignment. This is only possible on purely linear layouts though.
 Again, this is an example of the 90% rule. Most appends will not need this rewiring and hence be as fast as possible
 while the rarer cases suffering a minor penalty.

 In the case where the last module is a composite, the above trick would not work as nothing guarantees that the
 module that exposed its output port is at an expected position in the traversal. Instead, we simply keep around
 this composite and delay construction of its part of the traversal. For details see akka.stream.impl.LinearTraversalBuilder
 as these cases are heavily commented and explained in the code.

 There is another peculiarity of the linear builder we need to explain. Namely, it builds the traversal in reverse
 order, i.e. from Sinks towards Sources. THIS CAN BE SUPER CONFUSING AT TIMES SO PAY ATTENTION! There are two
 important reasons why this is needed:

 \* Prepending to immutable lists is more efficient. Even though we encode our traversal list as a tree, we would
 need stack space at materialization time as much as the length of the list if we would append to it instead of
 prepending.
 \* Prepending means that most output ports refer to slots visited before, i.e. output relative offsets are negative.
 This means that during materialization, output ports will be wired to slots that the materializer visited before
 which enables an efficient one\-pass materialization design. The importance of this is discussed later below.

 To visualize this, imagine a simple stream:

 \[Source.out] \-\> \[Map.in, Map.out] \-\> \[Sink.in]

 The traversal:

 offs \= 0 offs \= 1 offs \= 1
 \[Sink.in \= 0] \<\- \[Map.in \= 1, Map.out \= \-1] \<\- \[Source.out \= \-1]

 Since the traversal steps are reversed compared to the DSL order, it is important to reverse materialized value
 computation, too.

#### Islands and local slots

 All what we have discussed so far referred to the "mental array", the global address space in which slots
 are assigned to ports. This model describes the wiring of the graph perfectly, but it does not map to the local
 data structures needed by materialization when there are islands present. One of the important goals of this
 layout data structure is to be able to produce the data structures used by the akka.stream.impl.fusing.GraphInterpreter
 directly, without much translation. Unfortunately if there is an island inside a traversal, it might leave gaps
 in the address space:

 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 Since we visit Island2 before returning to Island1, the naive approach would leave a large gap between the last
 input port visited before entering Island2 and the first input port visited when returning to Island1\. What
 we would like to have instead is a contiguous slot assignment from the viewpoint of Island1\. This is where
 akka.stream.impl.PhasedFusingActorMaterializer and its akka.stream.impl.IslandTracking helper comes into
 the picture. These classes do the heavy\-lifting of traversing the traversal and then mapping global slots to
 slots local to the island, delegating then the local wiring to akka.stream.impl.PhaseIsland implementations.
 For example the akka.stream.impl.GraphStageIsland sees only a contigous slot\-space and hence it can directly
 construct the array for the interpreter. It is not aware of the presence of other islands or how it is represented
 in the global slot\-space.

#### Materialization

 Materialzation is orchestrated by the akka.stream.impl.PhasedFusingActorMaterializer. It basically decodes the
 traversal and handles islands. This top\-level materializer does not really handle the wiring \_inside\_ an island,
 it only handles wiring of Publishers and Subscribers that connect islands. Instead it delegates in\-island wiring
 to akka.stream.impl.PhaseIslands. For example a default fused island will be actually wired by
 akka.stream.impl.GraphStageIsland.

 First, look at a traversal that has two islands:

 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 In this traversal, we have two islands, and three, so called \_segments\_. Segments are simply contiguous range of
 slots between akka.stream.impl.EnterIsland or akka.stream.impl.ExitIsland tags (in any combination). When
 the materializer encounters either an enter or exit command, it saves various information about the segment it
 just completed (what is its offset, how long it is measured in input slots, etc.). This information is later
 used to figure out if a wiring crosses island boundaries or is it local to the island.

 It is important to note that the data structure for this is only allocated when there are islands. This is again
 the 90% rule in action. In addition, these data structures are [java.util.ArrayList](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html) instances, where lookups
 according to some value are implemented as simple linear scans. Since in 90% of the cases these structures are
 very short, this is the most efficient approach. Cases where this can be a performance problem are very\-very special
 and likely not happen in practice (no graph should contain more than a dozen of islands for example).

 When it comes to deciding whether a wiring is cross\-island or local, there are two cases possible:

 \* we encountered an output port that is wired backwards (relative address is negative). In this case we already
 have all the data necessary to resolve the question.
 \* we encountered an output port that is wired forward (relative address is positive). In this case we have not
 yet visited that part of the traversal where the assignment points.

 If we want to keep the one\-pass design of the materializer, we need to delay forward wirings until we have all
 the information needed, i.e. we visit the target in port. The akka.stream.impl.PhasedFusingActorMaterializer
 has a data structure for tracking forward wires which it consults whenever it visits an input port. Again, this
 is only allocated if needed, and it is again an array with linear scan lookup. Once the target input port have
 been found, the rules of the wiring are the same as for backwards wiring.

 backward wire (to the visited part) \<\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\> forward wire (into the unknown)
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\-\-\-\- ... (this is where we are now)

 Remember, the akka.stream.impl.LinearTraversalBuilder builds its akka.stream.impl.Traversal in backwards
 order, so since most of the graphs are constructed by the linear DSLs almost all wirings will be backwards
 (90% rule in action again).

##### Backward wirings

 When it comes to resolving wirings and calculating the local slots for all the islands involved there are three
 distinct cases.

 A wiring can be in\-segment:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 This means that the slot assigned to the output port still belongs to the current segment. This is easy to detect
 as the akka.stream.impl.IslandTracking class tracks the offset of the current segment. If the target input
 slot is larger or equal than this offset, and the wiring is backwards, then the wiring is strictly local to the
 island. The materializer will simply delegate to the akka.stream.impl.PhaseIsland to do the internal wiring.
 Since we know the offset of the segment in the local space of this island, calculating the local slot for the
 akka.stream.impl.PhaseIsland is simple. (This is fully documented with diagrams
 in akka.stream.impl.IslandTracking)

 A wiring can be cross\-segment, in\-island:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 In this case, the target slot is in another, but already visited segment. The akka.stream.impl.IslandTracking
 class needs to first find the segment in which the target slot is. Since each segment keeps a reference to its
 akka.stream.impl.PhaseIsland instance that handles the internal wiring a simple reference equality check
 will tell us if the target segment is in the same island or not. In this case it is, so all we need is to
 compensate for any possible holes (punched by enclosed islands) to calculate the local slot for the island
 and call the appropriate callback on the akka.stream.impl.PhaseIsland. (This is fully documented with diagrams
 in akka.stream.impl.IslandTracking)

 Finally a wiring can be cross\-segment, cross\-island:

 \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\+
 \| \|
 \|\-\-\-\-Island1\-\-\-\-\-\|\-\-\-\-Island2(enclosed)\-\-\-\-\|\-\-\-\-\-Island1\-\-\-\-\-\|

 This means, that the steps were similar as in the previous case until that point where we check the reference
 equality of the current akka.stream.impl.PhaseIsland with that of the target segment (we have already found
 the target segment). In this case, we need to calculate the local slot in the target island (similar to the
 previous case) and try to wire the two islands together. Now, instead of delegating the wiring to the phases, we
 ask the output akka.stream.impl.PhaseIsland to provide a Publisher and then we ask the target island to
 take this Publisher.

 Refer to akka.stream.impl.IslandTracking for all the nasty details of local slot resolution. It is also
 recommended to try out a few examples with akka.stream.impl.PhasedFusingActorMaterializer.Debug turned on, it
 will detail every step of the island tracking and slot resolution steps.

#### Utilities

 Useful utilities are:

 \* akka.stream.impl.PhasedFusingActorMaterializer.Debug: if this flag is turned on, the materializer will
 log the steps it takes
 \* akka.stream.impl.TraversalBuilder.printTraversal: Prints the Traversal in a readable format
 \* akka.stream.impl.TraversalBuilder.printWiring: Prints the calculated port assignments. Useful for
 debugging if everything is wired to the right thing.
2. [**](../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
3. [**](../../akka/stream/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html "Scala API: The flow DSL allows the formulation of stream transformations based on some input.")Scala API: The flow DSL allows the formulation of stream transformations based on some
input.

Scala API: The flow DSL allows the formulation of stream transformations based on some
input. The starting point is called [Source](scaladsl/Source.html) and can be a collection, an iterator,
a block of code which is evaluated repeatedly or a org.reactivestreams.Publisher.
A flow with an attached input and open output is also a [Source](scaladsl/Source.html).

A flow may also be defined without an attached input or output and that is then
a [Flow](scaladsl/Flow.html). The `Flow` can be connected to the `Source` later by using [Source\#via](scaladsl/Source.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T]) with
the flow as argument, and it remains a [Source](scaladsl/Source.html).

Transformations can be appended to `Source` and `Flow` with the operations
defined in [FlowOps](scaladsl/FlowOps.html). Each DSL element produces a new flow that can be further transformed,
building up a description of the complete transformation pipeline.

The termination point of a flow is called [Sink](scaladsl/Sink.html) and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a [Sink](scaladsl/Sink.html).

If a flow has both an attached input and an attached output it becomes a [RunnableGraph](scaladsl/RunnableGraph.html).
In order to execute this pipeline the flow must be materialized by calling [RunnableGraph\#run](scaladsl/RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat) on it.

You can create your `Source`, `Flow` and `Sink` in any order and then wire them together before
they are materialized by connecting them using [Flow\#via](scaladsl/Flow.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Flow.this.Repr[T]) and [Flow\#to](scaladsl/Flow.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.Sink[In,Mat]), or connecting them into a
[GraphDSL](scaladsl/GraphDSL$.html) with fan\-in and fan\-out elements.

See [Reactive Streams](https://github.com/reactive-streams/reactive-streams/) for
details on org.reactivestreams.Publisher and org.reactivestreams.Subscriber.

It should be noted that the streams modeled by this library are “hot”,
meaning that they asynchronously flow through a series of processors without
detailed control by the user. In particular it is not predictable how many
elements a given transformation step might buffer before handing elements
downstream, which means that transformation functions may be invoked more
often than for corresponding transformations on strict collections like
List. \*An important consequence\* is that elements that were produced
into a stream may be discarded by later processors, e.g. when using the
\#take operator.

By default every operation is executed within its own [akka.actor.Actor](../actor/Actor.html)
to enable full pipelining of the chained set of computations. This behavior
is determined by the [akka.stream.Materializer](Materializer.html) which is required
by those methods that materialize the Flow into a series of
org.reactivestreams.Processor instances. The returned reactive stream
is fully started and active.
4. [**](../../akka/stream/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)
5. [**](../../akka/stream/stage/index.html "Permalink")  package [stage](stage/index.html)
6. [**](../../akka/stream/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
7. [**](../../akka/stream/typed/index.html "Permalink")  package [typed](typed/index.html)
### Type Members

1. [**](../../akka/stream/AbruptStageTerminationException.html "Permalink") final  class [AbruptStageTerminationException](AbruptStageTerminationException.html "Signal that the operator was abruptly terminated, usually seen as a call to postStop of the GraphStageLogic without any of the handler callbacks seeing completion or failure from upstream or cancellation from downstream.") extends [AbruptStreamTerminationException](AbruptStreamTerminationException.html)Signal that the operator was abruptly terminated, usually seen as a call to `postStop` of the `GraphStageLogic` without
any of the handler callbacks seeing completion or failure from upstream or cancellation from downstream.

Signal that the operator was abruptly terminated, usually seen as a call to `postStop` of the `GraphStageLogic` without
any of the handler callbacks seeing completion or failure from upstream or cancellation from downstream. This can happen when
the actor running the graph is killed, which happens when the materializer or actor system is terminated.
2. [**](../../akka/stream/AbruptStreamTerminationException.html "Permalink") sealed  class [AbruptStreamTerminationException](AbruptStreamTerminationException.html "A base exception for abrupt stream termination.") extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)A base exception for abrupt stream termination.

A base exception for abrupt stream termination.

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
3. [**](../../akka/stream/AbruptTerminationException.html "Permalink") final  case class [AbruptTerminationException](AbruptTerminationException.html "This exception signals that an actor implementing a Reactive Streams Subscriber, Publisher or Processor has been terminated without being notified by an onError, onComplete or cancel signal.")(actor: [ActorRef](../actor/ActorRef.html)) extends [AbruptStreamTerminationException](AbruptStreamTerminationException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis exception signals that an actor implementing a Reactive Streams Subscriber, Publisher or Processor
has been terminated without being notified by an onError, onComplete or cancel signal.

This exception signals that an actor implementing a Reactive Streams Subscriber, Publisher or Processor
has been terminated without being notified by an onError, onComplete or cancel signal. This usually happens
when an ActorSystem is shut down while stream processing actors are still running.
4. [**](../../akka/stream/AbstractShape.html "Permalink") abstract  class [AbstractShape](AbstractShape.html "Java API for creating custom Shape types.") extends [Shape](Shape.html)Java API for creating custom [Shape](Shape.html) types.
5. [**](../../akka/stream/ActorMaterializerSettings.html "Permalink") final  class [ActorMaterializerSettings](ActorMaterializerSettings.html "This class describes the configurable properties of the ActorMaterializer.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This class describes the configurable properties of the [ActorMaterializer](ActorMaterializer.html).

This class describes the configurable properties of the [ActorMaterializer](ActorMaterializer.html).
Please refer to the `withX` methods for descriptions of the individual settings.

The constructor is not public API, use create or apply on the [ActorMaterializerSettings](ActorMaterializerSettings.html) companion instead.

Annotations@nowarn()
6. [**](../../akka/stream/AmorphousShape.html "Permalink")  case class [AmorphousShape](AmorphousShape.html "This type of Shape can express any number of inputs and outputs at the expense of forgetting about their specific types.")(inlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Inlet](Inlet.html)\[\_]], outlets: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Outlet](Outlet.html)\[\_]]) extends [Shape](Shape.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis type of [Shape](Shape.html) can express any number of inputs and outputs at the
expense of forgetting about their specific types.

This type of [Shape](Shape.html) can express any number of inputs and outputs at the
expense of forgetting about their specific types. It is used mainly in the
implementation of the [Graph](Graph.html) builders and typically replaced by a more
meaningful type of Shape when the building is finished.
7. [**](../../akka/stream/Attributes.html "Permalink") final  class [Attributes](Attributes.html "Holds attributes which can be used to alter akka.stream.scaladsl.Flow / akka.stream.javadsl.Flow or akka.stream.scaladsl.GraphDSL / akka.stream.javadsl.GraphDSL materialization.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable with [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)Holds attributes which can be used to alter [akka.stream.scaladsl.Flow](scaladsl/Flow.html) / [akka.stream.javadsl.Flow](javadsl/Flow.html)
or [akka.stream.scaladsl.GraphDSL](scaladsl/GraphDSL$.html) / [akka.stream.javadsl.GraphDSL](javadsl/GraphDSL$.html) materialization.

Holds attributes which can be used to alter [akka.stream.scaladsl.Flow](scaladsl/Flow.html) / [akka.stream.javadsl.Flow](javadsl/Flow.html)
or [akka.stream.scaladsl.GraphDSL](scaladsl/GraphDSL$.html) / [akka.stream.javadsl.GraphDSL](javadsl/GraphDSL$.html) materialization.

Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

The `attributeList` is ordered with the most specific attribute first, least specific last.
Note that the order was the opposite in Akka 2\.4\.x.

Operators should in general not access the `attributeList` but instead use `get` to get the expected
value of an attribute.

Constructor is internal Akka API, use factories in companion to create instances.
8. [**](../../akka/stream/BackpressureTimeoutException.html "Permalink") final  class [BackpressureTimeoutException](BackpressureTimeoutException.html) extends [StreamTimeoutException](StreamTimeoutException.html)
9. [**](../../akka/stream/BidiShape.html "Permalink") final  case class [BidiShape](BidiShape.html "A bidirectional flow of elements that consequently has two inputs and two outputs, arranged like this:")\[\-In1, \+Out1, \-In2, \+Out2](in1: [Inlet](Inlet.html)\[In1], out1: [Outlet](Outlet.html)\[Out1], in2: [Inlet](Inlet.html)\[In2], out2: [Outlet](Outlet.html)\[Out2]) extends [Shape](Shape.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA bidirectional flow of elements that consequently has two inputs and two
outputs, arranged like this:

A bidirectional flow of elements that consequently has two inputs and two
outputs, arranged like this:

```
       +------+
 In1 ~>|      |~> Out1
       | bidi |
Out2 <~|      |<~ In2
       +------+
```
10. [**](../../akka/stream/BindFailedException.html "Permalink")  class [BindFailedException](BindFailedException.html) extends [StreamTcpException](StreamTcpException.html)
11. [**](../../akka/stream/BoundedSourceQueue.html "Permalink")  trait [BoundedSourceQueue](BoundedSourceQueue.html "A queue of the given size that gives immediate feedback whether an element could be enqueued or not.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A queue of the given size that gives immediate feedback whether an element could be enqueued or not.

A queue of the given size that gives immediate feedback whether an element could be enqueued or not.

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
12. [**](../../akka/stream/BufferOverflowException.html "Permalink") final  case class [BufferOverflowException](BufferOverflowException.html)(msg: String) extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
13. [**](../../akka/stream/Client.html "Permalink") sealed abstract  class [Client](Client.html "The client is usually the side that consumes the service provided by its interlocutor.") extends [TLSRole](TLSRole.html)The client is usually the side that consumes the service provided by its
interlocutor.

The client is usually the side that consumes the service provided by its
interlocutor. The precise interpretation of this role is protocol specific.
14. [**](../../akka/stream/ClosedShape.html "Permalink") sealed abstract  class [ClosedShape](ClosedShape.html "This Shape is used for graphs that have neither open inputs nor open outputs.") extends [Shape](Shape.html)This [Shape](Shape.html) is used for graphs that have neither open inputs nor open
outputs.

This [Shape](Shape.html) is used for graphs that have neither open inputs nor open
outputs. Only such a [Graph](Graph.html) can be materialized by a [Materializer](Materializer.html).
15. [**](../../akka/stream/CompletionStrategy.html "Permalink") sealed  trait [CompletionStrategy](CompletionStrategy.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
16. [**](../../akka/stream/CompletionTimeoutException.html "Permalink") final  class [CompletionTimeoutException](CompletionTimeoutException.html) extends [StreamTimeoutException](StreamTimeoutException.html)
17. [**](../../akka/stream/ConnectionException.html "Permalink")  class [ConnectionException](ConnectionException.html) extends [StreamTcpException](StreamTcpException.html)
18. [**](../../akka/stream/DelayOverflowStrategy.html "Permalink") sealed abstract  class [DelayOverflowStrategy](DelayOverflowStrategy.html "Represents a strategy that decides how to deal with a buffer of time based operator that is full but is about to receive a new element.") extends SerializableRepresents a strategy that decides how to deal with a buffer of time based operator
that is full but is about to receive a new element.

Represents a strategy that decides how to deal with a buffer of time based operator
that is full but is about to receive a new element.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
19. [**](../../akka/stream/EagerClose.html "Permalink") sealed abstract  class [EagerClose](EagerClose.html "see TLSClosing") extends [TLSClosing](TLSClosing.html)see [TLSClosing](TLSClosing.html)
20. [**](../../akka/stream/FanInShape.html "Permalink") abstract  class [FanInShape](FanInShape.html)\[\+O] extends [Shape](Shape.html)
21. [**](../../akka/stream/FanInShape10.html "Permalink")  class [FanInShape10](FanInShape10.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \+O] extends [FanInShape](FanInShape.html)\[O]
22. [**](../../akka/stream/FanInShape11.html "Permalink")  class [FanInShape11](FanInShape11.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \+O] extends [FanInShape](FanInShape.html)\[O]
23. [**](../../akka/stream/FanInShape12.html "Permalink")  class [FanInShape12](FanInShape12.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \+O] extends [FanInShape](FanInShape.html)\[O]
24. [**](../../akka/stream/FanInShape13.html "Permalink")  class [FanInShape13](FanInShape13.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \+O] extends [FanInShape](FanInShape.html)\[O]
25. [**](../../akka/stream/FanInShape14.html "Permalink")  class [FanInShape14](FanInShape14.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \+O] extends [FanInShape](FanInShape.html)\[O]
26. [**](../../akka/stream/FanInShape15.html "Permalink")  class [FanInShape15](FanInShape15.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \+O] extends [FanInShape](FanInShape.html)\[O]
27. [**](../../akka/stream/FanInShape16.html "Permalink")  class [FanInShape16](FanInShape16.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \+O] extends [FanInShape](FanInShape.html)\[O]
28. [**](../../akka/stream/FanInShape17.html "Permalink")  class [FanInShape17](FanInShape17.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \+O] extends [FanInShape](FanInShape.html)\[O]
29. [**](../../akka/stream/FanInShape18.html "Permalink")  class [FanInShape18](FanInShape18.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \+O] extends [FanInShape](FanInShape.html)\[O]
30. [**](../../akka/stream/FanInShape19.html "Permalink")  class [FanInShape19](FanInShape19.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \+O] extends [FanInShape](FanInShape.html)\[O]
31. [**](../../akka/stream/FanInShape2.html "Permalink")  class [FanInShape2](FanInShape2.html)\[\-T0, \-T1, \+O] extends [FanInShape](FanInShape.html)\[O]
32. [**](../../akka/stream/FanInShape20.html "Permalink")  class [FanInShape20](FanInShape20.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \+O] extends [FanInShape](FanInShape.html)\[O]
33. [**](../../akka/stream/FanInShape21.html "Permalink")  class [FanInShape21](FanInShape21.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \-T20, \+O] extends [FanInShape](FanInShape.html)\[O]
34. [**](../../akka/stream/FanInShape22.html "Permalink")  class [FanInShape22](FanInShape22.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \-T9, \-T10, \-T11, \-T12, \-T13, \-T14, \-T15, \-T16, \-T17, \-T18, \-T19, \-T20, \-T21, \+O] extends [FanInShape](FanInShape.html)\[O]
35. [**](../../akka/stream/FanInShape3.html "Permalink")  class [FanInShape3](FanInShape3.html)\[\-T0, \-T1, \-T2, \+O] extends [FanInShape](FanInShape.html)\[O]
36. [**](../../akka/stream/FanInShape4.html "Permalink")  class [FanInShape4](FanInShape4.html)\[\-T0, \-T1, \-T2, \-T3, \+O] extends [FanInShape](FanInShape.html)\[O]
37. [**](../../akka/stream/FanInShape5.html "Permalink")  class [FanInShape5](FanInShape5.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \+O] extends [FanInShape](FanInShape.html)\[O]
38. [**](../../akka/stream/FanInShape6.html "Permalink")  class [FanInShape6](FanInShape6.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \+O] extends [FanInShape](FanInShape.html)\[O]
39. [**](../../akka/stream/FanInShape7.html "Permalink")  class [FanInShape7](FanInShape7.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \+O] extends [FanInShape](FanInShape.html)\[O]
40. [**](../../akka/stream/FanInShape8.html "Permalink")  class [FanInShape8](FanInShape8.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \+O] extends [FanInShape](FanInShape.html)\[O]
41. [**](../../akka/stream/FanInShape9.html "Permalink")  class [FanInShape9](FanInShape9.html)\[\-T0, \-T1, \-T2, \-T3, \-T4, \-T5, \-T6, \-T7, \-T8, \+O] extends [FanInShape](FanInShape.html)\[O]
42. [**](../../akka/stream/FanOutShape.html "Permalink") abstract  class [FanOutShape](FanOutShape.html)\[\-I] extends [Shape](Shape.html)
43. [**](../../akka/stream/FanOutShape10.html "Permalink")  class [FanOutShape10](FanOutShape10.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9] extends [FanOutShape](FanOutShape.html)\[I]
44. [**](../../akka/stream/FanOutShape11.html "Permalink")  class [FanOutShape11](FanOutShape11.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10] extends [FanOutShape](FanOutShape.html)\[I]
45. [**](../../akka/stream/FanOutShape12.html "Permalink")  class [FanOutShape12](FanOutShape12.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11] extends [FanOutShape](FanOutShape.html)\[I]
46. [**](../../akka/stream/FanOutShape13.html "Permalink")  class [FanOutShape13](FanOutShape13.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12] extends [FanOutShape](FanOutShape.html)\[I]
47. [**](../../akka/stream/FanOutShape14.html "Permalink")  class [FanOutShape14](FanOutShape14.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13] extends [FanOutShape](FanOutShape.html)\[I]
48. [**](../../akka/stream/FanOutShape15.html "Permalink")  class [FanOutShape15](FanOutShape15.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13, \+O14] extends [FanOutShape](FanOutShape.html)\[I]
49. [**](../../akka/stream/FanOutShape16.html "Permalink")  class [FanOutShape16](FanOutShape16.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13, \+O14, \+O15] extends [FanOutShape](FanOutShape.html)\[I]
50. [**](../../akka/stream/FanOutShape17.html "Permalink")  class [FanOutShape17](FanOutShape17.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13, \+O14, \+O15, \+O16] extends [FanOutShape](FanOutShape.html)\[I]
51. [**](../../akka/stream/FanOutShape18.html "Permalink")  class [FanOutShape18](FanOutShape18.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13, \+O14, \+O15, \+O16, \+O17] extends [FanOutShape](FanOutShape.html)\[I]
52. [**](../../akka/stream/FanOutShape19.html "Permalink")  class [FanOutShape19](FanOutShape19.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13, \+O14, \+O15, \+O16, \+O17, \+O18] extends [FanOutShape](FanOutShape.html)\[I]
53. [**](../../akka/stream/FanOutShape2.html "Permalink")  class [FanOutShape2](FanOutShape2.html)\[\-I, \+O0, \+O1] extends [FanOutShape](FanOutShape.html)\[I]
54. [**](../../akka/stream/FanOutShape20.html "Permalink")  class [FanOutShape20](FanOutShape20.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13, \+O14, \+O15, \+O16, \+O17, \+O18, \+O19] extends [FanOutShape](FanOutShape.html)\[I]
55. [**](../../akka/stream/FanOutShape21.html "Permalink")  class [FanOutShape21](FanOutShape21.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13, \+O14, \+O15, \+O16, \+O17, \+O18, \+O19, \+O20] extends [FanOutShape](FanOutShape.html)\[I]
56. [**](../../akka/stream/FanOutShape22.html "Permalink")  class [FanOutShape22](FanOutShape22.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8, \+O9, \+O10, \+O11, \+O12, \+O13, \+O14, \+O15, \+O16, \+O17, \+O18, \+O19, \+O20, \+O21] extends [FanOutShape](FanOutShape.html)\[I]
57. [**](../../akka/stream/FanOutShape3.html "Permalink")  class [FanOutShape3](FanOutShape3.html)\[\-I, \+O0, \+O1, \+O2] extends [FanOutShape](FanOutShape.html)\[I]
58. [**](../../akka/stream/FanOutShape4.html "Permalink")  class [FanOutShape4](FanOutShape4.html)\[\-I, \+O0, \+O1, \+O2, \+O3] extends [FanOutShape](FanOutShape.html)\[I]
59. [**](../../akka/stream/FanOutShape5.html "Permalink")  class [FanOutShape5](FanOutShape5.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4] extends [FanOutShape](FanOutShape.html)\[I]
60. [**](../../akka/stream/FanOutShape6.html "Permalink")  class [FanOutShape6](FanOutShape6.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5] extends [FanOutShape](FanOutShape.html)\[I]
61. [**](../../akka/stream/FanOutShape7.html "Permalink")  class [FanOutShape7](FanOutShape7.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6] extends [FanOutShape](FanOutShape.html)\[I]
62. [**](../../akka/stream/FanOutShape8.html "Permalink")  class [FanOutShape8](FanOutShape8.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7] extends [FanOutShape](FanOutShape.html)\[I]
63. [**](../../akka/stream/FanOutShape9.html "Permalink")  class [FanOutShape9](FanOutShape9.html)\[\-I, \+O0, \+O1, \+O2, \+O3, \+O4, \+O5, \+O6, \+O7, \+O8] extends [FanOutShape](FanOutShape.html)\[I]
64. [**](../../akka/stream/FlowMonitor.html "Permalink")  trait [FlowMonitor](FlowMonitor.html "Used to monitor the state of a stream")\[\+T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Used to monitor the state of a stream

Used to monitor the state of a stream

TType of messages passed by the stream
65. [**](../../akka/stream/FlowShape.html "Permalink") final  case class [FlowShape](FlowShape.html "A Flow Shape has exactly one input and one output, it looks from the outside like a pipe (but it can be a complex topology of streams within of course).")\[\-I, \+O](in: [Inlet](Inlet.html)\[I], out: [Outlet](Outlet.html)\[O]) extends [Shape](Shape.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA Flow [Shape](Shape.html) has exactly one input and one output, it looks from the
outside like a pipe (but it can be a complex topology of streams within of
course).
66. [**](../../akka/stream/Graph.html "Permalink")  trait [Graph](Graph.html "Not intended to be directly extended by user classes")\[\+S \<: [Shape](Shape.html), \+M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not intended to be directly extended by user classes

Not intended to be directly extended by user classes

See also[akka.stream.stage.GraphStage](stage/GraphStage.html)
67. [**](../../akka/stream/IOOperationIncompleteException.html "Permalink") final  class [IOOperationIncompleteException](IOOperationIncompleteException.html "This exception signals that a stream has been completed or has an error while there was still IO operations in progress") extends RuntimeExceptionThis exception signals that a stream has been completed or has an error while
there was still IO operations in progress
68. [**](../../akka/stream/IOResult.html "Permalink") final  case class [IOResult](IOResult.html "Holds a result of an IO operation.")(count: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), status: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Done](../Done.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableHolds a result of an IO operation.

Holds a result of an IO operation.

countNumeric value depending on context, for example IO operations performed or bytes processed.

statusStatus of the result. Can be either [akka.Done](../Done.html) or an exception.

Annotations@nowarn()
69. [**](../../akka/stream/IOSettings.html "Permalink") final  class [IOSettings](IOSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@nowarn()
70. [**](../../akka/stream/IgnoreBoth.html "Permalink") sealed abstract  class [IgnoreBoth](IgnoreBoth.html "see TLSClosing") extends [TLSClosing](TLSClosing.html)see [TLSClosing](TLSClosing.html)
71. [**](../../akka/stream/IgnoreCancel.html "Permalink") sealed abstract  class [IgnoreCancel](IgnoreCancel.html "see TLSClosing") extends [TLSClosing](TLSClosing.html)see [TLSClosing](TLSClosing.html)
72. [**](../../akka/stream/IgnoreComplete.html "Permalink") sealed abstract  class [IgnoreComplete](IgnoreComplete.html "see TLSClosing") extends [TLSClosing](TLSClosing.html)see [TLSClosing](TLSClosing.html)
73. [**](../../akka/stream/InPort.html "Permalink") sealed abstract  class [InPort](InPort.html "An input port of a StreamLayout.Module.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An input port of a StreamLayout.Module.

An input port of a StreamLayout.Module. This type logically belongs
into the impl package but must live here due to how `sealed` works.
It is also used in the Java DSL for “classic Inlets” as a work\-around
for otherwise unreasonable existential types.
74. [**](../../akka/stream/InitialTimeoutException.html "Permalink") final  class [InitialTimeoutException](InitialTimeoutException.html) extends [StreamTimeoutException](StreamTimeoutException.html)
75. [**](../../akka/stream/Inlet.html "Permalink") final  class [Inlet](Inlet.html)\[T] extends [InPort](InPort.html)
76. [**](../../akka/stream/InvalidPartnerActorException.html "Permalink") final  case class [InvalidPartnerActorException](InvalidPartnerActorException.html "Stream refs establish a connection between a local and remote actor, representing the origin and remote sides of a stream.")(expectedRef: [ActorRef](../actor/ActorRef.html), gotRef: [ActorRef](../actor/ActorRef.html), msg: String) extends [IllegalStateException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableStream refs establish a connection between a local and remote actor, representing the origin and remote sides
of a stream.

Stream refs establish a connection between a local and remote actor, representing the origin and remote sides
of a stream. Each such actor refers to the other side as its "partner". We make sure that no other actor than
the initial partner can send demand/messages to the other side accidentally.

This exception is thrown when a message is received from a non\-partner actor,
which could mean a bug or some actively malicient behavior from the other side.

This is not meant as a security feature, but rather as plain sanity\-check.
77. [**](../../akka/stream/InvalidSequenceNumberException.html "Permalink") final  case class [InvalidSequenceNumberException](InvalidSequenceNumberException.html)(expectedSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), gotSeqNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), msg: String) extends [IllegalStateException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
78. [**](../../akka/stream/KillSwitch.html "Permalink")  trait [KillSwitch](KillSwitch.html "A KillSwitch allows completion of Graphs from the outside by completing Graphs of FlowShape linked to the switch.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A [KillSwitch](KillSwitch.html) allows completion of [Graph](Graph.html)s from the outside by completing [Graph](Graph.html)s of [FlowShape](FlowShape.html) linked
to the switch.

A [KillSwitch](KillSwitch.html) allows completion of [Graph](Graph.html)s from the outside by completing [Graph](Graph.html)s of [FlowShape](FlowShape.html) linked
to the switch. Depending on whether the [KillSwitch](KillSwitch.html) is a [UniqueKillSwitch](UniqueKillSwitch.html) or a [SharedKillSwitch](SharedKillSwitch.html) one or
multiple streams might be linked with the switch. For details see the documentation of the concrete subclasses of
this interface.
79. [**](../../akka/stream/MaterializationException.html "Permalink")  class [MaterializationException](MaterializationException.html "This exception or subtypes thereof should be used to signal materialization failures.") extends RuntimeExceptionThis exception or subtypes thereof should be used to signal materialization
failures.
80. [**](../../akka/stream/Materializer.html "Permalink") abstract  class [Materializer](Materializer.html "The Materializer is the component responsible for turning a stream blueprint into a running stream.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The Materializer is the component responsible for turning a stream blueprint into a running stream.

The Materializer is the component responsible for turning a stream blueprint into a running stream.
In general the system wide materializer should be preferred over creating instances manually.

Not for user extension

Annotations@implicitNotFound() @nowarn() @[DoNotInherit](../annotation/DoNotInherit.html)()
81. [**](../../akka/stream/MaterializerLoggingProvider.html "Permalink")  trait [MaterializerLoggingProvider](MaterializerLoggingProvider.html "Not for user extension") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
82. [**](../../akka/stream/NeverMaterializedException.html "Permalink") final  class [NeverMaterializedException](NeverMaterializedException.html) extends RuntimeException
83. [**](../../akka/stream/OutPort.html "Permalink") sealed abstract  class [OutPort](OutPort.html "An output port of a StreamLayout.Module.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An output port of a StreamLayout.Module.

An output port of a StreamLayout.Module. This type logically belongs
into the impl package but must live here due to how `sealed` works.
It is also used in the Java DSL for “classic Outlets” as a work\-around
for otherwise unreasonable existential types.
84. [**](../../akka/stream/Outlet.html "Permalink") final  class [Outlet](Outlet.html)\[T] extends [OutPort](OutPort.html)
85. [**](../../akka/stream/OverflowStrategy.html "Permalink") sealed abstract  class [OverflowStrategy](OverflowStrategy.html "Represents a strategy that decides how to deal with a buffer that is full but is about to receive a new element.") extends [DelayOverflowStrategy](DelayOverflowStrategy.html)Represents a strategy that decides how to deal with a buffer that is full but is
about to receive a new element.

Represents a strategy that decides how to deal with a buffer that is full but is
about to receive a new element.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
86. [**](../../akka/stream/QueueCompletionResult.html "Permalink") sealed abstract  class [QueueCompletionResult](QueueCompletionResult.html "Not for user extension") extends [QueueOfferResult](QueueOfferResult.html)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
87. [**](../../akka/stream/QueueOfferResult.html "Permalink") sealed abstract  class [QueueOfferResult](QueueOfferResult.html "Not for user extension") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Not for user extension

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
88. [**](../../akka/stream/RateExceededException.html "Permalink")  class [RateExceededException](RateExceededException.html "Exception that is thrown when rated controlled by stream is exceeded") extends RuntimeExceptionException that is thrown when rated controlled by stream is exceeded
89. [**](../../akka/stream/RemoteStreamRefActorTerminatedException.html "Permalink") final  case class [RemoteStreamRefActorTerminatedException](RemoteStreamRefActorTerminatedException.html)(msg: String) extends RuntimeException with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
90. [**](../../akka/stream/RestartSettings.html "Permalink") final  class [RestartSettings](RestartSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
91. [**](../../akka/stream/Server.html "Permalink") sealed abstract  class [Server](Server.html "The server is usually the side the provides the service to its interlocutor.") extends [TLSRole](TLSRole.html)The server is usually the side the provides the service to its interlocutor.

The server is usually the side the provides the service to its interlocutor.
The precise interpretation of this role is protocol specific.
92. [**](../../akka/stream/Shape.html "Permalink") abstract  class [Shape](Shape.html "A Shape describes the inlets and outlets of a Graph.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A Shape describes the inlets and outlets of a [Graph](Graph.html).

A Shape describes the inlets and outlets of a [Graph](Graph.html). In keeping with the
philosophy that a Graph is a freely reusable blueprint, everything that
matters from the outside are the connections that can be made with it,
otherwise it is just a black box.
93. [**](../../akka/stream/SharedKillSwitch.html "Permalink") final  class [SharedKillSwitch](SharedKillSwitch.html "A SharedKillSwitch is a provider for Graphs of FlowShape that can be completed or failed from the outside.") extends [KillSwitch](KillSwitch.html)A [SharedKillSwitch](SharedKillSwitch.html) is a provider for [Graph](Graph.html)s of [FlowShape](FlowShape.html) that can be completed or failed from the outside.

A [SharedKillSwitch](SharedKillSwitch.html) is a provider for [Graph](Graph.html)s of [FlowShape](FlowShape.html) that can be completed or failed from the outside.
A [Graph](Graph.html) returned by the switch can be materialized arbitrary amount of times: every newly materialized [Graph](Graph.html)
belongs to the switch from which it was acquired. Multiple [SharedKillSwitch](SharedKillSwitch.html) instances are isolated from each other,
shutting down or aborting on instance does not affect the [Graph](Graph.html)s provided by another instance.

After calling [SharedKillSwitch\#shutdown](SharedKillSwitch.html#shutdown():Unit) all materialized, running instances of all [Graph](Graph.html)s provided by the
[SharedKillSwitch](SharedKillSwitch.html) will complete their downstreams and cancel their upstreams (unless if finished or failed already in which
case the command is ignored). Subsequent invocations of [SharedKillSwitch\#shutdown](SharedKillSwitch.html#shutdown():Unit) and [SharedKillSwitch\#abort](SharedKillSwitch.html#abort(reason:Throwable):Unit) will be
ignored.

After calling [SharedKillSwitch\#abort](SharedKillSwitch.html#abort(reason:Throwable):Unit) all materialized, running instances of all [Graph](Graph.html)s provided by the
[SharedKillSwitch](SharedKillSwitch.html) will fail their downstreams with the provided exception and cancel their upstreams
(unless it finished or failed already in which case the command is ignored). Subsequent invocations of
[SharedKillSwitch\#shutdown](SharedKillSwitch.html#shutdown():Unit) and [SharedKillSwitch\#abort](SharedKillSwitch.html#abort(reason:Throwable):Unit) will be ignored.

The [Graph](Graph.html)s provided by the [SharedKillSwitch](SharedKillSwitch.html) do not modify the passed through elements in any way or affect
backpressure in the stream. All provided [Graph](Graph.html)s provide the parent [SharedKillSwitch](SharedKillSwitch.html) as materialized value.

This class is thread\-safe, the instance can be passed safely among threads and its methods may be invoked concurrently.
94. [**](../../akka/stream/SinkRef.html "Permalink")  trait [SinkRef](SinkRef.html "A SinkRef allows sharing a \"reference\" to a Sink with others, with the main purpose of crossing a network boundary.")\[In] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A [SinkRef](SinkRef.html) allows sharing a "reference" to a Sink with others, with the main purpose of crossing a network boundary.

A [SinkRef](SinkRef.html) allows sharing a "reference" to a Sink with others, with the main purpose of crossing a network boundary.
Usually obtaining a SinkRef would be done via Actor messaging, in which one system asks a remote one,
to accept some data from it, and the remote one decides to accept the request to send data in a back\-pressured
streaming fashion \-\- using a sink ref.

To create a [SinkRef](SinkRef.html) you have to materialize the `Sink` that you want to obtain a reference to by attaching it to a `StreamRefs.sinkRef()`.

Stream refs can be seen as Reactive Streams over network boundaries.
See also [akka.stream.SourceRef](SourceRef.html) which is the dual of a `SinkRef`.

For additional configuration see `reference.conf` as well as [akka.stream.StreamRefAttributes](StreamRefAttributes$.html).

Not for user extension.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
95. [**](../../akka/stream/SinkShape.html "Permalink") final  case class [SinkShape](SinkShape.html "A Sink Shape has exactly one input and no outputs, it models a data sink.")\[\-T](in: [Inlet](Inlet.html)\[T]) extends [Shape](Shape.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA Sink [Shape](Shape.html) has exactly one input and no outputs, it models a data sink.
96. [**](../../akka/stream/SourceRef.html "Permalink")  trait [SourceRef](SourceRef.html "A SourceRef allows sharing a \"reference\" with others, with the main purpose of crossing a network boundary.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A SourceRef allows sharing a "reference" with others, with the main purpose of crossing a network boundary.

A SourceRef allows sharing a "reference" with others, with the main purpose of crossing a network boundary.
Usually obtaining a SourceRef would be done via Actor messaging, in which one system asks a remote one,
to share some data with it, and the remote one decides to do so in a back\-pressured streaming fashion \-\- using a stream ref.

To create a [SourceRef](SourceRef.html) you have to materialize the `Source` that you want to obtain a reference to by attaching it to a `Sink.sourceRef`.

Stream refs can be seen as Reactive Streams over network boundaries.
See also [akka.stream.SinkRef](SinkRef.html) which is the dual of a `SourceRef`.

For additional configuration see `reference.conf` as well as [akka.stream.StreamRefAttributes](StreamRefAttributes$.html).

Not for user extension.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
97. [**](../../akka/stream/SourceShape.html "Permalink") final  case class [SourceShape](SourceShape.html "A Source Shape has exactly one output and no inputs, it models a source of data.")\[\+T](out: [Outlet](Outlet.html)\[T]) extends [Shape](Shape.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableA Source [Shape](Shape.html) has exactly one output and no inputs, it models a source
of data.
98. [**](../../akka/stream/StreamDetachedException.html "Permalink") final  class [StreamDetachedException](StreamDetachedException.html "This exception signals that materialized value is already detached from stream.") extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)This exception signals that materialized value is already detached from stream.

This exception signals that materialized value is already detached from stream. This usually happens
when stream is completed and an ActorSystem is shut down while materialized object is still available.
99. [**](../../akka/stream/StreamIdleTimeoutException.html "Permalink") final  class [StreamIdleTimeoutException](StreamIdleTimeoutException.html) extends [StreamTimeoutException](StreamTimeoutException.html)
100. [**](../../akka/stream/StreamLimitReachedException.html "Permalink")  class [StreamLimitReachedException](StreamLimitReachedException.html) extends RuntimeException
101. [**](../../akka/stream/StreamRefMessages.html "Permalink") final  class [StreamRefMessages](StreamRefMessages.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
102. [**](../../akka/stream/StreamRefResolver.html "Permalink")  trait [StreamRefResolver](StreamRefResolver.html "The stream ref resolver provides a way to serialize and deserialize streamrefs in user serializers.") extends [Extension](../actor/Extension.html)The stream ref resolver provides a way to serialize and deserialize streamrefs in user serializers.

The stream ref resolver provides a way to serialize and deserialize streamrefs in user serializers.

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
103. [**](../../akka/stream/StreamRefSettings.html "Permalink")  trait [StreamRefSettings](StreamRefSettings.html "Settings specific to SourceRef and SinkRef.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Settings specific to [SourceRef](SourceRef.html) and [SinkRef](SinkRef.html).

Settings specific to [SourceRef](SourceRef.html) and [SinkRef](SinkRef.html).
More detailed documentation about each of the settings is available in `reference.conf`.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
104. [**](../../akka/stream/StreamRefSubscriptionTimeoutException.html "Permalink") final  case class [StreamRefSubscriptionTimeoutException](StreamRefSubscriptionTimeoutException.html)(msg: String) extends [IllegalStateException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
105. [**](../../akka/stream/StreamSubscriptionTimeoutSettings.html "Permalink") final  class [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html "Leaked publishers and subscribers are cleaned up when they are not used within a given deadline, configured by StreamSubscriptionTimeoutSettings.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Leaked publishers and subscribers are cleaned up when they are not used within a given
deadline, configured by [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html).

Leaked publishers and subscribers are cleaned up when they are not used within a given
deadline, configured by [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings.html).

Annotations@nowarn()
106. [**](../../akka/stream/StreamSubscriptionTimeoutTerminationMode.html "Permalink") sealed abstract  class [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode.html "This mode describes what shall happen when the subscription timeout expires for substream Publishers created by operations like prefixAndTail.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This mode describes what shall happen when the subscription timeout expires for
substream Publishers created by operations like `prefixAndTail`.
107. [**](../../akka/stream/StreamTcpException.html "Permalink")  class [StreamTcpException](StreamTcpException.html) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)
108. [**](../../akka/stream/StreamTimeoutException.html "Permalink") sealed  class [StreamTimeoutException](StreamTimeoutException.html "Base class for timeout exceptions specific to Akka Streams") extends TimeoutException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)Base class for timeout exceptions specific to Akka Streams

Base class for timeout exceptions specific to Akka Streams

Not for user extension

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
109. [**](../../akka/stream/SubscriptionWithCancelException.html "Permalink")  trait [SubscriptionWithCancelException](SubscriptionWithCancelException.html "Extension of Subscription that allows to pass a cause when a subscription is cancelled.") extends SubscriptionExtension of Subscription that allows to pass a cause when a subscription is cancelled.

Extension of Subscription that allows to pass a cause when a subscription is cancelled.

Subscribers can check for this trait and use its `cancel(cause)` method instead of the regular
cancel method to pass a cancellation cause.

Not for user extension.

Annotations@[DoNotInherit](../annotation/DoNotInherit.html)()
110. [**](../../akka/stream/SubstreamCancelStrategy.html "Permalink") sealed abstract  class [SubstreamCancelStrategy](SubstreamCancelStrategy.html "Represents a strategy that decides how to deal with substream events.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents a strategy that decides how to deal with substream events.
111. [**](../../akka/stream/SystemMaterializer.html "Permalink") final  class [SystemMaterializer](SystemMaterializer.html) extends [Extension](../actor/Extension.html)
112. [**](../../akka/stream/TLSClientAuth.html "Permalink") sealed abstract  class [TLSClientAuth](TLSClientAuth.html "An SSLEngine can either demand, allow or ignore its peer’s authentication (via certificates), where Need will fail the handshake if the peer does not provide valid credentials, Want allows the peer to send credentials and verifies them if provided, and None disables peer certificate verification.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)An SSLEngine can either demand, allow or ignore its peer’s authentication
(via certificates), where `Need` will fail the handshake if the peer does
not provide valid credentials, `Want` allows the peer to send credentials
and verifies them if provided, and `None` disables peer certificate
verification.

An SSLEngine can either demand, allow or ignore its peer’s authentication
(via certificates), where `Need` will fail the handshake if the peer does
not provide valid credentials, `Want` allows the peer to send credentials
and verifies them if provided, and `None` disables peer certificate
verification.

See the documentation for `SSLEngine::setWantClientAuth` for more information.
113. [**](../../akka/stream/TLSClosing.html "Permalink") sealed abstract  class [TLSClosing](TLSClosing.html "All streams in Akka are unidirectional: while in a complex flow graph data may flow in multiple directions these individual flows are independent from each other.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)All streams in Akka are unidirectional: while in a complex flow graph data
may flow in multiple directions these individual flows are independent from
each other.

All streams in Akka are unidirectional: while in a complex flow graph data
may flow in multiple directions these individual flows are independent from
each other. The difference between two half\-duplex connections in opposite
directions and a full\-duplex connection is that the underlying transport
is shared in the latter and tearing it down will end the data transfer in
both directions.

When integrating a full\-duplex transport medium that does not support
half\-closing (which means ending one direction of data transfer without
ending the other) into a stream topology, there can be unexpected effects.
Feeding a finite Source into this medium will close the connection after
all elements have been sent, which means that possible replies may not
be received in full. To support this type of usage, the sending and
receiving of data on the same side (e.g. on the [Client](Client.html)) need to be
coordinated such that it is known when all replies have been received.
Only then should the transport be shut down.

To support these scenarios it is recommended that the full\-duplex
transport integration is configurable in terms of termination handling,
which means that the user can optionally suppress the normal (closing)
reaction to completion or cancellation events, as is expressed by the
possible values of this type:

	- [EagerClose](EagerClose.html) means to not ignore signals
	- [IgnoreCancel](IgnoreCancel.html) means to not react to cancellation of the receiving
	 side unless the sending side has already completed
	- [IgnoreComplete](IgnoreComplete.html) means to not react to the completion of the sending
	 side unless the receiving side has already canceled
	- [IgnoreBoth](IgnoreBoth.html) means to ignore the first termination signal—be that
	 cancellation or completion—and only act upon the second one
114. [**](../../akka/stream/TLSRole.html "Permalink") sealed abstract  class [TLSRole](TLSRole.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
115. [**](../../akka/stream/TargetRefNotInitializedYetException.html "Permalink") final  case class [TargetRefNotInitializedYetException](TargetRefNotInitializedYetException.html)() extends [IllegalStateException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
116. [**](../../akka/stream/ThrottleMode.html "Permalink") sealed abstract  class [ThrottleMode](ThrottleMode.html "Represents a mode that decides how to deal exceed rate for Throttle operator") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Represents a mode that decides how to deal exceed rate for Throttle operator
117. [**](../../akka/stream/TooManySubstreamsOpenException.html "Permalink") final  class [TooManySubstreamsOpenException](TooManySubstreamsOpenException.html "This exception signals that the maximum number of substreams declared has been exceeded.") extends [IllegalStateException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/IllegalStateException.html#java.lang.IllegalStateException) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)This exception signals that the maximum number of substreams declared has been exceeded.

This exception signals that the maximum number of substreams declared has been exceeded.
A finite limit is imposed so that memory usage is controlled.
118. [**](../../akka/stream/UniformFanInShape.html "Permalink")  class [UniformFanInShape](UniformFanInShape.html)\[\-T, \+O] extends [FanInShape](FanInShape.html)\[O]
119. [**](../../akka/stream/UniformFanOutShape.html "Permalink")  class [UniformFanOutShape](UniformFanOutShape.html)\[\-I, \+O] extends [FanOutShape](FanOutShape.html)\[I]
120. [**](../../akka/stream/UniqueKillSwitch.html "Permalink") final  class [UniqueKillSwitch](UniqueKillSwitch.html "A UniqueKillSwitch is always a result of a materialization (unlike SharedKillSwitch which is constructed before any materialization) and it always controls that graph and operator which yielded the materialized value.") extends [KillSwitch](KillSwitch.html)A [UniqueKillSwitch](UniqueKillSwitch.html) is always a result of a materialization (unlike [SharedKillSwitch](SharedKillSwitch.html) which is constructed
before any materialization) and it always controls that graph and operator which yielded the materialized value.

A [UniqueKillSwitch](UniqueKillSwitch.html) is always a result of a materialization (unlike [SharedKillSwitch](SharedKillSwitch.html) which is constructed
before any materialization) and it always controls that graph and operator which yielded the materialized value.

After calling [UniqueKillSwitch\#shutdown](UniqueKillSwitch.html#shutdown():Unit) the running instance of the [Graph](Graph.html) of [FlowShape](FlowShape.html) that materialized to the
[UniqueKillSwitch](UniqueKillSwitch.html) will complete its downstream and cancel its upstream (unless if finished or failed already in which
case the command is ignored). Subsequent invocations of completion commands will be ignored.

After calling [UniqueKillSwitch\#abort](UniqueKillSwitch.html#abort(ex:Throwable):Unit) the running instance of the [Graph](Graph.html) of [FlowShape](FlowShape.html) that materialized to the
[UniqueKillSwitch](UniqueKillSwitch.html) will fail its downstream with the provided exception and cancel its upstream
(unless if finished or failed already in which case the command is ignored). Subsequent invocations of
completion commands will be ignored.

It is also possible to individually cancel, complete or fail upstream and downstream parts by calling the corresponding
methods.
121. [**](../../akka/stream/WatchedActorTerminatedException.html "Permalink") final  class [WatchedActorTerminatedException](WatchedActorTerminatedException.html "Used as failure exception by an ask operator if the target actor terminates.") extends RuntimeExceptionUsed as failure exception by an `ask` operator if the target actor terminates.

Used as failure exception by an `ask` operator if the target actor terminates.
See `Flow.ask` and `Flow.watch`.
### Deprecated Type Members

1. [**](../../akka/stream/AbruptIOTerminationException.html "Permalink") final  case class [AbruptIOTerminationException](AbruptIOTerminationException.html "This exception signals that a stream has been completed by an onError signal while there was still IO operations in progress.")(ioResult: [IOResult](IOResult.html), cause: Throwable) extends RuntimeException with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableThis exception signals that a stream has been completed by an onError signal
while there was still IO operations in progress.

This exception signals that a stream has been completed by an onError signal
while there was still IO operations in progress.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* use IOOperationIncompleteException
2. [**](../../akka/stream/ActorMaterializer.html "Permalink") abstract  class [ActorMaterializer](ActorMaterializer.html "An ActorMaterializer takes a stream blueprint and turns it into a running stream.") extends [Materializer](Materializer.html) with [MaterializerLoggingProvider](MaterializerLoggingProvider.html)An ActorMaterializer takes a stream blueprint and turns it into a running stream.

An ActorMaterializer takes a stream blueprint and turns it into a running stream.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* The Materializer now has all methods the ActorMaterializer used to have
### Value Members

1. [**](../../akka/stream/ActorAttributes$.html "Permalink")  object [ActorAttributes](ActorAttributes$.html "Attributes for the Materializer.")Attributes for the [Materializer](Materializer.html).

Attributes for the [Materializer](Materializer.html).
Note that more attributes defined in [Attributes](Attributes.html).
2. [**](../../akka/stream/ActorMaterializer$.html "Permalink")  object [ActorMaterializer](ActorMaterializer$.html)
3. [**](../../akka/stream/ActorMaterializerSettings$.html "Permalink")  object [ActorMaterializerSettings](ActorMaterializerSettings$.html)
4. [**](../../akka/stream/Attributes$.html "Permalink")  object [Attributes](Attributes$.html "Note that more attributes for the Materializer are defined in ActorAttributes.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).
5. [**](../../akka/stream/BidiShape$.html "Permalink")  object [BidiShape](BidiShape$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
6. [**](../../akka/stream/Client$.html "Permalink")  case object [Client](Client$.html) extends [Client](Client.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
7. [**](../../akka/stream/ClosedShape$.html "Permalink")  object [ClosedShape](ClosedShape$.html) extends [ClosedShape](ClosedShape.html)
8. [**](../../akka/stream/CompletionStrategy$.html "Permalink")  case object [CompletionStrategy](CompletionStrategy$.html) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
9. [**](../../akka/stream/DelayOverflowStrategy$.html "Permalink")  object [DelayOverflowStrategy](DelayOverflowStrategy$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
10. [**](../../akka/stream/EagerClose$.html "Permalink")  case object [EagerClose](EagerClose$.html) extends [EagerClose](EagerClose.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
11. [**](../../akka/stream/FanInShape$.html "Permalink")  object [FanInShape](FanInShape$.html)
12. [**](../../akka/stream/FanOutShape$.html "Permalink")  object [FanOutShape](FanOutShape$.html)
13. [**](../../akka/stream/FlowMonitorState$.html "Permalink")  object [FlowMonitorState](FlowMonitorState$.html)
14. [**](../../akka/stream/FlowShape$.html "Permalink")  object [FlowShape](FlowShape$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
15. [**](../../akka/stream/Graph$.html "Permalink")  object [Graph](Graph$.html)
16. [**](../../akka/stream/IOResult$.html "Permalink")  object [IOResult](IOResult$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
17. [**](../../akka/stream/IOSettings$.html "Permalink")  object [IOSettings](IOSettings$.html)
18. [**](../../akka/stream/IgnoreBoth$.html "Permalink")  case object [IgnoreBoth](IgnoreBoth$.html) extends [IgnoreBoth](IgnoreBoth.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
19. [**](../../akka/stream/IgnoreCancel$.html "Permalink")  case object [IgnoreCancel](IgnoreCancel$.html) extends [IgnoreCancel](IgnoreCancel.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
20. [**](../../akka/stream/IgnoreComplete$.html "Permalink")  case object [IgnoreComplete](IgnoreComplete$.html) extends [IgnoreComplete](IgnoreComplete.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
21. [**](../../akka/stream/Inlet$.html "Permalink")  object [Inlet](Inlet$.html "An Inlet is a typed input to a Shape.")An Inlet is a typed input to a Shape.

An Inlet is a typed input to a Shape. Its partner in the Module view
is the InPort (which does not bear an element type because Modules only
express the internal structural hierarchy of stream topologies).
22. [**](../../akka/stream/KillSwitches$.html "Permalink")  object [KillSwitches](KillSwitches$.html "Creates shared or single kill switches which can be used to control completion of graphs from the outside.")Creates shared or single kill switches which can be used to control completion of graphs from the outside.

Creates shared or single kill switches which can be used to control completion of graphs from the outside.

	- The factory `shared()` returns a [SharedKillSwitch](SharedKillSwitch.html) which provides a [Graph](Graph.html) of [FlowShape](FlowShape.html) that can be
	 used in arbitrary number of graphs and materializations. The switch simultaneously
	 controls completion in all of those graphs.
	- The factory `single()` returns a [Graph](Graph.html) of [FlowShape](FlowShape.html) that materializes to a [UniqueKillSwitch](UniqueKillSwitch.html)
	 which is always unique
	 to that materialized Flow itself.Creates a [SharedKillSwitch](SharedKillSwitch.html) that can be used to externally control the completion of various streams.
23. [**](../../akka/stream/Materializer$.html "Permalink")  object [Materializer](Materializer$.html)
24. [**](../../akka/stream/Outlet$.html "Permalink")  object [Outlet](Outlet$.html "An Outlet is a typed output to a Shape.")An Outlet is a typed output to a Shape.

An Outlet is a typed output to a Shape. Its partner in the Module view
is the OutPort (which does not bear an element type because Modules only
express the internal structural hierarchy of stream topologies).
25. [**](../../akka/stream/OverflowStrategy$.html "Permalink")  object [OverflowStrategy](OverflowStrategy$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
26. [**](../../akka/stream/QueueOfferResult$.html "Permalink")  object [QueueOfferResult](QueueOfferResult$.html "Contains types that is used as return types for streams Source queues")Contains types that is used as return types for streams Source queues
27. [**](../../akka/stream/RestartSettings$.html "Permalink")  object [RestartSettings](RestartSettings$.html)
28. [**](../../akka/stream/Server$.html "Permalink")  case object [Server](Server$.html) extends [Server](Server.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
29. [**](../../akka/stream/SinkRef$.html "Permalink")  object [SinkRef](SinkRef$.html "See full documentation on SinkRef.")See full documentation on [SinkRef](SinkRef.html).
30. [**](../../akka/stream/SinkShape$.html "Permalink")  object [SinkShape](SinkShape$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
31. [**](../../akka/stream/SourceRef$.html "Permalink")  object [SourceRef](SourceRef$.html "See full documentation on SourceRef.")See full documentation on [SourceRef](SourceRef.html).
32. [**](../../akka/stream/SourceShape$.html "Permalink")  object [SourceShape](SourceShape$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
33. [**](../../akka/stream/StreamRefAttributes$.html "Permalink")  object [StreamRefAttributes](StreamRefAttributes$.html "Attributes for stream refs (akka.stream.SourceRef and akka.stream.SinkRef).")Attributes for stream refs ([akka.stream.SourceRef](SourceRef.html) and [akka.stream.SinkRef](SinkRef.html)).

Attributes for stream refs ([akka.stream.SourceRef](SourceRef.html) and [akka.stream.SinkRef](SinkRef.html)).
Note that more attributes defined in [Attributes](Attributes.html) and [ActorAttributes](ActorAttributes$.html).
34. [**](../../akka/stream/StreamRefResolver$.html "Permalink")  object [StreamRefResolver](StreamRefResolver$.html "The stream ref resolver extension provides a way to serialize and deserialize streamrefs in user serializers.") extends [ExtensionId](../actor/ExtensionId.html)\[[StreamRefResolver](StreamRefResolver.html)]The stream ref resolver extension provides a way to serialize and deserialize streamrefs in user serializers.
35. [**](../../akka/stream/StreamRefSettings$.html "Permalink")  object [StreamRefSettings](StreamRefSettings$.html)
36. [**](../../akka/stream/StreamSubscriptionTimeoutSettings$.html "Permalink")  object [StreamSubscriptionTimeoutSettings](StreamSubscriptionTimeoutSettings$.html)
37. [**](../../akka/stream/StreamSubscriptionTimeoutTerminationMode$.html "Permalink")  object [StreamSubscriptionTimeoutTerminationMode](StreamSubscriptionTimeoutTerminationMode$.html)
38. [**](../../akka/stream/SubscriptionWithCancelException$.html "Permalink")  object [SubscriptionWithCancelException](SubscriptionWithCancelException$.html)
39. [**](../../akka/stream/SubstreamCancelStrategy$.html "Permalink")  object [SubstreamCancelStrategy](SubstreamCancelStrategy$.html)
40. [**](../../akka/stream/Supervision$.html "Permalink")  object [Supervision](Supervision$.html)
41. [**](../../akka/stream/SystemMaterializer$.html "Permalink")  object [SystemMaterializer](SystemMaterializer$.html "The system materializer is a default materializer to use for most cases running streams, it is a single instance per actor system that is tied to the lifecycle of that system.") extends [ExtensionId](../actor/ExtensionId.html)\[[SystemMaterializer](SystemMaterializer.html)] with [ExtensionIdProvider](../actor/ExtensionIdProvider.html)The system materializer is a default materializer to use for most cases running streams, it is a single instance
per actor system that is tied to the lifecycle of that system.

The system materializer is a default materializer to use for most cases running streams, it is a single instance
per actor system that is tied to the lifecycle of that system.

Not intended to be manually used in user code.
42. [**](../../akka/stream/TLSClientAuth$.html "Permalink")  object [TLSClientAuth](TLSClientAuth$.html)
43. [**](../../akka/stream/TLSClosing$.html "Permalink")  object [TLSClosing](TLSClosing$.html)
44. [**](../../akka/stream/TLSProtocol$.html "Permalink")  object [TLSProtocol](TLSProtocol$.html)
45. [**](../../akka/stream/TLSRole$.html "Permalink")  object [TLSRole](TLSRole$.html "Many protocols are asymmetric and distinguish between the client and the server, where the latter listens passively for messages and the former actively initiates the exchange.")Many protocols are asymmetric and distinguish between the client and the
server, where the latter listens passively for messages and the former
actively initiates the exchange.
46. [**](../../akka/stream/ThrottleMode$.html "Permalink")  object [ThrottleMode](ThrottleMode$.html)
47. [**](../../akka/stream/UniformFanInShape$.html "Permalink")  object [UniformFanInShape](UniformFanInShape$.html)
48. [**](../../akka/stream/UniformFanOutShape$.html "Permalink")  object [UniformFanOutShape](UniformFanOutShape$.html)
### Deprecated Value Members

1. [**](../../akka/stream/BindFailedException$.html "Permalink")  case object [BindFailedException](BindFailedException$.html) extends [BindFailedException](BindFailedException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@deprecated Deprecated*(Since version 2\.4\.19\)* BindFailedException object will never be thrown. Match on the class instead.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/Done.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/current/akka/actor/index.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/index.html
- https://doc.akka.io/api/akka-core/current/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/current/akka/coordination/index.html
- https://doc.akka.io/api/akka-core/current/akka/discovery/index.html
- https://doc.akka.io/api/akka-core/current/akka/dispatch/index.html
- https://doc.akka.io/api/akka-core/current/akka/event/index.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/io/index.html
- https://doc.akka.io/api/akka-core/current/akka/japi/index.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/Patterns$.html
- https://doc.akka.io/api/akka-core/current/akka/pattern/index.html
- https://doc.akka.io/api/akka-core/current/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/current/akka/pki/index.html
- https://doc.akka.io/api/akka-core/current/akka/remote/index.html
- https://doc.akka.io/api/akka-core/current/akka/routing/index.html
- https://doc.akka.io/api/akka-core/current/akka/serialization/index.html
- https://doc.akka.io/api/akka-core/current/akka/stream/AbruptIOTerminationException.html
- https://doc.akka.io/api/akka-core/current/akka/stream/AbruptStageTerminationException.html
- https://doc.akka.io/api/akka-core/current/akka/stream/AbruptStreamTerminationException.html
- https://doc.akka.io/api/akka-core/current/akka/stream/AbruptTerminationException.html
- https://doc.akka.io/api/akka-core/current/akka/stream/AbstractShape.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ActorMaterializer$.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ActorMaterializerSettings$.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/api/akka-core/current/akka/stream/AmorphousShape.html
- https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka-core/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/current/akka/stream/BackpressureTimeoutException.html
- https://doc.akka.io/api/akka-core/current/akka/stream/BidiShape$.html
- https://doc.akka.io/api/akka-core/current/akka/stream/BidiShape.html
- https://doc.akka.io/api/akka-core/current/akka/stream/BindFailedException$.html
- https://doc.akka.io/api/akka-core/current/akka/stream/BindFailedException.html
- https://doc.akka.io/api/akka-core/current/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/api/akka-core/current/akka/stream/BufferOverflowException.html
- https://doc.akka.io/api/akka-core/current/akka/stream/Client$.html
- https://doc.akka.io/api/akka-core/current/akka/stream/Client.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ClosedShape$.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ClosedShape.html
- https://doc.akka.io/api/akka-core/current/akka/stream/CompletionStrategy$.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/stream/index.html](https://doc.akka.io/api/akka-core/current/akka/stream/index.html)*