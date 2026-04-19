---
description: Akka 2.10.17 - akka.stream.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:06:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/index.html
title: Akka 2.10.17 - akka.stream.scaladsl
---

# Akka 2.10.17 - akka.stream.scaladsl

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/impl/index.html "Permalink")  package [impl](../impl/index.html "The architecture of Akka Streams internally consists of several distinct layers:")The architecture of Akka Streams internally consists of several distinct layers:

The architecture of Akka Streams internally consists of several distinct layers:

 \* The DSLs like [akka.stream.scaladsl.Flow](Flow.html), [akka.stream.scaladsl.Source](Source.html) etc. are the user facing API
 for composing streams. These DSLs are a thin wrappers around the internal akka.stream.impl.TraversalBuilder
 builder classes. There are Java alternatives of these DSLs in [javadsl](../javadsl/index.html) which basically wrap their scala
 counterpart, delegating method calls.
 \* The [akka.stream.stage.GraphStage](../stage/GraphStage.html) API is the user facing API for creating new stream operators. These
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
 are used to execute synchronous islands (subgraphs) of [akka.stream.stage.GraphStage](../stage/GraphStage.html)s.

For the execution layer, refer to akka.stream.impl.fusing.GraphInterpreter.

#### Design goals

The central piece for both the DSLs and materialization is the akka.stream.impl.Traversal. This is the
representation of an Akka Stream, basically a [akka.stream.scaladsl.RunnableGraph](RunnableGraph.html). The design goals
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
 chains of operators, hence, it can only have at most one [OutPort](../OutPort.html) and [InPort](../InPort.html) unwired. Since there is no
 possible ambiguity between these two port types, there is no need for port mapping for these. Conversely,
 for those internal ports that are already wired, there is no need for port mapping as their relative wiring
 is not ambiguous (see previous section). As a result, the akka.stream.impl.LinearTraversalBuilder does not
 use any port mapping.

 The generic graph builder class akka.stream.impl.CompositeTraversalBuilder needs port mapping as it allows
 adding any kind of builders in any order. When adding a module (encoded as another akka.stream.impl.TraversalBuilder)
 there are two entities in play:

 \* The module (builder) to be added. This builder has a few ports unwired which are usually packaged in a [Shape](../Shape.html)
 which is stored alongside with the builder in the [Graph](../Graph.html) of the DSL. When invoking methods on this builder
 these set of ports must be used.
 \* The module that we are growing. This module needs a new set of ports to be used as it might add this module
 multiple times and needs to disambiguate these ports.

 Adding to the akka.stream.impl.CompositeTraversalBuilder involves the following steps (pseudocode):

 val newShape \= shape.deepCopy() // Copy the shape of the module we want to add
 val newBuilder \= builder.add(submodule, newShape) // Add the module, and register it with the new shape
 newBuilder.wire(newShape.in, ...) // Use the new ports to wire

 What happens in the background is that [Shape.deepCopy](../Shape.html#deepCopy():akka.stream.Shape) creates copies of the ports, and fills their
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

 \* [akka.stream.scaladsl.Source](Source.html) and [akka.stream.scaladsl.Flow](Flow.html) contain an unwired output port. Yet, we would
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

Definition Classes[stream](../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/scaladsl/index.html "Permalink")  package scaladslScala API: The flow DSL allows the formulation of stream transformations based on some
input.

Scala API: The flow DSL allows the formulation of stream transformations based on some
input. The starting point is called [Source](Source.html) and can be a collection, an iterator,
a block of code which is evaluated repeatedly or a org.reactivestreams.Publisher.
A flow with an attached input and open output is also a [Source](Source.html).

A flow may also be defined without an attached input or output and that is then
a [Flow](Flow.html). The `Flow` can be connected to the `Source` later by using [Source\#via](Source.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T]) with
the flow as argument, and it remains a [Source](Source.html).

Transformations can be appended to `Source` and `Flow` with the operations
defined in [FlowOps](FlowOps.html). Each DSL element produces a new flow that can be further transformed,
building up a description of the complete transformation pipeline.

The termination point of a flow is called [Sink](Sink.html) and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a [Sink](Sink.html).

If a flow has both an attached input and an attached output it becomes a [RunnableGraph](RunnableGraph.html).
In order to execute this pipeline the flow must be materialized by calling [RunnableGraph\#run](RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat) on it.

You can create your `Source`, `Flow` and `Sink` in any order and then wire them together before
they are materialized by connecting them using [Flow\#via](Flow.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Flow.this.Repr[T]) and [Flow\#to](Flow.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.Sink[In,Mat]), or connecting them into a
[GraphDSL](GraphDSL$.html) with fan\-in and fan\-out elements.

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

By default every operation is executed within its own [akka.actor.Actor](../../actor/Actor.html)
to enable full pipelining of the chained set of computations. This behavior
is determined by the [akka.stream.Materializer](../Materializer.html) which is required
by those methods that materialize the Flow into a series of
org.reactivestreams.Processor instances. The returned reactive stream
is fully started and active.

Definition Classes[stream](../index.html)
- [Balance](Balance.html "Fan-out the stream to several streams.")
- [BidiFlow](BidiFlow.html)
- [Broadcast](Broadcast.html "Fan-out the stream to several streams emitting each incoming upstream element to all downstream consumers.")
- [BroadcastHub](BroadcastHub$.html "A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.")
- [Compression](Compression$.html)
- [Concat](Concat.html "Takes multiple streams and outputs one stream formed from the input streams by first emitting all of the elements from the first stream and then emitting all of the elements from the second stream, etc.")
- [DelayStrategy](DelayStrategy.html "Allows to manage delay.")
- [FileIO](FileIO$.html "Factories to create sinks and sources from files")
- [Flow](Flow.html "A Flow is a set of stream processing steps that has one open input and one open output.")
- [FlowOps](FlowOps.html "Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left-to-right only.")
- [FlowOpsMat](FlowOpsMat.html "INTERNAL API: this trait will be changed in binary-incompatible ways for classes that are derived from it! Do not implement this interface outside the Akka code base!")
- [FlowWithContext](FlowWithContext.html "A flow that provides operations which automatically propagate the context of an element.")
- [FlowWithContextOps](FlowWithContextOps.html "Shared stream operations for FlowWithContext and SourceWithContext that automatically propagate a context element with each data element.")
- [Framing](Framing$.html)
- [GraphApply](GraphApply.html)
- [GraphDSL](GraphDSL$.html)
- [Interleave](Interleave.html "Interleave represents deterministic merge which takes N elements per input stream, in-order of inputs, emits them downstream and then cycles/\"wraps-around\" the inputs.")
- [JavaFlowSupport](JavaFlowSupport$.html "For use only with JDK 9+.")
- [JsonFraming](JsonFraming$.html "Provides JSON framing operators that can separate valid JSON objects from incoming ByteString objects.")
- [Keep](Keep$.html "Convenience functions for often-encountered purposes like keeping only the left (first) or only the right (second) of two input values.")
- [Merge](Merge.html "Merge several streams, taking elements as they arrive from input streams (picking randomly when several have elements ready).")
- [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")
- [MergeLatest](MergeLatest.html)
- [MergePreferred](MergePreferred.html "Merge several streams, taking elements as they arrive from input streams (picking from preferred when several have elements ready).")
- [MergePrioritized](MergePrioritized.html "Merge several streams, taking elements as they arrive from input streams (picking from prioritized once when several have elements ready).")
- [MergeSequence](MergeSequence.html "Takes multiple streams whose elements in aggregate have a defined linear sequence with difference 1, starting at 0, and outputs a single stream containing these elements, in order.")
- [MergeSorted](MergeSorted.html "Merge two pre-sorted streams such that the resulting stream is sorted.")
- [OrElse](OrElse$.html)
- [Partition](Partition.html "Fan-out the stream to several streams.")
- [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")
- [RestartFlow](RestartFlow$.html "A RestartFlow wraps a Flow that gets restarted when it completes or fails.")
- [RestartSink](RestartSink$.html "A RestartSink wraps a Sink that gets restarted when it completes or fails.")
- [RestartSource](RestartSource$.html "A RestartSource wraps a Source that gets restarted when it completes or fails.")
- [RestartSourceWithContext](RestartSourceWithContext$.html "A RestartSourceWithContext wraps a SourceWithContext that gets restarted when it completes or fails.")
- [RestartWithBackoffFlow](RestartWithBackoffFlow$.html)
- [RetryFlow](RetryFlow$.html)
- [RunnableGraph](RunnableGraph.html "Flow with attached input and output, can be executed.")
- [ScalaSessionAPI](ScalaSessionAPI.html "Allows access to an SSLSession with Scala types")
- [Sink](Sink.html "A Sink is a set of stream processing steps that has one open input.")
- [SinkQueue](SinkQueue.html "This trait allows to have a queue as a sink for a stream.")
- [SinkQueueWithCancel](SinkQueueWithCancel.html "This trait adds cancel support to SinkQueue.")
- [SinkToCompletionStage](package$$SinkToCompletionStage.html)
- [Source](Source.html "A Source is a set of stream processing steps that has one open output.")
- [SourceQueue](SourceQueue.html "This trait allows to have a queue as a data source for some stream.")
- [SourceQueueWithComplete](SourceQueueWithComplete.html "This trait adds completion support to SourceQueue.")
- [SourceToCompletionStage](package$$SourceToCompletionStage.html)
- [SourceWithContext](SourceWithContext.html "A source that provides operations which automatically propagate the context of an element.")
- [StreamConverters](StreamConverters$.html "Converters for interacting with the blocking java.io streams APIs and Java 8 Streams")
- [StreamRefs](StreamRefs$.html "Factories for creating stream refs.")
- [SubFlow](SubFlow.html "A “stream of streams” sub-flow of data elements, e.g.")
- [TLS](TLS$.html "Stream cipher support based upon JSSE.")
- [TLSPlacebo](TLSPlacebo$.html "This object holds simple wrapping akka.stream.scaladsl.BidiFlow implementations that can be used instead of TLS when no encryption is desired.")
- [Tcp](Tcp.html)
- [TcpAttributes](TcpAttributes$.html)
- [TcpIdleTimeoutException](TcpIdleTimeoutException.html)
- [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.")
- [Unzip](Unzip.html "Takes a stream of pair elements and splits each pair to two output streams.")
- [UnzipWith](UnzipWith$.html "Transforms each element of input stream into multiple streams using a splitter function.")
- [UnzipWith10](UnzipWith10.html "UnzipWith specialized for 10 outputs")
- [UnzipWith11](UnzipWith11.html "UnzipWith specialized for 11 outputs")
- [UnzipWith12](UnzipWith12.html "UnzipWith specialized for 12 outputs")
- [UnzipWith13](UnzipWith13.html "UnzipWith specialized for 13 outputs")
- [UnzipWith14](UnzipWith14.html "UnzipWith specialized for 14 outputs")
- [UnzipWith15](UnzipWith15.html "UnzipWith specialized for 15 outputs")
- [UnzipWith16](UnzipWith16.html "UnzipWith specialized for 16 outputs")
- [UnzipWith17](UnzipWith17.html "UnzipWith specialized for 17 outputs")
- [UnzipWith18](UnzipWith18.html "UnzipWith specialized for 18 outputs")
- [UnzipWith19](UnzipWith19.html "UnzipWith specialized for 19 outputs")
- [UnzipWith2](UnzipWith2.html "UnzipWith specialized for 2 outputs")
- [UnzipWith20](UnzipWith20.html "UnzipWith specialized for 20 outputs")
- [UnzipWith21](UnzipWith21.html "UnzipWith specialized for 21 outputs")
- [UnzipWith22](UnzipWith22.html "UnzipWith specialized for 22 outputs")
- [UnzipWith3](UnzipWith3.html "UnzipWith specialized for 3 outputs")
- [UnzipWith4](UnzipWith4.html "UnzipWith specialized for 4 outputs")
- [UnzipWith5](UnzipWith5.html "UnzipWith specialized for 5 outputs")
- [UnzipWith6](UnzipWith6.html "UnzipWith specialized for 6 outputs")
- [UnzipWith7](UnzipWith7.html "UnzipWith specialized for 7 outputs")
- [UnzipWith8](UnzipWith8.html "UnzipWith specialized for 8 outputs")
- [UnzipWith9](UnzipWith9.html "UnzipWith specialized for 9 outputs")
- [UnzipWithApply](UnzipWithApply.html)
- [WireTap](WireTap$.html)
- [Zip](Zip.html "Combine the elements of 2 streams into a stream of tuples.")
- [ZipLatest](ZipLatest.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipLatestWith10](ZipLatestWith10.html "ZipLatestWith specialized for 10 inputs")
- [ZipLatestWith11](ZipLatestWith11.html "ZipLatestWith specialized for 11 inputs")
- [ZipLatestWith12](ZipLatestWith12.html "ZipLatestWith specialized for 12 inputs")
- [ZipLatestWith13](ZipLatestWith13.html "ZipLatestWith specialized for 13 inputs")
- [ZipLatestWith14](ZipLatestWith14.html "ZipLatestWith specialized for 14 inputs")
- [ZipLatestWith15](ZipLatestWith15.html "ZipLatestWith specialized for 15 inputs")
- [ZipLatestWith16](ZipLatestWith16.html "ZipLatestWith specialized for 16 inputs")
- [ZipLatestWith17](ZipLatestWith17.html "ZipLatestWith specialized for 17 inputs")
- [ZipLatestWith18](ZipLatestWith18.html "ZipLatestWith specialized for 18 inputs")
- [ZipLatestWith19](ZipLatestWith19.html "ZipLatestWith specialized for 19 inputs")
- [ZipLatestWith2](ZipLatestWith2.html "ZipLatestWith specialized for 2 inputs")
- [ZipLatestWith20](ZipLatestWith20.html "ZipLatestWith specialized for 20 inputs")
- [ZipLatestWith21](ZipLatestWith21.html "ZipLatestWith specialized for 21 inputs")
- [ZipLatestWith22](ZipLatestWith22.html "ZipLatestWith specialized for 22 inputs")
- [ZipLatestWith3](ZipLatestWith3.html "ZipLatestWith specialized for 3 inputs")
- [ZipLatestWith4](ZipLatestWith4.html "ZipLatestWith specialized for 4 inputs")
- [ZipLatestWith5](ZipLatestWith5.html "ZipLatestWith specialized for 5 inputs")
- [ZipLatestWith6](ZipLatestWith6.html "ZipLatestWith specialized for 6 inputs")
- [ZipLatestWith7](ZipLatestWith7.html "ZipLatestWith specialized for 7 inputs")
- [ZipLatestWith8](ZipLatestWith8.html "ZipLatestWith specialized for 8 inputs")
- [ZipLatestWith9](ZipLatestWith9.html "ZipLatestWith specialized for 9 inputs")
- [ZipLatestWithApply](ZipLatestWithApply.html)
- [ZipN](ZipN.html "Combine the elements of multiple streams into a stream of sequences.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWith10](ZipWith10.html "ZipWith specialized for 10 inputs")
- [ZipWith11](ZipWith11.html "ZipWith specialized for 11 inputs")
- [ZipWith12](ZipWith12.html "ZipWith specialized for 12 inputs")
- [ZipWith13](ZipWith13.html "ZipWith specialized for 13 inputs")
- [ZipWith14](ZipWith14.html "ZipWith specialized for 14 inputs")
- [ZipWith15](ZipWith15.html "ZipWith specialized for 15 inputs")
- [ZipWith16](ZipWith16.html "ZipWith specialized for 16 inputs")
- [ZipWith17](ZipWith17.html "ZipWith specialized for 17 inputs")
- [ZipWith18](ZipWith18.html "ZipWith specialized for 18 inputs")
- [ZipWith19](ZipWith19.html "ZipWith specialized for 19 inputs")
- [ZipWith2](ZipWith2.html "ZipWith specialized for 2 inputs")
- [ZipWith20](ZipWith20.html "ZipWith specialized for 20 inputs")
- [ZipWith21](ZipWith21.html "ZipWith specialized for 21 inputs")
- [ZipWith22](ZipWith22.html "ZipWith specialized for 22 inputs")
- [ZipWith3](ZipWith3.html "ZipWith specialized for 3 inputs")
- [ZipWith4](ZipWith4.html "ZipWith specialized for 4 inputs")
- [ZipWith5](ZipWith5.html "ZipWith specialized for 5 inputs")
- [ZipWith6](ZipWith6.html "ZipWith specialized for 6 inputs")
- [ZipWith7](ZipWith7.html "ZipWith specialized for 7 inputs")
- [ZipWith8](ZipWith8.html "ZipWith specialized for 8 inputs")
- [ZipWith9](ZipWith9.html "ZipWith specialized for 9 inputs")
- [ZipWithApply](ZipWithApply.html)
- [ZipWithN](ZipWithN.html "Combine the elements of multiple streams into a stream of sequences using a combiner function.")
- [**](../../../akka/stream/snapshot/index.html "Permalink")  package [snapshot](../snapshot/index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/stage/index.html "Permalink")  package [stage](../stage/index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[stream](../index.html)
p[akka](../../index.html).[stream](../index.html)

# scaladsl[**](../../../akka/stream/scaladsl/index.html "Permalink")

#### package scaladsl

Scala API: The flow DSL allows the formulation of stream transformations based on some
input. The starting point is called [Source](Source.html) and can be a collection, an iterator,
a block of code which is evaluated repeatedly or a org.reactivestreams.Publisher.
A flow with an attached input and open output is also a [Source](Source.html).

A flow may also be defined without an attached input or output and that is then
a [Flow](Flow.html). The `Flow` can be connected to the `Source` later by using [Source\#via](Source.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T]) with
the flow as argument, and it remains a [Source](Source.html).

Transformations can be appended to `Source` and `Flow` with the operations
defined in [FlowOps](FlowOps.html). Each DSL element produces a new flow that can be further transformed,
building up a description of the complete transformation pipeline.

The termination point of a flow is called [Sink](Sink.html) and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a [Sink](Sink.html).

If a flow has both an attached input and an attached output it becomes a [RunnableGraph](RunnableGraph.html).
In order to execute this pipeline the flow must be materialized by calling [RunnableGraph\#run](RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat) on it.

You can create your `Source`, `Flow` and `Sink` in any order and then wire them together before
they are materialized by connecting them using [Flow\#via](Flow.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Flow.this.Repr[T]) and [Flow\#to](Flow.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.Sink[In,Mat]), or connecting them into a
[GraphDSL](GraphDSL$.html) with fan\-in and fan\-out elements.

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

By default every operation is executed within its own [akka.actor.Actor](../../actor/Actor.html)
to enable full pipelining of the chained set of computations. This behavior
is determined by the [akka.stream.Materializer](../Materializer.html) which is required
by those methods that materialize the Flow into a series of
org.reactivestreams.Processor instances. The returned reactive stream
is fully started and active.

Source[package.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/package.scala#L57)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. scaladsl
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/scaladsl/Balance.html "Permalink") final  class [Balance](Balance.html "Fan-out the stream to several streams.")\[T] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, T]]Fan\-out the stream to several streams.

Fan\-out the stream to several streams. Each upstream element is emitted to the first available downstream consumer.
It will not shut down until the subscriptions
for at least two downstream subscribers have been established.

A `Balance` has one `in` port and 2 or more `out` ports.

**Emits when** any of the outputs stops backpressuring; emits the element to the first available output

**Backpressures when** all of the outputs backpressure

**Completes when** upstream completes

**Cancels when** If eagerCancel is enabled: when any downstream cancels; otherwise: when all downstreams cancel
2. [**](../../../akka/stream/scaladsl/BidiFlow.html "Permalink") final  class [BidiFlow](BidiFlow.html)\[\-I1, \+O1, \-I2, \+O2, \+Mat] extends [Graph](../Graph.html)\[[BidiShape](../BidiShape.html)\[I1, O1, I2, O2], Mat]
3. [**](../../../akka/stream/scaladsl/Broadcast.html "Permalink") final  class [Broadcast](Broadcast.html "Fan-out the stream to several streams emitting each incoming upstream element to all downstream consumers.")\[T] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, T]]Fan\-out the stream to several streams emitting each incoming upstream element to all downstream consumers.

Fan\-out the stream to several streams emitting each incoming upstream element to all downstream consumers.
It will not shut down until the subscriptions for at least two downstream subscribers have been established.

**Emits when** all of the outputs stops backpressuring and there is an input element available

**Backpressures when** any of the outputs backpressure

**Completes when** upstream completes

**Cancels when**
 If eagerCancel is enabled: when any downstream cancels; otherwise: when all downstreams cancel
4. [**](../../../akka/stream/scaladsl/Concat.html "Permalink") final  class [Concat](Concat.html "Takes multiple streams and outputs one stream formed from the input streams by first emitting all of the elements from the first stream and then emitting all of the elements from the second stream, etc.")\[T] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, T]]Takes multiple streams and outputs one stream formed from the input streams
by first emitting all of the elements from the first stream and then emitting
all of the elements from the second stream, etc.

Takes multiple streams and outputs one stream formed from the input streams
by first emitting all of the elements from the first stream and then emitting
all of the elements from the second stream, etc.

A `Concat` has one `first` port, one `second` port and one `out` port.

**Emits when** the current stream has an element available; if the current input completes, it tries the next one

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete

**Cancels when** downstream cancels
5. [**](../../../akka/stream/scaladsl/DelayStrategy.html "Permalink")  trait [DelayStrategy](DelayStrategy.html "Allows to manage delay.")\[\-T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Allows to manage delay.

Allows to manage delay. Can be stateful to compute delay for any sequence
of elements, as instances are not shared among running streams and all
elements go through nextDelay(), updating state and returning delay for that
element.
6. [**](../../../akka/stream/scaladsl/Flow.html "Permalink") final  class [Flow](Flow.html "A Flow is a set of stream processing steps that has one open input and one open output.")\[\-In, \+Out, \+Mat] extends [FlowOpsMat](FlowOpsMat.html)\[Out, Mat] with [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[In, Out], Mat]A `Flow` is a set of stream processing steps that has one open input and one open output.
7. [**](../../../akka/stream/scaladsl/FlowOps.html "Permalink")  trait [FlowOps](FlowOps.html "Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left-to-right only.")\[\+Out, \+Mat] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left\-to\-right only.

Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left\-to\-right only.

INTERNAL API: this trait will be changed in binary\-incompatible ways for classes that are derived from it!
Do not implement this interface outside the Akka code base!

Binary compatibility is only maintained for callers of this trait’s interface.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
8. [**](../../../akka/stream/scaladsl/FlowOpsMat.html "Permalink")  trait [FlowOpsMat](FlowOpsMat.html "INTERNAL API: this trait will be changed in binary-incompatible ways for classes that are derived from it! Do not implement this interface outside the Akka code base!")\[\+Out, \+Mat] extends [FlowOps](FlowOps.html)\[Out, Mat]INTERNAL API: this trait will be changed in binary\-incompatible ways for classes that are derived from it!
Do not implement this interface outside the Akka code base!

INTERNAL API: this trait will be changed in binary\-incompatible ways for classes that are derived from it!
Do not implement this interface outside the Akka code base!

Binary compatibility is only maintained for callers of this trait’s interface.
9. [**](../../../akka/stream/scaladsl/FlowWithContext.html "Permalink") final  class [FlowWithContext](FlowWithContext.html "A flow that provides operations which automatically propagate the context of an element.")\[\-In, \-CtxIn, \+Out, \+CtxOut, \+Mat] extends GraphDelegate\[[FlowShape](../FlowShape.html)\[(In, CtxIn), (Out, CtxOut)], Mat] with [FlowWithContextOps](FlowWithContextOps.html)\[Out, CtxOut, Mat]A flow that provides operations which automatically propagate the context of an element.

A flow that provides operations which automatically propagate the context of an element.
Only a subset of common operations from [FlowOps](FlowOps.html) is supported. As an escape hatch you can
use [FlowWithContextOps.via](FlowWithContextOps.html#via[Out2,Ctx2,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[(Out,Ctx),(Out2,Ctx2)],Mat2]):FlowWithContextOps.this.Repr[Out2,Ctx2]) to manually provide the context propagation for otherwise unsupported
operations.

An "empty" flow can be created by calling `FlowWithContext[Ctx, T]`.
10. [**](../../../akka/stream/scaladsl/FlowWithContextOps.html "Permalink")  trait [FlowWithContextOps](FlowWithContextOps.html "Shared stream operations for FlowWithContext and SourceWithContext that automatically propagate a context element with each data element.")\[\+Out, \+Ctx, \+Mat] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Shared stream operations for [FlowWithContext](FlowWithContext.html) and [SourceWithContext](SourceWithContext.html) that automatically propagate a context
element with each data element.
11. [**](../../../akka/stream/scaladsl/GraphApply.html "Permalink")  trait [GraphApply](GraphApply.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../../akka/stream/scaladsl/Interleave.html "Permalink") final  class [Interleave](Interleave.html "Interleave represents deterministic merge which takes N elements per input stream, in-order of inputs, emits them downstream and then cycles/\"wraps-around\" the inputs.")\[T] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, T]]Interleave represents deterministic merge which takes N elements per input stream,
in\-order of inputs, emits them downstream and then cycles/"wraps\-around" the inputs.

Interleave represents deterministic merge which takes N elements per input stream,
in\-order of inputs, emits them downstream and then cycles/"wraps\-around" the inputs.

**Emits when** element is available from current input (depending on phase)

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)

**Cancels when** downstream cancels
13. [**](../../../akka/stream/scaladsl/Merge.html "Permalink") final  class [Merge](Merge.html "Merge several streams, taking elements as they arrive from input streams (picking randomly when several have elements ready).")\[T] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, T]]Merge several streams, taking elements as they arrive from input streams
(picking randomly when several have elements ready).

Merge several streams, taking elements as they arrive from input streams
(picking randomly when several have elements ready).

**Emits when** one of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels
14. [**](../../../akka/stream/scaladsl/MergeLatest.html "Permalink") final  class [MergeLatest](MergeLatest.html)\[T, M] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, M]]
15. [**](../../../akka/stream/scaladsl/MergePreferred.html "Permalink") final  class [MergePreferred](MergePreferred.html "Merge several streams, taking elements as they arrive from input streams (picking from preferred when several have elements ready).")\[T] extends [GraphStage](../stage/GraphStage.html)\[[MergePreferredShape](MergePreferred$$MergePreferredShape.html)\[T]]Merge several streams, taking elements as they arrive from input streams
(picking from preferred when several have elements ready).

Merge several streams, taking elements as they arrive from input streams
(picking from preferred when several have elements ready).

A `MergePreferred` has one `out` port, one `preferred` input port and 1 or more secondary `in` ports.

**Emits when** one of the inputs has an element available, preferring
a specified input if multiple have elements available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels
16. [**](../../../akka/stream/scaladsl/MergePrioritized.html "Permalink") final  class [MergePrioritized](MergePrioritized.html "Merge several streams, taking elements as they arrive from input streams (picking from prioritized once when several have elements ready).")\[T] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, T]]Merge several streams, taking elements as they arrive from input streams
(picking from prioritized once when several have elements ready).

