package telran.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class LinkedList<T> implements List<T> {
	private static class Node<T> {
		T obj;
		Node<T> next;
		Node<T> prev;

		Node(T obj) {
			this.obj = obj;
		}
	}

	Node<T> head;
	Node<T> tail;
	int size;

// HW-13 Section start
	private class LinkedListIterator implements Iterator<T> {
		int currentIndex = 0;
		boolean flNext = false;

		@Override
		public boolean hasNext() {
			return currentIndex < size;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			flNext = true;
			Node<T> node = getNode(currentIndex++);
			return (T) node;
		}

		@Override
		public void remove() {
			if (!flNext) {
				throw new IllegalStateException();
			}
			LinkedList.this.remove(--currentIndex);
			flNext = false;
		}

	}
// HW-13 Section end

	@Override
	public boolean add(T obj) {
		Node<T> node = new Node<>(obj);
		addNode(size, node);
		return true;
	}

	private void addNode(int index, Node<T> node) {
		if (index == size) {
			addTail(node);
		} else if (index == 0) {
			addHead(node);
		} else {
			addMiddle(index, node);
		}
		size++;
	}

	private void addMiddle(int index, Node<T> node) {
		Node<T> nextNode = getNode(index);
		Node<T> prevNode = nextNode.prev;
		node.next = nextNode;
		nextNode.prev = node;
		prevNode.next = node;
		node.prev = prevNode;
	}

	private void addHead(Node<T> node) {
		node.next = head;
		head.prev = node;
		head = node;
	}

	private void addTail(Node<T> node) {
		if (tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
		}
		tail = node;
	}

	@Override
	public int size() {
		return size;
	}

// HW-13 Section start
	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}
// HW-13 Section end

	@Override
	public void add(int index, T obj) {
		indexValidation(index, true);
		Node<T> node = new Node<>(obj);
		addNode(index, node);
	}

	@Override
	public T get(int index) {
		indexValidation(index, false);
		Node<T> node = getNode(index);
		return node.obj;
	}

	private Node<T> getNode(int index) {
		return index < size / 2 ? getNodeFromHead(index) : getNodeFromTail(index);
	}

	private Node<T> getNodeFromTail(int index) {
		Node<T> current = tail;
		for (int i = size - 1; i > index; i--) {
			current = current.prev;
		}
		return current;
	}

	private Node<T> getNodeFromHead(int index) {
		Node<T> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

// HW-13 Section start
	@Override
	public T set(int index, T obj) {
		Node<T> beforeSetNode = getNode(index - 1);
		Node<T> afterSetNode = getNode(index + 1);
		beforeSetNode.next = afterSetNode;
		afterSetNode.prev = beforeSetNode;
		return null;
	}

	@Override
	public T remove(int index) {
		indexValidation(index, false);
		removeNode(index);
		return null;
	}

	private void removeNode(int index) {
		if (index == 0) {
			removeHead();
		} else if (index == size) {
			removeTail();
		} else {
			removeMiddle(index);
		}
		size--;
	}

	private void removeMiddle(int index) {
		Node<T> beforeRemovedNode = getNode(index - 1);
		Node<T> afterRemovedNode = getNode(index + 1);
		beforeRemovedNode.next = afterRemovedNode;
		afterRemovedNode.prev = beforeRemovedNode;
	}

	private void removeTail() {
		if (tail == null) {
			throw new NoSuchElementException("Cannot remove tail from an empty linked list");
		}
		Node<T> newTailNode = tail.prev;
		newTailNode.next = null;
		tail = newTailNode;
	}

	private void removeHead() {
		if (head == null) {
			throw new NoSuchElementException("Cannot remove head from an empty linked list");
		}
		if (head.next == null) {
			head = null;
		} else {
			Node<T> newHeadNode = head.next;
			newHeadNode.prev = null;
			head = newHeadNode;
		}
	}

	@Override
	public int indexOf(Object pattern) {
		return indexOf(Predicate.isEqual(pattern));
	}

	@Override
	public int lastIndexOf(Object pattern) {
		return lastIndexOf(Predicate.isEqual(pattern));
	}

	@SuppressWarnings("unchecked")
	@Override
	public int indexOf(Predicate<T> predicate) {
		int res = -1;
		int index = 0;
		Node<T> current = head;
		while (index < size && res == -1) {
			if (predicate.test((T) current)) {
				res = index;
				current = current.next;
			}
			index++;
		}
		return res;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int lastIndexOf(Predicate<T> predicate) {
		int res = -1;
		int index = size - 1;
		Node<T> current = tail;
		while (index >= 0 && res == -1) {
			if (predicate.test((T) current)) {
				res = index;
				current = current.prev;
			}
			index--;
		}
		return res;
	}
// HW-13 Section end

}