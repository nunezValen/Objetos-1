package io.github.unlp_oo.ejercicio16;
import java.util.*;

public class EvenNumberSet implements Set<Integer>{
	private List<Integer> set;
	
	@Override
	public int size() {
		return set.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.set.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return this.set.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return this.set.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return this.set.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return this.set.toArray(a);
	}

	@Override
	public boolean add(Integer e) {
		if ((e % 2) == 0) {
			return this.set.add(e);
			
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return this.set.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return this.set.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return this.set.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return this.set.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return this.removeAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.set.clear();
	}

}