Merge several streams, taking elements as they arrive from input streams
(picking from prioritized once when several have elements ready).

A `MergePrioritized` has one `out` port, one or more input port with their priorities.

**Emits when** one of the inputs has an element available, preferring
a input based on its priority if multiple have elements available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels
17. [**](../../../akka/stream/scaladsl/MergeSequence.html "Permalink") final  class [MergeSequence](MergeSequence.html "Takes multiple streams whose elements in aggregate have a defined linear sequence with difference 1, starting at 0, and outputs a single stream containing these elements, in order.")\[T] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanInShape](../UniformFanInShape.html)\[T, T]]Takes multiple streams whose elements in aggregate have a defined linear
sequence with difference 1, starting at 0, and outputs a single stream
containing these elements, in order.

Takes multiple streams whose elements in aggregate have a defined linear
sequence with difference 1, starting at 0, and outputs a single stream
containing these elements, in order. That is, given a set of input streams
with combined elements \*ek\*:

\*e0\*, \*e1\*, \*e2\*, ..., \*en\*

This will output a stream ordered by \*k\*.

The elements in the input streams must already be sorted according to the
sequence. The input streams do not need to be linear, but the aggregate
stream must be linear, no element \*k\* may be skipped or duplicated, either
of these conditions will cause the stream to fail.

