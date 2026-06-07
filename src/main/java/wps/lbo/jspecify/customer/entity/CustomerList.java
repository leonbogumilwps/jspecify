package wps.lbo.jspecify.customer.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Deklarieren von generischen Typen und Typvariablen
public class CustomerList<E extends Customer> implements List<E>
{
	private final List<Customer> customers = new ArrayList<>();

	@Override
	public int size()
	{
		return customers.size();
	}

	@Override
	public boolean isEmpty()
	{
		return customers.isEmpty();
	}

	@Override
	public boolean contains(final Object o)
	{
		return customers.contains(o);
	}

	@Override
	public Iterator<E> iterator()
	{
		return (Iterator<E>) customers.iterator();
	}

	@Override
	public Object[] toArray()
	{
		return customers.toArray();
	}

	@Override
	public <T> T[] toArray(final T[] a)
	{
		return customers.toArray(a);
	}

	@Override
	public boolean add(final E e)
	{
		return customers.add(e);
	}

	@Override
	public boolean remove(final Object o)
	{
		return customers.remove(o);
	}

	@Override
	public boolean containsAll(final Collection<?> c)
	{
		return customers.containsAll(c);
	}

	@Override
	public boolean addAll(final Collection<? extends E> c)
	{
		return customers.addAll(c);
	}

	@Override
	public boolean addAll(final int index, final Collection<? extends E> c)
	{
		return customers.addAll(index, c);
	}

	@Override
	public boolean removeAll(final Collection<?> c)
	{
		return customers.removeAll(c);
	}

	@Override
	public boolean retainAll(final Collection<?> c)
	{
		return customers.retainAll(c);
	}

	@Override
	public void clear()
	{
		customers.clear();
	}

	@Override
	public E get(final int index)
	{
		return (E) customers.get(index);
	}

	@Override
	public E set(final int index, final E element)
	{
		return (E) customers.set(index, element);
	}

	@Override
	public void add(final int index, final E element)
	{
		customers.add(index, element);
	}

	@Override
	public E remove(final int index)
	{
		return (E) customers.remove(index);
	}

	@Override
	public int indexOf(final Object o)
	{
		return customers.indexOf(o);
	}

	@Override
	public int lastIndexOf(final Object o)
	{
		return customers.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator()
	{
		return (ListIterator<E>) customers.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(final int index)
	{
		return (ListIterator<E>) customers.listIterator(index);
	}

	@Override
	public List<E> subList(final int fromIndex, final int toIndex)
	{
		return (List<E>) customers.subList(fromIndex, toIndex);
	}

}
