# C++ STL

{% embed url="https://www.geeksforgeeks.org/cpp-stl-tutorial/" %}



[CPPCon STL](https://www.youtube.com/watch?v=2olsGf6JIkU)

STL Algorithm 

-&gt; more expressive

-&gt; avoid common mistakes \(empty loops, off-by-one\) 

-&gt; 

```cpp
C++ 17

//Heaps

//numbers is a vector of integers

make_heap(begin(numbers), end(numbers));

push_heap(begin(numbers), end(numbers));

pop_heap(begin(numbers), end(numbers));  

// Sorting

sort(numbers.begin(), numbers.end()); 

partial_sort(number.begin(), number.begin()+3));

nth_element

sort_heap

inplace_merge

//Partition

partition

partition_point

//Permutations

rotate

shuffule

next_permuation

prev_permutation    

reverse

//integration

stable_sort
stable_partition

is_sorted
is_partitioned
is_heap

//Numeric

count

accumulate

inner_product

adjacent_difference

partial_sum

sample

//Querying

all_of

any_of

none_of

// Querying on2 ranges

equal

lexicographical_compare

mismatch

// Searching

equal_range

lower_bound, upper_bound

find_first_of

max_element

min_element

// Algo on sets

set_difference 

set_intersection

set_union

set_symmetric_difference

merge

includes

// moves

copy(first, last, out)

move(first, last, out)

// generate

fill(first, last, 42)
generate(first, last, f)
iota(first, last, 42) 
replace(first, last, 42, 43) 

// Changing Structure

remove(begin(collection), end(collection), 99) // returns iterator pointing to the first place which is empty

erase(colection, 99) 

//Transform

transform(begin(list_, end(list_), back_inserter(results), f);

for_each(begin(collection), end(collection), f);



```

