package exercices.multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class MultiMaps {

	private MultiMaps() {
	}

	public static <K, V> MultiMap<K, V> createMultiMap() {
		return new HashSetMultiMap<K,V>();
	}
	
	public static <K, V> MultiMap<K, V> createMultiMap2(MultiMap.Kind kind) {
		return new HashSetMultiMap<K,V>(kind);
	}
	
	private static class HashSetMultiMap<K,V> implements MultiMap<K, V> {
		
		private Map<K, Set<V>> map;
		
		public HashSetMultiMap() {
			this.map = new HashMap<>();
		}
		
		public HashSetMultiMap(MultiMap.Kind kind){
			this.map = kind.create(); //Parterne Strategie
		}

		@Override
		public int size() {
			return map.size();
		}

		@Override
		public Set<V> get(Object key) {
			if(map.get(key) == null)
				return new HashSet<V>();
			return map.get(key);
		}

		@Override
		public boolean put(K key, V value) {
			if(map.get(key) != null)
				return map.get(key).add(value);
			
			Set<V> set = new HashSet<>();
			set.add(value);
			map.put(key, set);
			return true;
		}

		@Override
		public Iterator<V> iterator() {
			return new MultiMapIterator<V>(map.values());
		}

		@Override
		public String toString() {
			String s = "";
			for(Map.Entry<K, Set<V>> entry : map.entrySet()){
				s += entry.getKey() + " : [";
				for(V val: entry.getValue()){
					s += val + ",";
				}
				s = s.substring(0, s.length()-1);
				s += "]\n";
			}
			
			return s;
		}
		
	}
	
	private static class MultiMapIterator<V> implements Iterator<V> {

		private Iterator<V> it;

		public MultiMapIterator(Collection<Set<V>> values) {
			Collection<V> collection = new HashSet<>(); //Paterne delegation
			for(Set<V> set : values){
				collection.addAll(set);
			}
			it = collection.iterator();
		}
		@Override
		public boolean hasNext() {
			return it.hasNext();
		}

		@Override
		public V next() {
			return it.next();
		}
		
	}
	
	
	
}
