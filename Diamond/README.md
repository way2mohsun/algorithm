# Dependencies

In this task, your job will be to write a program that can decide whether the list of dependencies contains diamond dependency or not.
The following example of a dependency graph illustrates the property of diamond dependency.
There are four libraries: A,B,C and D.
An arrow pointing from A to B indicates that library A depends on library B.


In this dependency graph, A depends on both B and C, B depends on D and C also depends on D.
An dependence path from X to Y is defined as a sequence of libraries X, C1, C2, C3, …, Cn, Y where X depends on C1,C i depends on C i + 1 for 1 ≤ i ≤ n - 1, and C n depends on Y.
There are two dependence paths from A to D in the example above.
The first path is A, B, D and the second path is A,C,D.

A list of dependencies is said to contain a diamond dependency if there exists a pair of libraries X and Y
such that there are at least two different dependence paths from X to Y.
The above dependence graph is a classic example of diamond dependency.
Your task is to determine whether or not a given list of dependencies contains a diamond dependency.

Note that the input size (see below) is quite low.
Therefore you don’t need to produce the most effective algorithm possible - sure, it’s nice if you do so, but far more important is that your code is correct and you deliver it on time.

# Input

Input starts with a number of test cases T (0 ≤ T ≤ 100). 
Each test case begins with a line containing a single number N (0 ≤ N ≤ 100) — the number of libraries. 
On each of the following N lines, there is a list of direct dependencies of one library. 
The line consists of a number of dependencies D (0 ≤ D < N), the name of the library and then the list of D dependencies (names of other libraries). 

The number of dependencies and the names of libraries are all separated by a single space.
Each library name consists only of English alphabet letters ( [a-zA-Z] ) and is at most 20 characters long. 
You may assume that:
If there is an dependency path from X to Y then there is no dependency path from Y to X .
A library will never depend on itself.
A list contains all the libraries Alternatively, you can use a JSON input file whose structure corresponds to the above description.

# Output
For each test case output a single line containing either string `yes` if there is a diamond dependency or `no` if there is none.

# Sample input 
. 4
. 4
. 2 A B C
. 1 B D
. 1 C D
. 0 D
. 5
. 2 new old basic
. 0 old
. 2 better old alternative
. 1 alternative basic
. 0 basic
. 3
. 2 simple number integer
. 1 integer number
. 0 number
. 5
. 2 a b c
. 1 b d
. 1 c e
. 1 d e
. 0 e

# Sample output Sample output Sample output Sample output
. yes
. no
. yes
. yes


