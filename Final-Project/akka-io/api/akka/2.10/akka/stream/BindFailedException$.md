---
description: Akka 2.10.17 - akka.stream.BindFailedException
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:23:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/BindFailedException$.html
title: Akka 2.10.17 - akka.stream.BindFailedException
---

# Akka 2.10.17 - akka.stream.BindFailedException

> **Summary:** Akka 2.10.17 - akka.stream.BindFailedException

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
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

Definition Classes[stream](index.html)
- [**](../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[stream](index.html)
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

Definition Classes[stream](index.html)
- [**](../../akka/stream/snapshot/index.html "Permalink")  package [snapshot](snapshot/index.html)Definition Classes[stream](index.html)
- [**](../../akka/stream/stage/index.html "Permalink")  package [stage](stage/index.html)Definition Classes[stream](index.html)
- [**](../../akka/stream/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[stream](index.html)
- [**](../../akka/stream/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[stream](index.html)
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
[o](BindFailedException.html "See companion class")[akka](../index.html).[stream](index.html)

# [BindFailedException](BindFailedException.html "See companion class")[**](../../akka/stream/BindFailedException$.html "Permalink")

### Companion [class BindFailedException](BindFailedException.html "See companion class")

#### case object BindFailedException extends [BindFailedException](BindFailedException.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Annotations@deprecated Deprecated*(Since version 2\.4\.19\)* BindFailedException object will never be thrown. Match on the class instead.

Source[StreamTcpException.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/StreamTcpException.scala#L14)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [BindFailedException](BindFailedException.html), [StreamTcpException](StreamTcpException.html), [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace), [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException), [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception), [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable), [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. BindFailedException
2. Product
3. Equals
4. BindFailedException
5. StreamTcpException
6. NoStackTrace
7. RuntimeException
8. Exception
9. Throwable
10. Serializable
11. AnyRef
12. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/stream/BindFailedException$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/BindFailedException$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/BindFailedException$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/stream/BindFailedException$.html#addSuppressed(x$1:Throwable):Unit "Permalink") final  def addSuppressed(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
5. [**](../../akka/stream/BindFailedException$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/stream/BindFailedException$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../akka/stream/BindFailedException$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/stream/BindFailedException$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/stream/BindFailedException$.html#fillInStackTrace():Throwable "Permalink")  def fillInStackTrace(): ThrowableDefinition ClassesNoStackTrace → Throwable
10. [**](../../akka/stream/BindFailedException$.html#getCause():Throwable "Permalink")  def getCause(): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
11. [**](../../akka/stream/BindFailedException$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/stream/BindFailedException$.html#getLocalizedMessage():String "Permalink")  def getLocalizedMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
13. [**](../../akka/stream/BindFailedException$.html#getMessage():String "Permalink")  def getMessage(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable
14. [**](../../akka/stream/BindFailedException$.html#getStackTrace():Array[StackTraceElement] "Permalink")  def getStackTrace(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]Definition ClassesThrowable
15. [**](../../akka/stream/BindFailedException$.html#getSuppressed():Array[Throwable] "Permalink") final  def getSuppressed(): [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)]Definition ClassesThrowable
16. [**](../../akka/stream/BindFailedException$.html#initCause(x$1:Throwable):Throwable "Permalink")  def initCause(arg0: [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)): [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)Definition ClassesThrowable
17. [**](../../akka/stream/BindFailedException$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../akka/stream/BindFailedException$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/stream/BindFailedException$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/stream/BindFailedException$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../akka/stream/BindFailedException$.html#printStackTrace(x$1:java.io.PrintWriter):Unit "Permalink")  def printStackTrace(arg0: [PrintWriter](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html#java.io.PrintWriter)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
22. [**](../../akka/stream/BindFailedException$.html#printStackTrace(x$1:java.io.PrintStream):Unit "Permalink")  def printStackTrace(arg0: [PrintStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#java.io.PrintStream)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
23. [**](../../akka/stream/BindFailedException$.html#printStackTrace():Unit "Permalink")  def printStackTrace(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
24. [**](../../akka/stream/BindFailedException$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
25. [**](../../akka/stream/BindFailedException$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../akka/stream/BindFailedException$.html#setStackTrace(x$1:Array[StackTraceElement]):Unit "Permalink")  def setStackTrace(arg0: [Array](https://www.scala-lang.org/api/2.13.17/scala/Array.html#scala.Array)\[[StackTraceElement](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StackTraceElement.html#java.lang.StackTraceElement)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesThrowable
27. [**](../../akka/stream/BindFailedException$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../akka/stream/BindFailedException$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesThrowable → AnyRef → Any
29. [**](../../akka/stream/BindFailedException$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../akka/stream/BindFailedException$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
31. [**](../../akka/stream/BindFailedException$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/BindFailedException$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [BindFailedException](BindFailedException.html)

### Inherited from [StreamTcpException](StreamTcpException.html)

### Inherited from [NoStackTrace](https://www.scala-lang.org/api/2.13.17/scala/util/control/NoStackTrace.html#scala.util.control.NoStackTrace)

### Inherited from [RuntimeException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html#java.lang.RuntimeException)

### Inherited from [Exception](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html#java.lang.Exception)

### Inherited from [Throwable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Throwable.html#java.lang.Throwable)

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/AbruptIOTerminationException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/AbruptStageTerminationException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/AbruptStreamTerminationException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/AbruptTerminationException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/AbstractShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorMaterializer$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorMaterializerSettings$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorMaterializerSettings.html
- https://doc.akka.io/api/akka/2.10/akka/stream/AmorphousShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/2.10/akka/stream/BackpressureTimeoutException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/BidiShape$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/BidiShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/BindFailedException$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/BindFailedException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/BoundedSourceQueue.html
- https://doc.akka.io/api/akka/2.10/akka/stream/BufferOverflowException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Client$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/Client.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ClosedShape$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ClosedShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/CompletionStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/CompletionStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/CompletionTimeoutException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ConnectionException.html
- https://doc.akka.io/api/akka/2.10/akka/stream/DelayOverflowStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/EagerClose$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/EagerClose.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape10.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape11.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape12.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape13.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape14.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape15.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape16.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape17.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape18.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape19.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape2.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape20.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape21.html
- https://doc.akka.io/api/akka/2.10/akka/stream/FanInShape22.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/BindFailedException$.html](https://doc.akka.io/api/akka/2.10/akka/stream/BindFailedException$.html)*