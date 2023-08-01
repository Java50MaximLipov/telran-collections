package telran.util;

import java.util.Iterator;

import telran.util.LinkedList.Node;

public class LinkedHashSet<T> implements Set<T> {
	HashMap<T, Node<T>> map = new HashMap<>();
	LinkedList<T> list = new LinkedList<>();

	@Override
	public boolean add(T obj) {
		boolean res = false;
		if (!map.containsKey(obj)) {
			res = true;
			Node<T> node = new Node<>(obj);
			map.put(obj, node);
			list.addNode(list.size(), node);
		}
		return res;
	}

	@Override
	public boolean remove(Object pattern) {
		boolean res = false;
		if (map.containsKey(pattern)) {
			res = true;
			Node<T> node = map.remove(pattern);
			list.removeNode(node);
		}
		return res;
	}

	@Override
	public boolean contains(Object pattern) {
		return map.containsKey(pattern);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

	@Override
	public T get(Object pattern) {
		T res = null;
		if (contains(pattern)) {
			res = map.get(pattern).obj;
		}
		return res;
	}

}