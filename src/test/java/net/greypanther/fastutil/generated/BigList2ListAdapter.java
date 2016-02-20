package net.greypanther.fastutil.generated;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.google.common.collect.Iterators;

import it.unimi.dsi.fastutil.BigList;
import it.unimi.dsi.fastutil.BigListIterator;

@SuppressWarnings("serial")
abstract class BigList2ListAdapter<E> implements List<E>, Serializable {
  protected final BigList<E> bigList;

  BigList2ListAdapter(BigList<E> bigList) {
    this.bigList = bigList;
  }

  @Override
  public int size() {
    return bigList.size();
  }

  @Override
  public boolean isEmpty() {
    return bigList.isEmpty();
  }

  @Override
  public boolean contains(Object o) {
    return bigList.contains(o);
  }

  @Override
  public Iterator<E> iterator() {
    return bigList.iterator();
  }

  @Override
  public Object[] toArray() {
    return bigList.toArray();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return bigList.toArray(a);
  }

  @Override
  public boolean add(E e) {
    return bigList.add(e);
  }

  @Override
  public boolean remove(Object o) {
    return bigList.remove(o);
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return bigList.containsAll(c);
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    return bigList.addAll(c);
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    return bigList.addAll(index, c);
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return bigList.removeAll(c);
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return bigList.retainAll(c);
  }

  @Override
  public void clear() {
    bigList.clear();
  }

  @Override
  public E get(int index) {
    return bigList.get(index);
  }

  @Override
  public E set(int index, E element) {
    return bigList.set(index, element);
  }

  @Override
  public void add(int index, E element) {
    bigList.add(index, element);
  }

  @Override
  public E remove(int index) {
    return bigList.remove(index);
  }

  @Override
  public int indexOf(Object o) {
    return checkedCast(bigList.indexOf(o));
  }

  @Override
  public int lastIndexOf(Object o) {
    return checkedCast(bigList.lastIndexOf(o));
  }

  @Override
  public ListIterator<E> listIterator() {
    return new BigListIterator2ListIterator(bigList.listIterator());
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    return new BigListIterator2ListIterator(bigList.listIterator(index));
  }

  @Override
  public int hashCode() {
    return bigList.hashCode();
  }

  @Override
  public String toString() {
    return bigList.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof BigList2ListAdapter) {
      BigList2ListAdapter<?> that = (BigList2ListAdapter<?>) o;
      return this.bigList.equals(that.bigList);
    } else if (o instanceof List) {
      List<?> that = (List<?>) o;
      if (bigList.size() != that.size()) {
        return false;
      }
      return Iterators.elementsEqual(bigList.iterator(), that.iterator());
    } else {
      return this.bigList.equals(o);
    }
  }

  abstract void bigListIteratorSet(BigListIterator<E> bigListIterator, E e);

  abstract void bigListIteratorAdd(BigListIterator<E> bigListIterator, E e);

  private final class BigListIterator2ListIterator implements ListIterator<E> {
    private final BigListIterator<E> bigListIterator;

    private BigListIterator2ListIterator(BigListIterator<E> bigListIterator) {
      this.bigListIterator = bigListIterator;
    }

    @Override
    public boolean hasNext() {
      return bigListIterator.hasNext();
    }

    @Override
    public E next() {
      return bigListIterator.next();
    }

    @Override
    public boolean hasPrevious() {
      return bigListIterator.hasPrevious();
    }

    @Override
    public E previous() {
      return bigListIterator.previous();
    }

    @Override
    public int nextIndex() {
      return checkedCast(bigListIterator.nextIndex());
    }

    @Override
    public int previousIndex() {
      return checkedCast(bigListIterator.previousIndex());
    }

    @Override
    public void remove() {
      bigListIterator.remove();
    }

    @Override
    public void set(E e) {
      bigListIteratorSet(bigListIterator, e);
    }

    @Override
    public void add(E e) {
      bigListIteratorAdd(bigListIterator, e);
    }

    @Override
    public String toString() {
      return bigListIterator.toString();
    }
  }

  private static int checkedCast(long value) {
    if (value < Integer.MIN_VALUE | value > Integer.MAX_VALUE) {
      throw new AssertionError(Long.toString(value));
    }
    return (int) value;
  }
}