The typical use case for this is to merge a partitioned stream back
together while maintaining order. This can be achieved by first using
`zipWithIndex` on the input stream, then partitioning using a
[Partition](Partition.html) fanout, and then maintaining the index through the processing
of each partition before bringing together with this stage.

**Emits when** one of the upstreams has the next expected element in the
sequence available.

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete

**Cancels when** downstream cancels
18. [**](../../../akka/stream/scaladsl/MergeSorted.html "Permalink") final  class [MergeSorted](MergeSorted.html "Merge two pre-sorted streams such that the resulting stream is sorted.")\[T] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape2](../FanInShape2.html)\[T, T, T]]Merge two pre\-sorted streams such that the resulting stream is sorted.

Merge two pre\-sorted streams such that the resulting stream is sorted.

**Emits when** both inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete

**Cancels when** downstream cancels
19. [**](../../../akka/stream/scaladsl/Partition.html "Permalink") final  class [Partition](Partition.html "Fan-out the stream to several streams.")\[T] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanOutShape](../UniformFanOutShape.html)\[T, T]]Fan\-out the stream to several streams.

Fan\-out the stream to several streams. emitting an incoming upstream element to one downstream consumer according
to the partitioner function applied to the element

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** emits when an element is available from the input and the chosen output has demand

