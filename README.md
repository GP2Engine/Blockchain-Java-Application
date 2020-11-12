# Blockchain-Java-Application

This is a materialization of a blockchain in a java console application, for e-commerce purposes, in 3 different versions. The main job of all versions is the same, to be able to do some simple management related to products but in a blockchain. More specifically, the user can either view all products, add 1 product, add multiple products, search products or just view the statistics of a product entry. What happens is, with every product addition that gets added to a blockchain, a new block is getting mined and that takes time. So, we got 3 different versions of the same project.

* # Version 1 - Single Threaded Execution #
The block is getting mined serially, without any parallelism.

* # Version 2 - Multi Threaded Execution via a Thread Pool #
We're using Java's Class "Executor Service" to proceess the mining of every new block in multiple threads using a thread pool.

* # Version 3 - Multi Threaded with Simple Threads #
This time we still mining every new block in parallel but with the use of 5 simple threads.
