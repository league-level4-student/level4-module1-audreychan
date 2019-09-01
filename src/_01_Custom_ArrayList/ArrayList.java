package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] list;
	
	public ArrayList() {
		list = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc];
	}
	
	public void add(T val) {
		T[] add = (T[]) new Object[list.length+1];
		for(int i = 0; i < list.length; i++) {
			add[i] = list[i];
		}
		add[add.length-1] = val;
		list = add;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] insert = (T[]) new Object[list.length+1];
		for(int i = 0; i < loc; i++) {
			insert[i] = list[i];
		}
		insert[loc] = val;
		for(int i = loc+1; i < insert.length; i++) {
			insert[i] = list[i-1];
		}
		
		list = insert;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] remove = (T[]) new Object[list.length-1];
		for(int i = 0; i < loc; i++) {
			remove[i] = list[i];
		}
		for(int i = loc+1; i < list.length; i++) {
			remove[i-1] = list[i];
		}
		
		list = remove;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return list.length;
	}
}