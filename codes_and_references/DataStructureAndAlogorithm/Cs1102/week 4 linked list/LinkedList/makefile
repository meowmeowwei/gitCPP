all: TestBasic.class

TestBasic.class: TestBasic.java BasicLinkedList.class ExtendedLinkedList.class
	/usr/bin/javac TestBasic.java

ExtendedLinkedList.class: ExtendedLinkedList.java BasicLinkedList.class ListNode.class BasicLinkedListInterface.class
	/usr/bin/javac ExtendedLinkedList.java

BasicLinkedList.class: BasicLinkedList.java ListNode.class BasicLinkedListInterface.class
	/usr/bin/javac BasicLinkedList.java

BasicLinkedListInterface.class: BasicLinkedListInterface.java
	/usr/bin/javac BasicLinkedListInterface.java

ListNode.class: ListNode.java
	/usr/bin/javac ListNode.java