**Backpressures when** the currently chosen output back\-pressures

**Completes when** upstream completes and no output is pending

**Cancels when** all downstreams have cancelled (eagerCancel\=false) or one downstream cancels (eagerCancel\=true)
20. [**](../../../akka/stream/scaladsl/RunnableGraph.html "Permalink") final  case class [RunnableGraph](RunnableGraph.html "Flow with attached input and output, can be executed.")\[\+Mat](traversalBuilder: TraversalBuilder) extends [Graph](../Graph.html)\[[ClosedShape](../ClosedShape.html), Mat] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableFlow with attached input and output, can be executed.
21. [**](../../../akka/stream/scaladsl/ScalaSessionAPI.html "Permalink")  trait [ScalaSessionAPI](ScalaSessionAPI.html "Allows access to an SSLSession with Scala types") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Allows access to an SSLSession with Scala types
22. [**](../../../akka/stream/scaladsl/Sink.html "Permalink") final  class [Sink](Sink.html "A Sink is a set of stream processing steps that has one open input.")\[\-In, \+Mat] extends [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], Mat]A `Sink` is a set of stream processing steps that has one open input.

A `Sink` is a set of stream processing steps that has one open input.
Can be used as a `Subscriber`
23. [**](../../../akka/stream/scaladsl/SinkQueue.html "Permalink")  trait [SinkQueue](SinkQueue.html "This trait allows to have a queue as a sink for a stream.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This trait allows to have a queue as a sink for a stream.

This trait allows to have a queue as a sink for a stream.
A [SinkQueue](SinkQueue.html) pulls data from a stream with a backpressure mechanism.
24. [**](../../../akka/stream/scaladsl/SinkQueueWithCancel.html "Permalink")  trait [SinkQueueWithCancel](SinkQueueWithCancel.html "This trait adds cancel support to SinkQueue.")\[T] extends [SinkQueue](SinkQueue.html)\[T]This trait adds cancel support to [SinkQueue](SinkQueue.html).
25. [**](../../../akka/stream/scaladsl/package$$SinkToCompletionStage.html "Permalink") implicit final  class [SinkToCompletionStage](package$$SinkToCompletionStage.html)\[In, T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
26. [**](../../../akka/stream/scaladsl/Source.html "Permalink") final  class [Source](Source.html "A Source is a set of stream processing steps that has one open output.")\[\+Out, \+Mat] extends [FlowOpsMat](FlowOpsMat.html)\[Out, Mat] with [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out], Mat]A `Source` is a set of stream processing steps that has one open output.

A `Source` is a set of stream processing steps that has one open output. It can comprise
any number of internal sources and transformations that are wired together, or it can be
an “atomic” source, e.g. from a collection or a file. Materialization turns a Source into
a Reactive Streams `Publisher` (at least conceptually).
27. [**](../../../akka/stream/scaladsl/SourceQueue.html "Permalink")  trait [SourceQueue](SourceQueue.html "This trait allows to have a queue as a data source for some stream.")\[T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This trait allows to have a queue as a data source for some stream.
28. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete.html "Permalink")  trait [SourceQueueWithComplete](SourceQueueWithComplete.html "This trait adds completion support to SourceQueue.")\[T] extends [SourceQueue](SourceQueue.html)\[T]This trait adds completion support to [SourceQueue](SourceQueue.html).
29. [**](../../../akka/stream/scaladsl/package$$SourceToCompletionStage.html "Permalink") implicit final  class [SourceToCompletionStage](package$$SourceToCompletionStage.html)\[Out, T] extends [AnyVal](https://www.scala-lang.org/api/2.13.17/scala/AnyVal.html#scala.AnyVal)
30. [**](../../../akka/stream/scaladsl/SourceWithContext.html "Permalink") final  class [SourceWithContext](SourceWithContext.html "A source that provides operations which automatically propagate the context of an element.")\[\+Out, \+Ctx, \+Mat] extends GraphDelegate\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat] with [FlowWithContextOps](FlowWithContextOps.html)\[Out, Ctx, Mat]A source that provides operations which automatically propagate the context of an element.

A source that provides operations which automatically propagate the context of an element.
Only a subset of common operations from [FlowOps](FlowOps.html) is supported. As an escape hatch you can
use [FlowWithContextOps.via](FlowWithContextOps.html#via[Out2,Ctx2,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[(Out,Ctx),(Out2,Ctx2)],Mat2]):FlowWithContextOps.this.Repr[Out2,Ctx2]) to manually provide the context propagation for otherwise unsupported
operations.

Can be created by calling [Source.asSourceWithContext](Source.html#asSourceWithContext[Ctx](f:Out=>Ctx):akka.stream.scaladsl.SourceWithContext[Out,Ctx,Mat])
31. [**](../../../akka/stream/scaladsl/SubFlow.html "Permalink")  trait [SubFlow](SubFlow.html "A “stream of streams” sub-flow of data elements, e.g.")\[\+Out, \+Mat, \+F\[\+\_], C] extends [FlowOps](FlowOps.html)\[Out, Mat]A “stream of streams” sub\-flow of data elements, e.g.

A “stream of streams” sub\-flow of data elements, e.g. produced by `groupBy`.
SubFlows cannot contribute to the super\-flow’s materialized value since they
are materialized later, during the runtime of the flow graph processing.

Not for user extension

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)()
32. [**](../../../akka/stream/scaladsl/Tcp.html "Permalink") final  class [Tcp](Tcp.html) extends [Extension](../../actor/Extension.html)
33. [**](../../../akka/stream/scaladsl/TcpIdleTimeoutException.html "Permalink") final  class [TcpIdleTimeoutException](TcpIdleTimeoutException.html) extends [TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html#java.util.concurrent.TimeoutException) with [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)
34. [**](../../../akka/stream/scaladsl/ThrottleControl.html "Permalink") final  class [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Control the throttle rate from the outside of the stream, or share a common throttle rate
across several streams.
35. [**](../../../akka/stream/scaladsl/Unzip.html "Permalink") final  class [Unzip](Unzip.html "Takes a stream of pair elements and splits each pair to two output streams.")\[A, B] extends [UnzipWith2](UnzipWith2.html)\[(A, B), A, B]Takes a stream of pair elements and splits each pair to two output streams.

Takes a stream of pair elements and splits each pair to two output streams.

An `Unzip` has one `in` port and one `left` and one `right` output port.

**Emits when** all of the outputs stop backpressuring and there is an input element available

**Backpressures when** any of the outputs backpressure

**Completes when** upstream completes

**Cancels when** any downstream cancels
36. [**](../../../akka/stream/scaladsl/UnzipWith10.html "Permalink")  class [UnzipWith10](UnzipWith10.html "UnzipWith specialized for 10 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape10](../FanOutShape10.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10]]`UnzipWith` specialized for 10 outputs
37. [**](../../../akka/stream/scaladsl/UnzipWith11.html "Permalink")  class [UnzipWith11](UnzipWith11.html "UnzipWith specialized for 11 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape11](../FanOutShape11.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11]]`UnzipWith` specialized for 11 outputs
38. [**](../../../akka/stream/scaladsl/UnzipWith12.html "Permalink")  class [UnzipWith12](UnzipWith12.html "UnzipWith specialized for 12 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape12](../FanOutShape12.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12]]`UnzipWith` specialized for 12 outputs
39. [**](../../../akka/stream/scaladsl/UnzipWith13.html "Permalink")  class [UnzipWith13](UnzipWith13.html "UnzipWith specialized for 13 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape13](../FanOutShape13.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13]]`UnzipWith` specialized for 13 outputs
40. [**](../../../akka/stream/scaladsl/UnzipWith14.html "Permalink")  class [UnzipWith14](UnzipWith14.html "UnzipWith specialized for 14 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape14](../FanOutShape14.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14]]`UnzipWith` specialized for 14 outputs
41. [**](../../../akka/stream/scaladsl/UnzipWith15.html "Permalink")  class [UnzipWith15](UnzipWith15.html "UnzipWith specialized for 15 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape15](../FanOutShape15.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15]]`UnzipWith` specialized for 15 outputs
42. [**](../../../akka/stream/scaladsl/UnzipWith16.html "Permalink")  class [UnzipWith16](UnzipWith16.html "UnzipWith specialized for 16 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape16](../FanOutShape16.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16]]`UnzipWith` specialized for 16 outputs
43. [**](../../../akka/stream/scaladsl/UnzipWith17.html "Permalink")  class [UnzipWith17](UnzipWith17.html "UnzipWith specialized for 17 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape17](../FanOutShape17.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17]]`UnzipWith` specialized for 17 outputs
44. [**](../../../akka/stream/scaladsl/UnzipWith18.html "Permalink")  class [UnzipWith18](UnzipWith18.html "UnzipWith specialized for 18 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape18](../FanOutShape18.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18]]`UnzipWith` specialized for 18 outputs
45. [**](../../../akka/stream/scaladsl/UnzipWith19.html "Permalink")  class [UnzipWith19](UnzipWith19.html "UnzipWith specialized for 19 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape19](../FanOutShape19.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19]]`UnzipWith` specialized for 19 outputs
46. [**](../../../akka/stream/scaladsl/UnzipWith2.html "Permalink")  class [UnzipWith2](UnzipWith2.html "UnzipWith specialized for 2 outputs")\[In, A1, A2] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape2](../FanOutShape2.html)\[In, A1, A2]]`UnzipWith` specialized for 2 outputs
47. [**](../../../akka/stream/scaladsl/UnzipWith20.html "Permalink")  class [UnzipWith20](UnzipWith20.html "UnzipWith specialized for 20 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape20](../FanOutShape20.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20]]`UnzipWith` specialized for 20 outputs
48. [**](../../../akka/stream/scaladsl/UnzipWith21.html "Permalink")  class [UnzipWith21](UnzipWith21.html "UnzipWith specialized for 21 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape21](../FanOutShape21.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21]]`UnzipWith` specialized for 21 outputs
49. [**](../../../akka/stream/scaladsl/UnzipWith22.html "Permalink")  class [UnzipWith22](UnzipWith22.html "UnzipWith specialized for 22 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape22](../FanOutShape22.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22]]`UnzipWith` specialized for 22 outputs
50. [**](../../../akka/stream/scaladsl/UnzipWith3.html "Permalink")  class [UnzipWith3](UnzipWith3.html "UnzipWith specialized for 3 outputs")\[In, A1, A2, A3] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape3](../FanOutShape3.html)\[In, A1, A2, A3]]`UnzipWith` specialized for 3 outputs
51. [**](../../../akka/stream/scaladsl/UnzipWith4.html "Permalink")  class [UnzipWith4](UnzipWith4.html "UnzipWith specialized for 4 outputs")\[In, A1, A2, A3, A4] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape4](../FanOutShape4.html)\[In, A1, A2, A3, A4]]`UnzipWith` specialized for 4 outputs
52. [**](../../../akka/stream/scaladsl/UnzipWith5.html "Permalink")  class [UnzipWith5](UnzipWith5.html "UnzipWith specialized for 5 outputs")\[In, A1, A2, A3, A4, A5] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape5](../FanOutShape5.html)\[In, A1, A2, A3, A4, A5]]`UnzipWith` specialized for 5 outputs
53. [**](../../../akka/stream/scaladsl/UnzipWith6.html "Permalink")  class [UnzipWith6](UnzipWith6.html "UnzipWith specialized for 6 outputs")\[In, A1, A2, A3, A4, A5, A6] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape6](../FanOutShape6.html)\[In, A1, A2, A3, A4, A5, A6]]`UnzipWith` specialized for 6 outputs
54. [**](../../../akka/stream/scaladsl/UnzipWith7.html "Permalink")  class [UnzipWith7](UnzipWith7.html "UnzipWith specialized for 7 outputs")\[In, A1, A2, A3, A4, A5, A6, A7] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape7](../FanOutShape7.html)\[In, A1, A2, A3, A4, A5, A6, A7]]`UnzipWith` specialized for 7 outputs
55. [**](../../../akka/stream/scaladsl/UnzipWith8.html "Permalink")  class [UnzipWith8](UnzipWith8.html "UnzipWith specialized for 8 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape8](../FanOutShape8.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8]]`UnzipWith` specialized for 8 outputs
56. [**](../../../akka/stream/scaladsl/UnzipWith9.html "Permalink")  class [UnzipWith9](UnzipWith9.html "UnzipWith specialized for 9 outputs")\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9] extends [GraphStage](../stage/GraphStage.html)\[[FanOutShape9](../FanOutShape9.html)\[In, A1, A2, A3, A4, A5, A6, A7, A8, A9]]`UnzipWith` specialized for 9 outputs
57. [**](../../../akka/stream/scaladsl/UnzipWithApply.html "Permalink")  trait [UnzipWithApply](UnzipWithApply.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
58. [**](../../../akka/stream/scaladsl/Zip.html "Permalink") final  class [Zip](Zip.html "Combine the elements of 2 streams into a stream of tuples.")\[A, B] extends [ZipWith2](ZipWith2.html)\[A, B, (A, B)]Combine the elements of 2 streams into a stream of tuples.

Combine the elements of 2 streams into a stream of tuples.

A `Zip` has a `left` and a `right` input port and one `out` port

**Emits when** all of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
59. [**](../../../akka/stream/scaladsl/ZipLatest.html "Permalink") final  class [ZipLatest](ZipLatest.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")\[A, B] extends [ZipLatestWith2](ZipLatestWith2.html)\[A, B, (A, B)]Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

A `ZipLatest` has a `left` and a `right` input port and one `out` port.

No element is emitted until at least one element from each Source becomes available.

**Emits when** all of the inputs have at least an element available, and then each time an element becomes
\* available on either of the inputs

**Backpressures when** downstream backpressures

**Completes when** any upstream completes if `eagerComplete` is enabled or wait for all upstreams to complete

**Cancels when** downstream cancels
60. [**](../../../akka/stream/scaladsl/ZipLatestWith10.html "Permalink")  class [ZipLatestWith10](ZipLatestWith10.html "ZipLatestWith specialized for 10 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape10](../FanInShape10.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, O]]`ZipLatestWith` specialized for 10 inputs
61. [**](../../../akka/stream/scaladsl/ZipLatestWith11.html "Permalink")  class [ZipLatestWith11](ZipLatestWith11.html "ZipLatestWith specialized for 11 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape11](../FanInShape11.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, O]]`ZipLatestWith` specialized for 11 inputs
62. [**](../../../akka/stream/scaladsl/ZipLatestWith12.html "Permalink")  class [ZipLatestWith12](ZipLatestWith12.html "ZipLatestWith specialized for 12 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape12](../FanInShape12.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, O]]`ZipLatestWith` specialized for 12 inputs
63. [**](../../../akka/stream/scaladsl/ZipLatestWith13.html "Permalink")  class [ZipLatestWith13](ZipLatestWith13.html "ZipLatestWith specialized for 13 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape13](../FanInShape13.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, O]]`ZipLatestWith` specialized for 13 inputs
64. [**](../../../akka/stream/scaladsl/ZipLatestWith14.html "Permalink")  class [ZipLatestWith14](ZipLatestWith14.html "ZipLatestWith specialized for 14 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape14](../FanInShape14.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, O]]`ZipLatestWith` specialized for 14 inputs
65. [**](../../../akka/stream/scaladsl/ZipLatestWith15.html "Permalink")  class [ZipLatestWith15](ZipLatestWith15.html "ZipLatestWith specialized for 15 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape15](../FanInShape15.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, O]]`ZipLatestWith` specialized for 15 inputs
66. [**](../../../akka/stream/scaladsl/ZipLatestWith16.html "Permalink")  class [ZipLatestWith16](ZipLatestWith16.html "ZipLatestWith specialized for 16 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape16](../FanInShape16.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, O]]`ZipLatestWith` specialized for 16 inputs
67. [**](../../../akka/stream/scaladsl/ZipLatestWith17.html "Permalink")  class [ZipLatestWith17](ZipLatestWith17.html "ZipLatestWith specialized for 17 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape17](../FanInShape17.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, O]]`ZipLatestWith` specialized for 17 inputs
68. [**](../../../akka/stream/scaladsl/ZipLatestWith18.html "Permalink")  class [ZipLatestWith18](ZipLatestWith18.html "ZipLatestWith specialized for 18 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape18](../FanInShape18.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, O]]`ZipLatestWith` specialized for 18 inputs
69. [**](../../../akka/stream/scaladsl/ZipLatestWith19.html "Permalink")  class [ZipLatestWith19](ZipLatestWith19.html "ZipLatestWith specialized for 19 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape19](../FanInShape19.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, O]]`ZipLatestWith` specialized for 19 inputs
70. [**](../../../akka/stream/scaladsl/ZipLatestWith2.html "Permalink")  class [ZipLatestWith2](ZipLatestWith2.html "ZipLatestWith specialized for 2 inputs")\[A1, A2, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape2](../FanInShape2.html)\[A1, A2, O]]`ZipLatestWith` specialized for 2 inputs
71. [**](../../../akka/stream/scaladsl/ZipLatestWith20.html "Permalink")  class [ZipLatestWith20](ZipLatestWith20.html "ZipLatestWith specialized for 20 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape20](../FanInShape20.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, O]]`ZipLatestWith` specialized for 20 inputs
72. [**](../../../akka/stream/scaladsl/ZipLatestWith21.html "Permalink")  class [ZipLatestWith21](ZipLatestWith21.html "ZipLatestWith specialized for 21 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape21](../FanInShape21.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, O]]`ZipLatestWith` specialized for 21 inputs
73. [**](../../../akka/stream/scaladsl/ZipLatestWith22.html "Permalink")  class [ZipLatestWith22](ZipLatestWith22.html "ZipLatestWith specialized for 22 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape22](../FanInShape22.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, O]]`ZipLatestWith` specialized for 22 inputs
74. [**](../../../akka/stream/scaladsl/ZipLatestWith3.html "Permalink")  class [ZipLatestWith3](ZipLatestWith3.html "ZipLatestWith specialized for 3 inputs")\[A1, A2, A3, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape3](../FanInShape3.html)\[A1, A2, A3, O]]`ZipLatestWith` specialized for 3 inputs
75. [**](../../../akka/stream/scaladsl/ZipLatestWith4.html "Permalink")  class [ZipLatestWith4](ZipLatestWith4.html "ZipLatestWith specialized for 4 inputs")\[A1, A2, A3, A4, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape4](../FanInShape4.html)\[A1, A2, A3, A4, O]]`ZipLatestWith` specialized for 4 inputs
76. [**](../../../akka/stream/scaladsl/ZipLatestWith5.html "Permalink")  class [ZipLatestWith5](ZipLatestWith5.html "ZipLatestWith specialized for 5 inputs")\[A1, A2, A3, A4, A5, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape5](../FanInShape5.html)\[A1, A2, A3, A4, A5, O]]`ZipLatestWith` specialized for 5 inputs
77. [**](../../../akka/stream/scaladsl/ZipLatestWith6.html "Permalink")  class [ZipLatestWith6](ZipLatestWith6.html "ZipLatestWith specialized for 6 inputs")\[A1, A2, A3, A4, A5, A6, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape6](../FanInShape6.html)\[A1, A2, A3, A4, A5, A6, O]]`ZipLatestWith` specialized for 6 inputs
78. [**](../../../akka/stream/scaladsl/ZipLatestWith7.html "Permalink")  class [ZipLatestWith7](ZipLatestWith7.html "ZipLatestWith specialized for 7 inputs")\[A1, A2, A3, A4, A5, A6, A7, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape7](../FanInShape7.html)\[A1, A2, A3, A4, A5, A6, A7, O]]`ZipLatestWith` specialized for 7 inputs
79. [**](../../../akka/stream/scaladsl/ZipLatestWith8.html "Permalink")  class [ZipLatestWith8](ZipLatestWith8.html "ZipLatestWith specialized for 8 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape8](../FanInShape8.html)\[A1, A2, A3, A4, A5, A6, A7, A8, O]]`ZipLatestWith` specialized for 8 inputs
80. [**](../../../akka/stream/scaladsl/ZipLatestWith9.html "Permalink")  class [ZipLatestWith9](ZipLatestWith9.html "ZipLatestWith specialized for 9 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape9](../FanInShape9.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, O]]`ZipLatestWith` specialized for 9 inputs
81. [**](../../../akka/stream/scaladsl/ZipLatestWithApply.html "Permalink")  trait [ZipLatestWithApply](ZipLatestWithApply.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
82. [**](../../../akka/stream/scaladsl/ZipN.html "Permalink") final  class [ZipN](ZipN.html "Combine the elements of multiple streams into a stream of sequences.")\[A] extends [ZipWithN](ZipWithN.html)\[A, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[A]]Combine the elements of multiple streams into a stream of sequences.

Combine the elements of multiple streams into a stream of sequences.

A `ZipN` has a `n` input ports and one `out` port

**Emits when** all of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
83. [**](../../../akka/stream/scaladsl/ZipWith10.html "Permalink")  class [ZipWith10](ZipWith10.html "ZipWith specialized for 10 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape10](../FanInShape10.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, O]]`ZipWith` specialized for 10 inputs
84. [**](../../../akka/stream/scaladsl/ZipWith11.html "Permalink")  class [ZipWith11](ZipWith11.html "ZipWith specialized for 11 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape11](../FanInShape11.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, O]]`ZipWith` specialized for 11 inputs
85. [**](../../../akka/stream/scaladsl/ZipWith12.html "Permalink")  class [ZipWith12](ZipWith12.html "ZipWith specialized for 12 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape12](../FanInShape12.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, O]]`ZipWith` specialized for 12 inputs
86. [**](../../../akka/stream/scaladsl/ZipWith13.html "Permalink")  class [ZipWith13](ZipWith13.html "ZipWith specialized for 13 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape13](../FanInShape13.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, O]]`ZipWith` specialized for 13 inputs
87. [**](../../../akka/stream/scaladsl/ZipWith14.html "Permalink")  class [ZipWith14](ZipWith14.html "ZipWith specialized for 14 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape14](../FanInShape14.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, O]]`ZipWith` specialized for 14 inputs
88. [**](../../../akka/stream/scaladsl/ZipWith15.html "Permalink")  class [ZipWith15](ZipWith15.html "ZipWith specialized for 15 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape15](../FanInShape15.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, O]]`ZipWith` specialized for 15 inputs
89. [**](../../../akka/stream/scaladsl/ZipWith16.html "Permalink")  class [ZipWith16](ZipWith16.html "ZipWith specialized for 16 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape16](../FanInShape16.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, O]]`ZipWith` specialized for 16 inputs
90. [**](../../../akka/stream/scaladsl/ZipWith17.html "Permalink")  class [ZipWith17](ZipWith17.html "ZipWith specialized for 17 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape17](../FanInShape17.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, O]]`ZipWith` specialized for 17 inputs
91. [**](../../../akka/stream/scaladsl/ZipWith18.html "Permalink")  class [ZipWith18](ZipWith18.html "ZipWith specialized for 18 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape18](../FanInShape18.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, O]]`ZipWith` specialized for 18 inputs
92. [**](../../../akka/stream/scaladsl/ZipWith19.html "Permalink")  class [ZipWith19](ZipWith19.html "ZipWith specialized for 19 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape19](../FanInShape19.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, O]]`ZipWith` specialized for 19 inputs
93. [**](../../../akka/stream/scaladsl/ZipWith2.html "Permalink")  class [ZipWith2](ZipWith2.html "ZipWith specialized for 2 inputs")\[A1, A2, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape2](../FanInShape2.html)\[A1, A2, O]]`ZipWith` specialized for 2 inputs
94. [**](../../../akka/stream/scaladsl/ZipWith20.html "Permalink")  class [ZipWith20](ZipWith20.html "ZipWith specialized for 20 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape20](../FanInShape20.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, O]]`ZipWith` specialized for 20 inputs
95. [**](../../../akka/stream/scaladsl/ZipWith21.html "Permalink")  class [ZipWith21](ZipWith21.html "ZipWith specialized for 21 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape21](../FanInShape21.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, O]]`ZipWith` specialized for 21 inputs
96. [**](../../../akka/stream/scaladsl/ZipWith22.html "Permalink")  class [ZipWith22](ZipWith22.html "ZipWith specialized for 22 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape22](../FanInShape22.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, O]]`ZipWith` specialized for 22 inputs
97. [**](../../../akka/stream/scaladsl/ZipWith3.html "Permalink")  class [ZipWith3](ZipWith3.html "ZipWith specialized for 3 inputs")\[A1, A2, A3, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape3](../FanInShape3.html)\[A1, A2, A3, O]]`ZipWith` specialized for 3 inputs
98. [**](../../../akka/stream/scaladsl/ZipWith4.html "Permalink")  class [ZipWith4](ZipWith4.html "ZipWith specialized for 4 inputs")\[A1, A2, A3, A4, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape4](../FanInShape4.html)\[A1, A2, A3, A4, O]]`ZipWith` specialized for 4 inputs
99. [**](../../../akka/stream/scaladsl/ZipWith5.html "Permalink")  class [ZipWith5](ZipWith5.html "ZipWith specialized for 5 inputs")\[A1, A2, A3, A4, A5, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape5](../FanInShape5.html)\[A1, A2, A3, A4, A5, O]]`ZipWith` specialized for 5 inputs
100. [**](../../../akka/stream/scaladsl/ZipWith6.html "Permalink")  class [ZipWith6](ZipWith6.html "ZipWith specialized for 6 inputs")\[A1, A2, A3, A4, A5, A6, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape6](../FanInShape6.html)\[A1, A2, A3, A4, A5, A6, O]]`ZipWith` specialized for 6 inputs
101. [**](../../../akka/stream/scaladsl/ZipWith7.html "Permalink")  class [ZipWith7](ZipWith7.html "ZipWith specialized for 7 inputs")\[A1, A2, A3, A4, A5, A6, A7, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape7](../FanInShape7.html)\[A1, A2, A3, A4, A5, A6, A7, O]]`ZipWith` specialized for 7 inputs
102. [**](../../../akka/stream/scaladsl/ZipWith8.html "Permalink")  class [ZipWith8](ZipWith8.html "ZipWith specialized for 8 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape8](../FanInShape8.html)\[A1, A2, A3, A4, A5, A6, A7, A8, O]]`ZipWith` specialized for 8 inputs
103. [**](../../../akka/stream/scaladsl/ZipWith9.html "Permalink")  class [ZipWith9](ZipWith9.html "ZipWith specialized for 9 inputs")\[A1, A2, A3, A4, A5, A6, A7, A8, A9, O] extends [GraphStage](../stage/GraphStage.html)\[[FanInShape9](../FanInShape9.html)\[A1, A2, A3, A4, A5, A6, A7, A8, A9, O]]`ZipWith` specialized for 9 inputs
104. [**](../../../akka/stream/scaladsl/ZipWithApply.html "Permalink")  trait [ZipWithApply](ZipWithApply.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
105. [**](../../../akka/stream/scaladsl/ZipWithN.html "Permalink")  class [ZipWithN](ZipWithN.html "Combine the elements of multiple streams into a stream of sequences using a combiner function.")\[A, O] extends [GraphStage](../stage/GraphStage.html)\[[UniformFanInShape](../UniformFanInShape.html)\[A, O]]Combine the elements of multiple streams into a stream of sequences using a combiner function.

Combine the elements of multiple streams into a stream of sequences using a combiner function.

A `ZipWithN` has a `n` input ports and one `out` port

**Emits when** all of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
### Value Members

1. [**](../../../akka/stream/scaladsl/Balance$.html "Permalink")  object [Balance](Balance$.html)
2. [**](../../../akka/stream/scaladsl/BidiFlow$.html "Permalink")  object [BidiFlow](BidiFlow$.html)
3. [**](../../../akka/stream/scaladsl/Broadcast$.html "Permalink")  object [Broadcast](Broadcast$.html)
4. [**](../../../akka/stream/scaladsl/BroadcastHub$.html "Permalink")  object [BroadcastHub](BroadcastHub$.html "A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.")A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.

A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.
It consists of two parts, a [Sink](Sink.html) and a [Source](Source.html). The [Sink](Sink.html) broadcasts elements from a producer to the
actually live consumers it has. Once the producer has been materialized, the [Sink](Sink.html) it feeds into returns a
materialized value which is the corresponding [Source](Source.html). This [Source](Source.html) can be materialized an arbitrary number
of times, where each of the new materializations will receive their elements from the original [Sink](Sink.html).
5. [**](../../../akka/stream/scaladsl/Compression$.html "Permalink")  object [Compression](Compression$.html)
6. [**](../../../akka/stream/scaladsl/Concat$.html "Permalink")  object [Concat](Concat$.html)
7. [**](../../../akka/stream/scaladsl/DelayStrategy$.html "Permalink")  object [DelayStrategy](DelayStrategy$.html)
8. [**](../../../akka/stream/scaladsl/FileIO$.html "Permalink")  object [FileIO](FileIO$.html "Factories to create sinks and sources from files")Factories to create sinks and sources from files
9. [**](../../../akka/stream/scaladsl/Flow$.html "Permalink")  object [Flow](Flow$.html)
10. [**](../../../akka/stream/scaladsl/FlowWithContext$.html "Permalink")  object [FlowWithContext](FlowWithContext$.html)
11. [**](../../../akka/stream/scaladsl/Framing$.html "Permalink")  object [Framing](Framing$.html)
12. [**](../../../akka/stream/scaladsl/GraphDSL$.html "Permalink")  object [GraphDSL](GraphDSL$.html) extends [GraphApply](GraphApply.html)
13. [**](../../../akka/stream/scaladsl/Interleave$.html "Permalink")  object [Interleave](Interleave$.html)
14. [**](../../../akka/stream/scaladsl/JavaFlowSupport$.html "Permalink")  object [JavaFlowSupport](JavaFlowSupport$.html "For use only with JDK 9+.")For use only with `JDK 9+`.

For use only with `JDK 9+`.

Provides support for `java.util.concurrent.Flow.*` interfaces which mirror the Reactive Streams
interfaces from `org.reactivestreams`. See: \[http://www.reactive\-streams.org/](reactive\-streams.org).
15. [**](../../../akka/stream/scaladsl/JsonFraming$.html "Permalink")  object [JsonFraming](JsonFraming$.html "Provides JSON framing operators that can separate valid JSON objects from incoming ByteString objects.")Provides JSON framing operators that can separate valid JSON objects from incoming ByteString objects.
16. [**](../../../akka/stream/scaladsl/Keep$.html "Permalink")  object [Keep](Keep$.html "Convenience functions for often-encountered purposes like keeping only the left (first) or only the right (second) of two input values.")Convenience functions for often\-encountered purposes like keeping only the
left (first) or only the right (second) of two input values.
17. [**](../../../akka/stream/scaladsl/Merge$.html "Permalink")  object [Merge](Merge$.html)
18. [**](../../../akka/stream/scaladsl/MergeHub$.html "Permalink")  object [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of
producers.

A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of
producers. It consists of two parts, a [Source](Source.html) and a [Sink](Sink.html). The [Source](Source.html) streams the element to a consumer from
its merged inputs. Once the consumer has been materialized, the [Source](Source.html) returns a materialized value which is
the corresponding [Sink](Sink.html). This [Sink](Sink.html) can then be materialized arbitrary many times, where each of the new
materializations will feed its consumed elements to the original [Source](Source.html).
19. [**](../../../akka/stream/scaladsl/MergeLatest$.html "Permalink")  object [MergeLatest](MergeLatest$.html "MergeLatest joins elements from N input streams into stream of lists of size N.")MergeLatest joins elements from N input streams into stream of lists of size N.

MergeLatest joins elements from N input streams into stream of lists of size N.
i\-th element in list is the latest emitted element from i\-th input stream.
MergeLatest emits list for each element emitted from some input stream,
but only after each stream emitted at least one element

**Emits when** element is available from some input and each input emits at least one element from stream start

**Completes when** all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)

**Cancels when** downstream cancels
20. [**](../../../akka/stream/scaladsl/MergePreferred$.html "Permalink")  object [MergePreferred](MergePreferred$.html)
21. [**](../../../akka/stream/scaladsl/MergePrioritized$.html "Permalink")  object [MergePrioritized](MergePrioritized$.html)
22. [**](../../../akka/stream/scaladsl/MergeSequence$.html "Permalink")  object [MergeSequence](MergeSequence$.html)
23. [**](../../../akka/stream/scaladsl/OrElse$.html "Permalink")  object [OrElse](OrElse$.html)
24. [**](../../../akka/stream/scaladsl/Partition$.html "Permalink")  object [Partition](Partition$.html)
25. [**](../../../akka/stream/scaladsl/PartitionHub$.html "Permalink")  object [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.

A `PartitionHub` is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.
It consists of two parts, a [Sink](Sink.html) and a [Source](Source.html). The [Sink](Sink.html) e elements from a producer to the
actually live consumers it has. The selection of consumer is done with a function. Each element can be routed to
only one consumer. Once the producer has been materialized, the [Sink](Sink.html) it feeds into returns a
materialized value which is the corresponding [Source](Source.html). This [Source](Source.html) can be materialized an arbitrary number
of times, where each of the new materializations will receive their elements from the original [Sink](Sink.html).
26. [**](../../../akka/stream/scaladsl/RestartFlow$.html "Permalink")  object [RestartFlow](RestartFlow$.html "A RestartFlow wraps a Flow that gets restarted when it completes or fails.")A RestartFlow wraps a [Flow](Flow.html) that gets restarted when it completes or fails.

A RestartFlow wraps a [Flow](Flow.html) that gets restarted when it completes or fails.

They are useful for graphs that need to run for longer than the [Flow](Flow.html) can necessarily guarantee it will, for
example, for [Flow](Flow.html) streams that depend on a remote server that may crash or become partitioned. The
RestartFlow ensures that the graph can continue running while the [Flow](Flow.html) restarts.
27. [**](../../../akka/stream/scaladsl/RestartSink$.html "Permalink")  object [RestartSink](RestartSink$.html "A RestartSink wraps a Sink that gets restarted when it completes or fails.")A RestartSink wraps a [Sink](Sink.html) that gets restarted when it completes or fails.

A RestartSink wraps a [Sink](Sink.html) that gets restarted when it completes or fails.

They are useful for graphs that need to run for longer than the [Sink](Sink.html) can necessarily guarantee it will, for
example, for [Sink](Sink.html) streams that depend on a remote server that may crash or become partitioned. The
RestartSink ensures that the graph can continue running while the [Sink](Sink.html) restarts.
28. [**](../../../akka/stream/scaladsl/RestartSource$.html "Permalink")  object [RestartSource](RestartSource$.html "A RestartSource wraps a Source that gets restarted when it completes or fails.")A RestartSource wraps a [Source](Source.html) that gets restarted when it completes or fails.

A RestartSource wraps a [Source](Source.html) that gets restarted when it completes or fails.

They are useful for graphs that need to run for longer than the [Source](Source.html) can necessarily guarantee it will, for
example, for [Source](Source.html) streams that depend on a remote server that may crash or become partitioned. The
RestartSource ensures that the graph can continue running while the [Source](Source.html) restarts.
29. [**](../../../akka/stream/scaladsl/RestartSourceWithContext$.html "Permalink")  object [RestartSourceWithContext](RestartSourceWithContext$.html "A RestartSourceWithContext wraps a SourceWithContext that gets restarted when it completes or fails.")A RestartSourceWithContext wraps a [SourceWithContext](SourceWithContext.html) that gets restarted when it completes or fails.

A RestartSourceWithContext wraps a [SourceWithContext](SourceWithContext.html) that gets restarted when it completes or fails.

They are useful for graphs that need to run for longer than the [SourceWithContext](SourceWithContext.html) can necessarily guarantee it will,
e.g. for [SourceWithContext](SourceWithContext.html) streams that depend on a remote service to which connectivity may be lost (crash or partition). The RestartSourceWithContext ensures that the graph can continue running while the [SourceWithContext](SourceWithContext.html) restarts.
30. [**](../../../akka/stream/scaladsl/RestartWithBackoffFlow$.html "Permalink")  object [RestartWithBackoffFlow](RestartWithBackoffFlow$.html)
31. [**](../../../akka/stream/scaladsl/RetryFlow$.html "Permalink")  object [RetryFlow](RetryFlow$.html)
32. [**](../../../akka/stream/scaladsl/RunnableGraph$.html "Permalink")  object [RunnableGraph](RunnableGraph$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
33. [**](../../../akka/stream/scaladsl/ScalaSessionAPI$.html "Permalink")  object [ScalaSessionAPI](ScalaSessionAPI$.html)
34. [**](../../../akka/stream/scaladsl/Sink$.html "Permalink")  object [Sink](Sink$.html)
35. [**](../../../akka/stream/scaladsl/SinkQueueWithCancel$.html "Permalink")  object [SinkQueueWithCancel](SinkQueueWithCancel$.html)
36. [**](../../../akka/stream/scaladsl/Source$.html "Permalink")  object [Source](Source$.html)
37. [**](../../../akka/stream/scaladsl/SourceQueueWithComplete$.html "Permalink")  object [SourceQueueWithComplete](SourceQueueWithComplete$.html)
38. [**](../../../akka/stream/scaladsl/SourceWithContext$.html "Permalink")  object [SourceWithContext](SourceWithContext$.html)
39. [**](../../../akka/stream/scaladsl/StreamConverters$.html "Permalink")  object [StreamConverters](StreamConverters$.html "Converters for interacting with the blocking java.io streams APIs and Java 8 Streams")Converters for interacting with the blocking `java.io` streams APIs and Java 8 Streams
40. [**](../../../akka/stream/scaladsl/StreamRefs$.html "Permalink")  object [StreamRefs](StreamRefs$.html "Factories for creating stream refs.")Factories for creating stream refs.
41. [**](../../../akka/stream/scaladsl/TLS$.html "Permalink")  object [TLS](TLS$.html "Stream cipher support based upon JSSE.")Stream cipher support based upon JSSE.

Stream cipher support based upon JSSE.

The underlying SSLEngine has four ports: plaintext input/output and
ciphertext input/output. These are modeled as a [akka.stream.BidiShape](../BidiShape.html)
element for use in stream topologies, where the plaintext ports are on the
left hand side of the shape and the ciphertext ports on the right hand side.

Configuring JSSE is a rather complex topic, please refer to the JDK platform
documentation or the excellent user guide that is part of the Play Framework
documentation. The philosophy of this integration into Akka Streams is to
expose all knobs and dials to client code and therefore not limit the
configuration possibilities. In particular the client code will have to
provide the SSLEngine, which is typically created from a SSLContext. Handshake
parameters and other parameters are defined when creating the SSLEngine.

**IMPORTANT NOTE**

The TLS specification until version 1\.2 did not permit half\-closing of the user data session
that it transports—to be precise a half\-close will always promptly lead to a
full close. This means that canceling the plaintext output or completing the
plaintext input of the SslTls operator will lead to full termination of the
secure connection without regard to whether bytes are remaining to be sent or
received, respectively. Especially for a client the common idiom of attaching
a finite Source to the plaintext input and transforming the plaintext response
bytes coming out will not work out of the box due to early termination of the
connection. For this reason there is a parameter that determines whether the
SslTls operator shall ignore completion and/or cancellation events, and the
default is to ignore completion (in view of the client–server scenario). In
order to terminate the connection the client will then need to cancel the
plaintext output as soon as all expected bytes have been received. When
ignoring both types of events the operator will shut down once both events have
been received. See also [TLSClosing](../TLSClosing.html). For now, half\-closing is also not
supported with TLS 1\.3 where the spec allows it.
42. [**](../../../akka/stream/scaladsl/TLSPlacebo$.html "Permalink")  object [TLSPlacebo](TLSPlacebo$.html "This object holds simple wrapping akka.stream.scaladsl.BidiFlow implementations that can be used instead of TLS when no encryption is desired.")This object holds simple wrapping [akka.stream.scaladsl.BidiFlow](BidiFlow.html) implementations that can
be used instead of [TLS](TLS$.html) when no encryption is desired.

This object holds simple wrapping [akka.stream.scaladsl.BidiFlow](BidiFlow.html) implementations that can
be used instead of [TLS](TLS$.html) when no encryption is desired. The flows will
just adapt the message protocol by wrapping into SessionBytes and
unwrapping SendBytes.
43. [**](../../../akka/stream/scaladsl/Tcp$.html "Permalink")  object [Tcp](Tcp$.html) extends [ExtensionId](../../actor/ExtensionId.html)\[[Tcp](Tcp.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
44. [**](../../../akka/stream/scaladsl/TcpAttributes$.html "Permalink")  object [TcpAttributes](TcpAttributes$.html)
45. [**](../../../akka/stream/scaladsl/Unzip$.html "Permalink")  object [Unzip](Unzip$.html "Takes a stream of pair elements and splits each pair to two output streams.")Takes a stream of pair elements and splits each pair to two output streams.

Takes a stream of pair elements and splits each pair to two output streams.

An `Unzip` has one `in` port and one `left` and one `right` output port.

**Emits when** all of the outputs stop backpressuring and there is an input element available

**Backpressures when** any of the outputs backpressure

**Completes when** upstream completes

**Cancels when** any downstream cancels
46. [**](../../../akka/stream/scaladsl/UnzipWith$.html "Permalink")  object [UnzipWith](UnzipWith$.html "Transforms each element of input stream into multiple streams using a splitter function.") extends [UnzipWithApply](UnzipWithApply.html)Transforms each element of input stream into multiple streams using a splitter function.

Transforms each element of input stream into multiple streams using a splitter function.

**Emits when** all of the outputs stop backpressuring and there is an input element available

**Backpressures when** any of the outputs backpressure

**Completes when** upstream completes

**Cancels when** any downstream cancels
47. [**](../../../akka/stream/scaladsl/UnzipWithApply$.html "Permalink")  object [UnzipWithApply](UnzipWithApply$.html)
48. [**](../../../akka/stream/scaladsl/WireTap$.html "Permalink")  object [WireTap](WireTap$.html)
49. [**](../../../akka/stream/scaladsl/Zip$.html "Permalink")  object [Zip](Zip$.html)
50. [**](../../../akka/stream/scaladsl/ZipLatest$.html "Permalink")  object [ZipLatest](ZipLatest$.html)
51. [**](../../../akka/stream/scaladsl/ZipLatestWith$.html "Permalink")  object [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.") extends [ZipLatestWithApply](ZipLatestWithApply.html)Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source. The combined stream completes immediately if
some upstreams have already completed while some upstreams did not emitted any value yet.
If all upstreams produced some value and the optional parameter `eagerComplete` is true (default),
the combined stream completes when any of the upstreams completes, otherwise, the combined stream
will wait for all upstreams to complete.

No element is emitted until at least one element from each Source becomes available. Whenever a new
element appears, the zipping function is invoked with a tuple containing the new element
and the other last seen elements.

 **Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

 **Backpressures when** downstream backpressures

 **Completes when** any of the upstreams completes

 **Cancels when** downstream cancels
52. [**](../../../akka/stream/scaladsl/ZipN$.html "Permalink")  object [ZipN](ZipN$.html)
53. [**](../../../akka/stream/scaladsl/ZipWith$.html "Permalink")  object [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.") extends [ZipWithApply](ZipWithApply.html)Combine the elements of multiple streams into a stream of combined elements using a combiner function.

Combine the elements of multiple streams into a stream of combined elements using a combiner function.

**Emits when** all of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
54. [**](../../../akka/stream/scaladsl/ZipWithN$.html "Permalink")  object [ZipWithN](ZipWithN$.html)
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/current/akka/index.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka-core/current/akka/stream/BidiShape.html
- https://doc.akka.io/api/akka-core/current/akka/stream/ClosedShape.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape10.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape11.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape12.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape13.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape14.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape15.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape16.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape17.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape18.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape19.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape2.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape20.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape21.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape22.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape3.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape4.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape5.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape6.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape7.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape8.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanInShape9.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape10.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape11.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape12.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape13.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape14.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape15.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape16.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape17.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape18.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape19.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape2.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape20.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape21.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape22.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape3.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape4.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape5.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape6.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape7.html
- https://doc.akka.io/api/akka-core/current/akka/stream/FanOutShape8.html

---
*Source: [https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/index.html](https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/index.html)*